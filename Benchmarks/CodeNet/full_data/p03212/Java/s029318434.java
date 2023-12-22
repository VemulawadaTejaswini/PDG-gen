import java.io.*;
import java.math.*;
import java.util.*;
public class Main {  
	public static void main(String[] args) { 
		FastScanner I = new FastScanner(); //Input
		OutPut O = new OutPut(); //Output
		long N = I.nextLong();
		int[] a = new int[10]; //right most indicates ones digit, 2nd rightmost indicates tens
		//digit and so on
		int ans = 0; //GOD
		UPD(a,9);
		while (true) {
			if (!BelowN(a,N)) break;
			UPD(a,9);
			if (Valid(a)) {
				ans++;
			} 
		}
		O.pln(ans);
	}
	public static void UPD(int[] a, int in) {
		if (a[in]==0) a[in]=3;
		else{
			a[in]+=2;
			if (a[in]>7) {
				a[in]=3; //Reset and recurse backwards
				UPD(a,in-1);
			}
		}
	}
	public static boolean Valid(int[] a) {
		boolean[] vis = new boolean[10];
		for (int i = 1; i<= 9; i++) {
			vis[a[i]]=true; //Remember only valid digits are used
		}
		return vis[3]&&vis[5]&&vis[7]?true:false;
	}
	public static boolean BelowN(int[] a, long N) {
		long sum = 0;
		long mult = 1;
		for (int i = 9; i>= 0; i--) {
			sum+=a[i]*mult;
			mult*=10;
		}
		return sum<=N?true:false;
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
