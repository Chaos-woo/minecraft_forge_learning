package per.chao.material;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import per.chao.register.ItemRegister;

/**
 * Description: 自定义物品等级
 *
 * 附魔机制：https://minecraft.fandom.com/wiki/Enchanting_mechanics
 *
 * @author W.Chao
 * @date 2021/5/24 23:55
 **/
public enum ComboItemTier implements IItemTier {
	//	FLAME(),
	OBSIDIAN(3, 2000, 10.0F, 4.0F, 30);

	private final int harvestLevel; // 收获等级
	private final int maxUses; // 耐久度
	private final float efficiency; // 效率
	private final float attackDamage; // 攻击伤害
	private final int enchantability; // 物品附魔等级影响因子，实际参照原版

	ComboItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability) {
		this.harvestLevel = harvestLevel;
		this.maxUses = maxUses;
		this.efficiency = efficiency;
		this.attackDamage = attackDamage;
		this.enchantability = enchantability;
	}

	@Override
	public int getMaxUses() {
		return maxUses;
	}

	@Override
	public float getEfficiency() {
		return efficiency;
	}

	@Override
	public float getAttackDamage() {
		return attackDamage;
	}

	@Override
	public int getHarvestLevel() {
		return harvestLevel;
	}

	@Override
	public int getEnchantability() {
		return enchantability;
	}

	@Override
	public Ingredient getRepairMaterial() {
		switch (this) {
			case OBSIDIAN:
				return Ingredient.fromItems(ItemRegister.OBSIDIAN_INGOT.get());
			default:
				return null;
		}
	}
}
