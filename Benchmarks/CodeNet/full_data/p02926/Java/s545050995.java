
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] x = new int[n];
			int[] y = new int[n];

			for (int i = 0; i < n; i++) {
				x[i] = sc.nextInt();
				y[i] = sc.nextInt();
			}

			double result = 0;
			long nowX = 0;
			long nowY = 0;
			// x+
			for (int i = 0; i < n; i++) {
				if (0 <= x[i] && calc(nowX, nowY) < calc(nowX + x[i], nowY + y[i])) {
					nowX += x[i];
					nowY += y[i];
				}
			}
			result = calc(nowX, nowY);
			// x-
			nowX = 0;
			nowY = 0;
			for (int i = 0; i < n; i++) {
				if (x[i] <= 0 && calc(nowX, nowY) < calc(nowX + x[i], nowY + y[i])) {
					nowX += x[i];
					nowY += y[i];
				}
			}
			if (result < calc(nowX, nowY)) {
				result = calc(nowX, nowY);
			}
			// y+
			nowX = 0;
			nowY = 0;
			for (int i = 0; i < n; i++) {
				if (0 <= y[i] && calc(nowX, nowY) < calc(nowX + x[i], nowY + y[i])) {
					nowX += x[i];
					nowY += y[i];
				}
			}
			if (result < calc(nowX, nowY)) {
				result = calc(nowX, nowY);
			}
			// y-
			nowX = 0;
			nowY = 0;
			for (int i = 0; i < n; i++) {
				if (y[i] <= 0 && calc(nowX, nowY) < calc(nowX + x[i], nowY + y[i])) {
					nowX += x[i];
					nowY += y[i];
				}
			}
			if (result < calc(nowX, nowY)) {
				result = calc(nowX, nowY);
			}

			System.out.println(Math.sqrt(result));
		}
	}

	private static long calc(long x, long y) {
		return x * x + y * y;
	}
}
