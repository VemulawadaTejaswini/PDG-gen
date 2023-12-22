
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
  
	public static void main(String[] args) {
	  FastReader sc = new FastReader();
	  int n = sc.nextInt();
	  int[] dp = new int[5]; // For counting 'm', 'a', 'r', 'c', 'h'.
	  
	  // Choose three from five, there is total ten patterns.
	  int[] p = {0, 0, 0, 0, 0, 0, 1, 1, 1, 2};
	  int[] q = {1, 1, 1, 2, 2, 3, 2, 2, 3, 3};
	  int[] r = {2, 3, 4, 3, 4, 4, 3, 4, 4, 4};
	  
	  int res = 0;
	  
	  for (int i = 0; i < n; i++) {
		  String s = sc.next();
		  
		  if (s.charAt(0) == 'M') {
			  dp[0]++;
		  } else if (s.charAt(0) == 'A') {
			  dp[1]++;
		  } else if (s.charAt(0) == 'R') {
			  dp[2]++;
		  } else if (s.charAt(0) == 'C') {
			  dp[3]++;
		  } else if (s.charAt(0) == 'H') {
			  dp[4]++;
		  }
	  }
	  
	  for (int i = 0; i < 10; i++) {
		  res += (dp[p[i]] * dp[q[i]] * dp[r[i]]);
	  }
	  
	  System.out.println(res);
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
