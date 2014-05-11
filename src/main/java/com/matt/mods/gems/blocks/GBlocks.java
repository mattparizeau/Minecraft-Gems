package com.matt.mods.gems.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
	
public final class GBlocks {
	
	public static Block sapphire_ore;
	public static Block ruby_ore;
	public static Block peridot_ore;
	
	public static Block sapphire_block;
	public static Block ruby_block;
	public static Block peridot_block;
	
	public static final void initBlocks()
	{
		sapphire_ore = new BlockBasic().setBlockName("sapphire_ore").setBlockTextureName("sapphire_ore");
		ruby_ore = new BlockBasic().setBlockName("ruby_ore").setBlockTextureName("ruby_ore");
		peridot_ore = new BlockBasic().setBlockName("peridot_ore").setBlockTextureName("peridot_ore");
		
		sapphire_block = new BlockBasic().setBlockName("sapphire_block").setBlockTextureName("sapphire_block");
		ruby_block = new BlockBasic().setBlockName("ruby_block").setBlockTextureName("ruby_block");
		peridot_block = new BlockBasic().setBlockName("peridot_block").setBlockTextureName("peridot_block");
		
		GameRegistry.registerBlock(sapphire_ore, "sapphire_ore");
		GameRegistry.registerBlock(ruby_ore, "ruby_ore");
		GameRegistry.registerBlock(peridot_ore, "peridot_ore");
		
		GameRegistry.registerBlock(sapphire_block, "sapphire_block");
		GameRegistry.registerBlock(ruby_block, "ruby_block");
		GameRegistry.registerBlock(peridot_block, "peridot_block");
	}
	
}
