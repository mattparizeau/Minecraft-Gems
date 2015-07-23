package com.matt.mods.gems.items;

import com.matt.mods.gems.Gems;
import com.matt.mods.gems.tabs.GTabs;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
	
public class ItemBasic extends Item {
	
	protected String name;
	
	public ItemBasic(String name)
	{
		super();
		this.name = name;
		GameRegistry.registerItem(this, name);
		this.setCreativeTab(GTabs.main);
	}
	
	public String getName()
	{
		return this.name;
	}
}
