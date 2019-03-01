package com.ancientshotgun.rapidreconstruction;

import org.apache.logging.log4j.Logger;

import com.ancientshotgun.rapidreconstruction.proxy.IProxy;
import com.ancientshotgun.rapidreconstruction.tabs.RapidReconstructionTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=RapidReconstruction.MODID, name=RapidReconstruction.NAME, version=RapidReconstruction.VERSION, acceptedMinecraftVersions=RapidReconstruction.MC_VERSION)
public class RapidReconstruction {

	public static final String MODID = "rapidreconstruction";
	public static final String NAME = "Rapid Reconstruction";
	public static final String VERSION = "1.0.2";
	public static final String MC_VERSION = "[1.12.2]";
	
	public static final CreativeTabs RAPID_RECONSTRUCTION_TAB = new RapidReconstructionTab("tabRapidReconstruction");
	
	public static final String CLIENT = "com.ancientshotgun.rapidreconstruction.proxy.ClientProxy";
    public static final String SERVER = "com.ancientshotgun.rapidreconstruction.proxy.ServerProxy";
	
    @SidedProxy(clientSide=RapidReconstruction.CLIENT,serverSide=RapidReconstruction.SERVER)
	public static IProxy proxy;
    
    public static Logger logger;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		logger=event.getModLog();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
	    logger.info(RapidReconstruction.NAME + " says hi!");
	}
	 
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
	 
	}
}
