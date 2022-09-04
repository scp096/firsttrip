package com.scp096.firsttrip.items;

import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.common.util.EnumHelper;

/**
 * @author Geooo
 * @date 2022/9/3 18:39
 */
public class GeoPick extends ItemPickaxe {

    public GeoPick() {
        super(EnumHelper.addToolMaterial("geo_pick", 4, 10000, 60.0F, 10.0F, 30));
        this.setRegistryName("geo_pick");
        this.setUnlocalizedName("geo_pick");
    }
}
