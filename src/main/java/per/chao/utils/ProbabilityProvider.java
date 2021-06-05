package per.chao.utils;

/**
 * Description: 自定义概率提供器
 *
 * @author W.Chao
 * @date 2021/5/24 23:15
 **/
@FunctionalInterface
public interface ProbabilityProvider {
	float get(int probability);

	ProbabilityProvider PERCENT = probability -> {
		float provider;
		if (probability < 0) {
			provider = 0.0f;
		} else if (probability > 100) {
			provider = 1.0f;
		} else {
			provider = Float.parseFloat(String.valueOf(probability)) / 100f;
		}
		return provider;
	};
}
