

import java.util.Scanner;

public class Main 
{
	static int w, h;
	static int[][][] dp;
	static boolean[][] g;
	static int BIGNUM = 999999999;
	
	static int get(int x, int y, int s)
	{
		if(x >= w || y >= h)return BIGNUM;
		else return dp[x][y][s];
	}
	
	int cuk(int x, int y)
	{
		int min = BIGNUM;
		if(g[x][y])
		{
			min = cukblack(x, y);
		}
		else //if this is floor, just walk
			min = Math.min(cuk(x, y+1), cuk(x+1,y));
		return min;
	}
	
	int cukblack(int x, int y)
	{ //draw squares and min
		int min = BIGNUM;
		
		int y2 = y;
		int maxwidth = BIGNUM;
		int x2 = x;
		while(y2 < h)
		{
			while(x2 < w-1 && x2 < maxwidth && g[x2+1][y2]) //black extend to the right
			{
				x2++; //x2: last x that's still black
				min = Math.min(min, cuk(x2+1,y2)+1);
				min = Math.min(min, cuk(x2,y2+1)+1);
			}
			maxwidth = x2;
		}
		return min;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		h = sc.nextInt();
		w = sc.nextInt();
		
		g = new boolean[w][h];
		
		dp = new int[w][h][2];
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
		
		dp[w-1][h-1][g[w-1][h-1]?1:0] = 0;
		dp[w-1][h-1][g[w-1][h-1]?0:1] = 0;
		boolean debug = false;
		
		//s=1 means flipped
		for(int y = h-1; y >= 0; y--)
			for(int x = w-1; x >= 0; x--)
				for(int s = 0; s < 2; s++)
				{
					//right
					if(x < w-1)
					{
						int reqstate = g[x+1][y]?1:0;
						int tax = reqstate==1&&s==0?1:0;
						dp[x][y][s] = Math.min(dp[x][y][s], get(x+1,y,reqstate)+tax);
					}
					
					//down
					if(y < h-1)
					{
						int reqstate = g[x][y+1]?1:0;
						int tax = reqstate==1&&s==0?1:0;
						dp[x][y][s] = Math.min(dp[x][y][s], get(x,y+1,reqstate)+tax);
					}
					
					if(debug)System.out.println(x + " " + y + " " + s + ": " + dp[x][y][s]);
				}
		
		
		if(debug)
			for(int s = 0; s < 2; s++)
			{
				System.out.print("\n\n");
				for(int y = 0; y < h; y++)
				{
					for(int x = 0; x < w; x++)
						System.out.print(dp[x][y][s] + " ");
					System.out.print("\n");
				}
			}
		
		if(g[0][0])
			System.out.println(get(0,0,1)+1);
		else
			System.out.println(get(0,0,0));
			
	}

}
