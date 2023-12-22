
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main
{
  static class FastScanner
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer("");
    
    String next() {
      while(!st.hasMoreTokens()) {
        try {
          st = new StringTokenizer(br.readLine());
        } catch (IOException e) {}
      }
      return st.nextToken();
    }
    
    int nextInt() {
      return Integer.parseInt(next());
    }
    
    long nextLong() {
      return Long.parseLong(next());
    }
    
  }
  
  public static void main(String[] args) {
    FastScanner fs = new FastScanner();
    int n = fs.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; ++i) {
      arr[i] = fs.nextInt();
    }
    int[] dp = new int[n];
    dp[1] = (int)Math.abs(arr[1]-arr[0]);
    for(int i = 2; i < n; ++i) {
      dp[i] = Math.min(dp[i-1] + (int)Math.abs(arr[i-1]-arr[i]), 
          dp[i-2] + (int)Math.abs(arr[i-2]-arr[i]));
    }
    PrintWriter out = new PrintWriter(System.out);
    out.println(dp[n-1]);
    out.close();
  }

}
