package com.sudoplay.mc.cttinycoal.proxy;

import com.sudoplay.mc.cttinycoal.items.ItemTinyCoal;
import com.sudoplay.mc.cttinycoal.items.Type;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class ProxyCommon {

  public void onPreInitialization(FMLPreInitializationEvent event) {
    //
  }

  public void onInitialization(FMLInitializationEvent event) {
    //
  }

  public void onPostInitialization(FMLPostInitializationEvent event) {
    //
  }

  @SubscribeEvent
  public static void registerItems(RegistryEvent.Register<Item> event) {

    event.getRegistry().registerAll(
        new ItemTinyCoal(Type.Coal),
        new ItemTinyCoal(Type.Charcoal)
    );
  }

}
