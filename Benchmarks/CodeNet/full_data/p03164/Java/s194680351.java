import java.util.*;
import java.lang.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
// 		Scanner sc= new Scanner(System.in);
// 		String s1 = sc.next();
// 		String s2 = sc.next();
// 		int dp[][]=new int[s1.length()][s2.length()];
// 		for(int i=0;i<s1.length;i++){
// 		    for(j=0;j<s2.lengthh;j++){
// 		        if(s1.charAt(i)==s2.charAt(j)) {
// 		            if(j==0){
// 		                dp[i][j]= 1;
// 		            }
// 		            else {
// 		               dp[i][j]= dp[i-1][j-1]+1; 
// 		            }
// 		        }
// 		        else{
// 		            if(j>0)
// 		                dp[i][j]=dp[i][j-1];
// 		        }
// 		    }
	//	}
	
	Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int w = sc.nextInt();
		int wt[] = new int[n];
		int val[] = new int[n];
		for(int i=0;i<n;i++){
		    wt[i] = sc.nextInt();
		    val[i]=sc.nextInt();
		}
		long dp[][]=new long[w+1][n];
		long maxv = Long.MIN_VALUE;
		for(int i=0;i<=w;i++){
		    for(int j=0;j<n;j++){
		        if (i==0){
		            dp[i][j]=0;
		        }
		        else {
		            if (j>0) {
		                dp[i][j] = dp[i][j-1];
		            }
		            if (i-wt[j]>=0){
		                if (i-wt[j]==0){
		                    if (j>0){
		                        dp[i][j]=Math.max(dp[i][j], dp[i-wt[j]][j-1]+val[j]); 
		                    }
		                  else {
		                      dp[i][j]=Math.max(dp[i][j], val[j]); 
		                  }
		                }
		                else {
		                    if (dp[i-wt[j]][j]>0){
		                        if (j>0){
		                        dp[i][j]=Math.max(dp[i][j], dp[i-wt[j]][j-1]+val[j]); 
		                    }
		                    else {
		                        dp[i][j]=Math.max(dp[i][j], val[j]);
		                    }
		                        
		                    }
		                }
		                
		            }
		        }
		    }
		    //System.out.print(dp[i][n-1]+" "+i);
		    //System.out.println();
		   maxv = Math.max(maxv, dp[i][n-1]);
		}
	    System.out.println(maxv);
		
	}
}