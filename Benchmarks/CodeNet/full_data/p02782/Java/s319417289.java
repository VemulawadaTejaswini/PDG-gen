import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws Exception {
		new Main().run();
	}
	
	final long mod=(long)1e9+7;
	
	int N=(int)2e6;
	long[] fac=new long[N];
	long[] inv=new long[N];
	long[] ifac=new long[N];
	{
		fac[0]=fac[1]=ifac[0]=ifac[1]=inv[0]=inv[1]=1;
		for(int i=2;i<fac.length;++i)fac[i]=i*fac[i-1]%mod;
		for(int i=2;i<inv.length;++i)inv[i]=mod-inv[(int)(mod%i)]*(mod/i)%mod;
		for(int i=2;i<ifac.length;++i)ifac[i]=inv[i]*ifac[i-1]%mod;
	}
	
	long binom(int n,int k) {
		if(n<0||n<k)return 0;
		return fac[n]*ifac[k]%mod*ifac[n-k]%mod;
	}
	
	long brute(int r,int c) {
		long ret=0;
		for(int i=0;i<=r;++i) {
			for(int j=0;j<=c;++j) {
				ret+=binom(i+j,j);
				ret%=mod;
			}
		}
		return ret;
	}
	
	long f(int r,int c) {
		if(r<0||c<0)return 0;
		long ret=((r+2)*binom(r+c+2,c)%mod-(c+1))*inv(c+1)%mod;
		ret=(ret%mod+mod)%mod;
		return ret;
	}
	
	void run() {
		Scanner sc = new Scanner(System.in);
		int r1=sc.nextInt();
		int c1=sc.nextInt();
		int r2=sc.nextInt();
		int c2=sc.nextInt();
		long ans=f(r2,c2)+f(r1-1,c1-1)-f(r1-1,c2)-f(r2,c1-1);
		ans=(ans%mod+mod)%mod;
		System.out.println(ans);
	}
	
	long inv(long a) {
		return pow(a,mod-2);
	}
	
	long pow(long a,long n) {
		long r=1;
		for(;n>0;n>>=1,a=a*a%mod)if(n%2==1)r=r*a%mod;
		return r;
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}
