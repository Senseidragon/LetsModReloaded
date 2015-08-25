/*
 * Copyright (c) 2015 Senseidragon.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.senseidragon.letsmodreloaded;

import com.senseidragon.letsmodreloaded.handlers.ConfigurationHandler;
import com.senseidragon.letsmodreloaded.init.ModItems;
import com.senseidragon.letsmodreloaded.proxy.IProxy;
import com.senseidragon.letsmodreloaded.reference.Reference;
import com.senseidragon.letsmodreloaded.utility.LogHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.MOD_VERSION, guiFactory = Reference.GUIFACTORY_CLASS)
public class LetsModReloaded {
    @Mod.Instance(Reference.MOD_ID)
    public static LetsModReloaded instance;

    @SidedProxy(clientSide = Reference.CLIENTPROXY_CLASS, serverSide = Reference.SERVERPROXY_CLASS, modId = Reference.MOD_ID)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        // Network Handling, Mod Configuration, Block/Item Initialization
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        ModItems.init();
        LogHelper.info("Pre Initialization complete!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        // Crafting Initialization
        LogHelper.info("Initialization complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        // Run after other mods have initialized
        LogHelper.info("Post Initialization complete!");
    }
}

