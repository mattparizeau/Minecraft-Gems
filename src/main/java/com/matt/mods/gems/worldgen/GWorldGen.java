package com.matt.mods.gems.worldgen;

import java.util.Random;

import com.matt.mods.gems.blocks.GBlocks;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;
	
public final class GWorldGen implements IWorldGenerator {

	public static final void initWorldGen()
	{
		GameRegistry.registerWorldGenerator(new GWorldGen(), 0);
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		int x = chunkX * 16;
		int z = chunkZ * 16;
		
		if (world.provider.dimensionId == 0)
		{
			this.generateOre(random, world, x, z, 20, 8, 0, 64, GBlocks.sapphire_ore);
			this.generateOre(random, world, x, z, 20, 8, 0, 64, GBlocks.ruby_ore);
			this.generateOre(random, world, x, z, 20, 8, 0, 64, GBlocks.peridot_ore);
		}
	}
	
	public void generateOre(Random random, World world, int x, int z, int tries, int amount, int minY, int maxY, Block ore)
	{
		for (int i = 0; i < tries; i++)
		{
			int x1 = random.nextInt(16) + x;
			int y1 = random.nextInt(maxY - minY) + minY;
			int z1 = random.nextInt(16) + z;
			new WorldGenMinable(ore, amount).generate(world, random, x1, y1, z1);
		}
	}
	
}