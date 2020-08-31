package me.gav06.skullControl.listeners;

import me.gav06.skullControl.AntiWitherSkull;
import org.bukkit.Bukkit;
import org.bukkit.Chunk;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.ChunkLoadEvent;
import org.bukkit.plugin.Plugin;

public class ChunkHandler
implements Listener {
    private AntiWitherSkull instance;

    public ChunkHandler(AntiWitherSkull instance) {
        this.instance = instance;
        Bukkit.getPluginManager().registerEvents((Listener)this, (Plugin)this.instance);
    }

    @EventHandler
    public void onLoad(ChunkLoadEvent event) {
        Chunk chunk = event.getChunk();
        for (Entity entity : chunk.getEntities()) {
            if (!entity.getType().equals((Object)EntityType.WITHER_SKULL)) continue;
            entity.remove();
        }
    }
}

