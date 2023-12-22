
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

			long result = 0;
			long nowX = 0;
			long nowY = 0;
			// x+, y+
			for (int i = 0; i < n; i++) {
				if (0 <= x[i] && 0 <= y[i]) {
					nowX += x[i];
					nowY += y[i];
				}
			}
			for (int i = 0; i < n; i++) {
				if (x[i] < 0 || y[i] < 0) {
					if(calc(nowX, nowY) < calc(nowX + x[i], nowY + y[i])) {
						nowX += x[i];
						nowY += y[i];
					}
				}
			}
			result = calc(nowX, nowY);
			// x+, y-
			nowX = 0;
			nowY = 0;
			for (int i = 0; i < n; i++) {
				if (0 <= x[i] && y[i] <= 0) {
					nowX += x[i];
					nowY += y[i];
				}
			}
			for (int i = 0; i < n; i++) {
				if (x[i] < 0 || 0 < y[i]) {
					if(calc(nowX, nowY) < calc(nowX + x[i], nowY + y[i])) {
						nowX += x[i];
						nowY += y[i];
					}
				}
			}
			if (result < calc(nowX, nowY)) {
				result = calc(nowX, nowY);
			}
			// x-, y-
			nowX = 0;
			nowY = 0;
			for (int i = 0; i < n; i++) {
				if (x[i] <= 0 && y[i] <= 0) {
					nowX += x[i];
					nowY += y[i];
				}
			}
			for (int i = 0; i < n; i++) {
				if (0 < x[i] || 0 < y[i]) {
					if(calc(nowX, nowY) < calc(nowX + x[i], nowY + y[i])) {
						nowX += x[i];
						nowY += y[i];
					}
				}
			}
			if (result < calc(nowX, nowY)) {
				result = calc(nowX, nowY);
			}
			// x-, y+
			nowX = 0;
			nowY = 0;
			for (int i = 0; i < n; i++) {
				if (x[i] <= 0 && 0 <= y[i]) {
					nowX += x[i];
					nowY += y[i];
				}
			}
			for (int i = 0; i < n; i++) {
				if (0 < x[i] || y[i] < 0) {
					if(calc(nowX, nowY) < calc(nowX + x[i], nowY + y[i])) {
						nowX += x[i];
						nowY += y[i];
					}
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
