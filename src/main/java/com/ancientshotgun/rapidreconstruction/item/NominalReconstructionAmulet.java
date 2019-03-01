package com.ancientshotgun.rapidreconstruction.item;

import com.ancientshotgun.rapidreconstruction.RapidReconstructionConfigOptions;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;

public class NominalReconstructionAmulet extends ReconstructionAmulet {
	
	public static int RestoreAmount;
	public NominalReconstructionAmulet(String unlocalizedName, String registryName) {
		super(unlocalizedName,registryName);
		setMaxDamage(RapidReconstructionConfigOptions.NominalAmuletDurability);
		RestoreAmount = RapidReconstructionConfigOptions.NominalAmuletRestoreAmount;
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		if (handIn == EnumHand.MAIN_HAND && playerIn.getHeldItem(EnumHand.OFF_HAND).isEmpty()) {
			IItemHandler inventory = playerIn.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null);
			for (int i = 0; i < inventory.getSlots(); i++) {
				ItemStack toRepair = inventory.getStackInSlot(i);
				if (!toRepair.isEmpty() && !(toRepair.getItem() instanceof ReconstructionAmulet)
					&& toRepair.getItemDamage() >= RestoreAmount) {

					toRepair.getItem().setDamage(toRepair,toRepair.getItemDamage() - RestoreAmount);
					if (!playerIn.isCreative()) {
						playerIn.getHeldItem(handIn).setItemDamage(playerIn.getHeldItem(handIn).getItemDamage() + 1);
					}
					break;

				}
			}
		}
		if (handIn == EnumHand.OFF_HAND) {
			ItemStack toRepair = playerIn.getHeldItem(EnumHand.MAIN_HAND);
			if (!toRepair.isEmpty() && toRepair.getItemDamage() >= RestoreAmount && !(toRepair.getItem() instanceof ReconstructionAmulet)) {
				toRepair.getItem().setDamage(toRepair,toRepair.getItemDamage() - RestoreAmount);
				if (!playerIn.isCreative()) {
					playerIn.getHeldItem(handIn).setItemDamage(playerIn.getHeldItem(handIn).getItemDamage() + 1);
				}
			}

		}

		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
	}
}
