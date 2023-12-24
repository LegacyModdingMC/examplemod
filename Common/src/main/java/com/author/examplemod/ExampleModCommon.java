package com.author.examplemod;

import net.minecraft.init.Items;

public class ExampleModCommon {

	public static void initialize() {
		ModConstants.LOGGER.info("Hello from Common init!");
		ModConstants.LOGGER.info("Diamond Item >> {}", Items.diamond.getUnlocalizedName());
	}
}
