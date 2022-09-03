package com.scp096.firsttrip;

import net.minecraft.item.ItemSword;

public class CustomSword extends ItemSword {
    public CustomSword(ToolMaterial material) {
        super(material);
        this.setRegistryName("my_sword");
        this.setUnlocalizedName("my_sword");
    }
}
