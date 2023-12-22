import java.util.*;
public class Main {
   static double ans=0;
   public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	double arr[]=new double[n+1];
	for(int i=1;i<=n;i++) {
		arr[i]=s.nextDouble();
	}
	double dp[][][]=new double[n+2][n+1][n+1];
	for(int i=0;i<=n+1;i++) {
		for(int j=0;j<=n;j++) {
			for(int k=0;k<=n;k++)
				dp[i][j][k]=-1;
			
		}
	}
	
	f(dp,1,0,0,1.0,n,arr);
	  System.out.println(ans);
   }
   
   public static double f(double dp[][][],int i,int head,int tail,double pro,int n,double arr[]) {
	if(i==n+1) {
		if(head>tail) {
			ans+=pro;
			return dp[i][head][tail]=ans;
		}
        return 0;
	}
	
	if(dp[i][head][tail]>0.9) {
		return dp[i][head][tail];
	}
	
	double a=f(dp,i+1,head+1,tail,pro*arr[i],n,arr);
    double b=f(dp,i+1,head,tail+1,pro*(1-arr[i]),n,arr);
	return dp[i][head][tail]=a+b;
	
   }
}