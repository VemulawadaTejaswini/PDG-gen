import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	// AtCoder Beginner Contest 136
	// https://atcoder.jp/contests/abc136/tasks
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		int[] nums = new int[n];
		if (n == 1) {
			System.out.println("Yes");
			System.exit(0);
		}
		
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		
		int descCnt = 0;
		
		for (int i = 1 ; i < n; i++) {
			if (nums[i-1] > nums[i]) {
				if (nums[i-1] - nums[i] > 1) {
					System.out.println("No");
					System.exit(0);
				}
				descCnt++;
			}
		}
		if (descCnt > 1) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
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
