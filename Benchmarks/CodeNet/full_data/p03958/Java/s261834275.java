import java.io.*;
import java.math.*;
import java.util.*;
import java.lang.*;
public class Main { 
 
	public static void main(String[] args) { 
		FastScanner I = new FastScanner(); //Input
		OutPut O = new OutPut(); //Output
		int K = I.nextInt();
		int N = I.nextInt();
		int[] a = new int[N];
		int ans = 0;
		for (int i = 0; i < N; i++) a[i] = I.nextInt();
		Arrays.sort(a);
		int L = 0;
		int R = N-1;
		while (L<=R) { //Just overload statements to ensure no Runtime error
			if (L==R) {
				ans=a[L]-1;
				ans=Math.max(0, ans);
				break;
			}
			int min = Math.min(a[L], a[R]);
			a[L]-=min;
			a[R]-=min;
			if (a[L]==0) L++;
			if (a[R]==0) R--;
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
		void pln(boolean x) {w.println(x);w.flush();}
		void p(int x) {w.print(x);w.flush();}
		void p(long x) {w.print(x);w.flush();}
		void p(String x) {w.print(x);w.flush();}
		void p(char x) {w.print(x);w.flush();}
		void p(StringBuilder x) {w.print(x);w.flush();}
		void p(boolean x) {w.println(x);w.flush();}
	}
}
