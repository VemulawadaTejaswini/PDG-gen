import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		long X = sc.nextInt();
		int[] A = new int[N];
		int[][] min = new int[N][N];
		for (int i = 0; i < N; ++i) {
			A[i] = sc.nextInt();
		}
		for (int i = 0; i < N; ++i) {
			min[i][i] = A[i];
		}
		for (int i = 0; i < N; ++i) {
			for (int j = i + 1; j < N; ++j) {
				min[i][j] = Math.min(min[i][j - 1], A[j]);
			}
		}
		long ans = Long.MAX_VALUE;
		for (int i = 0; i < N; ++i) {
			long cur = X * i;
			for (int j = 0; j < N; ++j) {
				if (j >= i) {
					cur += min[j - i][j];
				} else {
					cur += Math.min(min[0][j], min[N - (i - j)][N - 1]);
				}
			}
			ans = Math.min(ans, cur);
		}
		System.out.println(ans);
	}

}
