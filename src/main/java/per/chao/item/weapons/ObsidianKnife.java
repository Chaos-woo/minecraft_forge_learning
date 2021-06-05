package per.chao.item.weapons;

import net.minecraft.item.SwordItem;
import per.chao.group.ComboGroup;
import per.chao.material.ComboItemTier;

/**
 * Description: 黑曜石匕首
 *
 * @author W.Chao
 * @date 2021/5/30 0:07
 **/
public class ObsidianKnife extends SwordItem {
	public ObsidianKnife() {
		super(ComboItemTier.OBSIDIAN,
				1,
				0.5F, // 攻击速度，负数越大挥刀回复速度越慢，整数越大速度越快
				new Properties().group(ComboGroup.COMBO_GROUP));
	}
}
