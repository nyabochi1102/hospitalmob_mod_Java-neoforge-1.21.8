package net.mcreator.hospitalmob.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class HospitalmobPlaybackConditionProcedure {
	public static boolean eventResult = true;

	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity instanceof LivingEntity _livEnt0 && _livEnt0.swinging;
	}
}