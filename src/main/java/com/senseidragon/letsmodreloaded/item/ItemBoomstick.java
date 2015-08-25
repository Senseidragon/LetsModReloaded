package com.senseidragon.letsmodreloaded.item;

import com.senseidragon.letsmodreloaded.reference.Names;
import com.senseidragon.letsmodreloaded.reference.Reference;
import com.senseidragon.letsmodreloaded.reference.Textures;
import com.senseidragon.letsmodreloaded.utility.LogHelper;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Copyright 2015 Senseidragon.
 * Created on 8/25/2015.
 */
public class ItemBoomstick extends ItemLMR {
    public ItemBoomstick() {
        super();
        this.setUnlocalizedName(Names.Items.BOOMSTICK);
        this.setTextureName(Textures.RESOURCE_PREFIX + Names.Items.BOOMSTICK);
    }
}
