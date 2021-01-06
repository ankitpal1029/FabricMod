package com.yangit.tutorial;

import com.yangit.tutorial.registry.ModBlocks;
import com.yangit.tutorial.registry.Moditems;
import net.fabricmc.api.ModInitializer;

public class Tutorial implements ModInitializer {

    public static final String MOD_ID = "tutorial";
    @Override
    public void onInitialize() {
        Moditems.registerItems();
        ModBlocks.registerBlocks();
    }
}
