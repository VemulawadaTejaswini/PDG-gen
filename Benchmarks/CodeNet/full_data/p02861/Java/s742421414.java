import java.io.*;
import java.util.*;

class Solver {
  final int n;
  final int[][] xys;
  
  double[][] distanceMatrix;
  boolean[] visited;
  
  Solver(int n, int[][] xys) {
    this.n = n;
    this.xys = xys;
  }
  
  private double dfs(int prevIndex, int count, double distance) {
    if (count == n) {
      return distance;
    }
    
    double output = 0.0;
    for (int i = 0; i < n; i++) {
      if (visited[i]) {
        continue;
      }
      visited[i] = true;
      output += dfs(i, count + 1, distance + distanceMatrix[prevIndex][i]);
      visited[i] = false;
    }
    return output;
  }
  
  public double solve() {
    distanceMatrix = new double[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        double x1 = xys[i][0];
        double y1 = xys[i][1];
        double x2 = xys[j][0];
        double y2 = xys[j][1];
        distanceMatrix[i][j] = Math.hypot(x1 - x2, y1 - y2);
      }
    }
    
    double sum = 0.0;
    visited = new boolean[n];
    for (int i = 0; i < n; i++) {
      visited[i] = true;
      sum += dfs(i, 1, 0.0);
      visited[i] = false;
    }
    for (int i = 1; i <= n; i++) {
      sum /= i;
    }
    return sum;
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int[][] xys = reader.nextInt(n, 2);
    out.printf("%.10f\n", new Solver(n, xys).solve());
  }
  
  public static void main(String[] args) {
    ContestReader reader = new ContestReader(System.in);
    PrintWriter out = new PrintWriter(System.out);
    execute(reader, out);
    out.flush();
  }
}

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
  
  public String[] next(int n) {
    String[] array = new String[n];
    for (int i = 0; i < n; i++) {
      array[i] = next();
    }
    return array;
  }
  
  public int[] nextInt(int n) {
    int[] array = new int[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextInt();
    }
    return array;
  }
  
  public long[] nextLong(int n) {
    long[] array = new long[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextLong();
    }
    return array;
  }
  
  public double[] nextDouble(int n) {
    double[] array = new double[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextDouble();
    }
    return array;
  }
  
  public char[] nextCharArray() {
    return next().toCharArray();
  }
  
  public int[][] nextInt(int n, int m) {
    int[][] matrix = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = nextInt();
      }
    }
    return matrix;
  }
  
  public long[][] nextLong(int n, int m) {
    long[][] matrix = new long[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = nextLong();
      }
    }
    return matrix;
  }
  
  public double[][] nextDouble(int n, int m) {
    double[][] matrix = new double[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = nextDouble();
      }
    }
    return matrix;
  }
  
  public char[][] nextCharArray(int n) {
    char[][] matrix = new char[n][];
    for (int i = 0; i < n; i++) {
      matrix[i] = next().toCharArray();
    }
    return matrix;
  }
}
