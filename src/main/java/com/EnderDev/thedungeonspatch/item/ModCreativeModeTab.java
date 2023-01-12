package com.EnderDev.thedungeonspatch.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab TLHOE_WEAPONS = new CreativeModeTab("heart_weapons") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TEST.get());
        }
    };
    public static final CreativeModeTab TLHOE_ARMOURS = new CreativeModeTab("heart_armours") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TEST.get());
        }
    };
    public static final CreativeModeTab TLHOE_MOBS = new CreativeModeTab("heart_mobs") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TEST.get());
        }
    };
}
