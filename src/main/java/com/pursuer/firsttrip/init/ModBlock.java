package com.pursuer.firsttrip.init;

import com.pursuer.firsttrip.items.ItemBlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlock {

    public static final List<Block> BLOCKS = new ArrayList<>();

    public static final Block obsidian_ingot_block = new ItemBlockBase("obsidian_ingot_block", Material.IRON);


}
