import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 
 
	public static void main(String[] args) { //Partition babyyyyyyyyy
		FastScanner I = new FastScanner(); //Input
		OutPut O = new OutPut(); //Output
		int N = I.nextInt();
		PriorityQueue<Long> can = new PriorityQueue<Long>(Collections.reverseOrder());
		PriorityQueue<Long> must = new PriorityQueue<Long>(Collections.reverseOrder());
		for (int i = 0; i < N; i++) can.add(I.nextLong());
		int M = I.nextInt();
		for (int i = 0; i < M; i++) must.add(I.nextLong());
		while (!can.isEmpty()) {
			//O.pln(can.peek()+" "+must.peek());
			if (can.peek()<must.peek()) break; //If largest candidate is < largest requirement
			//IMPOSSIBLE since priority queue is sorted in non-increasing order
			if (can.peek()==must.peek()) must.poll();
			can.poll(); //Have to remove candidate regardless
			if (must.isEmpty()) break;
		}
		O.pln(must.size()==0?"YES":"NO");
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
