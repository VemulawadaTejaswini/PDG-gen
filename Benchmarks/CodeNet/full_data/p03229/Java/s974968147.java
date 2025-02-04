import java.io.*;
import java.math.*;
import java.util.*;
public class Main {
	/*1 --> (N,N-1)
	 * 2 --> (N,N-2)
	 * 3 --> (N-1,N-3)
	 * .
	 * .
	 * .
	 * i --> (N-i+2,N-i)
	 * 1 2 3 4 5 --> 2 5 1 4 3
	 * 
	 * 2 8 1 6 3
	 * */
	public static void main(String[] args) {  
		FastScanner I = new FastScanner(); //Input
		OutPut O = new OutPut(); //Output
		int N = I.nextInt();
		long[] a = new long[N+1];
		long ans = 0;
		for (int i = 1; i <= N; i++) a[i] = I.nextLong();
		Arrays.sort(a);
		if (N==2) ans+=a[2]-a[1];
		else {
			int left = N;
			left-=3;
			ans+=a[N]-a[1];
			ans+=a[N-1]-a[1];
			O.pln(ans);
			int in = 2;
			while (left>0) {
				if (left<=2) {
					ans+=a[N-in+2]-a[in];
					in++;
					left--;
				}else {
					ans+=Math.abs(a[N-in+2]-a[in]);
					left--;
					ans+=Math.abs(a[N-in]-a[in]);
					left--;
					in++;
				}
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
	public static int pop(long x) { //Returns number of bits within a number
		int cnt = 0;
		while (x>0) {
			if (x%2==1) cnt++;
			x/=2;
		}
		return cnt;
	}
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
		double nextDouble() {return Double.parseDouble(next());}
	}
	static class OutPut{
		PrintWriter w = new PrintWriter(System.out);
		void pln(double x) {w.println(x);w.flush();}
		void pln(boolean x) {w.println(x);w.flush();}
		void pln(int x) {w.println(x);w.flush();}
		void pln(long x) {w.println(x);w.flush();}
		void pln(String x) {w.println(x);w.flush();}
		void pln(char x) {w.println(x);w.flush();}
		void pln(StringBuilder x) {w.println(x);w.flush();}
		void pln(BigInteger x) {w.println(x);w.flush();}
		void p(int x) {w.print(x);w.flush();}
		void p(long x) {w.print(x);w.flush();}
		void p(String x) {w.print(x);w.flush();}
		void p(char x) {w.print(x);w.flush();}
		void p(StringBuilder x) {w.print(x);w.flush();}
		void p(BigInteger x) {w.print(x);w.flush();}
		void p(double x) {w.print(x);w.flush();}
		void p(boolean x) {w.print(x);w.flush();}
	}
}
