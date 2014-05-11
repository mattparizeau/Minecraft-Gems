package com.matt.mods.gems.items;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;
	
public final class GItems {
	
	public static Item sapphire;
	public static Item ruby;
	public static Item peridot;
	
	public static ToolMaterial tools = EnumHelper.addToolMaterial("MIDTIER", 2, 750, 8.0F, 3.0F, 10);
	
	public static Item sapphire_pickaxe;
	public static Item sapphire_axe;
	public static Item sapphire_shovel;
	public static Item sapphire_hoe;
	public static Item sapphire_sword;
	
	public static Item ruby_pickaxe;
	public static Item ruby_axe;
	public static Item ruby_shovel;
	public static Item ruby_hoe;
	public static Item ruby_sword;
	
	public static Item peridot_pickaxe;
	public static Item peridot_axe;
	public static Item peridot_shovel;
	public static Item peridot_hoe;
	public static Item peridot_sword;
	
	public static ArmorMaterial armor = EnumHelper.addArmorMaterial("MIDTIER", 25, new int[]{2, 6, 5, 2}, 10);
	
	public static Item sapphire_helmet;
	public static Item sapphire_chestplate;
	public static Item sapphire_leggings;
	public static Item sapphire_boots;
	
	public static Item ruby_helmet;
	public static Item ruby_chestplate;
	public static Item ruby_leggings;
	public static Item ruby_boots;
	
	public static Item peridot_helmet;
	public static Item peridot_chestplate;
	public static Item peridot_leggings;
	public static Item peridot_boots;
	
