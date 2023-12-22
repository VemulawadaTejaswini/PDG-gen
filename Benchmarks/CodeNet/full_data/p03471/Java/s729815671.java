
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	// AtCoder Beginner Contest 079
	// https://atcoder.jp/contests/abc079/tasks
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		int yen = sc.nextInt();
		
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n - i; j++) {
				for (int k = 0; k <= n - i - j; k++) {
					if ((10000 * i + 5000 * j + 1000 * k) == yen && (i + j + k) == n) {
						System.out.println("" + i + " " + j + " " + k);
						System.exit(0);
					}
				}
			}
		}
		
		System.out.println("-1 -1 -1");
	}
	static class FastReader { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() { 
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
            try{ 
                str = br.readLine(); 
            } catch (IOException e) { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
}
