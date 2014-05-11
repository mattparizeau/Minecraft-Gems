package com.matt.mods.gems.core;

import com.matt.mods.gems.blocks.GBlocks;
import com.matt.mods.gems.crafting.GRecipes;
import com.matt.mods.gems.items.GItems;
import com.matt.mods.gems.tabs.GTabs;
import com.matt.mods.gems.worldgen.GWorldGen;
	
public final class GInit {
	
	public static final void initGems()
	{
		GTabs.initTabs();
		GBlocks.initBlocks();
		GItems.initItems();
		GRecipes.initRecipes();
		GWorldGen.initWorldGen();
	}
	
}
