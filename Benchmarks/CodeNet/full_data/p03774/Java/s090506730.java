import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		long[][] student = new long[n][2];
		for(int i = 0; i < n; i++){
		    student[i][0] = sc.nextInt();
		    student[i][1] = sc.nextInt();
		}
		long[][] check = new long[m][2];
		for(int i = 0; i < m; i++){
		    check[i][0] = sc.nextInt();
		    check[i][1] = sc.nextInt();
		}
		
		// 計算
		int result = 0;
		for(int i = 0; i < n; i++){
		    int num = 0;
		    long dist = Long.MAX_VALUE;
		    for(int j = 0; j < m; j++){
		        long d = abs(student[i][0]-check[j][0]) + abs(student[i][1]-check[j][1]);
		        if(dist > d){
		            dist = d;
		            num = j+1;
		        }
		    }
		    System.out.println(num);
		}
		
		
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

