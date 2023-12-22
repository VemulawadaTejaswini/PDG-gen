import java.io.*;
import java.util.*;

class ContestReader {
  private BufferedReader reader;
  private StringTokenizer tokenizer;
  
  ContestReader(InputStream in) {
    reader = new BufferedReader(new InputStreamReader(in));
  }
  
  public String next() {
    while (tokenizer == null || !tokenizer.hasMoreTokens()) {
      try {
        tokenizer = new java.util.StringTokenizer(reader.readLine());
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }
    return tokenizer.nextToken();
  }
  
  public int nextInt() {
    return Integer.parseInt(next());
  }
  
  public long nextLong() {
    return Long.parseLong(next());
  }
  
  public double nextDouble() {
    return Double.parseDouble(next());
  }
}

public class Main {
  private static int solve(int n, int[] x, int[] y) {
    boolean[] possibleRed = new boolean[n + 1];
    int[] balls = new int[n + 1];
    
    possibleRed[1] = true;
    Arrays.fill(balls, 1);
    for (int i = 0; i < x.length; i++) {
      if (possibleRed[x[i]]) {
        possibleRed[y[i]] = true;
      }
      
      balls[x[i]]--;
      balls[y[i]]++;
      if (balls[x[i]] == 0) {
        possibleRed[x[i]] = false;
      }
    }
    
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      if (possibleRed[i]) {
        sum++;
      }
    }
    return sum;
  }
  
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int m = reader.nextInt();
    int[] x = new int[m];
    int[] y = new int[m];
    for (int i = 0; i < m; i++) {
      x[i] = reader.nextInt();
      y[i] = reader.nextInt();
    }
    System.out.println(solve(n, x, y));
  }
  
  public static void main(String[] args) {
    ContestReader reader = new ContestReader(System.in);
    PrintWriter out = new PrintWriter(System.out);
    execute(reader, out);
    out.flush();
  }
}

