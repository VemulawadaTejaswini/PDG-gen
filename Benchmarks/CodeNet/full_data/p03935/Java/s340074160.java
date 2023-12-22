import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner in;
	static PrintWriter out;
	static String INPUT = "";

	static int count(int r1, int c1, int r2, int c2)
	{
		out.printf("? %d %d %d %d\n", r1, c1, r2, c2);
		out.flush();
		return ni();
	}
	
	static void end(boolean[][] map, int mod)
	{
		long h = 0;
		long t = 1;
		for(int i = 0;i < map.length;i++){
			for(int j = 0;j < map[0].length;j++){
				h += (map[i][j] ? 1 : 0) * t;
				h %= mod;
				t = t * 2 % mod;
			}
		}
		out.println("! " + h);
		out.flush();
	}
	
	static void solve()
	{
		int h = ni(), w = ni(), n = ni(), K = ni();
		boolean[][] map = new boolean[h][w];
		dfs(0, h, 0, w, n, map);
		end(map, K);
	}
	
	static void fill(int r1, int r2, int c1, int c2, boolean[][] map)
	{
		for(int k = r1;k < r2;k++){
			for(int l = c1;l < c2;l++){
				map[k][l] = true;
			}
		}
	}
	
	static void dfs(int r1, int r2, int c1, int c2, int n, boolean[][] map)
	{
		if(n == (r2-r1)*(c2-c1)){
			fill(r1, r2, c1, c2, map);
			return;
		}
		if(r2-r1 > c2-c1){
			int hr = (r1+r2)/2;
			int co = count(r1, c1, hr-1, c2-1);
			if(co > 0){
				dfs(r1, hr, c1, c2, co, map);
			}
			if(n-co > 0){
				dfs(hr, r2, c1, c2, n-co, map);
			}
		}else{
			int hc = (c1+c2)/2;
			int co = count(r1, c1, r2-1, hc-1);
			if(co > 0){
				dfs(r1, r2, c1, hc, co, map);
			}
			if(n-co > 0){
				dfs(r1, r2, hc, c2, n-co, map);
			}
		}
	}
	
	public static void main(String[] args) throws Exception
	{
		in = INPUT.isEmpty() ? new Scanner(System.in) : new Scanner(INPUT);
		out = new PrintWriter(System.out);
		
		solve();
		out.flush();
	}
	
	static int ni() { return Integer.parseInt(in.next()); }
	static long nl() { return Long.parseLong(in.next()); }
	static double nd() { return Double.parseDouble(in.next()); }
	static void tr(Object... o) { if(INPUT.length() != 0)System.out.println(Arrays.deepToString(o)); }
}
