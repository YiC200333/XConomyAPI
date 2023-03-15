/*
 *  This file (XConomyLoad.java) is a part of project XConomy
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
import me.yic.xconomy.info.SyncChannalType;

import java.util.concurrent.ExecutorService;

public class XConomyLoad {

    public static DefaultConfig Config;

    public static ExecutorService FixedThreadPool;


    public static boolean getSyncData_Enable(){
        return !Config.SYNCDATA_TYPE.equals(SyncChannalType.OFF);
    }

    public static void runTaskAsynchronously(Runnable runnable){
        FixedThreadPool.execute(runnable);
    }
}
