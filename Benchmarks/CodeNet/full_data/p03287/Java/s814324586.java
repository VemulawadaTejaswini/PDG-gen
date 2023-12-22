import java.util.Scanner;

class Main{

	static long ans = 0;
	static int N;
	static long M;

	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);			//文字の入力
		N = sc.nextInt();
		M = sc.nextLong();
		long[] A = new long[N+1];

		long[][] dp = new long[N+1][N+1];

		for(int i = 1;i < N+1;i++){
			A[i] = sc.nextLong()%M;
		}
		for(int i = 1;i < N+1;i++){
			for(int j =i ;j < N+1;j++){
				dp[i][j] = dp[i][j-1]+A[j];
			}
		}

		for(int i = 1;i < N+1;i++){
			for(int j =i ;j < N+1;j++){
				if(dp[i][j] == 0){
					ans++;
				}else{

					if(dp[i][j]%M == 0){
						//					System.out.println("i "+i + " j "+j);
						//					System.out.println(dp[i][j]);

						ans++;
					}
				}
			}
		}

		System.out.println(ans);





	}


}



