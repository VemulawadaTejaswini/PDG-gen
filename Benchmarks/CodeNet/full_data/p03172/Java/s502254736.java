import java.util.Arrays;
import java.util.Scanner;

class Main{
	static int N, K;
	static int[] a;

	static int[][] memo;
	static boolean[][] flag;

	static final int hash = (int) 1e+9 + 7;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();

		a = new int[N];
		memo = new int[N][K + 1];
		flag = new boolean[N][K + 1];

		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			Arrays.fill(flag[i], false);
		}

		System.out.println(dp(0, K));
		sc.close();
	}

	static int dp(int i, int u) {
		if(i == N) {
			if(u == 0)
				return 1;
			return 0;
		}
		if(u == 0)
			return 1;
		if(flag[i][u]) {
			return memo[i][u];
		}
		flag[i][u] = true;
		int sum = 0;
		for(int j = 0; j <= a[i]; j++) {
			if(j <= u)
				sum += dp(i + 1, u - j) % hash;
		}
		return memo[i][u] = sum;
	}
}