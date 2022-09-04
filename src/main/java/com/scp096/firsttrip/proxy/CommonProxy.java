package com.scp096.firsttrip.proxy;

import com.scp096.firsttrip.FirstTripMod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class CommonProxy {
    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event) {
        registerRender(FirstTripMod.mySword, "models/item/my_sword.json");
        registerRender(FirstTripMod.geoPick, "models/item/geo_pick.json");

    }

    private static void registerRender(Item item, String sourcePath) {
        ResourceLocation location = item.getRegistryName() != null ? item.getRegistryName() : new ResourceLocation(FirstTripMod.MODID, sourcePath);
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(location, "inventory"));
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(FirstTripMod.mySword, FirstTripMod.geoPick);
    }
}
