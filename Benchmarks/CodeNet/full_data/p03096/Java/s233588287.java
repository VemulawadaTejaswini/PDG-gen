import java.util.Scanner;

public class Main 
{
	static int[] a;
	static int n;
	static int[] streak;
	static long MOD = 1000000007;
	static long[] dp;
	
	static long get(int i)
	{
		if(i<0||i>=n)return 1;
		else return dp[i];
	}
	
	static void test()
	{
		int n = 1000;
		System.out.println(n);
		for(int i = 0; i < n; i++)
		{
			System.out.println((int)(Math.random()*500));
		}
	}

	public static void main(String[] args) 
	{
//		test();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		int streaker = -1;
		int curstreak = 0;
		
		a = new int[n];
		streak = new int[n];
		
		for(int i = 0; i < n; i++)
		{
			a[i] = sc.nextInt();
			
			if(a[i] != streaker)
			{
				streaker = a[i];
				curstreak = 0;
			}
			curstreak++;
			streak[i] = curstreak;
		}
		
		long k = 1;
		dp = new long[n];
		long[] forcol = new long[200001];
		
		for(int i = 0; i < 200001; i++)
			forcol[i] = 0;
//		unlockedcol.add(-1);
		for(int i = 0; i < n; i++)
		{
			long cur = get(i-1);
			
			if(streak[i]==1)
			{
//				System.out.println("Go for " + i + ", streak " + streak[i]);
				cur = (cur + forcol[a[i]])%MOD;
				
				forcol[a[i]] = (forcol[a[i]] + get(i-1))%MOD;
			}
//			else cur = get(i-1);
			
			dp[i] = cur;
		}
		k=(dp[n-1])%MOD;
		if(k<0)k+=MOD;
		
//		System.out.println(Arrays.toString(streak));
//		System.out.println(Arrays.toString(dp));
		System.out.println(k);
	}

}
