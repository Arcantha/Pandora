package dev.arcantha.pandora.common.handler;

import dev.arcantha.pandora.common.block.ModBlocks;
import dev.arcantha.pandora.common.entity.EntityDirehorse;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EntityLightStepsHandler {
    @SubscribeEvent
    public void ondirehorseWalk(LivingEvent.LivingUpdateEvent event) {
        if (event.getEntity() instanceof EntityDirehorse) {
            EntityDirehorse direhorse = ((EntityDirehorse) event.getEntity()); 
            BlockPos blockUPos = direhorse.getPosition().down();
            BlockPos blockUUPos = direhorse.getPosition().down().down();
            BlockPos blockUUUPos = direhorse.getPosition().down().down().down();

            BlockPos blockNPos = direhorse.getPosition().north();
            BlockPos blockNNPos = direhorse.getPosition().north().north();
            BlockPos blockNNNPos = direhorse.getPosition().north().north().north();
            BlockPos blockEPos = direhorse.getPosition().east();
            BlockPos blockEEPos = direhorse.getPosition().east().east();
            BlockPos blockEEEPos = direhorse.getPosition().east().east().east();
            BlockPos blockSPos = direhorse.getPosition().south();
            BlockPos blockSSPos = direhorse.getPosition().south().south();
            BlockPos blockSSSPos = direhorse.getPosition().south().south().south();
            BlockPos blockWPos = direhorse.getPosition().west();
            BlockPos blockWWPos = direhorse.getPosition().west().west();
            BlockPos blockWWWPos = direhorse.getPosition().west().west().west();

            BlockPos blockUNPos = direhorse.getPosition().down().north();
            BlockPos blockUNNPos = direhorse.getPosition().down().north().north();
            BlockPos blockUNNNPos = direhorse.getPosition().down().north().north().north();
            BlockPos blockUEPos = direhorse.getPosition().down().east();
            BlockPos blockUEEPos = direhorse.getPosition().down().east().east();
            BlockPos blockUEEEPos = direhorse.getPosition().down().east().east().east();
            BlockPos blockUSPos = direhorse.getPosition().down().south();
            BlockPos blockUSSPos = direhorse.getPosition().down().south().south();
            BlockPos blockUSSSPos = direhorse.getPosition().down().south().south().south();
            BlockPos blockUWPos = direhorse.getPosition().down().west();
            BlockPos blockUWWPos = direhorse.getPosition().down().west().west();
            BlockPos blockUWWWPos = direhorse.getPosition().down().west().west().west();

            BlockPos blockUUNPos = direhorse.getPosition().down().down().north();
            BlockPos blockUUNNPos = direhorse.getPosition().down().down().north().north();
            BlockPos blockUUNNNPos = direhorse.getPosition().down().down().north().north().north();
            BlockPos blockUUEPos = direhorse.getPosition().down().down().east();
            BlockPos blockUUEEPos = direhorse.getPosition().down().down().east().east();
            BlockPos blockUUEEEPos = direhorse.getPosition().down().down().east().east().east();
            BlockPos blockUUSPos = direhorse.getPosition().down().down().south();
            BlockPos blockUUSSPos = direhorse.getPosition().down().down().south().south();
            BlockPos blockUUSSSPos = direhorse.getPosition().down().down().south().south().south();
            BlockPos blockUUWPos = direhorse.getPosition().down().down().west();
            BlockPos blockUUWWPos = direhorse.getPosition().down().down().west().west();
            BlockPos blockUUWWWPos = direhorse.getPosition().down().down().west().west().west();

            BlockPos blockNEPos = direhorse.getPosition().north().east();
            BlockPos blockSEPos = direhorse.getPosition().south().east();
            BlockPos blockSWPos = direhorse.getPosition().south().west();
            BlockPos blockNWPos = direhorse.getPosition().north().west();

            BlockPos blockUNEPos = direhorse.getPosition().north().east().down();
            BlockPos blockUSEPos = direhorse.getPosition().south().east().down();
            BlockPos blockUSWPos = direhorse.getPosition().south().west().down();
            BlockPos blockUNWPos = direhorse.getPosition().north().west().down();

            BlockPos blockUUNEPos = direhorse.getPosition().north().east().down().down();
            BlockPos blockUUSEPos = direhorse.getPosition().south().east().down().down();
            BlockPos blockUUSWPos = direhorse.getPosition().south().west().down().down();
            BlockPos blockUUNWPos = direhorse.getPosition().north().west().down().down();

            long minecraftTime = direhorse.world.getWorldTime();
            long minecraftNTime = 12570;
            long minecraftDTime = 24000;

            if(direhorse.onGround && direhorse.world.getBlockState(blockUPos).equals(Blocks.GRASS.getDefaultState()) && minecraftTime > minecraftNTime && minecraftTime < minecraftDTime ){
                direhorse.world.setBlockState(blockUPos, ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState());
            }
            if(direhorse.world.getBlockState(blockUUPos).equals(ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState())){
                direhorse.world.setBlockState(blockUUPos, Blocks.GRASS.getDefaultState());
            }
            if(direhorse.world.getBlockState(blockUUUPos).equals(ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState())){
                direhorse.world.setBlockState(blockUUUPos, Blocks.GRASS.getDefaultState());
            }
            if(direhorse.world.getBlockState(blockNPos).equals(ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState())){
                direhorse.world.setBlockState(blockNPos, Blocks.GRASS.getDefaultState());
            }
            if(direhorse.world.getBlockState(blockNNPos).equals(ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState())){
                direhorse.world.setBlockState(blockNNPos, Blocks.GRASS.getDefaultState());
            }
            if(direhorse.world.getBlockState(blockNNNPos).equals(ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState())){
                direhorse.world.setBlockState(blockNNNPos, Blocks.GRASS.getDefaultState());
            }
            if(direhorse.world.getBlockState(blockEPos).equals(ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState())){
                direhorse.world.setBlockState(blockEPos, Blocks.GRASS.getDefaultState());
            }
            if(direhorse.world.getBlockState(blockEEPos).equals(ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState())){
                direhorse.world.setBlockState(blockEEPos, Blocks.GRASS.getDefaultState());
            }
            if(direhorse.world.getBlockState(blockEEEPos).equals(ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState())){
                direhorse.world.setBlockState(blockEEEPos, Blocks.GRASS.getDefaultState());
            }
            if(direhorse.world.getBlockState(blockSPos).equals(ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState())){
                direhorse.world.setBlockState(blockSPos, Blocks.GRASS.getDefaultState());
            }
            if(direhorse.world.getBlockState(blockSSPos).equals(ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState())){
                direhorse.world.setBlockState(blockSSPos, Blocks.GRASS.getDefaultState());
            }
            if(direhorse.world.getBlockState(blockSSSPos).equals(ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState())){
                direhorse.world.setBlockState(blockSSSPos, Blocks.GRASS.getDefaultState());
            }
            if(direhorse.world.getBlockState(blockWPos).equals(ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState())){
                direhorse.world.setBlockState(blockWPos, Blocks.GRASS.getDefaultState());
            }
            if(direhorse.world.getBlockState(blockWWPos).equals(ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState())){
                direhorse.world.setBlockState(blockWWPos, Blocks.GRASS.getDefaultState());
            }
            if(direhorse.world.getBlockState(blockWWWPos).equals(ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState())){
                direhorse.world.setBlockState(blockWWWPos, Blocks.GRASS.getDefaultState());
            }
            if(direhorse.world.getBlockState(blockUNPos).equals(ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState())){
                direhorse.world.setBlockState(blockUNPos, Blocks.GRASS.getDefaultState());
            }
            if(direhorse.world.getBlockState(blockUNNPos).equals(ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState())){
                direhorse.world.setBlockState(blockUNNPos, Blocks.GRASS.getDefaultState());
            }
            if(direhorse.world.getBlockState(blockUNNNPos).equals(ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState())){
                direhorse.world.setBlockState(blockUNNNPos, Blocks.GRASS.getDefaultState());
            }
            if(direhorse.world.getBlockState(blockUEPos).equals(ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState())){
                direhorse.world.setBlockState(blockUEPos, Blocks.GRASS.getDefaultState());
            }
            if(direhorse.world.getBlockState(blockUEEPos).equals(ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState())){
                direhorse.world.setBlockState(blockUEEPos, Blocks.GRASS.getDefaultState());
            }
            if(direhorse.world.getBlockState(blockUEEEPos).equals(ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState())){
                direhorse.world.setBlockState(blockUEEEPos, Blocks.GRASS.getDefaultState());
            }
            if(direhorse.world.getBlockState(blockUSPos).equals(ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState())){
                direhorse.world.setBlockState(blockUSPos, Blocks.GRASS.getDefaultState());
            }
            if(direhorse.world.getBlockState(blockUSSPos).equals(ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState())){
                direhorse.world.setBlockState(blockUSSPos, Blocks.GRASS.getDefaultState());
            }
            if(direhorse.world.getBlockState(blockUSSSPos).equals(ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState())){
                direhorse.world.setBlockState(blockUSSSPos, Blocks.GRASS.getDefaultState());
            }
            if(direhorse.world.getBlockState(blockUWPos).equals(ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState())){
                direhorse.world.setBlockState(blockUWPos, Blocks.GRASS.getDefaultState());
            }
            if(direhorse.world.getBlockState(blockUWWPos).equals(ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState())){
                direhorse.world.setBlockState(blockUWWPos, Blocks.GRASS.getDefaultState());
            }
            if(direhorse.world.getBlockState(blockUWWWPos).equals(ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState())){
                direhorse.world.setBlockState(blockUWWWPos, Blocks.GRASS.getDefaultState());
            }
            if(direhorse.world.getBlockState(blockUUNPos).equals(ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState())){
                direhorse.world.setBlockState(blockUUNPos, Blocks.GRASS.getDefaultState());
            }
            if(direhorse.world.getBlockState(blockUUNNPos).equals(ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState())){
                direhorse.world.setBlockState(blockUUNNPos, Blocks.GRASS.getDefaultState());
            }
            if(direhorse.world.getBlockState(blockUUNNNPos).equals(ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState())){
                direhorse.world.setBlockState(blockUUNNNPos, Blocks.GRASS.getDefaultState());
            }
            if(direhorse.world.getBlockState(blockUUEPos).equals(ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState())){
                direhorse.world.setBlockState(blockUUEPos, Blocks.GRASS.getDefaultState());
            }
            if(direhorse.world.getBlockState(blockUUEEPos).equals(ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState())){
                direhorse.world.setBlockState(blockUUEEPos, Blocks.GRASS.getDefaultState());
            }
            if(direhorse.world.getBlockState(blockUUEEEPos).equals(ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState())){
                direhorse.world.setBlockState(blockUUEEEPos, Blocks.GRASS.getDefaultState());
            }
            if(direhorse.world.getBlockState(blockUUSPos).equals(ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState())){
                direhorse.world.setBlockState(blockUUSPos, Blocks.GRASS.getDefaultState());
            }
            if(direhorse.world.getBlockState(blockUUSSPos).equals(ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState())){
                direhorse.world.setBlockState(blockUUSSPos, Blocks.GRASS.getDefaultState());
            }
            if(direhorse.world.getBlockState(blockUUSSSPos).equals(ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState())){
                direhorse.world.setBlockState(blockUUSSSPos, Blocks.GRASS.getDefaultState());
            }
            if(direhorse.world.getBlockState(blockUUWPos).equals(ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState())){
                direhorse.world.setBlockState(blockUUWPos, Blocks.GRASS.getDefaultState());
            }
            if(direhorse.world.getBlockState(blockUUWWPos).equals(ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState())){
                direhorse.world.setBlockState(blockUUWWPos, Blocks.GRASS.getDefaultState());
            }
            if(direhorse.world.getBlockState(blockUUWWWPos).equals(ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState())){
                direhorse.world.setBlockState(blockUUWWWPos, Blocks.GRASS.getDefaultState());
            }
            if(direhorse.world.getBlockState(blockNEPos).equals(ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState())){
                direhorse.world.setBlockState(blockNEPos, Blocks.GRASS.getDefaultState());
            }
            if(direhorse.world.getBlockState(blockSEPos).equals(ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState())){
                direhorse.world.setBlockState(blockSEPos, Blocks.GRASS.getDefaultState());
            }
            if(direhorse.world.getBlockState(blockSWPos).equals(ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState())){
                direhorse.world.setBlockState(blockSWPos, Blocks.GRASS.getDefaultState());
            }
            if(direhorse.world.getBlockState(blockNWPos).equals(ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState())){
                direhorse.world.setBlockState(blockNWPos, Blocks.GRASS.getDefaultState());
            }
            if(direhorse.world.getBlockState(blockUNEPos).equals(ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState())){
                direhorse.world.setBlockState(blockUNEPos, Blocks.GRASS.getDefaultState());
            }
            if(direhorse.world.getBlockState(blockUSEPos).equals(ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState())){
                direhorse.world.setBlockState(blockUSEPos, Blocks.GRASS.getDefaultState());
            }
            if(direhorse.world.getBlockState(blockUSWPos).equals(ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState())){
                direhorse.world.setBlockState(blockUSWPos, Blocks.GRASS.getDefaultState());
            }
            if(direhorse.world.getBlockState(blockUNWPos).equals(ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState())){
                direhorse.world.setBlockState(blockUNWPos, Blocks.GRASS.getDefaultState());
            }
            if(direhorse.world.getBlockState(blockUUNEPos).equals(ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState())){
                direhorse.world.setBlockState(blockUUNEPos, Blocks.GRASS.getDefaultState());
            }
            if(direhorse.world.getBlockState(blockUUSEPos).equals(ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState())){
                direhorse.world.setBlockState(blockUUSEPos, Blocks.GRASS.getDefaultState());
            }
            if(direhorse.world.getBlockState(blockUUSWPos).equals(ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState())){
                direhorse.world.setBlockState(blockUUSWPos, Blocks.GRASS.getDefaultState());
            }
            if(direhorse.world.getBlockState(blockUUNWPos).equals(ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState())){
                direhorse.world.setBlockState(blockUUNWPos, Blocks.GRASS.getDefaultState());
            }
        }
    }
}