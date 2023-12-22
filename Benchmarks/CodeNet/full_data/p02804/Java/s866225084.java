import java.util.*;
import java.io.*;

// This file is a "Hello, world!" in Java language by OpenJDK for wandbox.

class Main
{
	public static void main(String[] args)
	{
		new Main().run();
	}
	
	long pow(long a,long n){
		long ret=1;
		for(;n>0;n>>=1,a=a*a%m)if(n%2==1)ret=ret*a%m;
		return ret;
	}
	
	final long m=(long)(1e9+7);
	
	int MAX=(int)(3e5);
	long[] fac=new long[MAX];
	long[] ifac=new long[MAX];
	long[] inv=new long[MAX];
	{
		fac[0]=fac[1]=ifac[0]=ifac[1]=inv[0]=inv[1]=1;
		for(int i=2;i<MAX;++i){
			fac[i]=fac[i-1]*i%m;
			inv[i]=m-inv[(int)m%i]*(m/i)%m;
			ifac[i]=ifac[i-1]*inv[i]%m;
		}
	}
	
	long comb(int n,int k){
		if(n<k)return 0;
		return fac[n]*ifac[k]%m*ifac[n-k]%m;
	}
	
	void run(){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		long[] A=new long[N];
		for(int i=0;i<N;++i)A[i]=sc.nextLong();
		Arrays.sort(A);
		long ans=0;
		for(int i=0;i<N;++i){
			//int j=i;
			//while(j+1<A.length&&A[i]==A[j+1])++j;
			//int num=j-i+1;
			//ans+=A[i]*(pow(2,num)-1)*pow(2,i)%m;
			ans+=A[i]*comb(i,K-1)%m;//max
			ans%=m;
			//ans-=A[i]*(pow(2,num)-1)*pow(2,N-1-j)%m;
			ans-=A[i]*comb(N-1-i,K-1)%m;//min
			ans%=m;
			//i=j;
		}
		ans=(ans%m+m)%m;
		System.out.println(ans);
	}
	
	void tr(Object...o){System.out.println(Arrays.deepToString(o));}
}
// OpenJDK reference:
//   http://openjdk.java.net/

// Java language references:
//   http://docs.oracle.com/javase
	