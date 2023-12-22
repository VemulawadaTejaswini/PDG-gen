import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] last=new int[200000];
		Arrays.fill(last,Integer.MAX_VALUE);

		long[]dp=new long[n+1];
		dp[0]=1;
		for(int i=1;i<=n;++i) {
			int v=s.nextInt()-1;
			if(last[v]<i-1) {
				dp[i]+=dp[last[v]];
			}
			dp[i]+=dp[i-1];
			dp[i]%=mod;
			last[v]=i;
		}
		System.out.println(dp[n]);
		System.err.println();
	}
	static int mod=1000000007;
}