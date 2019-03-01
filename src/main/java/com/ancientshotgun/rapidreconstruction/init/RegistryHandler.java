package com.ancientshotgun.rapidreconstruction.init;

import com.ancientshotgun.rapidreconstruction.item.GreaterReconstructionAmulet;
import com.ancientshotgun.rapidreconstruction.item.ItemCore;
import com.ancientshotgun.rapidreconstruction.item.LesserReconstructionAmulet;
import com.ancientshotgun.rapidreconstruction.item.NominalReconstructionAmulet;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler {

	@SubscribeEvent
	public static void registerItems(Register<Item> event) 
	{
		final Item[] items = {
			new LesserReconstructionAmulet("reconstructionAmuletLesser","lesser_reconstruction_amulet"),
			new NominalReconstructionAmulet("reconstructionAmuletNominal","nominal_reconstruction_amulet"),
			new GreaterReconstructionAmulet("reconstructionAmuletGreater","greater_reconstruction_amulet"),
			new ItemCore("reconstructionCoreGold","gold_reconstruction_core"),
			new ItemCore("reconstructionCoreDiamond","diamond_reconstruction_core"),
			new ItemCore("reconstructionCoreEmerald","emerald_reconstruction_core"),
		};
		event.getRegistry().registerAll(items);
		
	}
	
}
