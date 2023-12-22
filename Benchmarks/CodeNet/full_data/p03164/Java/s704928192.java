import java.util.Scanner;

class Main{





	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int N =sc.nextInt();
		int W = sc.nextInt();
		int[] w = new int[N+1];
		int[] v = new int[N+1];
		int V = 0;
		for(int  i = 1;i <= N;i++){
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
			V = (int)Math.max(V, v[i]);
		}
		long[][] dp = new long[N+1][V*N+1];		//dp[i][j] i番目までで価値jの時の重さ
		for(int  i = 0;i <= N;i++){
			for(int j = 0;j <= V*N;j++){
				dp[i][j] = 100001;
			}
		}
		
		
		for(int i = 1;i <= N;i++){
			dp[i][v[i]] =(long)Math.min(dp[i-1][v[i]], w[i]);
			for(int j = 0;j <= V*N;j++){
				if(dp[i-1][j] != 100001){
					dp[i][j+v[i]] =(long)Math.min(dp[i][j+v[i]], dp[i-1][j] + w[i]);
					dp[i][j] =(long)Math.min(dp[i][j], dp[i-1][j]) ;

				}else{
					dp[i][j] =(long)Math.min(dp[i][j], dp[i-1][j]) ;
				}

				
				//	System.out.println("i "+i +" j "+ j+" "+dp[i][j]);
			}
		}
		long max = 0;
		for(int i = 0;i <= N*V;i++){
			if(dp[N][i] > 0 && dp[N][i] <= W){
			//	System.out.println(i);
				max = i;
			}
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

