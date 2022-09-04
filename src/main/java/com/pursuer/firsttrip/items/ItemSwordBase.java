package com.pursuer.firsttrip.items;

import com.pursuer.firsttrip.init.ModItems;
import com.pursuer.firsttrip.proxy.ClientProxy;
import com.pursuer.firsttrip.util.IHasModel;
import net.minecraft.item.ItemSword;

/**
 * ItemSword Template
 */
public class ItemSwordBase extends ItemSword implements IHasModel {
    public ItemSwordBase(String name, ToolMaterial toolMaterial) {
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
