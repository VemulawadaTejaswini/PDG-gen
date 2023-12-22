import java.io.*;
import java.math.*;
import java.util.*;
public class Main {  
 
	public static void main(String[] args) { 
		FastScanner I = new FastScanner(); //Input
		OutPut O = new OutPut(); //Output
		/*ArrayList<String> perms = perms(5,5);
		for (int i = 0; i <perms.size(); i++) {
			O.pln(perms.get(i));
		}
		O.pln(perms.size());*/
		long mod = (long)(1e9)+7;
		int N = I.nextInt();
		ArrayList<String> perms = perms(N,N);
		int[] a = new int[N];
		int[] b = new int[N];
		int first = 0;
		int second = 0;
		for (int i = 0; i < N; i++) a[i] = I.nextInt();
		for (int i = 0; i < N; i++) b[i] = I.nextInt();
		for (int i = 0; i < perms.size(); i++) {
			String[] cur = perms.get(i).split(" ");
			boolean good=true;
			for (int j = 0; j < cur.length; j++) {
				if (a[j]!=Integer.parseInt(cur[j])){
					good=false;
					break;
				}
			}
			if (good) {
				first=i+1;
				break;
			}
		}
		for (int i = 0; i < perms.size(); i++) {
			String[] cur = perms.get(i).split(" ");
			boolean good=true;
			for (int j = 0; j < cur.length; j++) {
				if (b[j]!=Integer.parseInt(cur[j])){
					good=false;
					break;
				}
			}
			if (good) {
				second=i+1;
				break;
			}
		}
		O.pln(Math.abs(second-first));
	}
	public static ArrayList<String> perms(int N, int upper){
		if (N==1) {
			ArrayList<String> ret = new ArrayList<String>();
			for (int i = 1; i<=upper; i++) ret.add(Integer.toString(i)+" ");
			return ret;
		}
		ArrayList<String> prev = perms(N-1,upper);
		ArrayList<String> ret = new ArrayList<String>();
		for (int i = 0; i < prev.size(); i++) {
			boolean[] vis = new boolean[upper+1];
			String cur = prev.get(i);
			String[] parts = cur.split(" ");
			for (int j = 0; j < parts.length; j++) {
				vis[Integer.parseInt(parts[j])]=true;
			}
			for (int j = 1; j <= upper; j++) {
				if (!vis[j]) {
					String curans = cur;
					curans+=Integer.toString(j)+" ";
					ret.add(curans);
				}
			}
		}
		return ret;
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
