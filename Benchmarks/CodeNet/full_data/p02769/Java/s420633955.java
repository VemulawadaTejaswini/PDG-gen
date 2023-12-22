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
	
	long comb(int n,int k) {
//		long ret=1;
//		for(long i=n;i>=n-k+1;--i)ret=ret*i%MOD;
//		for(int i=1;i<=k;++i)ret=ret*inv[i]%MOD;
//		return ret;
		return fac[n]*ifac[k]%MOD*ifac[n-k]%MOD;
	}
	
	//最終的な分布がa_iになったとする。
	
	void run() {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long k=sc.nextLong();
		long ans=0;
		for(int zero=0;zero<=Math.min(k, n-1);++zero) {
			if(zero==0) {
				if(k%2==0) ++ans;
				else continue;
			}else if(zero==n-1) {
				if((k-zero)%2!=0)continue;
				else ans+=n;
			}else {
				int a=n-zero;
				int b=zero;
				ans+=comb(n,zero)*comb(a+b-1,b)%MOD;
			}
			ans%=MOD;
		}
		System.out.println(ans);
	}
	
	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
	
}
