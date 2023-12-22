import java.util.*;

public class Main{
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

	public static long nCr(long n,long r){
		long res=1;
		for(long i=n-r+1;i<=n;++i){
			res*=i;
			res%=mod;
		}
		for(long i=2;i<=r;++i){
			res*=modpow(i,mod-2);
			res%=mod;
		}
		return res;
	}

	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		int[]a=new int[n];
		Arrays.setAll(a,i->s.nextInt());
		Arrays.sort(a);

		if(k==1) {
			System.out.println(0);
			return;
		}

		long sum=0;
		for(int i=0;i<n;++i) {
			for(int j=i+k-1;j<n;++j) {
				sum+=(a[j]-a[i])%mod*nCr(j-i+1-2,k-2)%mod;
				sum%=mod;
			}
		}
		System.out.println(sum);
	}
}
