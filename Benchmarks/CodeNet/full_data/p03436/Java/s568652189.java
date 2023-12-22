import java.io.*;
import java.math.*;
import java.util.*;
public class Main { //Read the question silly billy
 
	public static void main(String[] args) { 
		FastScanner I = new FastScanner(); //Input
		OutPut O = new OutPut(); //Output
		int R = I.nextInt();
		int C = I.nextInt();
		char[][] grid = new char[R][C];
		int ans = -1;
		for (int r = 0; r < R; r++) {
			grid[r] = I.next().toCharArray();
		}
		int shortest = BFS(grid);
		//O.pln(shortest);
		if (shortest!=-1) {
			int totW = 0;
			for (int r = 0; r < R; r++) {
				for (int c = 0; c < C; c++) {
					if (grid[r][c]=='.') totW++;
				}
			}
			
			ans = totW-shortest; //Need shortest path length's worth of white squares,
			//rest can be contributed to score
		}
		O.pln(ans);
	}
	public static int BFS(char[][] grid) {
		int R = grid.length;
		int C = grid[0].length;
		Queue<int[]> cur = new LinkedList<int[]>();
		boolean[][] vis = new boolean[R][C];
		vis[0][0]=true; //Start from top right
		int[] start = {0,0};
		cur.add(start);
		int len = 1; //Starting square counts as 1 length path
		while (!cur.isEmpty()) {
			int size = cur.size(); //Adding in between loops changes queue size,
			//therefore confusion
			//Storing that info before-hand would be best
			for (int i = 0; i < size; i++) {
				int[] curPos = cur.poll();
				int row = curPos[0];
				int col = curPos[1]; //You're polling from previous level of graph silly,
				//therefore len+1 isn't needed since this looks back at the previous level
				if (row==R-1&&col==C-1) return len; //Include most recent (end) block in 
				//length as well (UPD: not needed? Over-thinking?)
				if (row>0&&!vis[row-1][col]&&grid[row-1][col]=='.') {
					int[] pair = {row-1,col};
					cur.add(pair);
					vis[row-1][col]=true;
				}
				if (row<R-1&&!vis[row+1][col]&&grid[row+1][col]=='.') {
					int[] pair = {row+1,col};
					cur.add(pair);
					vis[row+1][col]=true;
				}
				if (col>0&&!vis[row][col-1]&&grid[row][col-1]=='.') {
					int[] pair = {row,col-1};
					cur.add(pair);
					vis[row][col-1]=true;
				}
				if (col<C-1&&!vis[row][col+1]&&grid[row][col+1]=='.') {
					int[] pair = {row,col+1};
					cur.add(pair);
					vis[row][col+1]=true;
				}
			}
			len++;
		}
		return -1;
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
