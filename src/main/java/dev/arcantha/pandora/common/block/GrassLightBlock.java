package dev.arcantha.pandora.common.block;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.block.Block;

public class GrassLightBlock extends BlockBase {
	public GrassLightBlock(String name, Material material) {
		super(name, material);
		setSoundType(blockSoundType.PLANT);
		setHardness(0.6F);
		setResistance(2.5F);
		setLightLevel(7.0F);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}
	public boolean canSustainPlant(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing direction, net.minecraftforge.common.IPlantable plantable)
    {
		return true;
    }
}
