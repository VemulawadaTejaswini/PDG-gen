import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner in=new Scanner (System.in);
      int n=in.nextInt();
	int a[]=new int[n];
	int dp[]=new int[n];
	for(int i=0;i<n;i++)
		a[i]=in.nextInt();
	dp[0]=0;dp[1]=dp[0]+Math.abs(a[1]-a[0]);
	
	for(int i=2;i<n;i++)
	{
		dp[i]=Math.min(dp[i-1]+Math.abs(a[i]-a[i-1]), dp[i-2]+Math.abs(a[i]-a[i-2]));
	}
	
	System.out.println(dp[n-1]);
    }
}