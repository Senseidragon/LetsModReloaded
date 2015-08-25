package com.senseidragon.letsmodreloaded.init;

import com.senseidragon.letsmodreloaded.item.ItemBoomstick;
import com.senseidragon.letsmodreloaded.item.ItemDoomstick;
import com.senseidragon.letsmodreloaded.item.ItemLMR;
import com.senseidragon.letsmodreloaded.reference.Names;
import com.senseidragon.letsmodreloaded.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Copyright 2015 Senseidragon.
 * Created on 8/25/2015.
 */

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
    public static final ItemLMR boomStick = new ItemBoomstick();
    public static final ItemLMR doomStick = new ItemDoomstick();

    public static void init() {
        GameRegistry.registerItem(boomStick, Names.Items.BOOMSTICK);
        GameRegistry.registerItem(doomStick, Names.Items.DOOMSTICK);
    }
}
