package com.properjobgaming.PJGTweaks;


import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.server.MinecraftServer;

@cpw.mods.fml.common.Mod(name="PJGTweaks", modid="PJGTweaks", version="1.0", acceptableRemoteVersions="*")
public class PJGTweaks
{
  public static final String MODID = "PJGTweaks";
  public static final String NAME = "PJGTweaks";
  public static final String VERSION = "1.0";
  @Mod.Instance(MODID)
  public static PJGTweaks instance;
  
  public static MinecraftServer server;
  
  public PJGTweaks() {}
  

  @Mod.EventHandler
  public void PreInit(FMLPreInitializationEvent event){
	  

	  }
 
  
  @Mod.EventHandler
  public void init(FMLInitializationEvent event) {
    instance = this;
    server = MinecraftServer.getServer();
  }
  
  @Mod.EventHandler
  public void serverStart(FMLServerStartingEvent event) {}
}
