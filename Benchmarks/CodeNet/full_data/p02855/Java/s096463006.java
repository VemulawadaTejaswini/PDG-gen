import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 
 
	public static void main(String[] args) { 
		FastScanner I = new FastScanner(); //Input
		OutPut O = new OutPut(); //Output
		int row = I.nextInt();
		int col = I.nextInt();
		int K = I.nextInt();
		char[][] grid = new char[row][col];
		boolean[][] vis = new boolean[row][col];
		int[][] ans = new int[row][col];
		int cur = 1; //Current cake
		for (int r = 0; r < row; r++) {
			grid[r] = I.next().toCharArray();
		}
		for (int r = 0; r < row; r++) {
			for (int c = 0; c < col; c++) {
				if (grid[r][c]=='#') {
					//boolean[][] good = new boolean[]
					int endC = col-1; //Assuming all columns in current row are cuttable
					int endR = row-1; //Assuming all rows are possible as well
					int startR = 0;
					int startC = 0;
					for (int nextc = c+1; nextc < col; nextc++) {
						if (vis[r][nextc]||grid[r][nextc]=='#') {
							endC=nextc-1;
							break;
						}
					} 
					for (int prevc = c-1; prevc>=0; prevc--) {
						if (vis[r][prevc]||grid[r][prevc]=='#') {
							startC=prevc+1;
							break;
						}
					}
					boolean bad=false;
					for (int nextr=r+1; nextr<row;nextr++) {
						for (int nextc=startC; nextc<=endC; nextc++) {
							if (grid[nextr][nextc]=='#'||vis[nextr][nextc]) {
								bad=true;
								endR=nextr-1;
								break;
							}
						}
						if (bad) break;
					}
					for (int prevr=r-1; prevr>=0;prevr--) {
						for (int nextc=startC; nextc<=endC; nextc++) {
							if (grid[prevr][nextc]=='#'||vis[prevr][nextc]) {
								bad=true;
								startR=prevr+1;
								break;
							}
						}
						if (bad) break;
					}
					for (int fillr = startR; fillr <= endR; fillr++) {
						for (int fillc = startC; fillc <= endC; fillc++){
							ans[fillr][fillc]=cur;
							vis[fillr][fillc]=true;
						}
					}
					cur++; //Moving on to next cake
				}
			}
		}
		for (int r = 0; r < row; r++) {
			for (int c = 0; c < col; c++) {
				O.p(ans[r][c]+" ");
			}
			O.p("\n");
		}
	}
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
		void p(int x) {w.print(x);w.flush();}
		void p(long x) {w.print(x);w.flush();}
		void p(String x) {w.print(x);w.flush();}
		void p(char x) {w.print(x);w.flush();}
	}
}
