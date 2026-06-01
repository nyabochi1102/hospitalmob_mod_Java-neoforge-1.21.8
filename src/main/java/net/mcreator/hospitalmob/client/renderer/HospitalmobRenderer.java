package net.mcreator.hospitalmob.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.animation.KeyframeAnimation;
import net.minecraft.client.animation.AnimationDefinition;

import net.mcreator.hospitalmob.entity.HospitalmobEntity;
import net.mcreator.hospitalmob.client.model.animations.hospital_mob_modeldata6Animation;
import net.mcreator.hospitalmob.client.model.Modelhospital_mob_modeldata;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import java.util.function.Supplier;
import java.util.Map;

@Environment(EnvType.CLIENT)
public class HospitalmobRenderer extends MobRenderer<HospitalmobEntity, LivingEntityRenderState, Modelhospital_mob_modeldata> {
	private HospitalmobEntity entity = null;
	private final ResourceLocation entityTexture = ResourceLocation.parse("hospital_mob:textures/entities/hospital_mob_texture5.png");

	public HospitalmobRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelhospital_mob_modeldata.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(HospitalmobEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
		if (this.model instanceof AnimatedModel) {
			((AnimatedModel) this.model).setEntity(entity);
		}
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}

	private static final class AnimatedModel extends Modelhospital_mob_modeldata {
		private HospitalmobEntity entity = null;
		private final Supplier<KeyframeAnimation> keyframeAnimation0;
		private final Supplier<KeyframeAnimation> keyframeAnimation1;

		public AnimatedModel(ModelPart root) {
			super(root);
			this.keyframeAnimation0 = () -> safeBake(hospital_mob_modeldata6Animation.walk_animation);
			this.keyframeAnimation1 = () -> safeBake(hospital_mob_modeldata6Animation.attack_animation);
		}

		private KeyframeAnimation safeBake(AnimationDefinition source) {
			try {
				return source.bake(root);
			} catch (IllegalArgumentException e) {
				return new AnimationDefinition(0, false, Map.of()).bake(root);
			}
		}

		public void setEntity(HospitalmobEntity entity) {
			this.entity = entity;
		}

		@Override
		public void setupAnim(LivingEntityRenderState state) {
			this.root().getAllParts().forEach(ModelPart::resetPose);
			this.keyframeAnimation0.get().apply(entity.animationState0, state.ageInTicks, 1f);
			this.keyframeAnimation1.get().apply(entity.animationState1, state.ageInTicks, 2f);
			super.setupAnim(state);
		}
	}
}