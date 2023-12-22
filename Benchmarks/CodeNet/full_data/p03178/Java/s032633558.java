import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		int d=in.nextInt();
		int n=s.length();
		int mod=1000000007;
		int[][] dp=new int[n][d];
		dp[0][0]=1;
		for (int i=1;i<n;++i)
			for (int j=0;j<d;++j) if (dp[i-1][j]>0)
				for (int k=0;k<10;++k) {
					dp[i][(j+k)%d]+=dp[i-1][j];
					if (dp[i][(j+k)%d]>=mod)
						dp[i][(j+k)%d]-=mod;
				}
		int pre=d,res=0;
		for (int i=0;i<n;++i) {
			int num=s.charAt(i)-'0';
			for (int j=0;j<num;++j) {
				res+=dp[n-i-1][d-pre];
				if (res>=mod) res-=mod;
				++pre;
				if (pre>d) pre-=d;
			}
		}
		if (pre%d==0) ++res;
		--res;
		if (res<0) res+=mod;
		if (res>=mod) res-=mod;
		System.out.println(res);
	}
}