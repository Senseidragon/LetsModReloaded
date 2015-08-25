package com.senseidragon.letsmodreloaded.item;

import com.senseidragon.letsmodreloaded.reference.Textures;
import com.senseidragon.letsmodreloaded.utility.LogHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Copyright 2015 Senseidragon.
 * Created on 8/25/2015.
 */
public class ItemLMR extends Item {
    public ItemLMR() {
        super();
    }

    @Override
    public String getUnlocalizedName() {
        String x = String.format("item.%s%s", Textures.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
        LogHelper.info("G1:" + x);
        return x;
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack) {
        String x = String.format("item.%s%s", Textures.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
        LogHelper.info("G2:" + x);
        return x;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
        String x = unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
        LogHelper.info("G3:" + x);
        return x;
    }
}
