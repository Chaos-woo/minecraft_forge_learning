package per.chao.item.drink;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.UseAction;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import per.chao.group.ComboGroup;
import per.chao.register.ItemRegister;
import per.chao.utils.*;

/**
 * Description: 龙焰
 *
 * @author W.Chao
 * @date 2021/5/23 21:33
 **/
public class DragonFlame extends Item {
	private static final int FIRE_RESISTANCE_DURATION = TicksUnit.MINUTES_TO_TICKS.get(10); // tick
	private static final int FIRE_RESISTANCE_LEVEL = PoisonLevelUnit.LEVEL_2;
	private static final float FIRE_RESISTANCE_PROBABILITY = ProbabilityUnit.PERCENT_100.get();

	private static final Food DRAGON_FLAME = new Food.Builder()
			// 饱食度
			.saturation(SaturationUnit.SATURATION.get(0))
			// 饥饿值
			.hunger(HungerUnit.HUNGER.get(0))
			.setAlwaysEdible()
			// 药水效果
			.effect(() -> new EffectInstance(Effects.FIRE_RESISTANCE, FIRE_RESISTANCE_DURATION, FIRE_RESISTANCE_LEVEL), FIRE_RESISTANCE_PROBABILITY)
			.effect(() -> new EffectInstance(Effects.INSTANT_DAMAGE, 0, 0), ProbabilityUnit.PERCENT_100.get())
			.build();

	public DragonFlame() {
		super(new Properties().food(DRAGON_FLAME).group(ComboGroup.COMBO_GROUP));
	}

	@Override
	public UseAction getUseAction(ItemStack stack) {
		return UseAction.DRINK;
	}
}
