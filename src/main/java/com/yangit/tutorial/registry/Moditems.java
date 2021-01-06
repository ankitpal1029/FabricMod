package com.yangit.tutorial.registry;

import com.yangit.tutorial.Tutorial;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class Moditems {

    //Items
    public static final Item RUBY = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    //block items
    public static final BlockItem RUBY_BLOCKS = new BlockItem(ModBlocks.RUBY_BLOCK,new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static void registerItems(){
        Registry.register(Registry.ITEM, new Identifier(Tutorial.MOD_ID,"ruby"),RUBY);
        Registry.register(Registry.ITEM, new Identifier(Tutorial.MOD_ID,"ruby_block"),RUBY_BLOCKS);
    }
}
