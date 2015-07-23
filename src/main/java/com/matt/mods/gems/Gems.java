package com.matt.mods.gems;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.matt.mods.gems.blocks.GBlocks;
import com.matt.mods.gems.crafting.GRecipes;
import com.matt.mods.gems.items.GItems;
import com.matt.mods.gems.tabs.GTabs;
import com.matt.mods.gems.worldgen.GWorldGen;

@Mod(modid = Gems.modid, name = Gems.name, version = Gems.version)
public class Gems {
	public static final String modid = "mattgems";
	public static final String name = "Gems";
	public static final String version = "1.8";
	public static final String prefix = modid + ":";
	
	@Instance(Gems.modid)
	public static Gems instance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		GTabs.initTabs();
		GBlocks.initBlocks(event);
		GItems.initItems(event);
		GRecipes.initRecipes();
		GWorldGen.initWorldGen();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
