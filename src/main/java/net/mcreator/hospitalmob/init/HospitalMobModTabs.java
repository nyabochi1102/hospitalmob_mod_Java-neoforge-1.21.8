/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hospitalmob.init;

import net.minecraft.world.item.CreativeModeTabs;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class HospitalMobModTabs {
	public static void load() {
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.SPAWN_EGGS).register(tabData -> {
			tabData.accept(HospitalMobModItems.HOSPITALMOB_SPAWN_EGG);
		});
	}
}