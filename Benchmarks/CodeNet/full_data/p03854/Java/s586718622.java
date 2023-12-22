
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	// AtCoder Beginner Contest 087
	// https://atcoder.jp/contests/abc087/tasks
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		String[] strs = {"dream", "dreamer", "erase", "eraser"};
		String s = sc.next();
		boolean isGo = true;
		
		while (isGo) {
			boolean isFound = false;
			for (String str: strs) {
				if (!isFound) {
					int index = s.lastIndexOf(str);
					if (index != -1 && index == s.length() - str.length()) {
						isFound = true;
						if (index == 0) {
							s = "";
						} else {
							s = s.substring(index);
						}
					}
				}
			}

			if (!isFound || s.length() == 0) {
				isGo = false;
			}
		}
		
		if (s.length() == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
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
