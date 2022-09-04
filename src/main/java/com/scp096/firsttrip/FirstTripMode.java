package com.scp096.firsttrip;

import com.scp096.firsttrip.items.CustomSword;
import com.scp096.firsttrip.items.GeoPick;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = FirstTripMode.MODID, name = FirstTripMode.NAME, version = FirstTripMode.VERSION)
public class FirstTripMode {
    public static final String MODID = "firsttrip";
    public static final String NAME = "First Trip";
    public static final String VERSION = "1.0";

    private static Logger logger;
    public static ToolMaterial myToolMaterial;
    public static Item mySword;
    public static Item geoPick;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();

        myToolMaterial = EnumHelper.addToolMaterial("test", 4, 10000, 20.0F, 10000.0F, 30);
        mySword = new CustomSword(myToolMaterial);
        geoPick = new GeoPick();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
