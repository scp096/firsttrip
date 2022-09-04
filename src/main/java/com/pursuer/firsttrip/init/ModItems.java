package com.pursuer.firsttrip.init;

import com.pursuer.firsttrip.items.ItemMaterialBase;
import com.pursuer.firsttrip.items.ItemPickaxeBase;
import com.pursuer.firsttrip.items.ItemSwordBase;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ModItems {

    public static final List<Item> ITEMS = new ArrayList<>();

    // 黑曜石块
    public static final Item OBSIDIAN_INGOT = new ItemMaterialBase("obsidian_ingot");

    public static final Item CUSTOM_SWORD = new ItemSwordBase("custom_sword", EnumHelper.addToolMaterial("custom_sword_material", 4, 10000, 20.0F, 10000.0F, 30));

    public static final Item GEO_PICKAXE = new ItemPickaxeBase("geo_pickaxe", EnumHelper.addToolMaterial("geo_pickaxe_material", 4, 10000, 20.0F, 10000.0F, 30));
}
