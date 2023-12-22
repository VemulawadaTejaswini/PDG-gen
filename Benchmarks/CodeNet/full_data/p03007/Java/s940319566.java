import java.io.*;
import java.math.*;
import java.util.*;
public class Main {
	public static void main(String[] args) { 
		/*Let's say set {A,B,C,D,E} is a sorted list (non-decreasing order)
		 * The smallest possible number you can construct is A-C-D-E
		 * (with one number left out)
		 * Therefore, our answer is B-(A-C-D-E) = B-A+C+D+E = B+C+D+E-A
		 * In other words, the only negative is the smallest possible number 
		 * only do this with positive numbers 
		 * Negatives can just be used as ans-=negative to boost final answer
		 * */
		FastScanner I = new FastScanner(); //Input
		OutPut O = new OutPut(); //Output
		int N = I.nextInt();
		ArrayList<Long> neg = new ArrayList<Long>();
		ArrayList<Long> pos = new ArrayList<Long>();
		StringBuilder ret = new StringBuilder();
		for (int i = 0; i < N; i++) {
			long x = I.nextLong();
			if (x<0) neg.add(x);
			else if (x>0) pos.add(x);
		}
		Collections.sort(pos);
		Collections.sort(neg);
		long max = 0;
		for (int i = 0; i < pos.size(); i++) max+=pos.get(i);
		if (pos.size()>=2) max-=pos.get(0)*2;
		long small = pos.size()>=2?pos.get(0):-1;
		for (int i = 2; i < pos.size(); i++) {
			ret.append(small+" "+pos.get(i));
			ret.append("\n");
			small-=pos.get(i);
		}
		if (pos.size()>=2) {
			ret.append(pos.get(1)+" "+small);
			ret.append("\n");
		}
		int end = neg.size()-1;
		if (pos.size()==0) {
			end--;
			max=neg.get(neg.size()-1);
		}
		for (int i = end; i >= 0; i--) {
			ret.append(max+" "+neg.get(i));
			ret.append("\n");
			max-=neg.get(i); //Actually a boost
		}
		O.pln(max);
		O.pln(ret);
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