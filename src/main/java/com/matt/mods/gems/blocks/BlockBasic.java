package com.matt.mods.gems.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import com.matt.mods.gems.Gems;
import com.matt.mods.gems.items.GItems;
import com.matt.mods.gems.tabs.GTabs;
	
public class BlockBasic extends Block {

	public BlockBasic()
	{
		this(Material.rock);
		this.setHardness(3.0F);
		this.setResistance(5.0F);
		this.setStepSound(Block.soundTypeStone);
	}
	
	public BlockBasic(Material material)
	{
		super(material);
		this.setCreativeTab(GTabs.main);
	}
	
	@Override
	public Block setBlockTextureName(String name)
	{
		return super.setBlockTextureName(Gems.prefix + name);
	}
	
	private Random rand = new Random();
    @Override
    public int getExpDrop(IBlockAccess p_149690_1_, int p_149690_5_, int p_149690_7_)
    {
        if (this.getItemDropped(p_149690_5_, rand, p_149690_7_) != Item.getItemFromBlock(this))
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
	public Item getItemDropped(int meta, Random random, int fortune)
	{
		return GBlocks.sapphire_ore == this ? GItems.sapphire : (GBlocks.ruby_ore == this ? GItems.ruby : (GBlocks.peridot_ore == this ? GItems.peridot : super.getItemDropped(meta, random, fortune)));
	}
	
}
