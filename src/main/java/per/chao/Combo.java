package per.chao;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import per.chao.register.ItemRegister;

/**
 * Description: 主类
 *
 * @author W.Chao
 * @date 2021/5/23 18:50
 **/
@Mod(ModInfo.MOD_ID) //modid
public class Combo {
	public Combo() {
		// 将物品注册到mod总线
		ItemRegister.ITEMS_REGISTRY.register(FMLJavaModLoadingContext.get().getModEventBus());;
	}
}
