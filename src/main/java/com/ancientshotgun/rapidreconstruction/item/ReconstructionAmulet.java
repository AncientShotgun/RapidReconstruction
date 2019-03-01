package com.ancientshotgun.rapidreconstruction.item;

import com.ancientshotgun.rapidreconstruction.RapidReconstruction;

import net.minecraft.item.Item;

public abstract class ReconstructionAmulet extends Item {
	
	public ReconstructionAmulet(String unlocalizedName, String registryName) {
		setUnlocalizedName(RapidReconstruction.MODID + "." + unlocalizedName);
		setRegistryName(registryName);
		setCreativeTab(RapidReconstruction.RAPID_RECONSTRUCTION_TAB);
		setMaxStackSize(1);
		setNoRepair();
	}
	
}
