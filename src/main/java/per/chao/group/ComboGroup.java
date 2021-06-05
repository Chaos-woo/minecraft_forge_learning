package per.chao.group;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import per.chao.register.ItemRegister;

/**
 * Description: 自定义物品组（创造模式物品栏）
 *
 * @author W.Chao
 * @date 2021/5/23 21:33
 **/
public class ComboGroup extends ItemGroup {
	public static final ItemGroup COMBO_GROUP = new ComboGroup();

	public ComboGroup() {
		super("combo_group");
	}

	/**
	 * 物品组icon
	 *
	 * @return
	 */
	@Override
	public ItemStack createIcon() {
		return new ItemStack(ItemRegister.GREEN_APPLE.get());
	}
}
