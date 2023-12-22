import java.util.*;

class Main{

	static int mod=1000000007;

	static long[] fact=new long[2001];

	public static void main(String[] $){
		fact[0]=1;
		for(int i=1;i<=2000;++i)
			fact[i]=fact[i-1]*i%mod;
		System.err.println();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),k=s.nextInt();
		int b=k,r=n-k;
		for(int i=1;i<=k;++i){
			long pos=nCr(r+1,i);
			long count=nCr(b-1,i-1);
			System.out.println(pos*count%mod);
			//System.err.println(pos+" "+count+" "+pos*count%mod);
		}
	}

	static long modpow(long n,long a){
		if(a==0)
			return 1;
		if(a%2==0){
			long t=modpow(n,a/2);
			return t*t%mod;
		}
		return n*modpow(n,a-1)%mod;
	}

	static long nCr(int n,int r){
		if(n<r) return 0;
		if(n<0||r<0) return 0;
		return fact[n]*modpow(fact[r],mod-2)%mod*modpow(fact[n-r],mod-2)%mod;
	}
}
