import java.util.*;
import java.io.*;

// This file is a "Hello, world!" in Java language by OpenJDK for wandbox.

class Main
{
    public static void main(String[] args)
    {
        new Main().run();
    }
    
    void run(){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        long[] A=new long[N];
        for(int i=0;i<N;++i){
        	A[i]=sc.nextLong();
        }
		long base=0;
		long lcm=1;
		for(int i=0;i<N;++i){
			//h*lcm==A[i]/2-base mod A[i]
			long gcd=gcd(lcm,A[i]);
			long diff=((A[i]/2)-base)%A[i];
			diff=(diff+A[i])%A[i];
			if(diff==0)continue;
			if(gcd(diff,gcd)!=gcd){
				System.out.println(0);
				return;
			}
			long hoge=inv(lcm/gcd,A[i]/gcd)*(diff/gcd)%(A[i]/gcd);
			base=base+hoge*lcm;
			lcm=lcm(lcm,A[i]);
			if(base>M){
				System.out.println(0);
				return;
			}
		}
		System.out.println((M-base)/lcm+1);
    }
	
	long inv(long a, long mod) {
		a %= mod;
		if (a < 0)
			a += mod;
		if (a == 0) {
			throw new AssertionError();
			// return 1;
		}
		long b = mod;
		long p = 1, q = 0;
		while (b > 0) {
			long c = a / b;
			long d;
			d = a;
			a = b;
			b = d % b;
			d = p;
			p = q;
			q = d - c * q;
		}
		long ret = p < 0 ? (p + mod) : p;
		return ret;
	}
	
	long gcd(long a,long b){
		if(a>b)return gcd(b,a);
		if(a==0)return b;
		return gcd(a,b%a);
	}
	
	long lcm(long a,long b){
		return a/gcd(a,b)*b;
	}
	
	void tr(Object...o){
		System.out.println(Arrays.deepToString(o));
	}
}
// OpenJDK reference:
//   http://openjdk.java.net/

// Java language references:
//   http://docs.oracle.com/javase
