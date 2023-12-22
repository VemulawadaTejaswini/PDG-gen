import java.util.Arrays;
import java.util.Scanner;

class Main{
	static int N;
	static double [] p;
	static double [][] memo;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();

		p = new double[N];

		memo = new double[N][(N / 2) + 1];
		for(int i = 0; i < N; i++) {
			p[i] = sc.nextDouble();
			Arrays.fill(memo[i], -1);
		}

		System.out.printf("%.10f\n",1 - dp(0,(N / 2)));
		sc.close();
	}

	static double dp(int i, int n) {
		if(i == N && n >= 0) {
			return 1;
		}
		if(n < 0) {
			return 0;
		}
		if(memo[i][n] != -1) {
			return memo[i][n];
		}
		memo[i][n] = (dp(i + 1, n) * (1 - p[i])) + (dp(i + 1, n - 1) * p[i]);
		return memo[i][n];
	}
}
