package com.matt.mods.gems;

import com.matt.mods.gems.core.GInit;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Gems.modid, name = Gems.name, version = Gems.version)
public class Gems {
	public static final String modid = "mattgems";
	public static final String name = "Gems";
	public static final String version = "1.7.2";
	public static final String prefix = modid + ":";
	
	@Instance(Gems.modid)
	public static Gems instance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		GInit.initGems();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
