import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		long[] v = new long[n];
		for(int i = 0; i < n; i++){
		    v[i] = sc.nextLong();
		}
		Arrays.sort(v);
		
		// 計算
		long result = 0;
		long sum = 0;
		double ave = 0;
		int min = 0;
		int max = 0;
		int all = 0;
		for(int i = 0; i < n; i++){
		    if(i+1 <= a){
		        sum += v[n-1-i];
		        ave = (double)sum/(i+1);
		        if(i > 0 && v[n-i] == v[n-1-i]){
		            min++;
		            max++;
		            all++;
		        }else{
		            min = 1;
		            max = 1;
		            all = 1;
		        }
		    }else if(i+1 <= b && ave < v[n-1-i]){
		        sum += v[n-1-i];
		        ave = (double)sum/(i+1);
		        if(i > 0 && v[n-i] == v[n-1-i]){
		            min++;
		            max++;
		            all++;
		        }else{
		            min = 1;
		            max = 1;
		            all = 1;
		        }
		    }else if(i+1 <= b && ave == v[n-1-i]){
		        if(i > 0 && v[n-i] == v[n-1-i]){
		            max++;
		            all++;
		        }else{
		            break;
		        }
		    }else if(v[n-i] == v[n-1-i]){
		        all++;
		    }
		}
		
		for(int i = min; i <= max; i++){
		    result += combination(all, i);
		}
		
		// 出力
		System.out.println(ave);
		System.out.println(result);
	}
	
	public static long combination(long n, long k) {
	    if (n < k || n < 0 || k < 0) return 0;
	    long res = 1;
	    if(k > n-k) k = n-k;
	    for(int i = 1; i <= k; i++){
	        res *= n-k+i;
	        res /= i;
	    }
		return res;
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

