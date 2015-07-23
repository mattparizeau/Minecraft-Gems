package com.matt.mods.gems.blocks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

import com.matt.mods.gems.Gems;
	
public final class GBlocks {
	
	public static Block sapphire_ore;
	public static Block ruby_ore;
	public static Block peridot_ore;
	
	public static Block sapphire_block;
	public static Block ruby_block;
	public static Block peridot_block;
	
	public static final void initBlocks(FMLInitializationEvent event)
	{
		sapphire_ore = new BlockBasic("sapphire_ore").setUnlocalizedName("sapphire_ore");
		ruby_ore = new BlockBasic("ruby_ore").setUnlocalizedName("ruby_ore");
		peridot_ore = new BlockBasic("peridot_ore").setUnlocalizedName("peridot_ore");
		
		sapphire_block = new BlockBasic("sapphire_block").setUnlocalizedName("sapphire_block");
		ruby_block = new BlockBasic("ruby_block").setUnlocalizedName("ruby_block");
		peridot_block = new BlockBasic("peridot_block").setUnlocalizedName("peridot_block");
		
		//register renders
    	if(event.getSide() == Side.CLIENT)
    	{
	    	RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
	    
	    	//blocks
	    	renderItem.getItemModelMesher().register(Item.getItemFromBlock(sapphire_ore), 0, new ModelResourceLocation(Gems.prefix + ((BlockBasic) sapphire_ore).getName(), "inventory"));
	    	renderItem.getItemModelMesher().register(Item.getItemFromBlock(ruby_ore), 0, new ModelResourceLocation(Gems.prefix + ((BlockBasic) ruby_ore).getName(), "inventory"));
	    	renderItem.getItemModelMesher().register(Item.getItemFromBlock(peridot_ore), 0, new ModelResourceLocation(Gems.prefix + ((BlockBasic) peridot_ore).getName(), "inventory"));
	    	renderItem.getItemModelMesher().register(Item.getItemFromBlock(sapphire_block), 0, new ModelResourceLocation(Gems.prefix + ((BlockBasic) sapphire_block).getName(), "inventory"));
	    	renderItem.getItemModelMesher().register(Item.getItemFromBlock(ruby_block), 0, new ModelResourceLocation(Gems.prefix + ((BlockBasic) ruby_block).getName(), "inventory"));
	    	renderItem.getItemModelMesher().register(Item.getItemFromBlock(peridot_block), 0, new ModelResourceLocation(Gems.prefix + ((BlockBasic) peridot_block).getName(), "inventory"));
	    }
	}
	
}
