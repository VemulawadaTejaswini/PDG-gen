import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	long pow(long a,long n,long p) {
		long ret=1;
		for (;n>0;n>>=1,a=a*a%p) if(n%2==1) ret=ret*a%p;
		return ret;
	}
	
	long[] reverse(long[] a) {
		int s=0;
		int t=a.length-1;
		long[] b=Arrays.copyOf(a, a.length);
		while (s<t) {
			b[s]^=b[t];b[t]^=b[s];b[s]^=b[t];
			++s;--t;
		}
		return b;
	}
	
	//      * 
	// oxoxoxxoxoxo
	long g(long[] A) {
		int N=A.length;
		long ans=-Long.MAX_VALUE/3;
		long[] a=new long[N];
		long[] b=new long[N];
		for (int i=0;i<N;++i) {
			a[i]=(i%2==0?A[i]:0)+(i>0?a[i-1]:0);
			b[i]=(i%2==0?0:A[i])+(i>0?b[i-1]:0);
		}
		for (int i=0;i<N;++i) {
			if (i%2==1) ans=Math.max(ans, a[i]+(b[N-1]-b[i]));
		}
		return ans;
	}
	
	long f(long[] A) {
		int N=A.length;
		long[] a=new long[N];
		long[] b=new long[N];
		long[] c=new long[N];
		for (int i=0;i<N;++i) {
			a[i]=(i%2==0?A[i]:0)+(i>0?a[i-1]:0);
			b[i]=(i%2==0?0:A[i])+(i>0?b[i-1]:0);
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
		for (int i=2;i<N;i+=2) {
			max=Math.max(max, c[i]+a[N-1]-a[i]);
		}
		return max;
	}
	
	final long MOD=(long)1e9+7;

	void run() {
		Scanner sc=new Scanner(System.in);
		PrintWriter pw=new PrintWriter(System.out);
		int N=sc.nextInt();
		long[] A=new long[N];
		for (int i=0;i<N;++i) A[i]=sc.nextInt();
		if(N%2==0) {
			pw.println(Math.max(g(A),g(reverse(A))));
		} else {
			pw.println(Math.max(f(A),f(reverse(A))));
		}
		pw.close();
	} 
	
	void tr(Object...objects) {System.out.println(Arrays.deepToString(objects));}
	
    public static void main(String[] args) {
    	new Main().run();
    }
}
