package com.EnderDev.thedungeonspatch.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class NightmareBiteWeapon extends SwordItem {


    public NightmareBiteWeapon(Tier p_43269_, int p_43270_, float p_43271_, Properties p_43272_) {
        super(p_43269_, p_43270_, p_43271_, p_43272_);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        if (Screen.hasShiftDown()) {
            components.add(Component.translatable("tooltip.thedungeonspatch.nightmare_bite.tooltip.shift").withStyle(ChatFormatting.GOLD));
        } else {
            components.add(Component.translatable("tooltip.thedungeonspatch.nightmare_bite.tooltip").withStyle(ChatFormatting.AQUA));
        }
        super.appendHoverText(stack, level, components, flag);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if (!level.isClientSide() && hand == InteractionHand.OFF_HAND) {
            player.setMainArm(HumanoidArm.LEFT);
        }

        return super.use(level, player, hand);
    }
}
