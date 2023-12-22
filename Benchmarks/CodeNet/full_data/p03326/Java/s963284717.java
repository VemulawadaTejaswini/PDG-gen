import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long[][] n = new long[N][3];
		long[][] sum = new long[4][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 3; j++)
				n[i][j] = sc.nextLong();
			sum[0][i] = n[i][0] + n[i][1] + n[i][2];
			sum[1][i] = n[i][0] + n[i][1] - n[i][2];
			sum[2][i] = n[i][0] - n[i][1] + n[i][2];
			sum[3][i] = -n[i][0] + n[i][1] + n[i][2];
		}

		long max = 0;
		for (int i = 0; i < 4; i++) {
			max = Math.max(max, max(N, M, sum[i]));
		}
		System.out.println(max);
	}

	private static long max(int N, int M, long[] sum) {
		Arrays.sort(sum);
		long s0 = 0;
		long s1 = 0;
		long max = 0;
		for (int i = 0, j = N - 1; i < M; i++, j--) {
			s0 += sum[i];
			s1 += sum[j];
		}
		max = Math.max(max, Math.abs(s0));
		max = Math.max(max, Math.abs(s1));
		return max;
	}

}
