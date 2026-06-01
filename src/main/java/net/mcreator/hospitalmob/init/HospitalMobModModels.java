/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hospitalmob.init;

import net.mcreator.hospitalmob.client.model.Modelhospital_mob_modeldata;

import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class HospitalMobModModels {
	public static void clientLoad() {
		EntityModelLayerRegistry.registerModelLayer(Modelhospital_mob_modeldata.LAYER_LOCATION, Modelhospital_mob_modeldata::createBodyLayer);
	}
}