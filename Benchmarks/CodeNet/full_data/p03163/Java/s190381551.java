import java.util.*;
import java.lang.*;

public class Main {
  
    public int dp(int[] a,int[] b,int[] c,int[] dp1 ,int[] dp2,int[] dp3,int n,int index,int type) {
    	if(index==n-1) {
    		dp1[n-1]=a[n-1];
    		dp2[n-1]=b[n-1];
    		dp3[n-1]=c[n-1];
    	}
    	else {
    		if(dp1[index]==-1)
    		dp1[index]=this.dp(a, b, c, dp1,dp2,dp3,n,index+1,0)+a[index];
    	if(dp2[index]==-1)
    		dp2[index]=this.dp(a, b, c, dp1,dp2,dp3,n,index+1,1)+b[index];
    	if(dp3[index]==-1)
    	dp3[index]=this.dp(a, b, c, dp1,dp2,dp3,n,index+1,2)+c[index];
    	}
    	if(type==0) {
    		return Math.max(dp2[index], dp3[index]);
    	}
    	if(type==1) {
    		return Math.max(dp1[index],dp3[index]);
    	}
    	else {
    		return Math.max(dp2[index], dp1[index]);
    	}
    	
    }
	public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int w=sc.nextInt();
        long[] arr1=new long[n];//weight
        long[] arr2=new long[n];
        long[][] dp=new long[n][w+1];
        for(int i=0;i<n;i++) {
        	arr1[i]=sc.nextInt();
        	arr2[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++) {
        	for(int j=0;j<=w;j++) {
        		if(i==0) {
        			if(arr1[0]<=j) {
        				dp[i][j]=arr2[0];
        			}
        		}
        		else {
        			long temp=j-arr1[i];
        			if(temp>=0) {
        				dp[i][j]=Math.max(dp[i-1][j],dp[i-1][(int)temp]+arr2[i]);
        			}
        			else {
        				dp[i][j]=dp[i-1][j];
        			}
        		}
        	}
        
        }
       System.out.println(dp[n-1][w]);
	}
}
