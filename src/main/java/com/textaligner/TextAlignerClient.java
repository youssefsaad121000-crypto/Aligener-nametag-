package com.textaligner;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TextAlignerClient implements ClientModInitializer {

    public static final String MOD_ID = "textaligner";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitializeClient() {
        LOGGER.info("TextAligner initialized!");
    }
}
