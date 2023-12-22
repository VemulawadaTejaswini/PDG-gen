import java.util.*;

/**
 * Main
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int M = sc.nextInt();
		long S = 0;
		long A[] = new long[N];

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			S = S + A[i];
		}

		for (int i = 0; i < M; i++) {
			Arrays.sort(A);
			S -= (A[N - 1] - (A[N - 1] / 2));
			A[N - 1] /= 2;
		}

		sc.close();
		System.out.println(S);
	}
};
