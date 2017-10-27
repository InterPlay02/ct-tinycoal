package com.sudoplay.mc.cttinycoal;

import com.sudoplay.mc.cttinycoal.items.ItemTinyCoal;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {

  @GameRegistry.ObjectHolder(Mod.MOD_ID + ":tiny_coal")
  public static ItemTinyCoal TINY_COAL;

  @GameRegistry.ObjectHolder(Mod.MOD_ID + ":tiny_charcoal")
  public static ItemTinyCoal TINY_CHARCOAL;

  @SideOnly(Side.CLIENT)
  public static void initItems() {

    TINY_COAL.initModel();
    TINY_CHARCOAL.initModel();
  }

}
