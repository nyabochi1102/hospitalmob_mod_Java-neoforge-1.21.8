package net.mcreator.hospitalmob.client.model;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelhospital_mob_modeldata extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("hospital_mob", "modelhospital_mob_modeldata"), "main");
	public final ModelPart stand;
	public final ModelPart right_leg;
	public final ModelPart left_leg;
	public final ModelPart body;
	public final ModelPart left_arm;
	public final ModelPart right_arm;
	public final ModelPart head;

	public Modelhospital_mob_modeldata(ModelPart root) {
		super(root);
		this.stand = root.getChild("stand");
		this.right_leg = root.getChild("right_leg");
		this.left_leg = root.getChild("left_leg");
		this.body = root.getChild("body");
		this.left_arm = root.getChild("left_arm");
		this.right_arm = root.getChild("right_arm");
		this.head = root.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition stand = partdefinition.addOrReplaceChild("stand",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -2.0F, -7.0F, 5.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(42, 9).addBox(-1.0F, -1.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 46)
						.addBox(3.0F, -1.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 23).addBox(1.0F, -24.0F, -6.0F, 1.0F, 22.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 50)
						.addBox(-1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 50).addBox(3.0F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 23)
						.addBox(1.0F, -24.0F, 1.0F, 1.0F, 22.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 2).addBox(1.0F, -25.0F, -5.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(42, 23)
						.addBox(1.0F, -17.0F, -5.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(42, 41).addBox(1.0F, -23.0F, -4.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(26, 48)
						.addBox(1.0F, -24.0F, -3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 48).addBox(0.0F, -18.0F, -4.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(22, 46)
						.addBox(-1.0F, -23.0F, -5.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 50).addBox(0.0F, -25.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 48)
						.addBox(1.0F, -28.0F, -5.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 51).addBox(1.0F, -28.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 51)
						.addBox(0.0F, -28.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-10.0F, 24.0F, 5.0F));
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(-2.0F, 7.0F, 1.0F));
		PartDefinition cube_r1 = right_leg.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(30, 36).addBox(-2.0F, -8.0F, -1.0F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 16.0F, 6.0F, 0.5087F, -0.1298F, 0.228F));
		PartDefinition cube_r2 = right_leg.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 27).addBox(-2.0F, -10.0F, -1.0F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.0F, 2.0F, 0.2618F, 0.0F, 0.0F));
		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(2.0F, 8.0F, -2.0F));
		PartDefinition cube_r3 = left_leg.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(30, 0).addBox(0.0F, -8.0F, -1.0F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 16.0F, 0.0F, 0.2618F, 0.0F, -0.1309F));
		PartDefinition cube_r4 = left_leg.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(30, 23).addBox(-1.0F, -10.0F, -1.0F, 3.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 9.0F, -2.0F, -0.1309F, 0.0F, -0.2618F));
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(-2.0F, -4.0F, -3.0F));
		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(46, 14).addBox(-5.0F, -4.0F, -1.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 16.0F, 0.0F, 0.4456F, 0.608F, 0.6731F));
		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(46, 9).addBox(-5.0F, -5.0F, -1.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 14.0F, 0.0F, -0.3107F, 0.6358F, -0.4957F));
		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 11).addBox(-1.0F, -12.0F, -1.0F, 7.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 12.0F, 3.0F, 0.224F, 0.5662F, 0.0112F));
		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(2.0F, -3.0F, -4.0F));
		PartDefinition cube_r8 = left_arm.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(42, 30).addBox(-1.3115F, -3.9047F, -1.3623F, 2.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 11.0F, -1.0F, -0.075F, 0.4749F, 0.0085F));
		PartDefinition cube_r9 = left_arm.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(12, 40).addBox(-1.0F, -9.0F, -1.0F, 2.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 8.0F, -1.0F, -0.0244F, 0.4447F, -0.3404F));
		PartDefinition cube_r10 = left_arm.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(46, 19).addBox(-4.0F, -2.0F, -1.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 15.0F, 0.0F, -0.0436F, 0.5236F, 0.0F));
		PartDefinition cube_r11 = left_arm.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(42, 0).addBox(-7.0F, -13.0F, -7.0F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 27.0F, 4.0F, 0.0F, 0.5236F, 0.0F));
		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(-4.0F, -3.0F, -2.0F));
		PartDefinition cube_r12 = right_arm.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 41).addBox(-1.0F, -9.0F, -1.0F, 2.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6917F, -0.0624F, -1.6801F));
		PartDefinition cube_r13 = right_arm.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(12, 27).addBox(-1.0F, -9.0F, -1.0F, 2.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, 9.0F, 5.0F, -0.0252F, 0.523F, -0.0504F));
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(-2.0F, -4.0F, -3.0F));
		PartDefinition cube_r14 = head.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(22, 11).addBox(-5.0F, -5.0F, -1.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0F, -4.0F, 0.7854F, 0.5236F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

	}

}