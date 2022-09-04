package com.pursuer.firsttrip.items;

import com.pursuer.firsttrip.init.ModItems;
import com.pursuer.firsttrip.proxy.ClientProxy;
import com.pursuer.firsttrip.util.IHasModel;

import com.pursuer.firsttrip.init.ModBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class ItemBlockBase extends Block implements IHasModel {

    public ItemBlockBase(String name, Material material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        ModBlock.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(name));
    }


    @Override
    public void registerModels() {
        ClientProxy.registerItemRender(Item.getItemFromBlock(this), 0, "inventory");
    }
}
