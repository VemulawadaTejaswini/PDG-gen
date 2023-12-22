import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		int[] last=new int[200000];
		Arrays.setAll(a,i->s.nextInt());
		Arrays.fill(last,Integer.MAX_VALUE);

		long[]dp=new long[n+1];
		dp[0]=1;
		for(int i=0;i<n;++i) {
			if(last[a[i]]<i) {
				dp[i+1]+=dp[last[a[i]]];
			}
			dp[i+1]+=dp[i];
			dp[i+1]%=mod;
			last[a[i]]=i+1;
			System.err.println(dp[i+1]);
		}
		System.out.println(dp[n]);
		System.err.println();
	}
	static int mod=1000000007;
}