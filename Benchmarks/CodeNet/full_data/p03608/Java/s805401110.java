import java.util.Arrays;
import java.util.Scanner;

public class Main 
{
	static int n, m, r;
	static int[] tar;
	static long[][] dis;
	static long INF = 100000100000100000l;
	static long score = INF;
	
	static void go(int state, long tra, int pos)
	{
		if(state == allmask)
		{
			score = Math.min(score, tra);
			return;
		}
		for(int i = 0; i < r; i++)
		{ 
			if((mask[i] & state) <= 0)
			{ //not visited yet, go to tar[i]
				if(state == 0)
					go(state + mask[i], tra, tar[i]);
				else
					go(state + mask[i], tra + dis[pos][tar[i]], tar[i]);
			}
		}
	}
	
	static int[] mask = new int[8];
	static int allmask = 0;

	public static void main(String[] args) 
	{
		int curm = 1;

		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		r = sc.nextInt(); //targets
		tar = new int[r];
		dis = new long[n][n];
		
		for(int i = 0; i < 8; i++)
		{
			if(i<r)
				allmask+=curm;
			mask[i] = curm;
			curm *= 2;
		}		
		for(int i = 0; i < r; i++)
			tar[i] = sc.nextInt()-1;
		
		for(int i = 0; i < n; i++)
			for(int j = 0; j < n; j++)
				dis[i][j] = i==j?0:INF;
		
		for(int i = 0; i < m; i++)
		{
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			long d = sc.nextLong();
			dis[a][b] = d;
			dis[b][a] = d;
		}
		
		for(int k = 0; k < n; k++)
			for(int i = 0; i < n; i++)
				for(int j = 0; j < n; j++)
				{
					dis[i][j] = Math.min(dis[i][j], dis[i][k] + dis[k][j]);
				}
		
		go(0, 0, 0);
		
		System.out.println(score);
	}

}
