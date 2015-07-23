package com.matt.mods.gems.items;

import com.matt.mods.gems.Gems;
import com.matt.mods.gems.blocks.BlockBasic;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
	
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
	
	public static ArmorMaterial armorSapphire = EnumHelper.addArmorMaterial("SAPPHIRE", Gems.prefix + "sapphire", 25, new int[]{2, 6, 5, 2}, 10);
	public static ArmorMaterial armorRuby = EnumHelper.addArmorMaterial("RUBY", Gems.prefix + "ruby", 25, new int[]{2, 6, 5, 2}, 10);
	public static ArmorMaterial armorPeridot = EnumHelper.addArmorMaterial("PERIDOT", Gems.prefix + "peridot", 25, new int[]{2, 6, 5, 2}, 10);
	
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
	
	public static final void initItems(FMLInitializationEvent event)
	{
		sapphire = new ItemBasic("sapphire").setUnlocalizedName("sapphire");
		ruby = new ItemBasic("ruby").setUnlocalizedName("ruby");
		peridot = new ItemBasic("peridot").setUnlocalizedName("peridot");
		
		sapphire_pickaxe = new ItemBasicPickaxe("sapphire_pickaxe", tools).setUnlocalizedName("sapphire_pickaxe");
		sapphire_axe = new ItemBasicAxe("sapphire_axe", tools).setUnlocalizedName("sapphire_axe");
		sapphire_shovel = new ItemBasicShovel("sapphire_shovel", tools).setUnlocalizedName("sapphire_shovel");
		sapphire_hoe = new ItemBasicHoe("sapphire_hoe", tools).setUnlocalizedName("sapphire_hoe");
		sapphire_sword = new ItemBasicSword("sapphire_sword", tools).setUnlocalizedName("sapphire_sword");
		
		ruby_pickaxe = new ItemBasicPickaxe("ruby_pickaxe", tools).setUnlocalizedName("ruby_pickaxe");
		ruby_axe = new ItemBasicAxe("ruby_axe", tools).setUnlocalizedName("ruby_axe");
		ruby_shovel = new ItemBasicShovel("ruby_shovel", tools).setUnlocalizedName("ruby_shovel");
		ruby_hoe = new ItemBasicHoe("ruby_hoe", tools).setUnlocalizedName("ruby_hoe");
		ruby_sword = new ItemBasicSword("ruby_sword", tools).setUnlocalizedName("ruby_sword");
		
		peridot_pickaxe = new ItemBasicPickaxe("peridot_pickaxe", tools).setUnlocalizedName("peridot_pickaxe");
		peridot_axe = new ItemBasicAxe("peridot_axe", tools).setUnlocalizedName("peridot_axe");
		peridot_shovel = new ItemBasicShovel("peridot_shovel", tools).setUnlocalizedName("peridot_shovel");
		peridot_hoe = new ItemBasicHoe("peridot_hoe", tools).setUnlocalizedName("peridot_hoe");
		peridot_sword = new ItemBasicSword("peridot_sword", tools).setUnlocalizedName("peridot_sword");
		
		sapphire_helmet = new ItemBasicArmor("sapphire_helmet", armorSapphire, 0).setUnlocalizedName("sapphire_helmet");
		sapphire_chestplate = new ItemBasicArmor("sapphire_chestplate", armorSapphire, 1).setUnlocalizedName("sapphire_chestplate");
		sapphire_leggings = new ItemBasicArmor("sapphire_leggings", armorSapphire, 2).setUnlocalizedName("sapphire_leggings");
		sapphire_boots = new ItemBasicArmor("sapphire_boots", armorSapphire, 3).setUnlocalizedName("sapphire_boots");
		
		ruby_helmet = new ItemBasicArmor("ruby_helmet", armorRuby, 0).setUnlocalizedName("ruby_helmet");
		ruby_chestplate = new ItemBasicArmor("ruby_chestplate", armorRuby, 1).setUnlocalizedName("ruby_chestplate");
		ruby_leggings = new ItemBasicArmor("ruby_leggings", armorRuby, 2).setUnlocalizedName("ruby_leggings");
		ruby_boots = new ItemBasicArmor("ruby_boots", armorRuby, 3).setUnlocalizedName("ruby_boots");
		
		peridot_helmet = new ItemBasicArmor("peridot_helmet", armorPeridot, 0).setUnlocalizedName("peridot_helmet");
		peridot_chestplate = new ItemBasicArmor("peridot_chestplate", armorPeridot, 1).setUnlocalizedName("peridot_chestplate");
		peridot_leggings = new ItemBasicArmor("peridot_leggings", armorPeridot, 2).setUnlocalizedName("peridot_leggings");
		peridot_boots = new ItemBasicArmor("peridot_boots", armorPeridot, 3).setUnlocalizedName("peridot_boots");
		
		//register renders
    	if(event.getSide() == Side.CLIENT)
    	{
	    	RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
	    	
	    	//items
	    	renderItem.getItemModelMesher().register(sapphire, 0, new ModelResourceLocation(Gems.prefix + ((ItemBasic) sapphire).getName(), "inventory"));
	    	renderItem.getItemModelMesher().register(ruby, 0, new ModelResourceLocation(Gems.prefix + ((ItemBasic) ruby).getName(), "inventory"));
	    	renderItem.getItemModelMesher().register(peridot, 0, new ModelResourceLocation(Gems.prefix + ((ItemBasic) peridot).getName(), "inventory"));
	    	
	    	renderItem.getItemModelMesher().register(sapphire_pickaxe, 0, new ModelResourceLocation(Gems.prefix + ((ItemBasicPickaxe) sapphire_pickaxe).getName(), "inventory"));
	    	renderItem.getItemModelMesher().register(sapphire_axe, 0, new ModelResourceLocation(Gems.prefix + ((ItemBasicAxe) sapphire_axe).getName(), "inventory"));
	    	renderItem.getItemModelMesher().register(sapphire_shovel, 0, new ModelResourceLocation(Gems.prefix + ((ItemBasicShovel) sapphire_shovel).getName(), "inventory"));
	    	renderItem.getItemModelMesher().register(sapphire_hoe, 0, new ModelResourceLocation(Gems.prefix + ((ItemBasicHoe) sapphire_hoe).getName(), "inventory"));
	    	renderItem.getItemModelMesher().register(sapphire_sword, 0, new ModelResourceLocation(Gems.prefix + ((ItemBasicSword) sapphire_sword).getName(), "inventory"));
	    	renderItem.getItemModelMesher().register(ruby_pickaxe, 0, new ModelResourceLocation(Gems.prefix + ((ItemBasicPickaxe) ruby_pickaxe).getName(), "inventory"));
	    	renderItem.getItemModelMesher().register(ruby_axe, 0, new ModelResourceLocation(Gems.prefix + ((ItemBasicAxe) ruby_axe).getName(), "inventory"));
	    	renderItem.getItemModelMesher().register(ruby_shovel, 0, new ModelResourceLocation(Gems.prefix + ((ItemBasicShovel) ruby_shovel).getName(), "inventory"));
	    	renderItem.getItemModelMesher().register(ruby_hoe, 0, new ModelResourceLocation(Gems.prefix + ((ItemBasicHoe) ruby_hoe).getName(), "inventory"));
	    	renderItem.getItemModelMesher().register(ruby_sword, 0, new ModelResourceLocation(Gems.prefix + ((ItemBasicSword) ruby_sword).getName(), "inventory"));
	    	renderItem.getItemModelMesher().register(peridot_pickaxe, 0, new ModelResourceLocation(Gems.prefix + ((ItemBasicPickaxe) peridot_pickaxe).getName(), "inventory"));
	    	renderItem.getItemModelMesher().register(peridot_axe, 0, new ModelResourceLocation(Gems.prefix + ((ItemBasicAxe) peridot_axe).getName(), "inventory"));
	    	renderItem.getItemModelMesher().register(peridot_shovel, 0, new ModelResourceLocation(Gems.prefix + ((ItemBasicShovel) peridot_shovel).getName(), "inventory"));
	    	renderItem.getItemModelMesher().register(peridot_hoe, 0, new ModelResourceLocation(Gems.prefix + ((ItemBasicHoe) peridot_hoe).getName(), "inventory"));
	    	renderItem.getItemModelMesher().register(peridot_sword, 0, new ModelResourceLocation(Gems.prefix + ((ItemBasicSword) peridot_sword).getName(), "inventory"));
	    	renderItem.getItemModelMesher().register(sapphire_helmet, 0, new ModelResourceLocation(Gems.prefix + ((ItemBasicArmor) sapphire_helmet).getName(), "inventory"));
	    	renderItem.getItemModelMesher().register(sapphire_chestplate, 0, new ModelResourceLocation(Gems.prefix + ((ItemBasicArmor) sapphire_chestplate).getName(), "inventory"));
	    	renderItem.getItemModelMesher().register(sapphire_leggings, 0, new ModelResourceLocation(Gems.prefix + ((ItemBasicArmor) sapphire_leggings).getName(), "inventory"));
	    	renderItem.getItemModelMesher().register(sapphire_boots, 0, new ModelResourceLocation(Gems.prefix + ((ItemBasicArmor) sapphire_boots).getName(), "inventory"));
	    	renderItem.getItemModelMesher().register(ruby_helmet, 0, new ModelResourceLocation(Gems.prefix + ((ItemBasicArmor) ruby_helmet).getName(), "inventory"));
	    	renderItem.getItemModelMesher().register(ruby_chestplate, 0, new ModelResourceLocation(Gems.prefix + ((ItemBasicArmor) ruby_chestplate).getName(), "inventory"));
	    	renderItem.getItemModelMesher().register(ruby_leggings, 0, new ModelResourceLocation(Gems.prefix + ((ItemBasicArmor) ruby_leggings).getName(), "inventory"));
	    	renderItem.getItemModelMesher().register(ruby_boots, 0, new ModelResourceLocation(Gems.prefix + ((ItemBasicArmor) ruby_boots).getName(), "inventory"));
	    	renderItem.getItemModelMesher().register(peridot_helmet, 0, new ModelResourceLocation(Gems.prefix + ((ItemBasicArmor) peridot_helmet).getName(), "inventory"));
	    	renderItem.getItemModelMesher().register(peridot_chestplate, 0, new ModelResourceLocation(Gems.prefix + ((ItemBasicArmor) peridot_chestplate).getName(), "inventory"));
	    	renderItem.getItemModelMesher().register(peridot_leggings, 0, new ModelResourceLocation(Gems.prefix + ((ItemBasicArmor) peridot_leggings).getName(), "inventory"));
	    	renderItem.getItemModelMesher().register(peridot_boots, 0, new ModelResourceLocation(Gems.prefix + ((ItemBasicArmor) peridot_boots).getName(), "inventory"));
    	}
	}
	
}
