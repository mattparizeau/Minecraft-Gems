package com.matt.mods.gems.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.matt.mods.gems.items.GItems;
import com.matt.mods.gems.tabs.GTabs;
	
public class BlockBasic extends Block {

	protected String name;
	
	public BlockBasic(String name)
	{
		this(name, Material.rock);
		this.setHardness(3.0F);
		this.setResistance(5.0F);
		this.setStepSound(Block.soundTypeStone);
	}
	
	public BlockBasic(String name, Material material)
	{
		super(material);
		this.name = name;
		GameRegistry.registerBlock(this, name);
		this.setCreativeTab(GTabs.main);
	}
	
	public String getName()
	{
		return this.name;
	}
	
	private Random rand = new Random();
    @Override
    public int getExpDrop(IBlockAccess world, BlockPos pos, int fortune)
    {
        IBlockState state = world.getBlockState(pos);
        Random rand = world instanceof World ? ((World)world).rand : new Random();
        if (this.getItemDropped(state, rand, fortune) != Item.getItemFromBlock(this))
        {
            int j1 = 0;

            if (this == GBlocks.sapphire_ore || this == GBlocks.ruby_ore || this == GBlocks.peridot_ore)
            {
                j1 = MathHelper.getRandomIntegerInRange(rand, 0, 2);
            }

            return j1;
        }
        return 0;
    }
	
	@Override
	public Item getItemDropped(IBlockState state, Random random, int fortune)
	{
		return GBlocks.sapphire_ore == this ? GItems.sapphire : (GBlocks.ruby_ore == this ? GItems.ruby : (GBlocks.peridot_ore == this ? GItems.peridot : super.getItemDropped(state, random, fortune)));
	}
	
}
