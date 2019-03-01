package com.ancientshotgun.rapidreconstruction.tabs;

import com.ancientshotgun.rapidreconstruction.RapidReconstruction;
import com.ancientshotgun.rapidreconstruction.init.RapidReconstructionItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class RapidReconstructionTab extends CreativeTabs 
{
	
	public RapidReconstructionTab(String label) {
		super(RapidReconstruction.MODID+"."+label);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(RapidReconstructionItems.LESSER_RECONSTRUCTION_AMULET);
	}

}
