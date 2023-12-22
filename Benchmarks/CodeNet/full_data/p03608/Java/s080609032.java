import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static long [][] adj;
	public static int res= Integer.MAX_VALUE;
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		PrintWriter out= new PrintWriter(System.out);
		int n= in.nextInt();
		int m= in.nextInt();
		int rr= in.nextInt();
		int [] r= new int[rr];
		for (int i = 0; i < r.length; i++) {
			r[i]= in.nextInt()-1;
		}
		adj = new long[n][n];
		for (int i = 0; i < adj.length; i++) {
			Arrays.fill(adj[i], 1000000000);
			adj[i][i]=0;
		}
		for (int i = 0; i < m; i++) {
			int a= in.nextInt()-1;
			int b= in.nextInt()-1;
			int c= in.nextInt();
			adj[a][b]= c;
			adj[b][a]= c;
		}
		adj= fl(adj);
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n; j++) {
//				System.out.print(adj[i][j]+" ");
//			}
//			System.out.println();
//		}
		int [] perm= new int[rr];
		boolean [] used= new boolean[rr];
		RecPerm(perm, r, used, 0);
		System.out.println(res);
	}
	public static void RecPerm(int[] perm, int [] key, boolean[] used, int k) {
        if (k == perm.length) {
            go(perm);
        }
        else {
            for (int i=0; i<key.length; i++) {
                if (!used[i]) {
                    perm[k] = key[i];
                    used[i] = true;
                    RecPerm(perm, key, used, k+1);
                    used[i] = false;
                }
            }
        }
    }
	public static long [][] fl(long [][] adj) {
		int n = adj.length;
		for(int k=0; k<n; k++)
	        for(int i=0; i<n; i++)
	          for(int j=0; j<n; j++)
	            adj[i][j] = Math.min(adj[i][j], adj[i][k]+adj[k][j]);
		return adj;
	}
	public static void go(int [] d) {
		int cur=0;
		for (int i = 0; i < d.length-1; i++) {
			//System.out.print(adj[i][i+1]+" ");
			cur+= adj[d[i]][d[i+1]];
		}
		//System.out.println(cur);
		res= Math.min(cur, res);
	}
	
	static class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		public FastScanner(InputStream in) {
			br = new BufferedReader(new InputStreamReader(in));
			st = new StringTokenizer("");
		}

		public String next() throws IOException {
			if (!st.hasMoreTokens()) {
				st = new StringTokenizer(br.readLine());
				return next();
			}
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
		public double nextDouble() throws NumberFormatException, IOException {
			return Double.parseDouble(next());
		}
		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}
	}
}
