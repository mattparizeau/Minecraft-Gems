package com.matt.mods.gems.tabs;

import net.minecraft.creativetab.CreativeTabs;
	
public final class GTabs {
	
	public static CreativeTabs main;
	
	public static final void initTabs()
	{
		main = new TabMain("gems");
	}
	
}
