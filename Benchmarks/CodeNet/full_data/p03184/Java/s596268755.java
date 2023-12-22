import java.util.*;
public class Main {
	static int maxn=212345;
	static long mod=1000000007;
	static long[] fac=new long[maxn];
	static long[] rev=new long[maxn];
	static long ksm(long x,long n) {
		long ret=1;
		while (n>0) {
			if ((n&1)>0) ret=ret*x%mod;
			x=x*x%mod;
			n>>=1;
		}
		return ret;
	}
	static long C(int x,int y) {
		return fac[x]*rev[y]%mod*rev[x-y]%mod;
	}
	static long get(int x,int y) {
		return C(x+y-2,y-1);
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int h=in.nextInt();
		int w=in.nextInt();
		int n=in.nextInt();
		long[] a=new long[n+1];
		long[] dp=new long[n+1];
		for (int i=0;i<n;++i) {
			int r=in.nextInt();
			int c=in.nextInt();
			a[i]=200000L*r+c;
		}
		a[n++]=200000L*h+w;
		fac[0]=rev[0]=1;
		for (int i=1;i<maxn;++i) fac[i]=fac[i-1]*i%mod;
		rev[maxn-1]=ksm(fac[maxn-1],mod-2);
		for (int i=maxn-2;i>=0;--i) rev[i]=rev[i+1]*(i+1)%mod;
		Arrays.sort(a);
		for (int i=0;i<n;++i) {
			int x=(int)(a[i]/200000);
			int y=(int)(a[i]%200000);
			dp[i]=get(x,y);
			for (int j=0;j<i;++j) {
				int tx=(int)(a[j]/200000);
				int ty=(int)(a[j]%200000);
				if (tx>x||ty>y) continue;
				dp[i]-=dp[j]*get(x-tx+1,y-ty+1)%mod;
				dp[i]=(dp[i]%mod+mod)%mod;
			}
		}
		System.out.println(dp[n-1]);
	}
}