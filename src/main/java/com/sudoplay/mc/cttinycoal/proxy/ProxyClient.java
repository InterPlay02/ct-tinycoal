package com.sudoplay.mc.cttinycoal.proxy;

import com.sudoplay.mc.cttinycoal.ModItems;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ProxyClient extends
    ProxyCommon {

  @SubscribeEvent
  public static void registerModels(ModelRegistryEvent event) {

    ModItems.initItems();
  }
}
