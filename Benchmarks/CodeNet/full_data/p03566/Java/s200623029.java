import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] t = new int[N];
		int T = 0;
		for (int i = 0; i < N; i++) {
			t[i] = sc.nextInt();
			T += t[i];
		}
		long[] v = new long[N];
		for (int i = 0; i < N; i++) {
			v[i] = sc.nextLong();
		}

		double[] maxA = new double[T * 2 + 1];
		double[] maxB = new double[T * 2 + 1];

		int passed = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j <= t[i]; j++) {
				int time = passed + j;
				maxA[time * 2] = Math.min(v[i],
						(time == 0) ? 0 : maxA[time * 2 - 1] + 0.5);
				if (j == 0 && i > 0) maxA[time * 2] = Math.min(maxA[time * 2], v[i - 1]);
				if (j == t[i]) continue;
				maxA[time * 2 + 1] = Math.min(v[i], maxA[time * 2] + 0.5);
			}
			passed += t[i];
		}

		passed = 0;
		for (int i = N - 1; i >= 0; i--) {
			for (int j = 0; j <= t[i]; j++) {
				int time = T - (passed + j);
				maxB[time * 2] = Math.min(v[i], (time == T) ? 0 : maxB[time * 2 + 1] + 0.5);
				if (j == 0 && i < N - 1) {
					maxB[time * 2] = Math.min(maxB[time * 2], v[i + 1]);
				}
				if (j == t[i]) continue;
				maxB[time * 2 - 1] = Math.min(v[i], maxB[time * 2] + 0.5);
			}
			passed += t[i];
		}

		double answer = 0;
		for (int i = 0; i < T * 2 + 1; i++) {
			answer += Math.min(maxA[i], maxB[i]) * 0.5;
		}

		System.out.println(answer);
	}
}
