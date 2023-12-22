import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int sx = sc.nextInt();
		int sy = sc.nextInt();
		int tx = sc.nextInt();
		int ty = sc.nextInt();
		
		// 計算
		String result = "";
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < tx-sx; i++){
		    sb.append("R");
		}
		for(int i = 0; i < ty-sy; i++){
		    sb.append("U");
		}
		for(int i = 0; i < tx-sx; i++){
		    sb.append("L");
		}
		for(int i = 0; i < ty-sy; i++){
		    sb.append("D");
		}
		sb.append("D");
		for(int i = 0; i < tx-sx; i++){
		    sb.append("R");
		}
		sb.append("R");
		sb.append("U");
		for(int i = 0; i < ty-sy; i++){
		    sb.append("U");
		}
		sb.append("L");
		sb.append("U");
		for(int i = 0; i < tx-sx; i++){
		    sb.append("L");
		}
		sb.append("L");
		sb.append("D");
		for(int i = 0; i < ty-sy; i++){
		    sb.append("D");
		}
		sb.append("R");
		result = sb.toString();
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
