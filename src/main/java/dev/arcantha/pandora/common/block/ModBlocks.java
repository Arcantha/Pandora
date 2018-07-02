package dev.arcantha.pandora.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    public static final List<Block> BLOCKS = new ArrayList<>();

    public static final Block LOREYU_PLANT_BLOCK = new LoreyuPlantBlock("loreyu_plant_block", Material.PLANTS);
}
