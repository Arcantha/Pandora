package dev.arcantha.pandora.common.world;

import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;

import javax.annotation.Nullable;

public class ModWorlds {
    public static final String PANDORA_NAME = "pandora";
    public static final int PANDORA_DIM_ID = findFreeDimensionID();
    public static final DimensionType PANDORA_DIM_TYPE = DimensionType.register(PANDORA_NAME, "_" + PANDORA_NAME, PANDORA_DIM_ID, PandoraProvider.class, true);

    public static final void registerDimensions()
    {
        DimensionManager.registerDimension(PANDORA_DIM_ID, PANDORA_DIM_TYPE);
    }

    @Nullable
    private static Integer findFreeDimensionID() {
        for (int i = 2; i < Integer.MAX_VALUE; i++) {
            if (!DimensionManager.isDimensionRegistered(i)) {
                // DEBUG
                System.out.println("Found free dimension ID = " + i);
                return i;
            }
        }
        return 0;
    }
}
