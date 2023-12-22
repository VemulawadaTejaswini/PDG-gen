import java.io.*; 
import java.math.*;
import java.util.*;
 
public class Main {
	//static final long MOD = 998244353;
	static final long MOD = 1000000007;
	static final int INF = 1000000007;
	static boolean[] visited;
    public static void main(String[] args) throws IOException {
        FastScanner sc = new FastScanner();
        int N = sc.nextInt();
        int M = sc.nextInt();
        int L = sc.nextInt();
        int[][] adj = new int[N][N];
        for (int[] row: adj)
        	Arrays.fill(row,INF);
        for (int i = 0; i < M; i++) {
        	int a = sc.nextInt()-1;
        	int b = sc.nextInt()-1;
        	int w = sc.nextInt();
        	if (w <= L) {
            	adj[a][b] = w;
            	adj[b][a] = w;
        	}
        }
        int Q = sc.nextInt();
        int[][] queries = new int[Q][2];
        for (int i = 0; i < Q; i++) {
        	int s = sc.nextInt()-1;
        	int t = sc.nextInt()-1;
        	queries[i] = new int[]{s,t};
        }
        
        //Floyd Warshall Algorithm
        int[][] dist = new int[N][N];
        for (int i = 0; i < N; i++) {
        	for (int j = 0; j < N; j++) {
        		if (i == j)
        			dist[i][j] = 0;
        		else
        			dist[i][j] = adj[i][j];
        	}
        }
        
        for (int k = 0; k < N; k++) {
        	for (int i = 0; i < N; i++) {
        		for (int j = 0; j < N; j++) {
                    if (dist[i][k] + dist[k][j] < dist[i][j]) 
                        dist[i][j] = dist[i][k] + dist[k][j]; 
        		}
        	}
        }
        
        int[][] travelSteps = new int[N][N];
        for (int[] row: travelSteps)
        	Arrays.fill(row,INF);
        for (int i = 0; i < N; i++) {
        	for (int j = 0; j< N; j++) {
        		if (dist[i][j] == 0)
        			travelSteps[i][j] = 0;
        		else if (dist[i][j] <= L)
        			travelSteps[i][j] = 1;
        	}
        }
        
        //Floyd Wurshall Again!
        for (int k = 0; k < N; k++) {
        	for (int i = 0; i < N; i++) {
        		for (int j = 0; j < N; j++) {
                    if (travelSteps[i][k] + travelSteps[k][j] < travelSteps[i][j]) 
                        travelSteps[i][j] = travelSteps[i][k] + travelSteps[k][j]; 
        		}
        	}
        }
        
        StringBuilder ans = new StringBuilder();
        for (int[] q: queries) {
        	int val = travelSteps[q[0]][q[1]];
        	if (val == INF)
        		ans.append("-1\n");
        	else
        		ans.append((val-1) + "\n");
        }
        System.out.print(ans);
    }
    
    static class FastScanner { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastScanner() { 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next() { 
            while (st == null || !st.hasMoreElements()) { 
                try { 
                    st = new StringTokenizer(br.readLine());
                } catch (IOException  e) { 
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
  
        String nextLine() { 
            String str = ""; 
            try { 
                str = br.readLine(); 
            } catch (IOException e) {
                e.printStackTrace(); 
            } 
            return str; 
        }
    }
}