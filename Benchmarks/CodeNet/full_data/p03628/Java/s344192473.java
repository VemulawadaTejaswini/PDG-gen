import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	
	final long MOD=(long)1e9+7;

	long pow(long a,long n){
		long ret=1;
		for(;n>0;n>>=1,a=a*a%MOD){
			if(n%2==1)ret=ret*a%MOD;
		}
		return ret;
	}
	
	long inv(long a){
		return pow(a,MOD-2);
	}
	
	long comb(long n,long k){
		long ret=1;
		for(long i=1;i<=n;++i)ret=ret*i%MOD;
		for(long i=1;i<=k;++i)ret=ret*inv(i)%MOD;
		for(long i=1;i<=n-k;++i)ret=ret*inv(i)%MOD;
		return ret;
	}
	
	long fac(long n){
		long ret=1;
		for(long i=1;i<=n;++i)ret=ret*i%MOD;
		return ret;
	}
	
	void run() {
	 	Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		char[] s0=sc.next().toCharArray();
		char[] s1=sc.next().toCharArray();
		int p=0;
		long ans=1;
		int pre=0;
		while(p<N){
			if(s0[p]==s1[p]){
				ans=ans*comb(3-pre,1)%MOD;
				pre=1;
				++p;
			}else{
				if(pre<2){
					ans=ans*comb(3-pre,2)*2%MOD;
				}else{
					ans=ans*3%MOD;
				}
				pre=2;
				++p;++p;
			}
		}
		System.out.println(ans);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}
