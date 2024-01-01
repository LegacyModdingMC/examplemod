package com.author.examplemod;

import net.minecraftforge.fml.common.Mod;

@Mod(modid = ModConstants.MOD_ID, version = "1.0.0", name = "ExampleMod", acceptedMinecraftVersions = "[1.12.2]")
public class ExampleModForge {

	public ExampleModForge() {
		ModConstants.LOGGER.info("Hello Forge!");
		ExampleModCommon.initialize();
	}
}
