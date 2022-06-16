/*
 *  This file (DefaultConfig.java) is a part of project XConomy
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
package me.yic.xconomy.info;


import java.math.BigDecimal;
import java.util.List;

public class DefaultConfig {

    public DefaultConfig() {
    }

    public String LANGUAGE = "";
    public boolean CHECK_UPDATE = false;
    public int REFRESH_TIME = 0;
    public boolean ECO_COMMAND = false;
    public boolean DISABLE_ESSENTIAL = false;
    public double INITIAL_BAL = 0;
    public BigDecimal PAYMENT_TAX = BigDecimal.ZERO;
    public int RANKING_SIZE = getrankingsize();
    public int LINES_PER_PAGE = 0;
    public boolean DISABLE_CACHE = false;
    public boolean TRANSACTION_RECORD = false;
    public boolean PAY_TIPS = false;
    public boolean USERNAME_IGNORE_CASE = false;

    public boolean NON_PLAYER_ACCOUNT = false;
    public List<String> NON_PLAYER_ACCOUNT_SUBSTRING = null;

    public String SINGULAR_NAME = "";
    public String PLURAL_NAME = "";
    public boolean INTEGER_BAL = false;
    public String THOUSANDS_SEPARATOR = "";
    public String DISPLAY_FORMAT = "";
    public String MAX_NUMBER = "";
    public List<Integer> FORMAT_BALANCE = null;

    public boolean BUNGEECORD_ENABLE = false;
    public String BUNGEECORD_SIGN = "";


    private int getrankingsize() {
        return 0;
    }


    private void setnonplayeraccount() {
    }

    private void setpaytips() {
    }
}
