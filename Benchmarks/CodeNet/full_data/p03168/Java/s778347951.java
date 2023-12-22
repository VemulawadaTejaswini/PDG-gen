
import java.util.*;


public class Main{ 
	   public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		double arr[]=new double[n+1];
		for(int i=1;i<=n;i++) {
			arr[i]=s.nextDouble();
		}
		
		double dp[][]=new double[n+1][n+1];
		
		for(int i=0;i<n+1;i++) {
			 	for(int j=0;j<=n;j++) {
			     dp[i][j]=-1;
			    }
	    }
//		double ans=0.0;
//		for(int i=n;i>n/2;i--) {
//			ans+=(f(dp,arr,n,i));
//		}
		int x=(n/2)+1;
		double ans=(f(dp,arr,n,x));
		System.out.print(ans);
	   }
	   
   public static double f(double dp[][],double arr[],int i,int x) {
	   if(x==0 ) {
		   return 1;
	   }
	   if(i==0 ) {
		   return 0;
	   }
	   if(dp[i][x]>-0.1) {
		   return dp[i][x];
	   }
	   return dp[i][x]=arr[i]*f(dp,arr,i-1,x-1)+(1-arr[i])*f(dp,arr,i-1,x);
   }
}