package dev.arcantha.pandora.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class LoreyuPlantBlock extends BlockDoublePlant {

    public LoreyuPlantBlock(String name, Material material) {
        setCreativeTab(CreativeTabs.DECORATIONS);
        setUnlocalizedName(name);
        setRegistryName(name);
        setLightLevel(7f);

        ModBlocks.BLOCKS.add(this);
    }
}
