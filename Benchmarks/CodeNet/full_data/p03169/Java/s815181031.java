import java.util.Arrays;
import java.util.Scanner;

class Main{
	static int mod = 1000000000 + 7;
	static int N;
	static double[][][] dp;
	static double rec(int i, int j, int k) {
		if(dp[i][j][k] != -1) return dp[i][j][k];
		if(i == 0 && j == 0 && k == 0) return 0;
		double ret = N;
		if(i > 0) ret += rec(i - 1, j, k) * (double)i;
		if(j > 0) ret += rec(i + 1, j - 1, k) * (double)j;
		if(k > 0) ret += rec(i, j + 1, k - 1) * (double)k;
		ret = ret / ((double)(i + j + k));
		return dp[i][j][k] = ret;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			N = sc.nextInt();
			dp = new double[301][301][301];
			for(int i = 0; i <= 300; i++) for(int j = 0; j <= 300; j++) Arrays.fill(dp[i][j], -1);
			int one = 0, two = 0, three = 0;
			for(int i = 0; i < N; i++) {
				int a = sc.nextInt();
				if(a == 1) one++;
				else if(a == 2) two++;
				else if(a == 3) three++;
			}
			System.out.println(rec(one, two, three));
		}
	}
}