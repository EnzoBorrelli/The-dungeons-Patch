package com.EnderDev.thedungeonspatch.item;

import com.EnderDev.thedungeonspatch.TheDungeonsPatch;
import com.EnderDev.thedungeonspatch.item.custom.NightmareBiteWeapon;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TheDungeonsPatch.MOD_ID);

    public static final RegistryObject<Item> TEST = ITEMS.register("t_letter",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TLHOE_WEAPONS)));
    public static final RegistryObject<Item> NIGHTMARE_BITE = ITEMS.register("nightmare_bite",
            () -> new NightmareBiteWeapon(new Item.Properties().tab(ModCreativeModeTab.TLHOE_WEAPONS).stacksTo(2)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
