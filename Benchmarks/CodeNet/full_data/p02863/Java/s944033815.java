import java.util.*;

class Main{
	public static void main(String[] $) {
		System.err.println();
		Scanner s=new Scanner(System.in);

		int n=s.nextInt(),t=s.nextInt();
		int[]dp=new int[t+1];
		for(int q=0;q<n;++q) {
			int l=s.nextInt(),v=s.nextInt();
			dp[t]=Math.max(dp[t],dp[t-1]+v);
			for(int i=t-1;i>=l;--i)
				dp[i]=Math.max(dp[i],dp[i-l]+v);
			System.err.println(Arrays.toString(dp));
		}
		System.out.println(Arrays.stream(dp).max().getAsInt());
	}
}
