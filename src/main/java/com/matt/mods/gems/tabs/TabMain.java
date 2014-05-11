package com.matt.mods.gems.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.matt.mods.gems.items.GItems;
	
public class TabMain extends CreativeTabs {

	public TabMain(String label)
	{
		super(label);
	}

	@Override
	public Item getTabIconItem()
	{
		return GItems.sapphire;
	}
	
}
