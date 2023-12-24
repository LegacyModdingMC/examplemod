package com.author.examplemod;

import cpw.mods.fml.common.Mod;

@Mod(modid = ModConstants.MOD_ID, version = "1.0.0", name = "ExampleMod", acceptedMinecraftVersions = "[1.7.10]")
public class ExampleModForge {

	public ExampleModForge() {
		ModConstants.LOGGER.info("Hello Forge!");
		ExampleModCommon.initialize();
	}
}
