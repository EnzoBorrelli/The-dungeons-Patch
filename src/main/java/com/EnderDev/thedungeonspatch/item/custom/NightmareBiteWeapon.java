package com.EnderDev.thedungeonspatch.item.custom;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class NightmareBiteWeapon extends Item {
    public NightmareBiteWeapon(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
if(!level.isClientSide() && hand == InteractionHand.OFF_HAND){
    player.setMainArm(HumanoidArm.LEFT);
}

        return super.use(level, player, hand);
    }
}
