/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hospitalmob.init;

import net.mcreator.hospitalmob.client.renderer.HospitalmobRenderer;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class HospitalMobModEntityRenderers {
	public static void clientLoad() {
		EntityRendererRegistry.register(HospitalMobModEntities.HOSPITALMOB, HospitalmobRenderer::new);
	}
}