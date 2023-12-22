import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		String s = sc.next();
		
		// 計算
		String result = "YES";
		boolean flg = true;
		while(flg){
		    if(s.length()-5 >= 0){
		        String t = s.substring(s.length()-5, s.length());
		        if(t.equals("dream") || t.equals("erase")){
		            s = s.substring(0, s.length()-5);
		            continue;
		        }
		    }
		    if(s.length()-6 >= 0){
		        String t = s.substring(s.length()-6, s.length());
		        if(t.equals("eraser")){
		            s = s.substring(0, s.length()-6);
		            continue;
		        }
		    }
		    if(s.length()-7 >= 0){
		        String t = s.substring(s.length()-7, s.length());
		        if(t.equals("dreamer")){
		            s = s.substring(0, s.length()-7);
		            continue;
		        }
		    }
		    flg = false;
		    if(!s.equals("")) result = "NO";
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
