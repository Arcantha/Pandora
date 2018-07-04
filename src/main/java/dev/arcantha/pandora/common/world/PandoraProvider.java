package dev.arcantha.pandora.common.world;

import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.gen.IChunkGenerator;

public class PandoraProvider extends WorldProvider {
    public PandoraProvider() {
    }

    @Override
    public IChunkGenerator createChunkGenerator() {
        return new PandoraChunkGenerator(this.world, this.world.getSeed(), true, "");
    }

    @Override
    public DimensionType getDimensionType() {
        return null;
    }
}
