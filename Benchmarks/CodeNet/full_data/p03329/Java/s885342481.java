
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		int[] dp = new int[n+1];
		
		for (int i = 1; i <= n; i++) {
			// 先換1元
			dp[i] = dp[i-1] + 1;
			
			// 再換6^n元
			int power6 = 6;
			while (i >= power6) {
				dp[i] = Math.min(dp[i], 1 + dp[i - power6]);
				power6 *= 6;
			}
			
			// 再換9^n元
			int power9 = 9;
			while (i >= power9) {
				dp[i] = Math.min(dp[i], 1 + dp[i - power9]);
				power9 *= 9;
			}
		}
		
		System.out.println(dp[n]);
		
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
