package com.scp096.firsttrip.items;

import com.scp096.firsttrip.init.ModItems;
import com.scp096.firsttrip.proxy.ClientProxy;
import com.scp096.firsttrip.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * 物品栏物品模板
 * @author Geooo
 * @date 2022/9/4 11:37
 */
public class ItemBase extends Item implements IHasModel {


    public ItemBase(String name) {
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
