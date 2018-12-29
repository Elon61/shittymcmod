package com.example.examplemod.Blocks;

import com.example.examplemod.ExampleMod;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class FancyBlock extends BaseBlock{
    public FancyBlock() {
        super(Material.ROCK, "FancyBlock");
        setHardness(12.0F);
        setSoundType(SoundType.CLOTH);
    }
}
