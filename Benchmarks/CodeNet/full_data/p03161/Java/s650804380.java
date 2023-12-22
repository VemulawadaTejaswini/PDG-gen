import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int K=in.nextInt();
		int[] a=new int[n];
		for (int i=0;i<n;++i) a[i]=in.nextInt();
		int[] dp=new int[n];
		for (int i=1;i<n;++i) dp[i]=Integer.MAX_VALUE;
		for (int i=0;i<n;++i)
			for (int k=1;i+k<n&&k<=K;++k) dp[i+k]=Math.min(dp[i+k],dp[i]+Math.abs(a[i+k]-a[i]));
		System.out.println(dp[n-1]);
	}
}