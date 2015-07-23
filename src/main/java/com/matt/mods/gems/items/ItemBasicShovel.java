package com.matt.mods.gems.items;

import com.matt.mods.gems.Gems;
import com.matt.mods.gems.tabs.GTabs;

import net.minecraft.item.Item;
import net.minecraft.item.ItemShears;
import net.minecraft.item.ItemSpade;
import net.minecraftforge.fml.common.registry.GameRegistry;
	
public class ItemBasicShovel extends ItemSpade {
	
	protected String name;
	
	public ItemBasicShovel(String name, ToolMaterial toolmaterial)
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
