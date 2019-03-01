package com.ancientshotgun.rapidreconstruction;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.*;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = RapidReconstruction.MODID)
@Config.LangKey("rapidreconstruction.config.title")
public class RapidReconstructionConfigOptions {

	@Comment("Sets the durability of the Lesser Reconstruction Amulet.")
	public static int LesserAmuletDurability = 50;

	@Comment( "Sets the amount of durability repaired with every use of the Lesser Reconstruction Amulet." )
	public static int LesserAmuletRestoreAmount = 50;

	@Comment("Sets the durability of the Nominal Reconstruction Amulet.")
	public static int NominalAmuletDurability = 100;

	@Comment("Sets the amount of durability repaired with every use of the Nominal Reconstruction Amulet.")
	public static int NominalAmuletRestoreAmount = 100;

	@Comment("Sets the durability of the Greater Reconstruction Amulet.")
	public static int GreaterAmuletDurability = 150;

	@Comment("Sets the amount of durability repaired with every use of the Greater Reconstruction Amulet.")
	public static int GreaterAmuletRestoreAmount = 150;

	@EventBusSubscriber(modid = RapidReconstruction.MODID)
	public static class EventHandler {
		@SubscribeEvent
		public static void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
			if (event.getModID().equals(RapidReconstruction.MODID)) {
				ConfigManager.sync(RapidReconstruction.MODID, Config.Type.INSTANCE);
			}

		}

	}

}
