import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main{
	
	
	public static void main(String[] args) throws Exception {
		
		Scanner s=new Scanner(System.in);
		
		int h=s.nextInt();
		int n=s.nextInt();
		int[] hel=new int[n];
		int [] cost=new int[n];
		for(int i=0;i<n;i++) {
			hel[i]=s.nextInt();
			cost[i]=s.nextInt();
		}
		
		int[][] dp=new int[n+1][h+1];
		
		for(int i=0;i<h+1;i++) {
			dp[0][i]=Integer.MAX_VALUE;
			
		}
		
		for(int i=1;i<n+1;i++) {
			for(int j=1;j<h+1;j++) {
				
				if(j<=hel[i-1]) {
					dp[i][j]=Math.min(dp[i-1][j],cost[i-1]);
					
				}else {
					dp[i][j]=Math.min(dp[i-1][j], cost[i-1]+dp[i][j-hel[i-1]]);
				}
				
			
				
				
			}
		}
		
		
//		for(int i=0;i<n+1;i++) {
//			for(int j=0;j<h+1;j++) {
//				System.out.print(dp[i][j]+" ");
//			}
//			System.out.println();
//		}
//		
		
		System.out.println(dp[n][h]);
		
		
		
	}
}