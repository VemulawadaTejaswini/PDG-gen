import java.util.*;
public class Main{
	
	
	private static Scanner sc=new Scanner(System.in);
	
	public static long maxProfit(int weivalue[][],int capacity,int maxValue){
		//System.out.println(maxValue);
		long dp[][]=new long[weivalue.length+1][maxValue+1];
		
		for(int i=0;i<=weivalue.length;i++){
			Arrays.fill(dp[i],Integer.MAX_VALUE);
			dp[i][0]=0;
		}
		
		for(int i=1;i<=weivalue.length;i++){
			for(int j=0;j<=maxValue;j++){
				if(j>=weivalue[i-1][1]){
					dp[i][j]=Math.min(dp[i-1][j],weivalue[i-1][0]+dp[i-1][j-weivalue[i-1][1]]);
				}else{
					dp[i][j]=dp[i-1][j];
				}
			}
		}
		long ans=0;
		for(int i=0;i<=maxValue;i++){
			if(dp[weivalue.length][i]<=capacity)
				ans=i;
		}
		return ans;
			
	}
	
	public static void main(String []args){
		
		int n=sc.nextInt();
		int w=sc.nextInt();
		long sum=0;
		int weivalue[][]=new int[n][2];
		for(int i=0;i<n;i++){
			weivalue[i][0]=sc.nextInt();
			weivalue[i][1]=sc.nextInt();
			sum+=weivalue[i][1];
		}
		
		
		System.out.println(maxProfit(weivalue,w,(int)sum));
		
	}
}