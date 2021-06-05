package per.chao.item.food;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import per.chao.group.ComboGroup;
import per.chao.utils.HungerUnit;
import per.chao.utils.SaturationUnit;
import per.chao.utils.TicksUnit;

/**
 * Description: 绿苹果
 *
 * @author W.Chao
 * @date 2021/5/23 21:33
 **/
public class GreenApple extends Item {
	private static final int POISON_DURATION = TicksUnit.SECONDS_TO_TICKS.get(3); // tick
	private static final int POISON_LEVEL = 1;
	private static final float PROBABILITY = 1; // 100%

	private static final Food GREEN_APPLE_FOOD = new Food.Builder()
			// 饱食度
			.saturation(SaturationUnit.SATURATION.get(10))
			// 饥饿值
			.hunger(HungerUnit.HUNGER.get(5))
			// 药水效果
			.effect(() -> new EffectInstance(Effects.POISON, POISON_DURATION, POISON_LEVEL), PROBABILITY)
			.build();

	public GreenApple() {
		super(new Properties().food(GREEN_APPLE_FOOD).group(ComboGroup.COMBO_GROUP));
	}
}
