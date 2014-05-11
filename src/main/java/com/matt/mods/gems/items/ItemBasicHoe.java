package com.matt.mods.gems.items;

import com.matt.mods.gems.Gems;
import com.matt.mods.gems.tabs.GTabs;

import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
	
public class ItemBasicHoe extends ItemHoe {

	public ItemBasicHoe(ToolMaterial toolmaterial)
	{
		super(toolmaterial);
		this.setCreativeTab(GTabs.main);
	}
	
	@Override
	public Item setTextureName(String name)
	{
		return super.setTextureName(Gems.prefix + name);
	}
	
}
