package com.ancientshotgun.rapidreconstruction.item;

import com.ancientshotgun.rapidreconstruction.RapidReconstruction;

import net.minecraft.item.Item;

public class ItemCore extends Item {

	public ItemCore(String unlocalizedName, String registryName) {
		setRegistryName(registryName);
		setUnlocalizedName(RapidReconstruction.MODID + "." +unlocalizedName);
		setCreativeTab(RapidReconstruction.RAPID_RECONSTRUCTION_TAB);
	}

}
