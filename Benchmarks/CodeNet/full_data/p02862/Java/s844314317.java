import java.util.*;

class Main{
	public static void main(String[] $) {
		System.err.println();
		Scanner s=new Scanner(System.in);

		int x=s.nextInt(),y=s.nextInt();
		int a=2*x-y,b=2*y-x;

		if(a%3+b%3>0) {
			System.out.println(0);
			return;
		}
		a/=3;
		b/=3;

		System.out.println(nCr(a+b,Math.min(a,b)));
	}

	public static int mod=1000000007;

	public static long modpow(long n,long p) {
		if(p==0)
			return 1;
		if(p%2==1)
			return n*modpow(n,p-1)%mod;
		long d=modpow(n,p/2);
		return d*d%mod;
	}

	public static long nCr(long n,long r){
		long res=1;
		for(long i=n-r+1;i<=n;++i) {
			res*=i;
			res%=mod;
		}
		for(long i=2;i<=r;++i) {
			res*=modpow(i,mod-2);
			res%=mod;
		}
		return res;
	}
}
