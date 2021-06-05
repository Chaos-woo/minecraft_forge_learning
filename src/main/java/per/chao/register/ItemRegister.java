package per.chao.register;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import per.chao.ModInfo;
import per.chao.group.ComboGroup;
import per.chao.item.drink.DragonFlame;
import per.chao.item.food.GreenApple;
import per.chao.item.ingot.ObsidianIngot;
import per.chao.item.weapons.ObsidianKnife;
import per.chao.material.ComboArmorMaterial;

import java.util.function.Supplier;

/**
 * Description: 物品注册
 *
 * @author W.Chao
 * @date 2021/5/23 21:36
 **/
public class ItemRegister {
	// forge物品注册器
	public static final DeferredRegister<Item> ITEMS_REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ModInfo.MOD_ID);
	// 注册流程：
	// 1. 创建物品类
	// 2. ITEMS_REGISTRY.register(物品名, 物品类实例)

	// food
	public static final RegistryObject<Item> GREEN_APPLE = ITEMS_REGISTRY.register("green_apple", GreenApple::new);


	// drink
	public static final RegistryObject<Item> DRAGON_FLAME = ITEMS_REGISTRY.register("dragon_flame", DragonFlame::new);


	// normal item
	public static final RegistryObject<Item> OBSIDIAN_INGOT = ITEMS_REGISTRY.register("obsidian_ingot", ObsidianIngot::new);


	// armor
	public static final RegistryObject<Item> OBSIDIAN_KNIFE = ITEMS_REGISTRY.register("obsidian_knife", ObsidianKnife::new);
	public static final RegistryObject<Item> OBSIDIAN_HELMET = ITEMS_REGISTRY.register("obsidian_helmet", registryArmor(ComboArmorMaterial.OBSIDIAN, EquipmentSlotType.HEAD, null));
	public static final RegistryObject<Item> OBSIDIAN_CHESTPLATE = ITEMS_REGISTRY.register("obsidian_chestplate", registryArmor(ComboArmorMaterial.OBSIDIAN, EquipmentSlotType.CHEST, null));
	public static final RegistryObject<Item> OBSIDIAN_LEGS = ITEMS_REGISTRY.register("obsidian_leggings", registryArmor(ComboArmorMaterial.OBSIDIAN, EquipmentSlotType.LEGS, null));
	public static final RegistryObject<Item> OBSIDIAN_BOOTS = ITEMS_REGISTRY.register("obsidian_boots", registryArmor(ComboArmorMaterial.OBSIDIAN, EquipmentSlotType.FEET, null));


	/**
	 * 装备注册器
	 *
	 * @param armorMaterial                装备材料等级
	 * @param slotType                     装备位置
	 * @param requiredGroupOrLocalModGroup 是否指定其他物品组（为null时使用本模组自定义物品组）
	 * @return
	 */
	private static Supplier<ArmorItem> registryArmor(final IArmorMaterial armorMaterial, final EquipmentSlotType slotType, final ItemGroup requiredGroupOrLocalModGroup) {
		return () -> new ArmorItem(armorMaterial, slotType,
				new Item.Properties().group(requiredGroupOrLocalModGroup == null ? ComboGroup.COMBO_GROUP : requiredGroupOrLocalModGroup));
	}
}
