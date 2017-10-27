package com.sudoplay.mc.cttinycoal.items;

import com.sudoplay.mc.cttinycoal.Mod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemTinyCoal extends
    Item {

  public ItemTinyCoal(
      Type type
  ) {

    MinecraftForge.EVENT_BUS.register(this);

    String name = "tiny_" + type.getName();
    this.setRegistryName(name);
    this.setUnlocalizedName(Mod.MOD_ID + "." + name);
    this.setMaxStackSize(64);
  }

  @SideOnly(Side.CLIENT)
  public void initModel() {

    ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(this.getRegistryName(), "inventory"));
  }

  @Override
  public boolean isEnchantable(ItemStack stack) {

    return false;
  }

  @Override
  public int getItemBurnTime(ItemStack itemStack) {

    return 200;
  }
}
