
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static int N;
	public static int W;
	public static int[] w;
	public static int[] v;
	public static int[][] dp;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		W = sc.nextInt();
		w = new int[N+1];
		v = new int[N+1];
		for(int i=0;i<N;i++){
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
		}

		sc.close();

		dp = new int[101][300];
		for(int i=0;i<=N;i++) Arrays.fill(dp[i], -1);
		System.out.println(rec(0,W));
	}
	public static int rec(int i,int j){
		if(dp[i][j] != -1) return dp[i][j];
		int res = 0;
		if(i==N) res = 0;
		else {
			res = rec(i+1,j);
			if(j>=w[i]) res = Math.max(res,rec(i+1,j-w[i])+v[i]);
		}
		return dp[i][j] = res;
	}

}