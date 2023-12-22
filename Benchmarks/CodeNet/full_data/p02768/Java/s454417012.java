import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws Exception {
		new Main().run();
	}
	
	long pow(long a,long n) {
		long r=1;
		for(;n>0;n>>=1,a=a*a%MOD)if(n%2==1)r=r*a%MOD;
		return r;
	}
	
	final long MOD=(long)1e9+7;
	
	int N=(int)1e6;
	long[] fac=new long[N];
	long[] inv=new long[N];
	long[] ifac=new long[N];
	{
		fac[0]=fac[1]=inv[0]=inv[1]=ifac[0]=ifac[1]=1;
		for(int i=2;i<fac.length;++i) {
			fac[i]=i*fac[i-1]%MOD;
			inv[i]=MOD-inv[(int)(MOD%i)]*(MOD/i)%MOD;
			ifac[i]=inv[i]*ifac[i-1]%MOD;
		}
	}
	
	long comb(long n,int k) {
		long ret=1;
		for(long i=n;i>=n-k+1;--i)ret=ret*i%MOD;
		for(int i=1;i<=k;++i)ret=ret*inv[i]%MOD;
		return ret;
		//return fac[n]*ifac[k]%MOD*ifac[n-k]%MOD;
	}
	
	void run() {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		int a=sc.nextInt();
		int b=sc.nextInt();
		long ans=pow(2,n)-1;
		ans-=comb(n,a)+comb(n,b);
		ans=(ans%MOD+MOD)%MOD;
		System.out.println(ans);
	}
	
	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
	
}
