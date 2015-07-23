package com.matt.mods.gems.items;

import com.matt.mods.gems.Gems;
import com.matt.mods.gems.tabs.GTabs;

import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraftforge.fml.common.registry.GameRegistry;
	
public class ItemBasicAxe extends ItemAxe {
	
	protected String name;
	
	public ItemBasicAxe(String name, ToolMaterial toolmaterial)
	{
		super(toolmaterial);
		this.name = name;
		GameRegistry.registerItem(this, name);
		this.setCreativeTab(GTabs.main);
	}
	
	public String getName()
	{
		return this.name;
	}
}
