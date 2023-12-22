import java.io.*;
import java.math.*;
import java.util.*;
public class Main{
	public static void main(String[] args) { 
		/*Some rows can have number 1s be "smaller", while other rows can have number of 1s
		 *be "bigger". Same is the case for columns
		 *For each x amount of rows that can have 1 as bigger, there exist R-x rows with
		 *1 as smaller. Same is the case for columns.
		 *
		 * */
		FastScanner I = new FastScanner(); //Input
		OutPut O = new OutPut(); //Output
		int R = I.nextInt();
		int C = I.nextInt();
		int A = I.nextInt();
		int B = I.nextInt();
		int[][] ans = new int[R][C];
		boolean exists = false;
		for (int rows = 0; rows<=R; rows++) {
			for (int cols = 0; cols<=C; cols++) {
				int rowone = rows*A+(R-rows)*(C-A);
				int colone = cols*B+(C-cols)*(R-B);
				//O.pln(rows+" "+cols);
				if (rowone==colone) {
					//O.pln(rows+" "+cols);
					exists=true;
					int in = 0;
					for (int r = 0; r<rows; r++) {
						for (int c = 0;c < A; c++) {
							ans[r][in]=1;
							in++;
							in%=C;
						}
					}
					for (int r = rows; r < R; r++) {
						for (int c = 0;c < C-A; c++) {
							ans[r][in]=1;
							in++;
							in%=C;
						}
					}
					break;
				}
			}
			if (exists) break;
		}
		if (exists) {
			StringBuilder ret = new StringBuilder();
			for (int i = 0; i < R; i++) {
				for (int j = 0; j < C; j++) {
					ret.append(ans[i][j]);
				}
				ret.append("\n");
			}
			O.pln(ret);
		}else O.pln(-1);
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