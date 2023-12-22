import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int W = scan.nextInt();
		int[] w = new int[N];
		int[] v = new int[N];

		for(int i=0;i<N;i++){

			w[i]=scan.nextInt();
			v[i]=scan.nextInt();

		}
		int w1 = w[0];
		for(int i=0;i<N;i++){
			w[i]-=w1;
		}


		//dp[i+1][10*N+j] : 重さjまでで、i個めまでの価値の最大値
		//dp[i+1][j] = max( dp[i][j]//i個めは入れなかった , dp[i][j-w[i]]+v[i]//i個めを入れた
		//or j < w[i]なら入れない

		int dp[][] = new int[N+1][W+1];//最大値である
		//%1000 →w[i]の重さ
		///1000 →個数
		for(int i=0;i<W;i++){
			dp[0][i]=0;
		}


		for(int i=0;i<N;i++){
			for(int j=0;j<=W;j++){
					if(j<(w[i]+w1)){
						//入らない
						dp[i+1][j]=dp[i][j];
					}else{
						dp[i+1][j]=Math.max(dp[i][j],dp[i][j-(w[i]+w1)]+v[i]);
					}

			}
		}


		System.out.println(dp[N][W]);

	}

}
