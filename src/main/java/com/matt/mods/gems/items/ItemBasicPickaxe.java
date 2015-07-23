package com.matt.mods.gems.items;

import com.matt.mods.gems.Gems;
import com.matt.mods.gems.tabs.GTabs;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.fml.common.registry.GameRegistry;
	
public class ItemBasicPickaxe extends ItemPickaxe {
	
	protected String name;
	
	public ItemBasicPickaxe(String name, ToolMaterial toolmaterial)
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
