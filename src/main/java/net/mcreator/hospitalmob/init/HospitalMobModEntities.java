/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hospitalmob.init;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.hospitalmob.entity.HospitalmobEntity;
import net.mcreator.hospitalmob.HospitalMobMod;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class HospitalMobModEntities {
	public static EntityType<HospitalmobEntity> HOSPITALMOB = register("hospitalmob", EntityType.Builder.<HospitalmobEntity>of(HospitalmobEntity::new, MobCategory.MONSTER).clientTrackingRange(64).updateInterval(3)

			.sized(0.6f, 1.8f));

	public static void load() {
		init();
		registerAttributes();
	}

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> EntityType<T> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return Registry.register(BuiltInRegistries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(HospitalMobMod.MODID, registryname),
				(EntityType<T>) entityTypeBuilder.build(ResourceKey.create(Registries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(HospitalMobMod.MODID, registryname))));
	}

	public static void init() {
		HospitalmobEntity.init();
	}

	public static void registerAttributes() {
		FabricDefaultAttributeRegistry.register(HOSPITALMOB, HospitalmobEntity.createAttributes());
	}
}