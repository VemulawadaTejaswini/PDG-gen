import java.io.*;
import java.util.*;

class Solver {
  final char[] cs;
  final int d;
  long[][][] table;
  
  
  Solver(char[] cs, int d) {
    this.cs = cs;
    this.d = d;
  }
  
  private long solve(boolean exceedableK, int modD, int index) {
    if (index >= cs.length) {
      return modD == 0 ? 1 : 0;
    }
    int exceedableKIndex = exceedableK ? 1 : 0;
    if (table[exceedableKIndex][modD][index] >= 0) {
      return table[exceedableKIndex][modD][index];
    }
    table[exceedableKIndex][modD][index] = 0;
    int digitLimit = exceedableK ? cs[index] - '0' : 9;
    for (int digit = 0; digit <= digitLimit; digit++) {
      table[exceedableKIndex][modD][index] += solve(exceedableK && digit == digitLimit, (modD + digit) % d, index + 1);
    }
    table[exceedableKIndex][modD][index] %= 1_000_000_007L;
    return table[exceedableKIndex][modD][index];
  }
  
  public long solve() {
    table = new long[2][d][cs.length];
    for (long[][] t1 : table) {
      for (long[] t2 : t1) {
        Arrays.fill(t2, -1);
      }
    }
    return solve(true, 0, 0) - 1;
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    char[] cs = reader.nextCharArray();
    int d = reader.nextInt();
    out.println(new Solver(cs, d).solve());
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
  
  public char nextChar() {
    return next().charAt(0);
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
  
  public char[] nextChar(int n) {
    char[] array = new char[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextChar();
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
  
  public char[][] nextChar(int n, int m) {
    char[][] matrix = new char[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = nextChar();
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
