package com.ancientshotgun.rapidreconstruction.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(Side.CLIENT)
public class ModelRegistryHandler {

	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) 
	{
		registerModel(RapidReconstructionItems.LESSER_RECONSTRUCTION_AMULET);
		registerModel(RapidReconstructionItems.NOMINAL_RECONSTRUCTION_AMULET);
		registerModel(RapidReconstructionItems.GREATER_RECONSTRUCTION_AMULET);
		registerModel(RapidReconstructionItems.GOLD_RECONSTRUCTION_CORE);
		registerModel(RapidReconstructionItems.DIAMOND_RECONSTRUCTION_CORE);
		registerModel(RapidReconstructionItems.EMERALD_RECONSTRUCTION_CORE);
	}
	
	private static void registerModel(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
