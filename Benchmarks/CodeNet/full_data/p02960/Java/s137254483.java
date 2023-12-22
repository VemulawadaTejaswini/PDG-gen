import java.util.Arrays;
import java.util.Scanner;

public class Main 
{
	static long MOD = 1000000007;
	static long[][] dp;
	static int[] a;
	static int n;
	static int[] ss = {1, 10, 9, 12, 3, 4};
	
	static int seq(int pos)
	{
		int c = (n-1-pos)%6;
//		System.out.println("for pos " + pos + ", it's " + ss[c]);
		return ss[c];
	}
	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		a = new int[s.length()];
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) == '?')a[i] = -1;
			else a[i] = s.charAt(i)-'0';
		}
		n = s.length();
		
		dp = new long[n][13];
		for(int pos = 0; pos < n; pos++)
		{
			
			for(int x = 0; x <= 9; x++)
			{
				if(a[pos] == x || a[pos] == -1)
				{ //possible. apply this.
					for(int prevmod = 0; prevmod < 13; prevmod++)
					{
						long prevsc;
						if(pos==0&&prevmod==0)prevsc=1;
						else if(pos==0)prevsc=0;
						else prevsc = dp[pos-1][prevmod];
						//no. of ways that up until the prev digits the mod is prevmod
						
						int resmod = ((x*seq(pos))+prevmod)%13;
						while(resmod<0)resmod+=13;
						
						if(pos==n-1 && prevsc>0 && resmod == 5)
						{
//							System.out.println("resmod is from: " + seq(pos));
//							System.out.println("pos: " + pos + " resmod " + resmod + " prevsc " + prevsc + ", prevmod " + prevmod);
						}
//						System.out.println("Test " + pos + ", " + x);
						dp[pos][resmod]=((dp[pos][resmod]+prevsc)%MOD);
					}
					
					
				}
			}
			
		}
		
		dp[n-1][5]=(dp[n-1][5])%MOD;
		while(dp[n-1][5]<0)dp[n-1][5]+=MOD;
		System.out.println(dp[n-1][5]);
	}

}
