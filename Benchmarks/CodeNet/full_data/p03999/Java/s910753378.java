import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		long a = sc.nextLong();
		
		// 計算
		long result = 0;
		int n = Long.toString(a).length()-1;
		for(int i = 0; i < 1<<n; i++){
		    long tmp = 0;
		    for(int j = 0; j < n+1; j++){
		        int b = String.valueOf(a).charAt(j) - '0';
		        if((i>>j&1) == 1){
		            result += tmp*10+b;
		            tmp = 0;
		        }else{
		            tmp = tmp*10+b;
		        }
		    }
		    result += tmp;
		    //System.out.println(result);
		}
		
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
