import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    static int n;
    static double[][][] dp;
    static boolean[][][] flg;
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		n = sc.nextInt();
		dp = new double[n+1][n+1][n+1];
		flg = new boolean[n+1][n+1][n+1];
		int[] a = new int[4];
		for(int i = 0; i < n; i++){
		    int tmp = sc.nextInt();
		    a[tmp]++;
		}
		
		// 計算
		double result = 0;
		flg[0][0][0] = true;
		result = func(a[1], a[2], a[3]);
		
		// 出力
		System.out.println(result);
	}
	
	public static double func(int x, int y, int z){
	    if(flg[x][y][z]) return dp[x][y][z];
	    flg[x][y][z] = true;
	    double A = 0;
	    double B = 0;
	    double C = 0;
	    if(x > 0) A = func(x-1, y, z)*x/n;
	    if(y > 0) B = func(x+1, y-1, z)*y/n;
	    if(z > 0) C = func(x, y+1, z-1)*z/n;
	    dp[x][y][z] = (A+B+C+1)*n/(x+y+z);
	    return dp[x][y][z];
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
