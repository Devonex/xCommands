package org.devonex.xcommands.utils;

import net.md_5.bungee.api.ChatColor;

public class StringUtils {

    public static String colored(final String text) {
        return ChatColor.translateAlternateColorCodes('&', text);
    }
}
