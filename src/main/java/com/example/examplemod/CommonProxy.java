package com.example.examplemod;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.rmi.registry.Registry;

@Mod.EventBusSubscriber
public class CommonProxy {
    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event) {
        registerRender(ExampleMod.mySword);
    }

    private static void registerRender(Item item) {
        ResourceLocation location = item.getRegistryName() != null ? item.getRegistryName() : new ResourceLocation(ExampleMod.MODID, "models/item/my_sword.json");
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(location, "inventory"));
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(ExampleMod.mySword);
    }
}
