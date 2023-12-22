import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int W=in.nextInt();
		int[] w=new int[n];
		int[] v=new int[n];
		int x=0;
		for (int i=0;i<n;++i) {
			w[i]=in.nextInt();
			v[i]=in.nextInt();
			x+=v[i];
		}
		long[] dp=new long[x+1];
		for (int i=1;i<=x;++i) dp[i]=Long.MAX_VALUE;
		for (int i=0;i<n;++i)
			for (int j=x;j>=v[i];--j) if (dp[j-v[i]]!=Long.MAX_VALUE)
				dp[j]=Math.min(dp[j],dp[j-v[i]]+w[i]);
		int res=0;
		for (int i=x;i>=0;--i) if (dp[i]<=W) {
			res=i;
			break;
		}
		System.out.println(res);
	}
}