package com.example.examplemod.Blocks;

import com.example.examplemod.ExampleMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BaseBlock extends Block{

    String name;

    public BaseBlock(Material mat, String name) {
        super(mat);

        this.name = name;
        setUnlocalizedName(ExampleMod.MODID + "." + name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    }

    public Item createItemBlock() {
        return new ItemBlock(this).setRegistryName(getRegistryName());
    }

    public void registerItemModel(Item itemBlock) {
        ExampleMod.proxy.registerItemRenderer(itemBlock, 0, name);
    }
}
