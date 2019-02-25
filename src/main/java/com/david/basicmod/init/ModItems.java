package com.david.basicmod.init;

import java.util.ArrayList;
import java.util.List;

import com.david.basicmod.items.ItemBase;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModItems {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item basicItem = new ItemBase("basic_item", CreativeTabs.MATERIALS);
}
