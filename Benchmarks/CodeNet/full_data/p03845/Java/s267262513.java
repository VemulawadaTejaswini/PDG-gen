import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int[] t = new int[n];
		int sum = 0;
		for(int i = 0; i < n; i++){
		    t[i] = sc.nextInt();
		    sum += t[i];
		}
		int m = sc.nextInt();
		for(int i = 0; i < m; i++){
		    int p = sc.nextInt()-1;
		    int x = sc.nextInt();
		    System.out.println(sum - t[p] + x);
		}
		
		// 計算
		//int result = 0;
		
		// 出力
		//System.out.println(result);
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
