package me.gav06.skullControl.utils;

import me.gav06.skullControl.AntiWitherSkull;
import me.gav06.skullControl.listeners.ChunkHandler;

public class FCKLoader {
    private AntiWitherSkull instance;

    public FCKLoader(AntiWitherSkull instance) {
        this.instance = instance;
    }

    public void initLoader() {
        this.initListeners();
    }

    private void initListeners() {
        new ChunkHandler(this.instance);
    }

    public AntiWitherSkull getInstance() {
        return this.instance;
    }
}

