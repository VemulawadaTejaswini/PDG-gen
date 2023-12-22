import java.util.Scanner;

public class Main {
  
 	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] dp 	= new int[N+1][3];
		int[][] abc	= new int[N+1][3];

		for(int i=1;i<=N;i++){
			for(int j=0;j<3;j++){
				abc[i][j] = sc.nextInt();
				for(int k=0;k<3;k++){
					if(j==k){
						continue;
					}
					dp[i][j] = chmax(dp[i][j],dp[i-1][k]+abc[i][j]);
				}
			}
		}

		int ans = 0;
		for(int i=0;i<3;i++){
			ans = chmax(ans,dp[N][i]);
		}

		System.out.println(ans);
	}

	public static int chmax(int a,int b){

		if(a >= b){
			return a;
		}else{
			return b;
		}
	}
}