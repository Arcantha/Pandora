package dev.arcantha.pandora.util;

import dev.arcantha.pandora.client.render.model.ModelRealPlayer;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.player.EnumPlayerModelParts;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.util.EnumHandSide;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class RenderLBEEx extends RenderLivingBaseEx<AbstractClientPlayer> {
    public RenderLBEEx(RenderManager renderManagerIn, float shadowSizeIn) {
        super(renderManagerIn, new ModelRealPlayer(), shadowSizeIn);
        this.mainModel = new ModelRealPlayer();
    }

    public ModelRealPlayer getMainModel()
    {
        return (ModelRealPlayer) super.getMainModel();
    }

    public void doRender(AbstractClientPlayer entity, double x, double y, double z, float entityYaw, float partialTicks)
    {
        if (!entity.isUser() || this.renderManager.renderViewEntity == entity)
        {
            double d0 = y;

            if (entity.isSneaking())
            {
                d0 = y - 0.125D;
            }

            this.setModelVisibilities(entity);
            GlStateManager.enableBlendProfile(GlStateManager.Profile.PLAYER_SKIN);
            super.doRender(entity, x, d0, z, entityYaw, partialTicks);
            GlStateManager.disableBlendProfile(GlStateManager.Profile.PLAYER_SKIN);
        }
    }

    private void setModelVisibilities(AbstractClientPlayer clientPlayer)
    {
        ModelRealPlayer modelRealPlayer = this.getMainModel();

        if (clientPlayer.isSpectator())
        {
            modelRealPlayer.setVisible(true);
        }
        else
        {
            modelRealPlayer.setVisible(true);
        }
    }
    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    public ResourceLocation getEntityTexture(AbstractClientPlayer entity)
    {
        return entity.getLocationSkin();
    }

    public void transformHeldFull3DItemLayer()
    {
        GlStateManager.translate(0.0F, 0.1875F, 0.0F);
    }
    /**
     * Allows the render to do state modifications necessary before the model is rendered.
     */
    protected void preRenderCallback(AbstractClientPlayer entitylivingbaseIn, float partialTickTime)
    {
        float f = 0.9375F;
        GlStateManager.scale(0.9375F, 0.9375F, 0.9375F);
    }

    protected void renderEntityName(AbstractClientPlayer entityIn, double x, double y, double z, String name, double distanceSq)
    {
        if (distanceSq < 100.0D)
        {
            Scoreboard scoreboard = entityIn.getWorldScoreboard();
            ScoreObjective scoreobjective = scoreboard.getObjectiveInDisplaySlot(2);

            if (scoreobjective != null)
            {
                Score score = scoreboard.getOrCreateScore(entityIn.getName(), scoreobjective);
                this.renderLivingLabel(entityIn, score.getScorePoints() + " " + scoreobjective.getDisplayName(), x, y, z, 64);
                y += (double)((float)this.getFontRendererFromRenderManager().FONT_HEIGHT * 1.15F * 0.025F);
            }
        }

        super.renderEntityName(entityIn, x, y, z, name, distanceSq);
    }

    /**
     * Sets a simple glTranslate on a LivingEntity.
     */
    protected void renderLivingAt(AbstractClientPlayer entityLivingBaseIn, double x, double y, double z)
    {
        if (entityLivingBaseIn.isEntityAlive() && entityLivingBaseIn.isPlayerSleeping())
        {
            super.renderLivingAt(entityLivingBaseIn, x + (double)entityLivingBaseIn.renderOffsetX, y + (double)entityLivingBaseIn.renderOffsetY, z + (double)entityLivingBaseIn.renderOffsetZ);
        }
        else
        {
            super.renderLivingAt(entityLivingBaseIn, x, y, z);
        }
    }

    protected void applyRotations(AbstractClientPlayer entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
    {
        if (entityLiving.isEntityAlive() && entityLiving.isPlayerSleeping())
        {
            GlStateManager.rotate(entityLiving.getBedOrientationInDegrees(), 0.0F, 1.0F, 0.0F);
            GlStateManager.rotate(this.getDeathMaxRotation(entityLiving), 0.0F, 0.0F, 1.0F);
            GlStateManager.rotate(270.0F, 0.0F, 1.0F, 0.0F);
        }
        else if (entityLiving.isElytraFlying())
        {
            super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
            float f = (float)entityLiving.getTicksElytraFlying() + partialTicks;
            float f1 = MathHelper.clamp(f * f / 100.0F, 0.0F, 1.0F);
            GlStateManager.rotate(f1 * (-90.0F - entityLiving.rotationPitch), 1.0F, 0.0F, 0.0F);
            Vec3d vec3d = entityLiving.getLook(partialTicks);
            double d0 = entityLiving.motionX * entityLiving.motionX + entityLiving.motionZ * entityLiving.motionZ;
            double d1 = vec3d.x * vec3d.x + vec3d.z * vec3d.z;

            if (d0 > 0.0D && d1 > 0.0D)
            {
                double d2 = (entityLiving.motionX * vec3d.x + entityLiving.motionZ * vec3d.z) / (Math.sqrt(d0) * Math.sqrt(d1));
                double d3 = entityLiving.motionX * vec3d.z - entityLiving.motionZ * vec3d.x;
                GlStateManager.rotate((float)(Math.signum(d3) * Math.acos(d2)) * 180.0F / (float)Math.PI, 0.0F, 1.0F, 0.0F);
            }
        }
        else
        {
            super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
        }
    }

}
