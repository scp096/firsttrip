package com.pursuer.firsttrip.items;

import com.pursuer.firsttrip.proxy.ClientProxy;
import com.pursuer.firsttrip.util.IHasModel;
import com.pursuer.firsttrip.init.ModItems;
import net.minecraft.item.ItemPickaxe;

/**
 * ItemPickaxe Template
 */
public class ItemPickaxeBase extends ItemPickaxe implements IHasModel {
    public ItemPickaxeBase(String name, ToolMaterial toolMaterial) {
        super(toolMaterial);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        ClientProxy.registerItemRender(this, 0, "inventory");
    }
}
