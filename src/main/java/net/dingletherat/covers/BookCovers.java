package net.dingletherat.covers;

import net.dingletherat.covers.item.CoverItems;
import net.dingletherat.covers.item.CoverGroup;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BookCovers implements ModInitializer {
	public static final String MOD_ID = "book-covers";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");

        // Main
        CoverItems.registerItems();
        CoverGroup.registerItemGroups();
	}
}