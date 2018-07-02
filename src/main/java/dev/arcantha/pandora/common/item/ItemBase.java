package dev.arcantha.pandora.common.item;

import dev.arcantha.pandora.Pandora;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.TOOLS);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {Pandora.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
