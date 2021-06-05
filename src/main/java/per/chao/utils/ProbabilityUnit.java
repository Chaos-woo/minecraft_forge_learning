package per.chao.utils;

/**
 * Description: 概率组件
 *
 * @author W.Chao
 * @date 2021/5/24 23:08
 **/
@FunctionalInterface
public interface ProbabilityUnit {
	float get();

	ProbabilityUnit PERCENT_10 = () -> 0.1f;
	ProbabilityUnit PERCENT_20 = () -> 0.2f;
	ProbabilityUnit PERCENT_30 = () -> 0.3f;
	ProbabilityUnit PERCENT_40 = () -> 0.4f;
	ProbabilityUnit PERCENT_50 = () -> 0.5f;
	ProbabilityUnit PERCENT_60 = () -> 0.6f;
	ProbabilityUnit PERCENT_70 = () -> 0.7f;
	ProbabilityUnit PERCENT_80 = () -> 0.8f;
	ProbabilityUnit PERCENT_90 = () -> 0.9f;
	ProbabilityUnit PERCENT_100 = () -> 1.0f;
}
