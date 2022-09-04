package com.pursuer.firsttrip.items;

import com.pursuer.firsttrip.proxy.ClientProxy;
import com.pursuer.firsttrip.util.IHasModel;
import com.pursuer.firsttrip.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Item Materials Template
 */
public class ItemMaterialBase extends Item implements IHasModel {
    public ItemMaterialBase(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);
        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        ClientProxy.registerItemRender(this, 0, "inventory");
    }
}
