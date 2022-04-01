/*
 *  This file (XConomy.java) is a part of project XConomy
 *  Copyright (C) YiC and contributors
 *
 *  This program is free software: you can redistribute it and/or modify it
 *  under the terms of the GNU General Public License as published by the
 *  Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful, but
 *  WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 *  or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 *  for more details.
 *
 *  You should have received a copy of the GNU General Public License along
 *  with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package me.yic.xconomy;

import me.yic.xconomy.info.DefaultConfig;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class XConomy extends JavaPlugin {

    private static XConomy instance;
    public static DefaultConfig Config;

    @SuppressWarnings("ConstantConditions")
    public void onEnable() {
        instance = this;
        getLogger().info("XConomy加载成功");

    }

    public void onDisable() {
        getLogger().info("XConomy已成功卸载");
    }

    public static XConomy getInstance() {
        return instance;
    }


}
