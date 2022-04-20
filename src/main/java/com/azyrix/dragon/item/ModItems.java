package com.azyrix.dragon.item;

import com.azyrix.dragon.DragonsReforged;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DragonsReforged.MOD_ID);

    public static final RegistryObject<Item> BLUE_WET_INGOT = ITEMS.register("blue_wet_ingot",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.DRAGONS_REFORGED).fireResistant()));

    public static final RegistryObject<Item> WET_SCALES = ITEMS.register("wet_scales",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.DRAGONS_REFORGED).fireResistant()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
