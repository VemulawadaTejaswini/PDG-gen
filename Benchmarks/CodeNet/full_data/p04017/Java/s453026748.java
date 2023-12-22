

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int[] num = new int[n];
		int[] dp = new int[n];
		int st=0,dr=0;
		for (int i = 0; i < n; i++) {
			num[i] = s.nextInt();
		}
		int l = s.nextInt();
		int q = s.nextInt();
		
		
		while(dr!=dp.length)
		{  
			if(num[dr]-num[st]<=l)
			{
				dp[st]=dr;
				dr++;
			}
			else{
				if(dp[st]==0&&st!=0)
					dp[st]=dp[st-1];
				st++;
			}
			
			
		}
		if(st==0)st++;
		while(st<dp.length)
		{   
			dp[st]=dp[st-1];
			st++;
		}
			
	
		
		for (int i = 0; i < q; i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			System.out.println(f(dp,a-1,b-1));
		}
		
		
	}
	
	public static int f(int[] dp, int a, int b) {
		
		int cost=0;
		if(a>b)
		{
			a=a^b;
			b=a^b;
			a=a^b;
			
		}
		int current =a;
		while(current <b)
		{  
			current =dp[current];
			cost++;
		}
		return cost;
		
		
	}
}
