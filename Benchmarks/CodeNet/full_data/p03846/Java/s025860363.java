import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
		    a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		
		// 計算
		long result = 1;
		int MOD = 1000000007;
		if(n%2 == 0){
		    int num = 1;
		    for(int i = 0; i < n/2; i++){
		        if(a[2*i] != num || a[2*i+1] != num){
		            result = 0;
		            break;
		        }else{
		            result = result*2%MOD;
		            num += 2;
		        }
		    }
		}else{
		    int num = 0;
		    if(a[0] != num){
		        result = 0;
		        System.out.println(result);
		        return;
		    }
		    num += 2;
		    for(int i = 0; i < n/2; i++){
		        if(a[2*i+1] != num || a[2*i+2] != num){
		            result = 0;
		            break;
		        }else{
		            result = result*2%MOD;
		            num += 2;
		        }
		    }
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
