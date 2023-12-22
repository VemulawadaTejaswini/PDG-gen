import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt();
		long[]dp=new long[m+1];
		for(int q=0;q<n;++q) {
			int w=s.nextInt(),v=s.nextInt();
			for(int i=m;i>=w;--i)
				dp[i]=Math.max(dp[i],dp[i-w]+v);
		}
		System.out.println(dp[m]);
	}
}
