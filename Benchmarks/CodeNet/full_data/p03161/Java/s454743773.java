import java.util.*;

public class Main
{
	static int[] dp,height;//クラス内のメソッドたち共通で参照更新するために外だし
	static int N,K;
	static int j,l;////クラス内のメソッドたち共通で参照更新するために外だし


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		height = new int[N+1];
		dp = new int[N+1];

		//height入力
		for(int i=1;i<=N;i++)
		{
		height[i]=sc.nextInt();
		}

		//dp初期化
		for(int i=1;i<=N;i++)
		{
		dp[i]=Integer.MAX_VALUE;
		}
		dp[1]=0;
		dp[2]=Math.abs(height[2]-height[1]);

		//dp実行
		for(j=3;j<=N;j++)
		{
			chmin(j,K);
		}


		System.out.println(dp[N]);
	}

	//dp更新用の関数定義
	public static void chmin(int j,int K)
	{
		int min = Integer.MAX_VALUE;
		for(int i = Math.max(j-K,1);i<j;i++){
		min = Math.min(min,dp[i]+Math.abs(height[j]-height[i]));
		}
		dp[j]=min;
	}
}