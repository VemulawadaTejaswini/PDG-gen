import java.util.Arrays;
import java.util.Scanner;

public class Main{
	static int N;
	static long[] a;
	static long[][][] dp;
	static long f(int i, int j) {
		if(i == j) return ((N + i - j - 1) % 2 == 0) ? a[i] : -a[i];
		if(dp[i][j][(N + i - j - 1) % 2] != Long.MIN_VALUE) return dp[i][j][(N + i - j - 1) % 2];
		if((N + i - j - 1) % 2 == 0) {
			return dp[i][j][(N + i - j - 1) % 2] = Math.max(f(i + 1, j) + a[i], f(i, j - 1) + a[j]);
		}else {
			return dp[i][j][(N + i - j - 1) % 2] = Math.min(f(i + 1, j) - a[i], f(i, j - 1) - a[j]);
		}
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			N = sc.nextInt();
			a = new long[N];
			dp = new long[N][N][2];
			for(int i = 0; i < N; i++) {
				a[i] = sc.nextInt();
			}
			for(int i = 0; i < N; i++) for(int j = 0; j < N; j++) Arrays.fill(dp[i][j], Long.MIN_VALUE);
			System.out.println(f(0, N - 1));
		}
	}
}