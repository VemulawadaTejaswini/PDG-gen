import java.util.*;

class Main{
	public static int mod=1000000007;

	public static long modpow(long n,long p){
		if(p==0)
			return 1;
		if(p%2==1)
			return n*modpow(n,p-1)%mod;
		long d=modpow(n,p/2);
		return d*d%mod;
	}

	public static long modpow(long n){
		return modpow(n,mod-2);
	}

	static long[] factCache;
	static long[] modpowCache;

	public static long nCr(int n,int r){
		return factCache[n-r+1]*modpowCache[r]%mod;
	}

	public static void main(String[] $){
		final Scanner s=new Scanner(System.in);
		int n=s.nextInt(), k=s.nextInt();
		if(k==1){
			System.out.println(0);
			return;
		}

		long[] a=new long[n], cache=new long[n-2];
		Arrays.setAll(a,i->s.nextLong());
		factCache=new long[n+1];
		factCache[n]=n;
		for(int i=n-1;i >= 0;--i)
			factCache[i]=factCache[i+1]*i%mod;
		Arrays.setAll(modpowCache,i->modpow(i));
		Arrays.parallelPrefix(cache,(i,j)->(i*j)%mod);
		Arrays.setAll(cache,i->nCr(Math.max(i,k-2),k-2));
		Arrays.parallelPrefix(cache,(i,j)->(i+j)%mod);

		long r=0L;
		for(int i=0;i<n;++i){
			long l=i-1<0?0:cache[i-1];
			long m=n-2-i<0?0:cache[n-2-i];
			r=((l-m+mod)%mod*a[i]%mod+r+mod)%mod;
		}
		System.out.println(r);
	}
}
