package com.author.examplemod;

import net.fabricmc.api.ModInitializer;

public class ExampleFabricMod implements ModInitializer {

	public void onInitialize() {
		ModConstants.LOGGER.info("Hello Fabric!");
		ExampleModCommon.initialize();
	}
}
