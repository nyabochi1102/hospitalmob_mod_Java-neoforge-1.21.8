/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hospitalmob.init;

import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.hospitalmob.HospitalMobMod;

import java.util.function.Function;

public class HospitalMobModItems {
	public static Item HOSPITALMOB_SPAWN_EGG;

	public static void load() {
		HOSPITALMOB_SPAWN_EGG = register("hospitalmob_spawn_egg", properties -> new SpawnEggItem(HospitalMobModEntities.HOSPITALMOB, properties));
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> I register(String name, Function<Item.Properties, ? extends I> supplier) {
		return (I) Items.registerItem(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(HospitalMobMod.MODID, name)), (Function<Item.Properties, Item>) supplier);
	}
}