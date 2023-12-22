import java.util.Scanner;

class Main{

	//static long[] a;
	static	int N ;
	static	int M ;
	static long[][] dp;
	static int ans = 100000000;
	static	boolean[] flag ;

	public static void main(String[] args) {


		Scanner s = new Scanner(System.in);			//文字の入力
		N = s.nextInt();

		dp = new long[N+1][N+1];
		int[][] subdp =  new int[N+1][N+1];

		for(int i = 1;i < N+1;i++){
			for(int j = 1;j < N+1;j++){
				int x= s.nextInt();
				dp[i][j] = x;
			}
		}


		for(int k = 1;k < N+1;k++){
			for(int i = 1;i < N+1;i++){
				for(int j = 1;j < N+1;j++){
					if(dp[i][j] >dp[i][k] + dp[k][j] ){
						System.out.println("-1");
						return;
					}
				}
			}
		}
		long ans = 0;


		for(int i = 1; i < N+1;i++){
			for(int j = 1;j < N+1;j++){
				boolean flag = true;
				for(int k = 1;k < N+1;k++){
					if(i != k&& j != k && dp[i][j] == dp[i][k]+dp[k][j]){
						flag = false;
					}
				}
				if(flag) ans += dp[i][j];
			}
		}

		System.out.println(ans);
		

	}

	

	


}


