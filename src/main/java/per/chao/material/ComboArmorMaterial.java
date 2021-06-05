package per.chao.material;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import per.chao.register.ItemRegister;

/**
 * Description: 自定义装备等级
 *
 * @author W.Chao
 * @date 2021/5/31 23:24
 **/
public enum ComboArmorMaterial implements IArmorMaterial {
	OBSIDIAN("obsidian", // 名字
			40,  // 最大损伤因子，计算耐久值
			new int[]{5, 8, 10, 5},
			20,
			SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, // 装备穿脱声音
			2.0F, // 韧性
			0.0F, // 抗击退
			new LazyValue<>(() -> Ingredient.fromItems(ItemRegister.OBSIDIAN_INGOT.get()))); // 修复装备使用的物品

	private static final int[] MAX_DAMAGE_ARRAY = new int[]{13, 15, 16, 11};
	private final String name; // 名字，和穿在身上的材质有关
	private final int maxDamageFactor; // 最大损伤因子，用于计算耐久值
	private final int[] damageReductionAmountArray; // 不同部位的减伤
	private final int enchantability; // 物品附魔等级影响因子，实际参照原版
	private final SoundEvent soundEvent; // 装备穿脱的声音
	private final float toughness; // 韧性
	private final float knockbackResistance; // 抗击退
	private final LazyValue<Ingredient> repairMaterial; // 修复时使用的物品

	ComboArmorMaterial(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantability, SoundEvent soundEvent, float toughness, float knockbackResistance, LazyValue<Ingredient> repairMaterial) {
		this.name = name;
		this.maxDamageFactor = maxDamageFactor;
		this.damageReductionAmountArray = damageReductionAmountArray;
		this.enchantability = enchantability;
		this.soundEvent = soundEvent;
		this.toughness = toughness;
		this.knockbackResistance = knockbackResistance;
		this.repairMaterial = repairMaterial;
	}

	/**
	 * 耐久计算
	 *
	 * @param slotIn
	 * @return
	 */
	@Override
	public int getDurability(EquipmentSlotType slotIn) {
		return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
	}

	/**
	 * 减伤计算
	 *
	 * @param slotIn
	 * @return
	 */
	@Override
	public int getDamageReductionAmount(EquipmentSlotType slotIn) {
		return this.damageReductionAmountArray[slotIn.getIndex()];
	}

	@Override
	public int getEnchantability() {
		return this.enchantability;
	}

	@Override
	public SoundEvent getSoundEvent() {
		return this.soundEvent;
	}

	@Override
	public Ingredient getRepairMaterial() {
		return this.repairMaterial.getValue();
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public float getToughness() {
		return this.toughness;
	}

	@Override
	public float getKnockbackResistance() {
		return this.knockbackResistance;
	}
}
