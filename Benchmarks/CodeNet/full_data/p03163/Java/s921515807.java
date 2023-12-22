import java.util.Scanner;

class Main{





	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int N =sc.nextInt();
		int W = sc.nextInt();
		int[] w = new int[N+1];
		long[] v = new long[N+1];
		for(int  i = 1;i <= N;i++){
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
		}
		long[][] dp = new long[N+1][10000001];
		for(int i = 1;i <= N;i++){
			dp[i][w[i]] =Math.max(dp[i-1][w[i]], v[i]);
			for(int j = 0;j <= 10000000;j++){
				if(j >= w[i]){
					if(dp[i-1][j-w[i]] > 0){
						dp[i][j] =Math.max(dp[i][j], dp[i-1][j-w[i]] + v[i]);
					}else{
						dp[i][j] =Math.max(dp[i][j], dp[i-1][j]) ;

					}
				}else{
					dp[i][j] = dp[i-1][j];
				}
			//	System.out.println("i "+i +" j "+ j+" "+dp[i][j]);
			}
		}
		long max = 0;
		for(int i = 0;i <= W;i++){
			max = Math.max(max, dp[N][i]);
		}
		System.out.println(max);



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

