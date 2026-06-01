package net.mcreator.hospitalmob;

import net.mcreator.hospitalmob.init.HospitalMobModModels;
import net.mcreator.hospitalmob.init.HospitalMobModEntityRenderers;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.ClientModInitializer;

@Environment(EnvType.CLIENT)
public class HospitalMobModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// Start of user code block mod constructor
		// End of user code block mod constructor
		HospitalMobModModels.clientLoad();
		HospitalMobModEntityRenderers.clientLoad();
		// Start of user code block mod init
		// End of user code block mod init
	}
	// Start of user code block mod methods
	// End of user code block mod methods
}