package ca.wescook.wateringcans.potions;

import net.minecraft.entity.SharedMonsterAttributes;

public class ModPotions {
	public static PotionInvisible usingWateringCan;
	public static PotionInvisible slowPlayer;
	public static PotionInvisible inhibitFOV;

	public static void registerPotions() {
		// Using watering can
		usingWateringCan = new PotionInvisible(false, 0);
		usingWateringCan.setPotionName("usingWateringCan");

		// Slow player
		slowPlayer = new PotionInvisible(true, 0);
		slowPlayer.setPotionName("invSlow");
		slowPlayer.registerPotionAttributeModifier(SharedMonsterAttributes.MOVEMENT_SPEED, "2a050f8c-07be-4e06-9d39-b6d299e0505f", -0.15D, 2);

		// Inhibit FOV changes
		inhibitFOV = new PotionInvisible(false, 0);
		inhibitFOV.setPotionName("inhibitFOV");
	}
}
