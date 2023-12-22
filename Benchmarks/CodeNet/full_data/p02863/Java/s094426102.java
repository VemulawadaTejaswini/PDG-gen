import java.util.*;

class Main{
	public static void main(String[] $) {
		System.err.println();
		Scanner s=new Scanner(System.in);

		int n=s.nextInt(),t=s.nextInt();
		int[]dp=new int[t+3001];
		for(int q=0;q<n;++q) {
			int l=s.nextInt(),v=s.nextInt();
			for(int i=t-1;i>=0;--i)
				dp[i+l]=Math.max(dp[i+l],dp[i]+v);
		}
		System.out.println(Arrays.stream(dp).max().getAsInt());
	}
}
