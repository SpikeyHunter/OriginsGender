    package com.spikeyhunter.originsgender;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
   public void onEnable() {
      this.getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "OriginsCommand by SpipkeyHunter has been enabled!");
   }

   public void onDisable() {
      this.getServer().getConsoleSender().sendMessage(ChatColor.RED + "OriginsCommand by SpipkeyHunter has been disabled!");
   }

   public boolean onCommand(CommandSender s, Command cmd, String label, String[] args) {
      Player p = (Player)s;
      String prefix = ChatColor.translateAlternateColorCodes('&', "&6&lOriginsGender &8>> ");
      if (cmd.getName().equalsIgnoreCase("male") && args.length == 0) {
         if (p.hasPermission("gender.use")) {
            if (p.hasPermission("gender.male")) {
               p.sendMessage(prefix + ChatColor.RED + "You already have a male rank");
            } else if (p.hasPermission("group.count")) {
               this.getServer().dispatchCommand(this.getServer().getConsoleSender(), "lp  user " + p.getName() + " meta setsuffix 100 &aCount");
               this.getServer().dispatchCommand(this.getServer().getConsoleSender(), "lp  user " + p.getName() + " permission set gender.male");
               this.getServer().dispatchCommand(this.getServer().getConsoleSender(), "lp  user " + p.getName() + " permission unset gender.female");
               p.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', "Your rank was set to &8[&aCount&8]"));
            } else if (p.hasPermission("group.duke")) {
               this.getServer().dispatchCommand(this.getServer().getConsoleSender(), "lp  user " + p.getName() + " meta setsuffix 110 &eDuke");
               this.getServer().dispatchCommand(this.getServer().getConsoleSender(), "lp  user " + p.getName() + " permission set gender.male");
               this.getServer().dispatchCommand(this.getServer().getConsoleSender(), "lp  user " + p.getName() + " permission unset gender.female");
               p.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', "Your rank was set to &8[&eDuke&8]"));
            } else if (p.hasPermission("group.king")) {
               this.getServer().dispatchCommand(this.getServer().getConsoleSender(), "lp  user " + p.getName() + " meta setsuffix 120 &6King");
               this.getServer().dispatchCommand(this.getServer().getConsoleSender(), "lp  user " + p.getName() + " permission set gender.male");
               this.getServer().dispatchCommand(this.getServer().getConsoleSender(), "lp  user " + p.getName() + " permission unset gender.female");
               p.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', "Your rank was set to &8[&6King&8]"));
            } else if (p.hasPermission("group.emperor")) {
               this.getServer().dispatchCommand(this.getServer().getConsoleSender(), "lp  user " + p.getName() + " meta setsuffix 130 &dEmperor");
               this.getServer().dispatchCommand(this.getServer().getConsoleSender(), "lp  user " + p.getName() + " permission set gender.male");
               this.getServer().dispatchCommand(this.getServer().getConsoleSender(), "lp  user " + p.getName() + " permission unset gender.female");
               p.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', "Your rank was set to &8[&dEmperor&8]"));
            } else if (p.hasPermission("group.imperator")) {
               this.getServer().dispatchCommand(this.getServer().getConsoleSender(), "lp  user " + p.getName() + " meta setsuffix 140 &5Imperator");
               this.getServer().dispatchCommand(this.getServer().getConsoleSender(), "lp  user " + p.getName() + " permission set gender.male");
               this.getServer().dispatchCommand(this.getServer().getConsoleSender(), "lp  user " + p.getName() + " permission unset gender.female");
               p.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', "Your rank was set to &8[&5Imperator&8]"));
            }
         } else {
            p.sendMessage(prefix + ChatColor.GREEN + "Purchase a donor rank to use this command!");
         }
      }

      if (cmd.getName().equalsIgnoreCase("female") && args.length == 0) {
         if (p.hasPermission("gender.use")) {
            if (p.hasPermission("gender.female")) {
               p.sendMessage(prefix + ChatColor.RED + "You already have a female rank");
            } else if (p.hasPermission("group.count")) {
               this.getServer().dispatchCommand(this.getServer().getConsoleSender(), "lp  user " + p.getName() + " meta setsuffix 100 &aCountess");
               this.getServer().dispatchCommand(this.getServer().getConsoleSender(), "lp  user " + p.getName() + " permission set gender.female");
               this.getServer().dispatchCommand(this.getServer().getConsoleSender(), "lp  user " + p.getName() + " permission unset gender.male");
               p.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', "Your rank was set to &8[&aCountess&8]"));
            } else if (p.hasPermission("group.duke")) {
               this.getServer().dispatchCommand(this.getServer().getConsoleSender(), "lp  user " + p.getName() + " meta setsuffix 110 &eDuchess");
               this.getServer().dispatchCommand(this.getServer().getConsoleSender(), "lp  user " + p.getName() + " permission set gender.female");
               this.getServer().dispatchCommand(this.getServer().getConsoleSender(), "lp  user " + p.getName() + " permission unset gender.male");
               p.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', "Your rank was set to &8[&eDuchess&8]"));
            } else if (p.hasPermission("group.king")) {
               this.getServer().dispatchCommand(this.getServer().getConsoleSender(), "lp  user " + p.getName() + " meta setsuffix 120 &6Queen");
               this.getServer().dispatchCommand(this.getServer().getConsoleSender(), "lp  user " + p.getName() + " permission set gender.female");
               this.getServer().dispatchCommand(this.getServer().getConsoleSender(), "lp  user " + p.getName() + " permission unset gender.male");
               p.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', "Your rank was set to &8[&6Queen&8]"));
            } else if (p.hasPermission("group.emperor")) {
               this.getServer().dispatchCommand(this.getServer().getConsoleSender(), "lp  user " + p.getName() + " meta setsuffix 130 &dEmpress");
               this.getServer().dispatchCommand(this.getServer().getConsoleSender(), "lp  user " + p.getName() + " permission set gender.female");
               this.getServer().dispatchCommand(this.getServer().getConsoleSender(), "lp  user " + p.getName() + " permission unset gender.male");
               p.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', "Your rank was set to &8[&dEmpress&8]"));
            } else if (p.hasPermission("group.imperator")) {
               this.getServer().dispatchCommand(this.getServer().getConsoleSender(), "lp  user " + p.getName() + " meta setsuffix 140 &5Imperatrix");
               this.getServer().dispatchCommand(this.getServer().getConsoleSender(), "lp  user " + p.getName() + " permission set gender.female");
               this.getServer().dispatchCommand(this.getServer().getConsoleSender(), "lp  user " + p.getName() + " permission unset gender.male");
               p.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', "Your rank was set to &8[&5Imperatrix&8]"));
            }
         } else {
            p.sendMessage(prefix + ChatColor.GREEN + "Purchase a donor rank to use this command!");
         }
      }

      return true;
   }
}
