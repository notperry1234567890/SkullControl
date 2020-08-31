package me.gav06.skullControl;

import me.gav06.skullControl.utils.FCKLoader;
import org.bukkit.plugin.java.JavaPlugin;

public class AntiWitherSkull
extends JavaPlugin {
    private FCKLoader loader;

    public void onEnable() {
        this.loader = new FCKLoader(this);
        this.loader.initLoader();
    }

    public FCKLoader getLoader() {
        return this.loader;
    }
}

