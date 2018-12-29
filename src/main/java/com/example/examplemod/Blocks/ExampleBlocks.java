package com.example.examplemod.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

public class ExampleBlocks {
    @GameRegistry.ObjectHolder("examplemod:FancyBlock")
    public static FancyBlock fancyBlock;
    public static BaseBlock basicAF = new BaseBlock(Material.SAND, "basicthingy");

    public static void create(RegistryEvent.Register<Block> registry){
        registry.getRegistry().registerAll(
        );
    }

    public static void register(IForgeRegistry<Block> registry) {
        registry.registerAll(
                basicAF
                //fancyBlock2
        );
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        registry.registerAll(
                basicAF.createItemBlock()
                //fancyBlock2.createItemBlock()
        );
    }

    public static void registerModels() {
        basicAF.registerItemModel(Item.getItemFromBlock(basicAF));
        fancyBlock.initModel();
        fancyBlock.registerItemModel(Item.getItemFromBlock(fancyBlock));
        //fancyBlock2.registerItemModel(Item.getItemFromBlock(fancyBlock2));
    }
}

