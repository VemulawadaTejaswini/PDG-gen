import java.io.*;
import java.util.*;

class Solver {
  private static final int[] DI = new int[]{1, 0, -1, 0};
  private static final int[] DJ = new int[]{0, 1, 0, -1};
  private static final int[] ZERO = new int[]{0, 0};
  private static final char[] CHARS = new char[]{'#', '.'};
  
  final int h, w;
  final char[][] cm;
  boolean[][] visited;
  
  Solver(int h, int w, char[][] cm) {
    this.h = h;
    this.w = w;
    this.cm = cm;
  }
  
  private int[] dfs(int i, int j, int index) {
    if (visited[i][j] || cm[i][j] != CHARS[index]) {
      return ZERO;
    }
    visited[i][j] = true;
    
    int[] counts = new int[2];
    counts[index]++;
    for (int k = 0; k < 4; k++) {
      int nextI = i + DI[k];
      int nextJ = j + DJ[k];
      if (nextI < 0 || h <= nextI || nextJ < 0 || w <= nextJ) {
        continue;
      }
      int[] nextCounts = dfs(nextI, nextJ, 1 - index);
      counts[0] += nextCounts[0];
      counts[1] += nextCounts[1];
    }
    return counts;
  }
  
  public long solve() {
    visited = new boolean[h][w];
    
    long answer = 0;
    for (int i = 0; i < h; i++) {
      for (int j = 0; j < w; j++) {
        if (cm[i][j] == '#' && !visited[i][j]) {
          int[] counts = dfs(i, j, 0);
          answer += (long)counts[0] * (long)counts[1];
        }
      }
    }
    return answer;
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int h = reader.nextInt();
    int w = reader.nextInt();
    char[][] cm = reader.nextCharArray(h);
    out.println(new Solver(h, w, cm).solve());
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
