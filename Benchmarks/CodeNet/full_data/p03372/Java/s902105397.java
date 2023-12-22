import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt() + 1;
		long c = sc.nextLong();
		long[] x = new long[n];
		long[] v = new long[n];

		x[0] = 0;
		v[0] = 0;
		for (int i = 1; i < n; i++) {
			x[i] = sc.nextLong();
			v[i] = sc.nextLong();
		}

		long answer = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				long rx = x[i];
				long rv = 0;
				for (int k = 0; k <= i; k++) {
					rv += v[k];
				}

				long lx = (c - x[(n - j) % n]) % c;
				long lv = 0;
				for (int k = 0; k <= j; k++) {
					lv += v[(n - k) % n];
				}

				// Right edge first
				long totalValue1 = rv + lv - (rx * 2 + lx);
				// Left edge first
				long totalValue2 = rv + lv - (rx + lx * 2);

				if (totalValue1 > answer) {
					answer = totalValue1;
				}
				if (totalValue2 > answer) {
					answer = totalValue2;
				}
			}
		}

		System.out.println(answer);
	}
}
