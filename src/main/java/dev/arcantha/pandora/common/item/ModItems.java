package dev.arcantha.pandora.common.item;

import java.util.ArrayList;
import java.util.List;

import dev.arcantha.pandora.util.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ArmorMaterial ARMOR_MATERIAL_LOREYU = EnumHelper.addArmorMaterial("armor_material_loreyu", Reference.Info.MODID + ":loreyu_leaf", 10,
			new int[] {1, 3, 4, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
	
	//Armor
	public static final Item LOREYU_HEAD_GARMENT = new ArmorBase("loreyu_head_garment", ARMOR_MATERIAL_LOREYU, 1, EntityEquipmentSlot.HEAD);
	public static final Item LOREYU_CHEST_GARMENT = new ArmorBase("lorey_chest_garment", ARMOR_MATERIAL_LOREYU, 1, EntityEquipmentSlot.CHEST);
	public static final Item LOREYU_LEGGINGS_GARMENT = new ArmorBase("loreyu_leggings_garment", ARMOR_MATERIAL_LOREYU, 2, EntityEquipmentSlot.LEGS);
	public static final Item LOREU_FEET_GARMENT = new ArmorBase("loreyu_feet_garment", ARMOR_MATERIAL_LOREYU, 1, EntityEquipmentSlot.FEET);
	
	//Items
	public static final Item LOREYU_SACK = new ItemBase("loreyu_sack");
	public static final Item LOREYU_LEAF = new ItemBase("loreyu_leaf").setCreativeTab(CreativeTabs.MATERIALS);
	
}
