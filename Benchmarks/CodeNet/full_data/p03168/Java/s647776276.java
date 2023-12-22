import java.util.Scanner;

class Main{
	static int[][] dp;




	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int N = sc.nextInt();
		double[] p = new double[N];
		for(int i = 0;i < N;i++){
			p[i] = sc.nextDouble();
		}
		double[][] dp = new double[N+1][N+1];			//dp[i][j] = i番目までj枚面がでる確率
	dp[0][0] = 1;
		for(int i= 0;i < N;i++){
			for(int j = 0;j < N;j++){
				dp[i+1][j+1] += p[i] * dp[i][j];
				dp[i+1][j]   += (1-p[i])*dp[i][j];
			}
			
		}
		double ans = 0;
		for(int i = (N+1)/2;i <= N;i++){
			ans += dp[N][i];
		}
		System.out.println(ans);
		
		
	}

}







class Pair implements Comparable{
	int from;		//p
	int end;		//y
	int num;
	int bango;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}