	public static final void initItems()
	{
		sapphire = new ItemBasic().setUnlocalizedName("sapphire").setTextureName("sapphire");
		ruby = new ItemBasic().setUnlocalizedName("ruby").setTextureName("ruby");
		peridot = new ItemBasic().setUnlocalizedName("peridot").setTextureName("peridot");
		
		sapphire_pickaxe = new ItemBasicPickaxe(tools).setUnlocalizedName("sapphire_pickaxe").setTextureName("sapphire_pickaxe");
		sapphire_axe = new ItemBasicAxe(tools).setUnlocalizedName("sapphire_axe").setTextureName("sapphire_axe");
		sapphire_shovel = new ItemBasicShovel(tools).setUnlocalizedName("sapphire_shovel").setTextureName("sapphire_shovel");
		sapphire_hoe = new ItemBasicHoe(tools).setUnlocalizedName("sapphire_hoe").setTextureName("sapphire_hoe");
		sapphire_sword = new ItemBasicSword(tools).setUnlocalizedName("sapphire_sword").setTextureName("sapphire_sword");
		
		ruby_pickaxe = new ItemBasicPickaxe(tools).setUnlocalizedName("ruby_pickaxe").setTextureName("ruby_pickaxe");
		ruby_axe = new ItemBasicAxe(tools).setUnlocalizedName("ruby_axe").setTextureName("ruby_axe");
		ruby_shovel = new ItemBasicShovel(tools).setUnlocalizedName("ruby_shovel").setTextureName("ruby_shovel");
		ruby_hoe = new ItemBasicHoe(tools).setUnlocalizedName("ruby_hoe").setTextureName("ruby_hoe");
		ruby_sword = new ItemBasicSword(tools).setUnlocalizedName("ruby_sword").setTextureName("ruby_sword");
		
		peridot_pickaxe = new ItemBasicPickaxe(tools).setUnlocalizedName("peridot_pickaxe").setTextureName("peridot_pickaxe");
		peridot_axe = new ItemBasicAxe(tools).setUnlocalizedName("peridot_axe").setTextureName("peridot_axe");
		peridot_shovel = new ItemBasicShovel(tools).setUnlocalizedName("peridot_shovel").setTextureName("peridot_shovel");
		peridot_hoe = new ItemBasicHoe(tools).setUnlocalizedName("peridot_hoe").setTextureName("peridot_hoe");
		peridot_sword = new ItemBasicSword(tools).setUnlocalizedName("peridot_sword").setTextureName("peridot_sword");
		
		sapphire_helmet = new ItemBasicArmor(armor, 0).setUnlocalizedName("sapphire_helmet").setTextureName("sapphire");
		sapphire_chestplate = new ItemBasicArmor(armor, 1).setUnlocalizedName("sapphire_chestplate").setTextureName("sapphire");
		sapphire_leggings = new ItemBasicArmor(armor, 2).setUnlocalizedName("sapphire_leggings").setTextureName("sapphire");
		sapphire_boots = new ItemBasicArmor(armor, 3).setUnlocalizedName("sapphire_boots").setTextureName("sapphire");
		
		ruby_helmet = new ItemBasicArmor(armor, 0).setUnlocalizedName("ruby_helmet").setTextureName("ruby");
		ruby_chestplate = new ItemBasicArmor(armor, 1).setUnlocalizedName("ruby_chestplate").setTextureName("ruby");
		ruby_leggings = new ItemBasicArmor(armor, 2).setUnlocalizedName("ruby_leggings").setTextureName("ruby");
		ruby_boots = new ItemBasicArmor(armor, 3).setUnlocalizedName("ruby_boots").setTextureName("ruby");
		
		peridot_helmet = new ItemBasicArmor(armor, 0).setUnlocalizedName("peridot_helmet").setTextureName("peridot");
		peridot_chestplate = new ItemBasicArmor(armor, 1).setUnlocalizedName("peridot_chestplate").setTextureName("peridot");
		peridot_leggings = new ItemBasicArmor(armor, 2).setUnlocalizedName("peridot_leggings").setTextureName("peridot");
		peridot_boots = new ItemBasicArmor(armor, 3).setUnlocalizedName("peridot_boots").setTextureName("peridot");
		
		GameRegistry.registerItem(sapphire, "sapphire");
		GameRegistry.registerItem(ruby, "ruby");
		GameRegistry.registerItem(peridot, "peridot");
		
		GameRegistry.registerItem(sapphire_pickaxe, "sapphire_pickaxe");
		GameRegistry.registerItem(sapphire_axe, "sapphire_axe");
		GameRegistry.registerItem(sapphire_shovel, "sapphire_shovel");
		GameRegistry.registerItem(sapphire_hoe, "sapphire_hoe");
		GameRegistry.registerItem(sapphire_sword, "sapphire_sword");
		
		GameRegistry.registerItem(ruby_pickaxe, "ruby_pickaxe");
		GameRegistry.registerItem(ruby_axe, "ruby_axe");
		GameRegistry.registerItem(ruby_shovel, "ruby_shovel");
		GameRegistry.registerItem(ruby_hoe, "ruby_hoe");
		GameRegistry.registerItem(ruby_sword, "ruby_sword");
		
		GameRegistry.registerItem(peridot_pickaxe, "peridot_pickaxe");
		GameRegistry.registerItem(peridot_axe, "peridot_axe");
		GameRegistry.registerItem(peridot_shovel, "peridot_shovel");
		GameRegistry.registerItem(peridot_hoe, "peridot_hoe");
		GameRegistry.registerItem(peridot_sword, "peridot_sword");
		
		GameRegistry.registerItem(sapphire_helmet, "sapphire_helmet");
		GameRegistry.registerItem(sapphire_chestplate, "sapphire_chestplate");
		GameRegistry.registerItem(sapphire_leggings, "sapphire_leggings");
		GameRegistry.registerItem(sapphire_boots, "sapphire_boots");
		
		GameRegistry.registerItem(ruby_helmet, "ruby_helmet");
		GameRegistry.registerItem(ruby_chestplate, "ruby_chestplate");
		GameRegistry.registerItem(ruby_leggings, "ruby_leggings");
		GameRegistry.registerItem(ruby_boots, "ruby_boots");
		
		GameRegistry.registerItem(peridot_helmet, "peridot_helmet");
		GameRegistry.registerItem(peridot_chestplate, "peridot_chestplate");
		GameRegistry.registerItem(peridot_leggings, "peridot_leggings");
		GameRegistry.registerItem(peridot_boots, "peridot_boots");
	}
	
}
