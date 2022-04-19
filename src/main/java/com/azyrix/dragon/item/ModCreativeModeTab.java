package com.azyrix.dragon.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
        public static final CreativeModeTab DRAGONS_REFORGED = new CreativeModeTab("dragontab") {
            @Override
            public ItemStack makeIcon() {
                return new ItemStack(ModItems.INGOT_OF_BLUE_WET_SCALES.get());
            }
        };
    }
