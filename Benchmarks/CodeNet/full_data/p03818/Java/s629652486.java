import java.io.*;
import java.math.*;
import java.util.*;
public class Main {
	public static void main(String[] args) { 
		/*Take numbers occurring >= 3 times first
		 * Then pair numbers that appear 2 times each
		 * Then clean up remaining numbers that appear 2 times each */
		FastScanner I = new FastScanner(); //Input
		OutPut O = new OutPut(); //Output
		int N = I.nextInt();
		int big = (int)(1e5+1);
		int[] cnts = new int[big+1];
		int ans = 0;
		for (int i = 0; i < N; i++) cnts[I.nextInt()]++;
		for (int i = 1; i <= big; i++) {
			if (cnts[i]>=3) {
				cnts[i]=cnts[i]%2==1?1:2; //Odd numbers can be reduced to 1, 
				//but even can't go lower than 2
			}
		}
		ArrayList<Integer> pair = new ArrayList<Integer>();
		for (int i = 1; i <= big; i++) {
			if (cnts[i]==2&&pair.size()==0) pair.add(i);
			else if (cnts[i]==2) {
				int now = i;
				int prev = pair.get(0);
				cnts[now]=1;
				cnts[prev]=1; //Two numbers deleted are one of each number that occurred twice
				pair = new ArrayList<Integer>(); //refresh most recent pair now
			}
		}
		//What if one number still has 2 occurrences? (At most 1 since pairings cancel out >=2)
		for (int i = 1; i <= big; i++) ans+=cnts[i];
		for (int i = 1; i <= big; i++) {
			if (cnts[i]==2) {
				ans-=2;
				break; //Will have to delete some 2 cards regardless in this case
			}
		}
		O.pln(ans);
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
