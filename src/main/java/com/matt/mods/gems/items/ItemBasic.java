package com.matt.mods.gems.items;

import com.matt.mods.gems.Gems;
import com.matt.mods.gems.tabs.GTabs;

import net.minecraft.item.Item;
	
public class ItemBasic extends Item {
	
	public ItemBasic()
	{
		super();
		this.setCreativeTab(GTabs.main);
	}

	@Override
	public Item setTextureName(String name)
	{
		return super.setTextureName(Gems.prefix + name);
	}
	
}
