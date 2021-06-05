package per.chao.utils;

/**
 * Description: 恢复饥饿值
 *
 * @author W.Chao
 * @date 2021/5/24 22:55
 **/
@FunctionalInterface
public interface HungerUnit {
	int get(int hunger);

	HungerUnit HUNGER = hunger -> hunger;
}
