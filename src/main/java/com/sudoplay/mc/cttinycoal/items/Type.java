package com.sudoplay.mc.cttinycoal.items;

import javax.annotation.Nonnull;

public enum Type {

  Coal(0, "coal"),
  Charcoal(1, "charcoal");

  private final int meta;
  private final String name;

  Type(
      int meta,
      String name
  ) {

    this.meta = meta;
    this.name = name;
  }

  @Nonnull
  public String getName() {

    return this.name;
  }

  public int getMeta() {

    return this.meta;
  }
}
