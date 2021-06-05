package per.chao.utils;

/**
 * Description: Tick计算器
 *
 * @author W.Chao
 * @date 2021/5/24 22:12
 **/
@FunctionalInterface
public interface TicksUnit {
	int TICKS_PER_SECOND = 20; // 20 tick/s

	int get(int seconds);

	TicksUnit TICKS_TO_SECONDS = seconds -> seconds / TICKS_PER_SECOND;

	TicksUnit SECONDS_TO_TICKS = ticks -> TICKS_PER_SECOND * ticks;

	TicksUnit MINUTES_TO_TICKS = minutes -> minutes * 1000 * TICKS_PER_SECOND;
}
