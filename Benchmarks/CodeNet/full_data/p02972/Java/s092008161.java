import java.io.*; 
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws IOException {
        FastScanner sc = new FastScanner();
        int N = sc.nextInt();
        int[] A = new int[N+1];
        for (int i = 1; i <= N; i++) {
        	A[i] = sc.nextInt();
        }
        int[] sum = new int[449];
        int[] B = new int[200001];
        for (int i = N; i >= 1; i--) {
        	if (i > 448) {
        		int tot = 0;
        		for (int j = i; j <= N; j += i) {
        			tot += B[j];
        		}
        		tot = tot % 2;
        		if (tot != A[i]) {
        			B[i] = 1;
        			for (int j = 1; j <= 448; j++) {
        				if (i % j == 0) {
        					sum[j] += 1;
        					sum[j] %= 2;
        				}
        			}
        		}
        	} else {
        		if (sum[i] != A[i]) {
        			B[i] = 1;
        			for (int j = 1; j < i; j++) {
        				if (i % j == 0) {
        					sum[j] += 1;
        					sum[j] %= 2;
        				}
        			}
        		}
        	}
        }
        
        int num = 0;
        for (int i = 1; i <= N; i++) {
        	if (B[i] == 1)
        		num++;
        }
        System.out.println(num);
        for (int i = 1; i <= N; i++) {
        	if (B[i] == 1) {
        		System.out.println(i);
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