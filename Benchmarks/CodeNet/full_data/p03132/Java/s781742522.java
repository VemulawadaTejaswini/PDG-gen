import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		new Main().run();
	}
	
	public void run()
	{
		Scanner file = new Scanner(System.in);
		int L = file.nextInt();
		int[] ints = new int[L+2];//sentinal first and last
		int[][] pred = new int[][]{{0},{0,1},{0,1,2},{2,3},{0,1,2,3,4}};
		for(int i = 0;i<L;i++)
			ints[i+1] = file.nextInt();
		long[][] dp = new long[L+2][5];
		for(long[] in:dp)
			Arrays.fill(in, Long.MAX_VALUE/2);
		dp[0][0] = 0;
		for(int i = 1;i<dp.length;i++)
		{
			for(int j = 0;j<dp[0].length;j++)
			{
				long minPred = Long.MAX_VALUE/2;
				for(int k:pred[j])
					minPred = Math.min(minPred,dp[i-1][k]);
				if(j==0 || j == 4)
				{
					dp[i][j] = Math.min(dp[i][j], minPred + ints[i]);
				}else if(j == 1 || j == 3)
				{//even start or even end
					if(ints[i] == 0)
						dp[i][j] = Math.min(dp[i][j], minPred + 2);
					else
						dp[i][j] = Math.min(dp[i][j], minPred + ints[i] % 2);
				}else if(j == 2)
				{//odd
					if(ints[i]%2==0)
						dp[i][j] = Math.min(dp[i][j], minPred + 1);
					else
						dp[i][j] = Math.min(dp[i][j], minPred);
				}
			}
		}
		//for(long[] in:dp)
			//System.out.println(Arrays.toString(in));
		System.out.println(dp[dp.length-1][4]);
	}
	
}
