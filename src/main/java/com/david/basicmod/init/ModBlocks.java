package com.david.basicmod.init;

import java.util.ArrayList;
import java.util.List;

import com.david.basicmod.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class ModBlocks {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block BASIC_BLOCK = new BlockBase("basic_block", Material.ROCK, CreativeTabs.BUILDING_BLOCKS);
}