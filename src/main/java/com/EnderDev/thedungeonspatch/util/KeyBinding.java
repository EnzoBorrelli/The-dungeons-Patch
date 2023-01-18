package com.EnderDev.thedungeonspatch.util;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.settings.KeyConflictContext;
import org.lwjgl.glfw.GLFW;

public class KeyBinding {
    public static final String KEY_CATEGORY_DUNGEONS = "key.category.thedungeonspatch.test";
    public static final String KEY_TEST_TRY = "key.thedungeonspatch.test.try";

    public static final KeyMapping TRY_KEY = new KeyMapping(KEY_TEST_TRY,
            KeyConflictContext.IN_GAME, InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_C,KEY_CATEGORY_DUNGEONS);
}
