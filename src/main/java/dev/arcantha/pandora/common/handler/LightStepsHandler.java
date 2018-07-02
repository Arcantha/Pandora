package dev.arcantha.pandora.common.handler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;


public class LightStepsHandler {
    @SubscribeEvent
    public void onPlayerWalk(TickEvent.PlayerTickEvent event) {
        if (event.player instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) event.player;
            BlockPos blockUPos = player.getPosition().down();
            BlockPos blockUUPos = player.getPosition().down().down();
            BlockPos blockUUUPos = player.getPosition().down().down().down();

            BlockPos blockNPos = player.getPosition().north();
            BlockPos blockNNPos = player.getPosition().north().north();
            BlockPos blockNNNPos = player.getPosition().north().north().north();
            BlockPos blockEPos = player.getPosition().east();
            BlockPos blockEEPos = player.getPosition().east().east();
            BlockPos blockEEEPos = player.getPosition().east().east().east();
            BlockPos blockSPos = player.getPosition().south();
            BlockPos blockSSPos = player.getPosition().south().south();
            BlockPos blockSSSPos = player.getPosition().south().south().south();
            BlockPos blockWPos = player.getPosition().west();
            BlockPos blockWWPos = player.getPosition().west().west();
            BlockPos blockWWWPos = player.getPosition().west().west().west();

            BlockPos blockUNPos = player.getPosition().down().north();
            BlockPos blockUNNPos = player.getPosition().down().north().north();
            BlockPos blockUNNNPos = player.getPosition().down().north().north().north();
            BlockPos blockUEPos = player.getPosition().down().east();
            BlockPos blockUEEPos = player.getPosition().down().east().east();
            BlockPos blockUEEEPos = player.getPosition().down().east().east().east();
            BlockPos blockUSPos = player.getPosition().down().south();
            BlockPos blockUSSPos = player.getPosition().down().south().south();
            BlockPos blockUSSSPos = player.getPosition().down().south().south().south();
            BlockPos blockUWPos = player.getPosition().down().west();
            BlockPos blockUWWPos = player.getPosition().down().west().west();
            BlockPos blockUWWWPos = player.getPosition().down().west().west().west();

            BlockPos blockUUNPos = player.getPosition().down().down().north();
            BlockPos blockUUNNPos = player.getPosition().down().down().north().north();
            BlockPos blockUUNNNPos = player.getPosition().down().down().north().north().north();
            BlockPos blockUUEPos = player.getPosition().down().down().east();
            BlockPos blockUUEEPos = player.getPosition().down().down().east().east();
            BlockPos blockUUEEEPos = player.getPosition().down().down().east().east().east();
            BlockPos blockUUSPos = player.getPosition().down().down().south();
            BlockPos blockUUSSPos = player.getPosition().down().down().south().south();
            BlockPos blockUUSSSPos = player.getPosition().down().down().south().south().south();
            BlockPos blockUUWPos = player.getPosition().down().down().west();
            BlockPos blockUUWWPos = player.getPosition().down().down().west().west();
            BlockPos blockUUWWWPos = player.getPosition().down().down().west().west().west();

            BlockPos blockNEPos = player.getPosition().north().east();
            BlockPos blockSEPos = player.getPosition().south().east();
            BlockPos blockSWPos = player.getPosition().south().west();
            BlockPos blockNWPos = player.getPosition().north().west();

            BlockPos blockUNEPos = player.getPosition().north().east().down();
            BlockPos blockUSEPos = player.getPosition().south().east().down();
            BlockPos blockUSWPos = player.getPosition().south().west().down();
            BlockPos blockUNWPos = player.getPosition().north().west().down();

            BlockPos blockUUNEPos = player.getPosition().north().east().down().down();
            BlockPos blockUUSEPos = player.getPosition().south().east().down().down();
            BlockPos blockUUSWPos = player.getPosition().south().west().down().down();
            BlockPos blockUUNWPos = player.getPosition().north().west().down().down();

            if(player.onGround && player.world.getBlockState(blockUPos).equals(Blocks.GRASS.getDefaultState())){
                player.world.setBlockState(blockUPos, Blocks.STONE.getDefaultState());
            }
            if(player.world.getBlockState(blockUUPos).equals(Blocks.STONE.getDefaultState())){
                player.world.setBlockState(blockUUPos, Blocks.GRASS.getDefaultState());
            }
            if(player.world.getBlockState(blockUUUPos).equals(Blocks.STONE.getDefaultState())){
                player.world.setBlockState(blockUUUPos, Blocks.GRASS.getDefaultState());
            }
            if(player.world.getBlockState(blockNPos).equals(Blocks.STONE.getDefaultState())){
                player.world.setBlockState(blockNPos, Blocks.GRASS.getDefaultState());
            }
            if(player.world.getBlockState(blockNNPos).equals(Blocks.STONE.getDefaultState())){
                player.world.setBlockState(blockNNPos, Blocks.GRASS.getDefaultState());
            }
            if(player.world.getBlockState(blockNNNPos).equals(Blocks.STONE.getDefaultState())){
                player.world.setBlockState(blockNNNPos, Blocks.GRASS.getDefaultState());
            }
            if(player.world.getBlockState(blockEPos).equals(Blocks.STONE.getDefaultState())){
                player.world.setBlockState(blockEPos, Blocks.GRASS.getDefaultState());
            }
            if(player.world.getBlockState(blockEEPos).equals(Blocks.STONE.getDefaultState())){
                player.world.setBlockState(blockEEPos, Blocks.GRASS.getDefaultState());
            }
            if(player.world.getBlockState(blockEEEPos).equals(Blocks.STONE.getDefaultState())){
                player.world.setBlockState(blockEEEPos, Blocks.GRASS.getDefaultState());
            }
            if(player.world.getBlockState(blockSPos).equals(Blocks.STONE.getDefaultState())){
                player.world.setBlockState(blockSPos, Blocks.GRASS.getDefaultState());
            }
            if(player.world.getBlockState(blockSSPos).equals(Blocks.STONE.getDefaultState())){
                player.world.setBlockState(blockSSPos, Blocks.GRASS.getDefaultState());
            }
            if(player.world.getBlockState(blockSSSPos).equals(Blocks.STONE.getDefaultState())){
                player.world.setBlockState(blockSSSPos, Blocks.GRASS.getDefaultState());
            }
            if(player.world.getBlockState(blockWPos).equals(Blocks.STONE.getDefaultState())){
                player.world.setBlockState(blockWPos, Blocks.GRASS.getDefaultState());
            }
            if(player.world.getBlockState(blockWWPos).equals(Blocks.STONE.getDefaultState())){
                player.world.setBlockState(blockWWPos, Blocks.GRASS.getDefaultState());
            }
            if(player.world.getBlockState(blockWWWPos).equals(Blocks.STONE.getDefaultState())){
                player.world.setBlockState(blockWWWPos, Blocks.GRASS.getDefaultState());
            }
            if(player.world.getBlockState(blockUNPos).equals(Blocks.STONE.getDefaultState())){
                player.world.setBlockState(blockUNPos, Blocks.GRASS.getDefaultState());
            }
            if(player.world.getBlockState(blockUNNPos).equals(Blocks.STONE.getDefaultState())){
                player.world.setBlockState(blockUNNPos, Blocks.GRASS.getDefaultState());
            }
            if(player.world.getBlockState(blockUNNNPos).equals(Blocks.STONE.getDefaultState())){
                player.world.setBlockState(blockUNNNPos, Blocks.GRASS.getDefaultState());
            }
            if(player.world.getBlockState(blockUEPos).equals(Blocks.STONE.getDefaultState())){
                player.world.setBlockState(blockUEPos, Blocks.GRASS.getDefaultState());
            }
            if(player.world.getBlockState(blockUEEPos).equals(Blocks.STONE.getDefaultState())){
                player.world.setBlockState(blockUEEPos, Blocks.GRASS.getDefaultState());
            }
            if(player.world.getBlockState(blockUEEEPos).equals(Blocks.STONE.getDefaultState())){
                player.world.setBlockState(blockUEEEPos, Blocks.GRASS.getDefaultState());
            }
            if(player.world.getBlockState(blockUSPos).equals(Blocks.STONE.getDefaultState())){
                player.world.setBlockState(blockUSPos, Blocks.GRASS.getDefaultState());
            }
            if(player.world.getBlockState(blockUSSPos).equals(Blocks.STONE.getDefaultState())){
                player.world.setBlockState(blockUSSPos, Blocks.GRASS.getDefaultState());
            }
            if(player.world.getBlockState(blockUSSSPos).equals(Blocks.STONE.getDefaultState())){
                player.world.setBlockState(blockUSSSPos, Blocks.GRASS.getDefaultState());
            }
            if(player.world.getBlockState(blockUWPos).equals(Blocks.STONE.getDefaultState())){
                player.world.setBlockState(blockUWPos, Blocks.GRASS.getDefaultState());
            }
            if(player.world.getBlockState(blockUWWPos).equals(Blocks.STONE.getDefaultState())){
                player.world.setBlockState(blockUWWPos, Blocks.GRASS.getDefaultState());
            }
            if(player.world.getBlockState(blockUWWWPos).equals(Blocks.STONE.getDefaultState())){
                player.world.setBlockState(blockUWWWPos, Blocks.GRASS.getDefaultState());
            }
            if(player.world.getBlockState(blockUUNPos).equals(Blocks.STONE.getDefaultState())){
                player.world.setBlockState(blockUUNPos, Blocks.GRASS.getDefaultState());
            }
            if(player.world.getBlockState(blockUUNNPos).equals(Blocks.STONE.getDefaultState())){
                player.world.setBlockState(blockUUNNPos, Blocks.GRASS.getDefaultState());
            }
            if(player.world.getBlockState(blockUUNNNPos).equals(Blocks.STONE.getDefaultState())){
                player.world.setBlockState(blockUUNNNPos, Blocks.GRASS.getDefaultState());
            }
            if(player.world.getBlockState(blockUUEPos).equals(Blocks.STONE.getDefaultState())){
                player.world.setBlockState(blockUUEPos, Blocks.GRASS.getDefaultState());
            }
            if(player.world.getBlockState(blockUUEEPos).equals(Blocks.STONE.getDefaultState())){
                player.world.setBlockState(blockUUEEPos, Blocks.GRASS.getDefaultState());
            }
            if(player.world.getBlockState(blockUUEEEPos).equals(Blocks.STONE.getDefaultState())){
                player.world.setBlockState(blockUUEEEPos, Blocks.GRASS.getDefaultState());
            }
            if(player.world.getBlockState(blockUUSPos).equals(Blocks.STONE.getDefaultState())){
                player.world.setBlockState(blockUUSPos, Blocks.GRASS.getDefaultState());
            }
            if(player.world.getBlockState(blockUUSSPos).equals(Blocks.STONE.getDefaultState())){
                player.world.setBlockState(blockUUSSPos, Blocks.GRASS.getDefaultState());
            }
            if(player.world.getBlockState(blockUUSSSPos).equals(Blocks.STONE.getDefaultState())){
                player.world.setBlockState(blockUUSSSPos, Blocks.GRASS.getDefaultState());
            }
            if(player.world.getBlockState(blockUUWPos).equals(Blocks.STONE.getDefaultState())){
                player.world.setBlockState(blockUUWPos, Blocks.GRASS.getDefaultState());
            }
            if(player.world.getBlockState(blockUUWWPos).equals(Blocks.STONE.getDefaultState())){
                player.world.setBlockState(blockUUWWPos, Blocks.GRASS.getDefaultState());
            }
            if(player.world.getBlockState(blockUUWWWPos).equals(Blocks.STONE.getDefaultState())){
                player.world.setBlockState(blockUUWWWPos, Blocks.GRASS.getDefaultState());
            }
            if(player.world.getBlockState(blockNEPos).equals(Blocks.STONE.getDefaultState())){
                player.world.setBlockState(blockNEPos, Blocks.GRASS.getDefaultState());
            }
            if(player.world.getBlockState(blockSEPos).equals(Blocks.STONE.getDefaultState())){
                player.world.setBlockState(blockSEPos, Blocks.GRASS.getDefaultState());
            }
            if(player.world.getBlockState(blockSWPos).equals(Blocks.STONE.getDefaultState())){
                player.world.setBlockState(blockSWPos, Blocks.GRASS.getDefaultState());
            }
            if(player.world.getBlockState(blockNWPos).equals(Blocks.STONE.getDefaultState())){
                player.world.setBlockState(blockNWPos, Blocks.GRASS.getDefaultState());
            }
            if(player.world.getBlockState(blockUNEPos).equals(Blocks.STONE.getDefaultState())){
                player.world.setBlockState(blockUNEPos, Blocks.GRASS.getDefaultState());
            }
            if(player.world.getBlockState(blockUSEPos).equals(Blocks.STONE.getDefaultState())){
                player.world.setBlockState(blockUSEPos, Blocks.GRASS.getDefaultState());
            }
            if(player.world.getBlockState(blockUSWPos).equals(Blocks.STONE.getDefaultState())){
                player.world.setBlockState(blockUSWPos, Blocks.GRASS.getDefaultState());
            }
            if(player.world.getBlockState(blockUNWPos).equals(Blocks.STONE.getDefaultState())){
                player.world.setBlockState(blockUNWPos, Blocks.GRASS.getDefaultState());
            }
            if(player.world.getBlockState(blockUUNEPos).equals(Blocks.STONE.getDefaultState())){
                player.world.setBlockState(blockUUNEPos, Blocks.GRASS.getDefaultState());
            }
            if(player.world.getBlockState(blockUUSEPos).equals(Blocks.STONE.getDefaultState())){
                player.world.setBlockState(blockUUSEPos, Blocks.GRASS.getDefaultState());
            }
            if(player.world.getBlockState(blockUUSWPos).equals(Blocks.STONE.getDefaultState())){
                player.world.setBlockState(blockUUSWPos, Blocks.GRASS.getDefaultState());
            }
            if(player.world.getBlockState(blockUUNWPos).equals(Blocks.STONE.getDefaultState())){
                player.world.setBlockState(blockUUNWPos, Blocks.GRASS.getDefaultState());
            }
        }
    }
}
