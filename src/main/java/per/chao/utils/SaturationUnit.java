package per.chao.utils;

/**
 * Description: 饱食度
 *
 * @author W.Chao
 * @date 2021/5/24 22:55
 **/
@FunctionalInterface
public interface SaturationUnit {
	float get(float saturation);

	SaturationUnit SATURATION = saturation -> saturation;
}
