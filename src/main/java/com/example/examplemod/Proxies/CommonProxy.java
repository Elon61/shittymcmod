package com.example.examplemod.Proxies;

import com.example.examplemod.Blocks.BaseBlock;
import com.example.examplemod.Blocks.ExampleBlocks;
import com.example.examplemod.Blocks.FancyBlock;
import com.example.examplemod.Configs.Config;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

@Mod.EventBusSubscriber
public class CommonProxy {
    public static Configuration config;

    public void preInit(FMLPreInitializationEvent e) {
        File directory = e.getModConfigurationDirectory();
        config = new Configuration(new File(directory.getPath(), "modtut.cfg"));
        Config.readConfig();
    }

    public void init(FMLInitializationEvent e) {
        if (config.hasChanged()) {
            config.save();
        }
    }

    public void postInit(FMLPostInitializationEvent e) {
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(new FancyBlock());
        ExampleBlocks.create(event);
        ExampleBlocks.register(event.getRegistry());
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(ExampleBlocks.fancyBlock.createItemBlock());
        ExampleBlocks.registerItemBlocks(event.getRegistry());
    }

    public void registerBlockRenderer(Block item, int meta, String id) {

    }

    public void registerItemRenderer(Item item, int meta, String id) {
    }
}
