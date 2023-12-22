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
		long X;
		long S = 0;
		long A[] = new long[N];

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}

		for (int i = 0; i < M; i++) {
			Arrays.sort(A);
			A[N - 1] /= 2;
		}

		for (int i = 0; i < N; i++) {
			S = S + A[i];
		}

		sc.close();
		System.out.println(S);
	}
};

