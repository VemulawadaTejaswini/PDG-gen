import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	long gcd(long a,long b) {
		return a==0?b:gcd(b%a,a);
	}
	
	long pow(long a,long n,long p) {
		long ret=1;
		for (;n>0;n>>=1,a=a*a%p) if(n%2==1) ret=ret*a%p;
		return ret;
	}
	
	final long MOD=(long)1e9+7;

	void run() {
		Scanner sc=new Scanner(System.in);
		PrintWriter pw=new PrintWriter(System.out);
		int N=sc.nextInt();
		int[] A=new int[N];
		for (int i=0;i<N;++i) A[i]=sc.nextInt();
		long sum=Arrays.stream(A).sum();
		if(N%2==0) {
			long a=0;
			for (int i=0;i<N;i+=2) a+=A[i];
			pw.println(Math.max(a, sum-a));
		} else {
			// oxoxxxo (i)
			// oxxoxxo (iv)
			// oxxxoxo (i)
			
			// oxoxxox (ii)
			// xoxxoxo (iii)
			
			// oxoxoxox xoxoxoxox xoxoxoxo
			// e o e
			long[] a=new long[N];
			long[] b=new long[N];
			long[] c=new long[N];
			for (int i=0;i<N;++i) {
				if (i%2==0) a[i]+=A[i]; 
				else b[i]+=A[i];
				if (i>0) a[i]+=a[i-1];
				if (i>0) b[i]+=b[i-1];
				if (i%2==0&&i>=2) {
					c[i]=Math.max(c[i-2]+A[i-1], a[i-1]);
				}
			}
			long max=-Long.MAX_VALUE/3;
			for (int i=0;i<N;i+=2) {
				max=Math.max(max, a[N-1]-A[i]);
			}
			for (int i=0;i<N;i+=2) {
				max=Math.max(max, (i>0?a[i-1]:0)+(b[N-1]-b[i]));
			}
			for (int i=1;i<N;i+=2) { 
				max=Math.max(max, b[i-1]+(a[N-1]-a[i]));
			}
			for (int i=2;i<N;i+=2) {
				max=Math.max(max, c[i]+a[N-1]-a[i]);
			}
			pw.println(max);
		}
		pw.close();
	} 
	
	void tr(Object...objects) {System.out.println(Arrays.deepToString(objects));}
	
    public static void main(String[] args) {
    	new Main().run();
    }
}
