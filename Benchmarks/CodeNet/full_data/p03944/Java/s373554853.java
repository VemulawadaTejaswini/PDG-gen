import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int w = sc.nextInt();
		int h = sc.nextInt();
		int n = sc.nextInt();
		int xl = 0;
		int xr = w;
		int yu = h;
		int yd = 0;
		for(int i = 0; i < n; i++){
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int a = sc.nextInt();
		    if(a == 1){
		        xl = max(xl, x);
		    }else if(a == 2){
		        xr = min(xr, x);
		    }else if(a == 3){
		        yd = max(yd, y);
		    }else if(a == 4){
		        yu = min(yu, y);
		    }
		}
		// 計算
		int result = 0;
		result = max(0, xr-xl)*max(0, yu-yd);
		
		// 出力
		System.out.println(result);
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
