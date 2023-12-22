import java.io.*; 
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws IOException {
        FastScanner sc = new FastScanner();
        int N = sc.nextInt();
        int[][] games = new int[N+1][N-1];
        for (int i = 1; i <= N; i++) {
        	for (int j = 0; j < N-1; j++) {
        		games[i][j] = sc.nextInt();
        	}
        }
        int[] index = new int[N+1];
        int day = 0;
        int complete = 0;
        while (true) {
        	day++;
            boolean[] updates = new boolean[N+1];
            for (int i = 1; i <= N; i++) {
            	if (updates[i] || index[i]==N-1) {
            		continue;
            	}
            	int m1 = games[i][index[i]];
            	int m2 = games[m1][index[m1]];
            	if (m2 == i) {
            		updates[m1] = true;
            		updates[m2] = true;
            	}
            }
            boolean update = false;
            for (int i = 0; i < N; i++) {
            	if (updates[i+1]) {
            		update = true;
                	index[i] += 1;
                	if (index[i]==N-1)
                		complete++;
            	}
            }
        	if (! update) {
        		System.out.println(-1);
        		return;
        	} else if (complete==N) {
        		System.out.println(day);
        		return;
        	}
        }
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