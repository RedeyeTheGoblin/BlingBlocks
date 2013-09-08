package BlingBlocks;

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


@Mod(modid = "BlingBlocks", name = "Bling blocks", version = "0.01")
@NetworkMod(channels = {"Bling"}, clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class)
public class BlingBlocks {
	@Instance("BlingBlocks")
	public static BlingBlocks instance;
	
	@SidedProxy(clientSide = "BlingBlocks.proxies.ClientProxy", serverSide = "BlingBlocks.proxies.CommonProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		proxy.initSounds();
		proxy.initRenderers();
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event){
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
	
}

