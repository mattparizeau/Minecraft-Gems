package com.matt.mods.gems.items;

import com.matt.mods.gems.Gems;
import com.matt.mods.gems.tabs.GTabs;

import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
	
public class ItemBasicArmor extends ItemArmor {

	protected String name;
	
	public ItemBasicArmor(String name, ArmorMaterial material, int type)
	{
		super(material, 0, type);
		this.name = name;
		GameRegistry.registerItem(this, name);
		this.setCreativeTab(GTabs.main);
	}
	
	public String getName()
	{
		return this.name;
	}
}
