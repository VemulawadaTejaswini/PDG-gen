import java.io.*;
import java.math.*;
import java.util.*;
public class Main {
	public static void main(String[] args) { 
		/*Mark squares that need to be the same
		 * 
		 * */
		FastScanner I = new FastScanner(); //Input
		OutPut O = new OutPut(); //Output
		int cur = 1;
		int R = I.nextInt();
		int C = I.nextInt();
		int[] cnts = new int[26];
		int[][] dp = new int[R][C];
		int[] ltrs = new int[100001];
		for (int i = 0; i < R; i++) {
			String S = I.next();
			for (int j = 0; j < C; j++) cnts[S.charAt(j)-'a']++; 
		}
		ArrayList<Integer> sort = new ArrayList<Integer>();
		for (int i = 0; i < 26; i++) sort.add(cnts[i]);
		for (int col = 0; col<=C/2; col++) {
			for (int row = 0; row<=R/2; row++) {
				if (dp[row][col]==0) {
					if (dp[row][col]==0) {
						dp[row][col]=cur;
						ltrs[cur]++;
					}
					if (dp[row][C-col-1]==0) {
						ltrs[cur]++;
						dp[row][C-col-1]=cur;
					} 
					if (dp[R-row-1][col]==0) {
						dp[R-row-1][col]=cur;
						ltrs[cur]++;
					}
					if (dp[R-row-1][C-col-1]==0) {
						dp[R-row-1][C-col-1]=cur;
						ltrs[cur]++;
					} //Squares that absolutely need the same letter
					cur++;
				}
			}
		}
		int ptr = 1;
		int cov = 0; //Squares successfully filled
		while (ptr<cur) {
			Collections.sort(sort);
			for (int chk = 0; chk<26; chk++) {
				if (sort.get(chk)>=ltrs[ptr]) {
					sort.set(chk,sort.get(chk)-ltrs[ptr]);
					cov+=ltrs[ptr];
					break;
				}
			}
			ptr++;
		}
		O.pln(cov==R*C?"Yes":"No");
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
