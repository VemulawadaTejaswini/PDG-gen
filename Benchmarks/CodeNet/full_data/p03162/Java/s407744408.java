

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
    int N = fs.nextInt();
    long[][] arr = new long[N][3];
    for(int i = 0; i < N; ++i) {
      for(int j = 0; j < 3; ++j) {
        arr[i][j] = fs.nextLong();
      }
    }
    PrintWriter out = new PrintWriter(System.out);
    out.println(solve(arr));
    out.close();
  }
  
  public static long solve(long[][] arr) {
    int N = arr.length;
    long[] a = new long[N];
    long[] b = new long[N];
    long[] c = new long[N];
    a[0] = arr[0][0]; b[0] = arr[0][1]; c[0] = arr[0][2];
    for(int i = 1; i < N; ++i) {
      a[i] = arr[i][0] + Math.max(b[i-1], c[i-1]);
      b[i] = arr[i][1] + Math.max(a[i-1], c[i-1]);
      c[i] = arr[i][2] + Math.max(b[i-1], a[i-1]);
    }
    return Math.max(Math.max(a[N-1], b[N-1]), c[N-1]);
  }
  

}