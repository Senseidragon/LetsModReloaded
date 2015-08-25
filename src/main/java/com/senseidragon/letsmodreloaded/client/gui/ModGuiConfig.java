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

package com.senseidragon.letsmodreloaded.client.gui;

import com.senseidragon.letsmodreloaded.handlers.ConfigurationHandler;
import com.senseidragon.letsmodreloaded.reference.Reference;
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

public class ModGuiConfig extends GuiConfig {
    public ModGuiConfig(GuiScreen guiScreen) {
        super(guiScreen,
                new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
    }

//    public ModGuiConfig(GuiScreen parentScreen, List<IConfigElement> configElements, String modID, String configID, boolean allRequireWorldRestart, boolean allRequireMcRestart, String title) {
//        super(parentScreen, configElements, modID, configID, allRequireWorldRestart, allRequireMcRestart, title);
//    }
}
