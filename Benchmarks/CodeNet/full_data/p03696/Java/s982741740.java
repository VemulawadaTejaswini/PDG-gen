import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 
 
	public static void main(String[] args) { 
		FastScanner I = new FastScanner(); //Input
		OutPut O = new OutPut(); //Output
		String ans = "";
		int N = I.nextInt();
		String S = I.next();
		Queue<Character> cur = new LinkedList<Character>();
		for (int i = 0; i < N; i++) {
			cur.add(S.charAt(i));
		} //Plug all misplaced ( at start
		int TL = 0;
		int TR = 0;
		String curans = "";
		while (!cur.isEmpty()) {
			int L = 0;
			int R = 0;
			String alt = "";
			while (cur.size()>0&&cur.peek()=='(') {
				L++;
				curans+="(";
				cur.poll();
			}
			while (cur.size()>0&&cur.peek()==')') {
				R++;
				curans+=")";
				cur.poll();
			}
			if (R>L) {
				int diff = R-L;
				TL+=diff;
			}else if (L>R) {
				int diff = L-R;
				TR+=diff;
			}
		}
		for (int i = 0; i < TL; i++) {
			ans+="(";
		}
		ans+=curans;
		for (int i = 0; i < TR; i++) {
			ans+=")";
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