import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

	public static class FastReader {
		BufferedReader br;
		StringTokenizer root;
		
 
		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
 
		String next() {
			while (root == null || !root.hasMoreTokens()) {
				try {
					root = new StringTokenizer(br.readLine());
				} catch (Exception addd) {
					addd.printStackTrace();
				}
			}
			return root.nextToken();
		}
 
		int nextInt() {
			return Integer.parseInt(next());
		}
 
		double nextDouble() {
			return Double.parseDouble(next());
		}
 
		long nextLong() {
			return Long.parseLong(next());
		}
 
		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (Exception addd) {
				addd.printStackTrace();
			}
			return str;
		}
	}
	
	public static PrintWriter out = new PrintWriter (new BufferedOutputStream(System.out));
	
	public static FastReader sc = new FastReader();
 
	static int mod = (int) (1e9+7),MAX=(int) (2e5+100);
    static List<Integer>[] edges;
    static Long[][] dp;
    
	public static void main(String[] args) {
	
		    int n = sc.nextInt();
	        long k = sc.nextLong();
	        long[][] graph = new long[n][n];
	        
	        for(int i = 0; i<n; i++)
	            for(int j = 0; j<n; j++)
	                graph[i][j] = sc.nextLong();
            
	        long[][] res = mpow(graph,k);
	        
	        long ans = 0;
	        for(int i = 0; i<n; i++) {
	            for(int j = 0; j<n; j++)
	                ans = (ans+res[i][j])%mod;
	        }
	        out.println(ans);
	    
		out.close();
   }
	
	private static long[][] mpow(long[][] A, long k) {
	    int n = A.length;
	    long[][] res = new long[n][n];
        
        for(int i = 0; i<n; i++) res[i][i] = 1;
        
        while(k>0) {
            if((k&1)==1) res = multiply(res, A);
            A = multiply(A, A);
            k>>=1;
        }
	return res;
}
static long[][] multiply(long[][] a, long[][] b) {
    int n = a.length;
    long[][] res = new long[n][n];
    for(int i = 0; i<n; i++) {
        for(int j = 0; j<n; j++) {
            for(int k = 0; k<n; k++) {
                res[i][k] = (res[i][k] + (a[i][j]%mod * 1l * b[j][k]%mod)%mod)%mod;
            }
        }
    }
    return res;
}

    }

