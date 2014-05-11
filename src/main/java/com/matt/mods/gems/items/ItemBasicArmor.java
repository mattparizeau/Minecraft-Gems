package com.matt.mods.gems.items;

import com.matt.mods.gems.Gems;
import com.matt.mods.gems.tabs.GTabs;

import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
	
public class ItemBasicArmor extends ItemArmor {

	private String armorTexture = Gems.prefix + "textures/models/armor/";
	
	public ItemBasicArmor(ArmorMaterial material, int type)
	{
		super(material, 0, type);
		this.setCreativeTab(GTabs.main);
	}
	
	@Override
	public Item setTextureName(String name)
	{
		this.setArmorTexture(name);
		return super.setTextureName(Gems.prefix + name + "_" + getArmor());
	}
	
	private String getArmor()
	{
		switch (this.armorType)
		{
			case 0: return "helmet";
			case 1: return "chestplate";
			case 2: return "leggings";
			case 3: return "boots";
		}
		return "";
	}
	
	private void setArmorTexture(String texture)
	{
		if (this.armorType == 0 || this.armorType == 1 || this.armorType == 3)
		{
			this.armorTexture += texture + "_layer_1.png";
		} else {
			this.armorTexture += texture + "_layer_2.png";
		}
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		return this.armorTexture;
	}
	
}
