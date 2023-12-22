import java.util.*;
import java.io.*;

// This file is a "Hello, world!" in Java language by OpenJDK for wandbox.

class Main
{
    public static void main(String[] args)
    {
        new Main().run();
    }
	
	final long MOD=(long)1e9+7;
	int MAX=(int)3e6;
	long[] fac=new long[MAX];
	long[] ifac=new long[MAX];
	long[] inv=new long[MAX];
	{
		fac[0]=fac[1]=ifac[0]=ifac[1]=inv[0]=inv[1]=1;
		for(int i=2;i<MAX;++i){
			fac[i]=i*fac[i-1]%MOD;
			inv[i]=MOD-inv[(int)MOD%i]*(MOD/i)%MOD;
			ifac[i]=inv[i]*ifac[i-1]%MOD;
		}
	}
	
	long comb(int n,int k){
		return fac[n]*ifac[k]%MOD*ifac[n-k]%MOD;
	}
	
	long pow(long a,long n){
		long ret=1;
		for(;n>0;n>>=1,a=a*a%MOD){
			if(n%2==1)ret=ret*a%MOD;
		}
		return ret;
	}
    
    void run(){
        Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		long[] C=new long[N];
		for(int i=0;i<N;++i)C[i]=sc.nextLong();
		Arrays.sort(C);
		long dp=1;
		long ans=0;
		for(int i=N-1;i>=0;--i){
			long res=N-1-i;
			ans+=2*(pow(2,res)+res*pow(2,res-1)%MOD)%MOD*pow(2,res)%MOD*C[i]%MOD*pow(4,i)%MOD;
			ans%=MOD;
		}
		System.out.println(ans);
    }
	
	void tr(Object...o){
		System.out.println(Arrays.deepToString(o));
	}
}
// OpenJDK reference:
//   http://openjdk.java.net/

// Java language references:
//   http://docs.oracle.com/javase
