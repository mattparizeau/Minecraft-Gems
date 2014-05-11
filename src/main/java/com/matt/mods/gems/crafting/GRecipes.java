package com.matt.mods.gems.crafting;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.matt.mods.gems.blocks.GBlocks;
import com.matt.mods.gems.items.GItems;

import cpw.mods.fml.common.registry.GameRegistry;
	
public final class GRecipes {
	
	public static final void initRecipes()
	{
		GameRegistry.addRecipe(new ItemStack(GItems.ruby_pickaxe), new Object[]{
			"XXX", " I ", " I ", 'X', GItems.sapphire, 'I', Items.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(GItems.ruby_axe), new Object[]{
			"XX ", "XI ", " I ", 'X', GItems.sapphire, 'I', Items.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(GItems.ruby_shovel), new Object[]{
			"X", "I", "I", 'X', GItems.sapphire, 'I', Items.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(GItems.ruby_hoe), new Object[]{
			"XX ", " I ", " I ", 'X', GItems.sapphire, 'I', Items.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(GItems.ruby_sword), new Object[]{
			"X", "X", "I", 'X', GItems.sapphire, 'I', Items.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(GItems.ruby_pickaxe), new Object[]{
			"XXX", " I ", " I ", 'X', GItems.ruby, 'I', Items.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(GItems.ruby_axe), new Object[]{
			"XX ", "XI ", " I ", 'X', GItems.ruby, 'I', Items.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(GItems.ruby_shovel), new Object[]{
			"X", "I", "I", 'X', GItems.ruby, 'I', Items.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(GItems.ruby_hoe), new Object[]{
			"XX ", " I ", " I ", 'X', GItems.ruby, 'I', Items.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(GItems.ruby_sword), new Object[]{
			"X", "X", "I", 'X', GItems.ruby, 'I', Items.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(GItems.peridot_pickaxe), new Object[]{
			"XXX", " I ", " I ", 'X', GItems.peridot, 'I', Items.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(GItems.peridot_axe), new Object[]{
			"XX ", "XI ", " I ", 'X', GItems.peridot, 'I', Items.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(GItems.peridot_shovel), new Object[]{
			"X", "I", "I", 'X', GItems.peridot, 'I', Items.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(GItems.peridot_hoe), new Object[]{
			"XX ", " I ", " I ", 'X', GItems.peridot, 'I', Items.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(GItems.peridot_sword), new Object[]{
			"X", "X", "I", 'X', GItems.peridot, 'I', Items.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(GItems.sapphire_helmet), new Object[]{
			"XXX", "X X", 'X', GItems.sapphire
		});
		
		GameRegistry.addRecipe(new ItemStack(GItems.sapphire_chestplate), new Object[]{
			"X X", "XXX", "XXX", 'X', GItems.sapphire
		});
		
		GameRegistry.addRecipe(new ItemStack(GItems.sapphire_leggings), new Object[]{
			"XXX", "X X", "X X", 'X', GItems.sapphire
		});
		
		GameRegistry.addRecipe(new ItemStack(GItems.sapphire_boots), new Object[]{
			"X X", "X X", 'X', GItems.sapphire
		});
		
		GameRegistry.addRecipe(new ItemStack(GItems.ruby_helmet), new Object[]{
			"XXX", "X X", 'X', GItems.sapphire
		});
		
		GameRegistry.addRecipe(new ItemStack(GItems.ruby_chestplate), new Object[]{
			"X X", "XXX", "XXX", 'X', GItems.sapphire
		});
		
		GameRegistry.addRecipe(new ItemStack(GItems.ruby_leggings), new Object[]{
			"XXX", "X X", "X X", 'X', GItems.sapphire
		});
		
		GameRegistry.addRecipe(new ItemStack(GItems.ruby_boots), new Object[]{
			"X X", "X X", 'X', GItems.sapphire
		});
		
		GameRegistry.addRecipe(new ItemStack(GItems.peridot_helmet), new Object[]{
			"XXX", "X X", 'X', GItems.sapphire
		});
		
		GameRegistry.addRecipe(new ItemStack(GItems.peridot_chestplate), new Object[]{
			"X X", "XXX", "XXX", 'X', GItems.sapphire
		});
		
		GameRegistry.addRecipe(new ItemStack(GItems.peridot_leggings), new Object[]{
			"XXX", "X X", "X X", 'X', GItems.sapphire
		});
		
		GameRegistry.addRecipe(new ItemStack(GItems.peridot_boots), new Object[]{
			"X X", "X X", 'X', GItems.sapphire
		});
		
		GameRegistry.addRecipe(new ItemStack(GBlocks.sapphire_block), new Object[]{
			"XXX", "XXX", "XXX", 'X', GItems.sapphire
		});
		
		GameRegistry.addRecipe(new ItemStack(GBlocks.ruby_block), new Object[]{
			"XXX", "XXX", "XXX", 'X', GItems.ruby
		});
		
		GameRegistry.addRecipe(new ItemStack(GBlocks.peridot_block), new Object[]{
			"XXX", "XXX", "XXX", 'X', GItems.peridot
		});
	}
	
}
