import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 

	public static void main(String[] args) {  
		FastScanner I = new FastScanner(); //Input
		OutPut O = new OutPut(); //Output
		int N = I.nextInt();
		int[] a = new int[N];
		long ans = 0;
		for (int i = 0; i < N; i++) a[i] = I.nextInt();
		for (int i = 0; i < N; i++) {
			ans++; //All length 1 sub-arrays satisfy 
			boolean[] vis = new boolean[21];
			int bit = 0;
			int curnum = a[i];
			while (curnum>0) {
				if (curnum%2==1) vis[bit]=true;
				bit++;
				curnum/=2;
			}
			//O.pln("hit");
			for (int next = i+1; next<N; next++) { //This will at most go to i+20 --> no O(N^2)
				//issues
				//O.pln(i+" "+next);
				int nextnum = a[next];
				int nextbit = 0;
				boolean good=true;
				while (nextnum>0) {
					if (nextnum%2==1) {
						if (vis[nextbit]) {
							good=false;
							break;
						}
						vis[nextbit]=true;
					} 
					nextnum/=2;
					nextbit++;
				}
				if (!good) {
					//O.pln(i+" "+next);
					break;
				}
				ans++;
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
	}
	static class OutPut{
		PrintWriter w = new PrintWriter(System.out);
		void pln(double x) {w.println(x);w.flush();}
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
	}
}
