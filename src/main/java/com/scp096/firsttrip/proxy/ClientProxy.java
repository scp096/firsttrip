package com.scp096.firsttrip.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

/**
 * @author Geooo
 * @date 2022/9/4 13:55
 */
public class ClientProxy extends CommonProxy {

    public static void registerItemRender(Item item, int meta, String id) {

        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
    }
}
