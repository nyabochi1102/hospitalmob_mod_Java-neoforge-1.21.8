package net.mcreator.hospitalmob.procedures;

import net.minecraft.world.entity.Entity;

public class HospitalmobPlaybackConditionWalkProcedure {
	public static boolean eventResult = true;

	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getDeltaMovement().x() != 0 || entity.getDeltaMovement().z() != 0) {
			return true;
		}
		return false;
	}
}