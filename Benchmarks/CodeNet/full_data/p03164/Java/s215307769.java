import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {	
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int w=s.nextInt();
		int prices[]=new int[n];
		int weights[]=new int[n];
		int maxp=0;
		for(int i=0;i<n;i++) {
			weights[i]=s.nextInt();
			prices[i]=s.nextInt();
			maxp+=prices[i];
		}
		
		long dp[][]=new long[n+1][maxp+1];
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=maxp;j++) {
				if(i==0 && j==0)
					dp[i][j]=0;
				else if(i==0)
					dp[i][j]=(long)(1e11);
				else if(j>=prices[i-1]) {
					dp[i][j]=Math.min(weights[i-1]+dp[i-1][j-prices[i-1]], 
							dp[i-1][j]);
				}else
					dp[i][j]=dp[i-1][j];
			}
		}
//		for(int i=0;i<=n;i++) {
//			for(int j=0;j<=maxp;j++)
//				System.out.print(dp[i][j]+" ");
//			System.out.println();
//		}
		int ans=0;
		for(int i=0;i<=maxp;i++)
			if(dp[n][i]<=w)ans=i;
		
		System.out.println(ans);
		
	}


	
	
}