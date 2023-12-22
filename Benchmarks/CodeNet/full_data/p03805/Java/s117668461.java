import java.io.*;
import java.math.*;
import java.util.*;
public class Main {
	public static void main(String[] args) { 
		/*Permutation check on graph*/
		FastScanner I = new FastScanner(); //Input
		OutPut O = new OutPut(); //Output
		int N = I.nextInt();
		int M = I.nextInt();
		ArrayList<Integer>[] graph = new ArrayList[N+1];
		for (int i = 1; i <= N; i++) graph[i] = new ArrayList<Integer>();
		while (M-->0) {
			int A = I.nextInt();
			int B = I.nextInt();
			graph[A].add(B);
			graph[B].add(A);
		}
		ArrayList<String> perms = perms(N,N-1);
		int ans = 0;
		//for (int i = 0; i < perms.size(); i++) O.pln(perms.get(i));
		for (int i = 0; i<perms.size(); i++) {
			String[] cur = perms.get(i).split(" ");
			int start = 1; //Current start vertex
			boolean good=true;
			for (int j = 0; j < cur.length; j++) {
				boolean found=false;
				for (int k = 0; k < graph[start].size(); k++) {
					int nbr = graph[start].get(k);
					if (nbr==Integer.parseInt(cur[j])) {
						start=Integer.parseInt(cur[j]);
						found=true;
						break;
					}
				}
				if (!found) {
					good=false;
					break;
				}
			}
			if (good) ans++;
		}
		O.pln(ans);
	}
	public static ArrayList<String> perms(int N, int size){
		if (size==1) {
			ArrayList<String> ret = new ArrayList<String>();
			for (int i = 2; i<=N; i++) ret.add(Integer.toString(i)+" ");
			return ret;
		}
		ArrayList<String> prev = perms(N,size-1);
		ArrayList<String> ret = new ArrayList<String>();
		for (int i = 0; i < prev.size(); i++) {
			String[] now = prev.get(i).split(" ");
			String cur = prev.get(i);
			boolean[] vis = new boolean[10];
			for (int j = 0; j < now.length; j++) {
				vis[Integer.parseInt(now[j])]=true;
			}
			for (int j = 2; j <= N; j++) {
				if (!vis[j]) {
					ret.add(cur+Integer.toString(j)+" ");
				}
			}
		}
		return ret;
	}
	public static double max(double a, double b) {return Math.max(a, b);}
	public static double min(double a, double b) {return Math.min(a, b);}
	public static long min(long a, long b) {return Math.min(a,b);}
	public static long max(long a, long b) {return Math.max(a,b);}
	public static int min(int a, int b) {return Math.min(a,b);}
	public static int max(int a, int b) {return Math.max(a,b);}
	public static long abs(long x) {return Math.abs(x);}
	public static long ceil(long num, long den) {long ans = num/den; if (num%den!=0) 
	ans++; return ans;}
	public static long GCD(long a, long b) {
		if (a==0||b==0) return max(a,b);
		return GCD(min(a,b),max(a,b)%min(a,b));
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
