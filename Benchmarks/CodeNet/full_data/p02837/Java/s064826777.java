import java.io.*;
import java.util.*;

class Solver {
  final int n;
  final int[] as;
  final int[][][] xym;
  
  Solver(int n, int[] as, int[][][] xym) {
    this.n = n;
    this.as = as;
    this.xym = xym;
  }
  
  private boolean verify(boolean[] honests) {
    for (int i = 0; i < n; i++) {
      if (!honests[i]) {
        continue;
      }
      for (int[] xy : xym[i]) {
        int x = xy[0] - 1;
        int y = xy[1];
        if (honests[x] != (y == 1)) {
          return false;
        }
      }
    }
    return true;
  }
  
  public int solve() {
    int answer = 0;
    for (int i = 0; i < (1 << n); i++) {
      boolean[] honests = new boolean[n];
      int count = 0;
      for (int j = 0; j < n; j++) {
        honests[j] = ((i >> j) & 1) == 1;
        count += honests[j] ? 1 : 0;
      }
      
      if (count > answer && verify(honests)) {
        answer = count;
      }
    }
    return answer;
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int[] as = new int[n];
    int[][][] xym = new int[n][][];
    for (int i = 0; i < n; i++) {
      as[i] = reader.nextInt();
      xym[i] = reader.nextInt(as[i], 2);
    }
    out.println(new Solver(n, as, xym).solve());
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
