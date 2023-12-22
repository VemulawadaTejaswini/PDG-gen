import java.util.Arrays;
import java.util.Scanner;


public class Main {
	static int N,K;
	static long ans;
	static int[] S;
	static long[] MEMO;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
			 N = sc.nextInt();
			 K = sc.nextInt();
			 S = new int[N];

			 for(int i = 0 ; i < N ; i++){
				 S[i] = sc.nextInt();
			 }
		sc.close();



		MEMO = new long[N];
		Arrays.fill(MEMO, 10000);

		MEMO[0] = 0;
		MEMO[1] = Math.abs(S[1] - S[0]);

		System.out.println(dp(S,MEMO,N,K));

		//System.out.println(MEMO[3]);
	}

	static long dp(int[] s,long[] memo,int n, int k){
		if(n==1){
			return 0;
		}

		else if(n==2){
			return Math.abs(S[1] - S[0]);
		}

		else{
			long tmp = 0 ;
		for(n = 3; n <= N; n++){
			for(int j = 1 ; j <= K ; j++){
				if(j == n){
					break;
				}

				tmp = Math.abs(S[n-1]-S[n-1-j])+ memo[n-j-1];
				//System.out.println(tmp);
				if(tmp<memo[n-1]){
					memo[n-1] = tmp;
				}

			}
		}
		/*
		else if(n <= N){
			if(memo[N-1] != 0){
				ans = Math.min(Math.abs(S[N-1]-S[N-2]) +memo[N-1],Math.abs(S[N-1]-S[N-3]) + memo[N-2]);
			}
			else{
				memo[N-1] = dp(S,memo,N-1);
				memo[N-2] = dp(S,memo,N-2);
				ans = Math.min(Math.abs(S[N-1]-S[N-2]) +dp(S,memo,N-1),Math.abs(S[N-1]-S[N-3])+dp(S,memo,N-2));
			}
		}*/
		}

		return memo[N-1];
	}
}