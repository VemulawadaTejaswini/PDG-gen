import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 
 
	public static void main(String[] args) { 
		FastScanner I = new FastScanner(); //Input
		OutPut O = new OutPut(); //Output
		int N  = I.nextInt();
		long[] a = new long[N];
		long[] ans = new long[N];
		for (int i = 0; i < N; i++) {
			a[i] = I.nextLong();
		}
		ans[0]=0;
		boolean UPD = false;
		long diff = 0;
		for (int i = 1; i < N; i++) {
			if (i<N-1)ans[i] = a[i-1]*2-ans[i-1];
			else {
				ans[i] = a[i-1]*2-ans[i-1];
				if (ans[N-1]+ans[0]!=2*a[N-1]) {
					diff=2*a[N-1]-ans[N-1]-ans[0];
					UPD=true;
				}
			}
		}
		if (UPD) {
			ans[0]=diff/2;
			for (int i = 1; i < N; i++) {
				if (i%2==0) ans[i]+=ans[0];
				else ans[i]-=ans[0];
			}
		}
		for (int i = 0; i < N; i++) O.p(ans[i]+" ");
	}
	public static long ceil(long num, long den) {long ans = num/den; if (num%den!=0) 
	ans++; return ans;}
	public static long GCD(long a, long b) {
		if (a==0||b==0) return Math.max(a,b);
		return GCD(Math.min(a, b),Math.max(a, b)%Math.min(a, b));
	}
	public static long FastExp(long base, long exp, long mod) {
		long ans=1;
		while (exp>0) {
			if (exp%2==1) ans*=base;
			exp/=2;
			base*=base;
			base%=mod;
			ans%=mod;
		}
		return ans;
	}
	public static long ModInv(long num,long mod) {return FastExp(num,mod-2,mod);}
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		int nextInt() {return Integer.parseInt(next());}
		long nextLong() {return Long.parseLong(next());};
	}
	static class OutPut{
		PrintWriter w = new PrintWriter(System.out);
		void pln(int x) {w.println(x);w.flush();}
		void pln(long x) {w.println(x);w.flush();}
		void pln(String x) {w.println(x);w.flush();}
		void pln(char x) {w.println(x);w.flush();}
		void pln(StringBuilder x) {w.println(x);w.flush();}
		void p(int x) {w.print(x);w.flush();}
		void p(long x) {w.print(x);w.flush();}
		void p(String x) {w.print(x);w.flush();}
		void p(char x) {w.print(x);w.flush();}
		void p(StringBuilder x) {w.print(x);w.flush();}
	}
}
