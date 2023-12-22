import java.util.Scanner;

public class Main 
{
	static long[] bar = new long[200];
	
	static long getbar(int num)
	{
		if(num < 0)return 1;
		else return bar[num];
	}
	
	static long getdp(int x, int y)
	{
		if(x < w && y < h)return dp[x][y];
		else return 0;
	}

	static long[][] dp;
	static long MOD = 1000000007l;
	static boolean[][] cache;
	static int w,h,k;
	
	static long go(int x, int y)
	{
		if(cache[x][y])return dp[x][y];
		long cur = 0;
		if(y == h)
		{ //no more moves
			if(x == k)cur = 1;
		}
		else
		{
//			System.out.println("from " + x + " " + y);
			long curm = 0;
			//straight ahead
			curm = getbar(x-1);
			curm = (curm *getbar(w-x-2))%MOD;
			curm = (curm * go(x, y+1))%MOD;
			cur = (cur + curm)%MOD;
//			System.out.println("straight: " + curm);
			
			//left
			if(x>0)
			{
				curm = getbar(x-2);
				curm = (curm *getbar(w-x-2))%MOD;
				curm = (curm * go(x-1, y+1))%MOD;
				cur = (cur + curm)%MOD;
//				System.out.println("left: " + curm);
			}
			//right
			if(x<w-1)
			{
				curm = getbar(x-1);
				curm = (curm *getbar(w-x-3))%MOD;
				curm = (curm * go(x+1, y+1))%MOD;
				cur = (cur + curm)%MOD;
//				System.out.println("right: " + curm);
			}
			
		}
		
		cache[x][y] = true;
		dp[x][y] = cur;
		return cur;
	}
	
	
	public static void main(String[] args) 
	{
		long MOD = 1000000007l;
		Scanner sc = new Scanner(System.in);
		
		bar[0] = 1;
		bar[1] = 2;
		for(int i = 2; i < 200; i++)
		{
			bar[i] = (bar[i-2] + bar[i-1])%MOD;
		}
		
		
		h = sc.nextInt();
		w = sc.nextInt();
		k = sc.nextInt()-1;

		dp = new long[w][h+1];
		cache = new boolean[w][h+1];
		
		System.out.println(go(0,0));
		

	}

}
