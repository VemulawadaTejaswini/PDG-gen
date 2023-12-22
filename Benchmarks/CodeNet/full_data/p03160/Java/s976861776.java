import java.util.*;

public class Main
{

	static int[] dp,height;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

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
		dp[i]=0;
		}

		dp[2]=Math.abs(height[2]-height[1]);

		//dp実行
		for(int j=3;j<=N;j++)
		{
			chmin(dp[j-1],dp[j-2]);
		}


		System.out.println(dp[N]);
	}

	//dp更新用の関数定義
	public static void chmin(int k,int l)
	{
		dp[j] = Math.min(k + Math.abs(height[j]-height[j-1]),l + Math.abs(height[j]-height[j-2]));
	}



}