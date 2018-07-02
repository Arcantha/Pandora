package dev.arcantha.pandora.common.block;

import javax.annotation.Nonnull;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class LoreyuPlantBlock extends BlockBase {

	public LoreyuPlantBlock(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.PLANT);
		setHardness(0.0F);
		setResistance(0.0F);
		setLightLevel(9.0F);
		
	}
	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.TRANSLUCENT;
	}
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	@Override
	  public boolean isFullCube(IBlockState iBlockState) {
	    return false;
	}
	@Override
	  public AxisAlignedBB getCollisionBoundingBox(IBlockState state, IBlockAccess worldIn, BlockPos pos)
	  {
	    return NULL_AABB;
	}
}
