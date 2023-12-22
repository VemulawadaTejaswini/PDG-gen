import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 
 
	public static void main(String[] args) { 
		FastScanner I = new FastScanner(); //Input
		OutPut O = new OutPut(); //Output
		long Q = I.nextLong();
		long H = I.nextLong();
		long S = I.nextLong();
		long D = I.nextLong();
		long N = I.nextLong();
		Q*=8;
		H*=4;
		S*=2;
		long ans = 0;
		if (N%2==0) {
			long[] a = {Q,H,S,D};
			Arrays.sort(a);
			long cheap = a[0];
			N/=2; //Originally scaled per two liters to avoid precision errors
			ans=cheap*N;
		}else {
			if (D<S&&D<Q&&D<H) {
				//O.pln("HERE");
				long[] a = {H,S,Q};
				Arrays.sort(a);
				N/=2;
				ans += N*D;
				ans+=a[0]/2; //Have to also incorporate second cheapest (/2 because we need to 
				//re-scale to cost per single liter)
			}else { //If double isn't cheapest ---> Don't worry!!
				long[] a = {Q,H,S,D};
				Arrays.sort(a);
				long cheap = a[0];
				cheap/=2;
				ans=cheap*N;
			}
		}
		O.pln(ans);
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