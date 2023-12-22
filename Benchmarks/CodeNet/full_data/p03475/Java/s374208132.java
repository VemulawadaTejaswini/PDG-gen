import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] C = new int[N-1];
		int[] S = new int[N-1];
		int[] F = new int[N-1];
		for (int i = 0; i < N-1; i++) {
			C[i] = sc.nextInt();
			S[i] = sc.nextInt();
			F[i] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {
			int nowt = 0;
			for (int j = i; j < N-1; j++) {
				nowt += waitTime(C[j], S[j], F[j], nowt);
			}
			System.out.println(nowt);
		}
	}

	private static int waitTime(int C, int S, int F, int nowt) {
		return Math.max(F * ((nowt - 1) / F + 1), S) - nowt + C;
	}
}