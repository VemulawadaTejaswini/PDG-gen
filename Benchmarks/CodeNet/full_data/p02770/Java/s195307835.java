import java.io.PrintWriter;
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
		int K=sc.nextInt();
		int Q=sc.nextInt();
		long[] d=new long[K];
		long[] n=new long[Q];
		long[] x=new long[Q];
		long[] m=new long[Q];
		for(int i=0;i<K;++i) {
			d[i]=sc.nextLong();
		}
		for(int i=0;i<Q;++i) {
			n[i]=sc.nextLong();
			x[i]=sc.nextLong();
			m[i]=sc.nextLong();
		}
		
		PrintWriter pw=new PrintWriter(System.out);
		for(int q=0;q<Q;++q) {
			long[] sum=new long[K];
			for(int i=0;i<K;++i) {
				long add=d[i]%m[q];
				if(add==0)add=m[q];
				sum[i]=(i>0?sum[i-1]:0)+add;
			}
			long all=sum[K-1];
			long first=x[q];
			long last=x[q]+sum[(int)((n[q]-2)%K)]+all*((n[q]-2)/K);//i=mK+j項目はx+all*(i/K)
			long ans=(last/m[q]*m[q]-first/m[q]*m[q])/m[q];
			pw.println(n[q]-1-ans);
		}
		pw.close();
	}
	
	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
	
}
