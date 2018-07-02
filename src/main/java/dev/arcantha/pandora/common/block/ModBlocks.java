package dev.arcantha.pandora.common.block;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block LOREYU_PLANT_BLOCK = new LoreyuPlantBlock("loreyu_plant_block", Material.PLANTS);
	public static final Block GRASS_LIGHT_BLOCK = new GrassLightBlock("grass_light_block", Material.GRASS);
}
