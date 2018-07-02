package dev.arcantha.pandora.client.render.entity;

import dev.arcantha.pandora.client.render.model.ModelRealPlayer;
import dev.arcantha.pandora.common.entity.EntityRealPlayer;
import dev.arcantha.pandora.util.RenderLBEEx;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class RenderRealPlayer extends RenderLBEEx {

    private static ResourceLocation realPlayerTexture = new ResourceLocation("pm:texturerealplayer.png");

    public RenderRealPlayer(RenderManager renderManagerIn, float shadowSizeIn) {
        super(renderManagerIn, shadowSizeIn);
        this.bindTexture(realPlayerTexture);
    }
}
