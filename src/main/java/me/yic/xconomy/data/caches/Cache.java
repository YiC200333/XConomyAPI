/*
 *  This file (Cache.java) is a part of project XConomy
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
package me.yic.xconomy.data.caches;

import org.bukkit.entity.Player;

import java.math.BigDecimal;
import java.util.*;

public class Cache {
    public static List<String> baltop_papi = new ArrayList<>();
    public static BigDecimal sumbalance = BigDecimal.ZERO;


    public static BigDecimal getBalanceFromCacheOrDB(UUID u) {
        return null;
    }


    public static void change(String type, UUID u, String playername, BigDecimal amount, Boolean isAdd, String reason) {
    }


    public static UUID translateUUID(String name, Player pp) {
        return null;
    }


}
