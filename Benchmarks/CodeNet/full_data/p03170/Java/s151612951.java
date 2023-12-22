	import java.util.Scanner;
	
	public class Main {
		static Scanner sc=new Scanner(System.in);
		public static void main(String[] args) {
			int n=sc.nextInt();
		
				
				int sum=sc.nextInt();
				int a[]=new int[n];
				//int sum=sc.nextInt();
				
				for(int i=0;i<n;i++)a[i]=sc.nextInt();
				
				
			
				
				
				int dp[][]=new int[n+1][sum+1];
				
				for(int i=0;i<n+1;i++) {
					for(int j=0;j<sum+1;j++) {
						
						if(i==0)dp[i][j]=Integer.MIN_VALUE+1;
						if(i!=0&&j==0)dp[i][j]=0;
						
						
						
					}
				}
				int k=1;
					for(int j=1;j<sum+1;j++) {
						
						if(sum%j!=0)dp[k][j]=Integer.MIN_VALUE+1;
						if(sum%j==0)dp[k][j]=sum/j;
						
						
						
				}
				
				
				for(int i=1;i<n+1;i++) {
					for(int j=1;j<sum+1;j++) {
						if(a[i-1]<=j) dp[i][j]=Math.max(dp[i][j-a[i-1]]+1,dp[i-1][j]);
						else if(a[i-1]>j) dp[i][j]=dp[i-1][j];
					}
				}
			//	System.out.println(dp[n][sum]);
				
				
		
		  if(dp[n][sum]%2==0) System.out.println("SECOND"); else
		  System.out.println("FIRST");
		  
		 
	
				
				
				
		}
	}
