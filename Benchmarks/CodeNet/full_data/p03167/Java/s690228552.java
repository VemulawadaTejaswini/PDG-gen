import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    static int[] max;
    static ArrayList<Integer>[] list;
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int h = sc.nextInt();
		int w = sc.nextInt();
		int MOD = 1000000007;
		long[][] grid = new long[h][w];
		for(int i = 0; i < h; i++){
		    String s = sc.next();
		    for(int j = 0; j < w; j++){
		        if(s.charAt(j) == '#') grid[i][j] = -1;
		    }
		}
		//System.out.println(Arrays.deepToString(grid));
		
		// 計算
		long result = 0;
		grid[0][0] = 1;
		for(int i = 0; i < h; i++){
		    for(int j = 0; j < w; j++){
		        if(grid[i][j] == -1){
		            grid[i][j] = 0;
		            continue;
		        }
		        if(i > 0) grid[i][j] += grid[i-1][j];
		        grid[i][j] %= MOD;
		        if(j > 0) grid[i][j] += grid[i][j-1];
		        grid[i][j] %= MOD;
		    }
		}
		
		result = grid[h-1][w-1];
		
		// 出力
		System.out.println(result);
	}
	
	public static int dfs(int i){
	    if(max[i] != 0) return max[i];
	    int dist = 0;
	    for(Integer next : list[i]){
	        dist = max(dist, dfs(next)+1);
	    }
	    max[i] = dist;
	    return dist;
	}

	public static class Scanner {
		private BufferedReader br; private StringTokenizer tok;
		public Scanner(InputStream is) throws IOException { br = new BufferedReader(new InputStreamReader(is));}
		private void getLine() throws IOException { while(!hasNext()) tok = new StringTokenizer(br.readLine());}
		private boolean hasNext() { return tok != null && tok.hasMoreTokens();}
		public String next() throws IOException { getLine(); return tok.nextToken();}
		public int nextInt() throws IOException { return Integer.parseInt(next());}
		public long nextLong() throws IOException { return Long.parseLong(next());}
		public double nextDouble() throws IOException { return Double.parseDouble(next());}
	}
}
