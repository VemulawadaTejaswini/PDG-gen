import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int t = sc.nextInt();
		int max = 0;
		int now = 0;
		int cnt = 0;
		for(int i = 0; i < n; i++){
		    int a = sc.nextInt();
		    if(i == 0){
		        now = a;
		        continue;
		    }
		    if(now > a) now = a;
		    if(now < a){
		        if(a-now > max){
		            max = a-now;
		            cnt = 1;
		        }else if(a-now == max){
		            cnt++;
		        }
		    }
		}
		
		// 計算
		int result = cnt;
		
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
