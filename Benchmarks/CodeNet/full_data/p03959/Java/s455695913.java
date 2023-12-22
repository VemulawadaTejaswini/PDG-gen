

import java.io.PrintWriter;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		solver();
	}

	long MODULO = 1_000_000_000 + 7;

	void solver() {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long[] T = new long[N];
		long[] A = new long[N];
		long[] max = new long[N];
		for (int i = 0; i < N; i++) {
			T[i] = sc.nextLong();
			max[i] = T[i];
		}
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
		}
		if(T[N-1]!=A[0]){
			System.out.println(0);
			return;
		}

		long[] fixed = new long[N];
		Arrays.fill(fixed, -1);
		fixed[0] = T[0];

		for (int i = 1; i < N; i++) {
			if (T[i] != T[i - 1])
				fixed[i] = T[i];
		}

		if (fixed[N - 1] != A[N - 1] && fixed[N - 1] != -1) {
			System.out.println(0);
			return;
		}
		fixed[N - 1] = A[N - 1];
		for (int i = N - 2; i >= 0; i--) {
			if (A[i] != A[i + 1]) {
				if (fixed[i] != -1 && fixed[i] != A[i]) {
					System.out.println(0);
					return;
				}
				fixed[i] = A[i];
			}
		}

		for (int i = 0; i < N; i++) {
			max[i] = Math.min(A[i], T[i]);
		}

		long ans = 1;
		for (int i = 0; i < N; i++) {
			if (fixed[i] == -1) {
				ans = (ans * max[i]) % MODULO;
			}
		}

		System.out.println(ans);
	}
}
