import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		long[][] indis = new long[n][n];
		long[][] dis = new long[n][n];
		
		long sum = 0;
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				indis[i][j] = sc.nextLong();
				if(i>j)sum+=indis[i][j];
			}
			dis[i] = indis[i].clone();
		}
		boolean[][] rip = new boolean[n][n];
		
		for(int k = 0; k < n; k++)
			for(int i = 0; i < n; i++)
				for(int j = 0; j < n; j++)
				{
					if(dis[i][j] > dis[i][k] + dis[k][j])
					{
						System.out.println(-1);
						return;
					}
					else if(!rip[i][j] && dis[i][j] == dis[i][k] + dis[k][j] && i != j && j != k && i != k && i > j)
					{
						sum-=dis[i][j];
						rip[i][j] = true;
					}
				}

		System.out.println(sum);
	}

}
