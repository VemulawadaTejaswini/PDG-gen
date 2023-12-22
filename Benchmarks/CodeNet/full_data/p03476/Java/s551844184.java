import java.io.*;
import java.math.*;
import java.util.*;
import java.lang.*;
public class Main { 
 
	public static void main(String[] args) { 
		FastScanner I = new FastScanner(); //Input
		OutPut O = new OutPut(); //Output
		int N = (int)(1e5);
		boolean[] prime = new boolean[N+1];
		ArrayList<Long> p = new ArrayList<Long>();
		Arrays.fill(prime, true);
		for (long f = 2; f <= N; f++) {
			if (prime[(int)f]) {
				p.add(f);
				for (long next = f*f; next <= N; next+=f) {
					prime[(int)next]=false;
				}
			}
		}
		int[] pref = new int[N+1];
		//for (int i = 2; i <= N; i++) if (prime[i]) p.add(i);
		for (int i = 3; i <= N; i++) {
			pref[i] = pref[i-1];
			if (prime[i]&&prime[(i+1)/2]) pref[i]++;
		}
		int Q = I.nextInt();
		while (Q-->0) {
			int ans = 0;
			int L = I.nextInt();
			int R = I.nextInt();
			L--; //Want to include lower bound just in case L is valid ([3,5] --> ans = 
			//pref[5]-pref[2]
			ans = pref[R]-pref[L];
			O.pln(ans);
		}
	}
	public static void sort(long[] a) {Arrays.sort(a);}
	public static void sort(int[] a) {Arrays.sort(a);}
	public static void sort(String[] a) {Arrays.sort(a);}
	public static void sort(char[] a) {Arrays.sort(a);}
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
