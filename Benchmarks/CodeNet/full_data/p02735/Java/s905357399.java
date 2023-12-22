

import java.util.Scanner;

public class Main 
{
	static int w, h;
	static int[][][] dp;
	static boolean[][] g;
	static int BIGNUM = 999999999;
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		h = sc.nextInt();
		w = sc.nextInt();
		
		g = new boolean[w][h];
		
		dp = new int[w][h][2]; //2 states: current tile is covered in inversion (1) or not (0)
		for(int y = 0; y < h; y++)
		{
			String s = sc.next();
			for(int x = 0; x < w; x++)
			{
				g[x][y] = s.charAt(x) == '#';
			}
		}

		for(int y = 0; y < h; y++)
			for(int x = 0; x < w; x++)
				for(int s = 0; s < 2; s++)
				{
					dp[x][y][s] = BIGNUM;
				}
		
		//no more cost when you've reached finish
		dp[w-1][h-1][0] = 0;
		dp[w-1][h-1][1] = 0;
		
		//s=1 means flipped
		for(int y = h-1; y >= 0; y--)
			for(int x = w-1; x >= 0; x--)
				for(int s = 0; s < 2; s++)
				{
					//right
					if(x < w-1)
					{ //tax is only when moving to a wall when we're at state 0 (uninverted)
					  //moving to an originally floor tile when we're at state 1,
					  //does not incur tax because we can simply not cover that tile in our inversion.
					  //(the inversion that covers current tile)
						int reqstate = g[x+1][y]?1:0;
						int tax = reqstate==1&&s==0?1:0;
						dp[x][y][s] = Math.min(dp[x][y][s], dp[x+1][y][reqstate]+tax);
					}
					
					//down
					if(y < h-1)
					{
						int reqstate = g[x][y+1]?1:0;
						int tax = reqstate==1&&s==0?1:0;
						dp[x][y][s] = Math.min(dp[x][y][s], dp[x][y+1][reqstate]+tax);
					}
				}

		if(g[0][0]) //if starting tile is wall, we must invert it
			System.out.println(dp[0][0][1]+1);
		else //otherwise we must not
			System.out.println(dp[0][0][0]);
			
	}

}
