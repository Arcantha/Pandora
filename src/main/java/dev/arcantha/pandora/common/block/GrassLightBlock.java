package dev.arcantha.pandora.common.block;

import net.minecraft.block.material.Material;

public class GrassLightBlock extends BlockBase {
    public GrassLightBlock(String name, Material material) {
        super(name, material);
        setLightLevel(5);
    }
}
