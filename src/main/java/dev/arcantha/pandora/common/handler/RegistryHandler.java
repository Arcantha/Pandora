package dev.arcantha.pandora.common.handler;

import dev.arcantha.pandora.client.handler.RenderEntityHandler;
import dev.arcantha.pandora.common.block.ModBlocks;
import dev.arcantha.pandora.common.entity.ModEntities;
import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class RegistryHandler {
    public static void preInitRegistries() {
        ModEntities.registerEntities();
        RenderEntityHandler.registerEntityRenders();
    }
    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
    }
}
