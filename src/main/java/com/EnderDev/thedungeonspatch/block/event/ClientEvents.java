package com.EnderDev.thedungeonspatch.block.event;

import com.EnderDev.thedungeonspatch.TheDungeonsPatch;
import com.EnderDev.thedungeonspatch.util.KeyBinding;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class ClientEvents {
    @Mod.EventBusSubscriber(modid = TheDungeonsPatch.MOD_ID, value = Dist.CLIENT)
    public static class ClientForgeEvents {

@SubscribeEvent
        public static void onKeyInput(InputEvent.Key event) {
            if(KeyBinding.TRY_KEY.consumeClick()) {
                Minecraft.getInstance().player.sendSystemMessage(Component.translatable("key.thedungeonspatch.try_key").withStyle(ChatFormatting.GREEN));
            }
        }
    }
    @Mod.EventBusSubscriber(modid = TheDungeonsPatch.MOD_ID, value = Dist.CLIENT,bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModBusEvents{
        @SubscribeEvent
        public static void onKeyRegister(RegisterKeyMappingsEvent event) {
            event.register(KeyBinding.TRY_KEY);
        }
    }
}
