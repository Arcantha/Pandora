package dev.arcantha.pandora.client.handler;

import dev.arcantha.pandora.client.render.entity.RenderRealPlayer;
import dev.arcantha.pandora.common.entity.EntityRealPlayer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

@Mod.EventBusSubscriber
public class RenderHandler {

    @SubscribeEvent
    public static void onPlayerRender(RenderPlayerEvent.Pre event) {
        if (event.getEntity() instanceof EntityPlayer) {
            event.setCanceled(true);
        }
        EntityPlayer player = event.getEntityPlayer();
        EntityPlayerSP playerSP = (EntityPlayerSP)player;
        RenderRealPlayer renderRealPlayer = new RenderRealPlayer(Minecraft.getMinecraft().getRenderManager(), 3.0f);
        renderRealPlayer.doRender(playerSP, 0, 0, 0, 0f, event.getPartialRenderTick());
    }

    @SubscribeEvent
    public void onJump(LivingEvent.LivingJumpEvent event) {
        if (event.getEntity() instanceof EntityPlayer) {
            event.getEntity().motionY *= 1.75;
        }
    }
    @SubscribeEvent
    public void onFall(LivingFallEvent event) {
        if (event.getEntity() instanceof EntityPlayer) {
            if (event.getDistance() <= 8)
                event.setDistance(0);
                event.setDamageMultiplier(0);
        }
        if (event.getDistance() >= 9) {
            event.setDamageMultiplier(0.5f);
        }

    }
    @SubscribeEvent
    public void onMove(LivingEvent.LivingUpdateEvent event) {
        if (event.getEntity() instanceof EntityPlayer) {
            ((EntityPlayer) event.getEntity()).capabilities.setPlayerWalkSpeed(0.25f);
            if (((EntityPlayer) event.getEntity()).isRiding()){
                ((EntityPlayer) event.getEntity()).eyeHeight = 4;
            }
            if (!((EntityPlayer) event.getEntity()).isRiding()){
                ((EntityPlayer) event.getEntity()).eyeHeight = 3;
            }
        }
    }
}
