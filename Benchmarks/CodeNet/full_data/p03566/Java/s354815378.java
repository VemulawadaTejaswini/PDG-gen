import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class Main {

	private interface F extends Function<Double, Optional<Double>> {
	}

	private static class LineFunction {
		List<F> list = new ArrayList<>();

		public boolean add(F f) {
			return this.list.add(f);
		}

		public Optional<Double> f(double x) {
			double min = Double.MAX_VALUE;
			for (F f : list) {
				Optional<Double> y = f.apply(x);
				if (y.isPresent()) {
					min = Math.min(min, y.get());
				}
			}
			if (min < Double.MAX_VALUE) {
				return Optional.of(min);
			}
			return Optional.empty();
		}
	}

	private static LineFunction getVMaxLine(int[] t, int[] v) {
		LineFunction vmaxs = new LineFunction();
		int n = t.length;
		int lastTime = 0;
		for (int i = 0; i < n; lastTime += t[i++]) {
			final int now = lastTime;
			final int time = t[i];
			final int vmax = v[i];
			// vmaxにラインを引いておく
			vmaxs.add(x -> {
				double dx = x - now;
				if (0 <= dx && dx <= time) {
					return Optional.of((double) vmax);
				}
				return Optional.empty();
			});
		}
		return vmaxs;

	}

	private static LineFunction getUpLine(int[] t, int[] v) {
		LineFunction up = new LineFunction();
		int n = t.length;
		int lastTime = 0;
		double lastSpeed = 0;
		for (int i = 0; i < n; lastTime += t[i++]) {
			final double speed = lastSpeed;
			final int now = lastTime;
			final int time = t[i];
			final int vmax = v[i];

			final double needUpSpeed = vmax - speed;

			if (needUpSpeed > 0) {
				final double canUpSpeed = Math.min(needUpSpeed, time);
				up.add(x -> {
					double dx = x - now;
					if (0 <= dx) {
						return Optional.of(dx + speed);
					}
					return Optional.empty();
				});
				lastSpeed += canUpSpeed;
			} else {
				lastSpeed = vmax;
			}
		}
		return up;
	}

	private static LineFunction getDownLine(int[] t, int[] v, int T) {
		LineFunction down = new LineFunction();
		final int n = t.length;
		int lastTime = T;
		double lastSpeed = 0;
		for (int i = n - 1; i >= 0; lastTime -= t[i--]) {
			final double speed = lastSpeed;
			final int now = lastTime;
			final int time = t[i];
			final int vmax = v[i];

			final double needUpSpeed = vmax - speed;

			if (needUpSpeed > 0) {
				final double canUpSpeed = Math.min(needUpSpeed, time);
				down.add(x -> {
					double dx = now - x;
					if (0 <= dx) {
						return Optional.of(dx + speed);
					}
					return Optional.empty();
				});
				lastSpeed += canUpSpeed;
			} else {
				lastSpeed = vmax;
			}
		}
		return down;
	}

	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			br.readLine();
			int[] t = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int[] v = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

			int T = Arrays.stream(t).sum();

			LineFunction vmaxs = getVMaxLine(t, v);
			LineFunction up = getUpLine(t, v);
			LineFunction down = getDownLine(t, v, T);

			// 0.5ごとにマッピングする
			double sum = 0;
			double last = 0;
			for (int i = 1; i <= 2 * T; i++) {
				double x = i / 2.0;
				double a = up.f(x).orElse(Double.MAX_VALUE);
				double b = down.f(x).orElse(Double.MAX_VALUE);
				double c = vmaxs.f(x).orElse(Double.MAX_VALUE);

				double min = Math.min(a, Math.min(b, c));

				if (min < Double.MAX_VALUE) {
					sum += last + min;
					last = min;
				} else {
					last = 0;
				}
			}
			System.out.println(sum / 4.0);
		}
	}
}
