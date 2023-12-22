import java.io.*;
import java.util.*;

class Solver {
  final int n;
  final int[][] pm;
  
  boolean[] used;
  int[] array;
  
  int index;
  int[] pIndexes;
  
  Solver(int n, int[][] pm) {
    this.n = n;
    this.pm = pm;
  }
  
  private boolean same(int[] ps) {
    for (int i = 0; i < n; i++) {
      if (ps[i] != array[i]) {
        return false;
      }
    }
    return true;
  }
  
  private void dfs(int i) {
    if (i == n) {
      index++;
      for (int j = 0; j < 2; j++) {
        if (same(pm[j])) {
          pIndexes[j] = index;
        }
      }
      return;
    }
    
    for (int k = 1; k <= n; k++) {
      if (used[k]) {
        continue;
      }
      used[k] = true;
      array[i] = k;
      dfs(i + 1);
      used[k] = false;
    }
  }
  
  public int solve() {
    used = new boolean[n + 1];
    array = new int[n];
    pIndexes = new int[2];
    index = 0;
    dfs(0);
    return Math.abs(pIndexes[0] - pIndexes[1]);
  }
}

public class Main {
  
  
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int[][] pm = reader.nextInt(2, n);
    out.println(new Solver(n, pm).solve());
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
