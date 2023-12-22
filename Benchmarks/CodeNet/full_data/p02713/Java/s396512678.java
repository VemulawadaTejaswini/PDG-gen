import java.math.*;
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		FastScanner sc = new FastScanner(System.in);
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		int t = 1;
		while (t-->0) {
		    int k = sc.nextInt();
		    int[][] gcd = new int[k+1][k+1];
		    for (int i=1;i<=k ;i++ ){
		        for(int j=i;j<=k;j++){
		            gcd[i][j] = gcd[j][i] = gcd(i,j);
		        }
		    }
		    long sum = 0;
		    for(int i=1;i<=k;i++){
		        for(int j=1;j<=k;j++){
		            for(int j1=1;j1<=k;j1++){
		                sum+=gcd(j1,gcd[i][j]);
		            }
		        }
		    }
		    out.println(sum);
		}
		out.close();
	}
	static int gcd(int a, int b){
	    if(b==0) return a;
	    return gcd(b,a%b);
	}
	static class Pair implements Comparable<Pair>{
		int a, b;
		public Pair(int c, int d){
			a = c;
			b = d;
		}
		public int compareTo(Pair p){
		    return a-p.a;
		}
	}
	static class FastScanner {
		BufferedReader br;
		StringTokenizer st;
		FastScanner(File f) {
			try {
				br = new BufferedReader(new FileReader(f));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		FastScanner(InputStream f) {
			br = new BufferedReader(new InputStreamReader(f));
		}
		String nextLine() {
			try {
				return br.readLine();
			} catch (IOException e) {
				return null;
			}
		}
		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
		double nextDouble() {
			return Double.parseDouble(next());
		}
	}
}