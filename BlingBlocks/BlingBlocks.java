package BlingBlocks;

import BlingBlocks.blocks.Blocks;
import BlingBlocks.config.ConfigHandler;
import BlingBlocks.network.PacketHandler;
import BlingBlocks.proxies.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;


@Mod(modid = Modi.ID, name = Modi.NAME, version = Modi.VERSION)
@NetworkMod(channels = {Modi.CHANEL}, clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class)
public class BlingBlocks {
	@Instance(Modi.ID)
	public static BlingBlocks instance;
	
	@SidedProxy(clientSide = "BlingBlocks.proxies.ClientProxy", serverSide = "BlingBlocks.proxies.CommonProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		ConfigHandler.init(event.getSuggestedConfigurationFile());
		
		Blocks.init();
		
		proxy.initSounds();
		proxy.initRenderers();
		
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event){
		Blocks.addNames();
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
	
}

