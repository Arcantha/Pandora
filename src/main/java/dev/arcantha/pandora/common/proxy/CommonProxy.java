package dev.arcantha.pandora.common.proxy;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class CommonProxy {
    @SideOnly(Side.SERVER)

    public void preInit(FMLPreInitializationEvent event) {

    }
    public void init(FMLInitializationEvent event) {

    }
    public void postInit(FMLPostInitializationEvent event) {

    }
    public void registerItemRenderer(Item item, int meta, String id) {

    }
}
