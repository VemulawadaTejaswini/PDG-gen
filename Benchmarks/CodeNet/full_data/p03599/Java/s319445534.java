import java.io.*;
import java.util.*;

public class Main {
  private static final int MAX_V = 3000;
  
  private static boolean[] dp(int x, int y) {
    boolean[] table = new boolean[MAX_V + 1];
    table[0] = true;
    for (int v : new int[]{x, y}) {
      for (int i = 0; i + v <= MAX_V; i++) {
        if (table[i]) {
          table[i + v] = true;
        }
      }
    }
    return table;
  }
  
  private static String solve(int a, int b, int c, int d, int e, int f) {
    boolean[] waterTable = dp(a, b);
    boolean[] sugarTable = dp(c, d);
    
    double maxSugarPercentage = -1.0;
    String answer = "";
    for (int waterUnit = 1; waterUnit <= 30; waterUnit++) {
      if (!waterTable[waterUnit]) {
        continue;
      }
      int waterWeight = 100 * waterUnit;
      for (int sugarWeight = 0; waterWeight + sugarWeight <= f && sugarWeight <= (waterWeight / 100) * e; sugarWeight++) {
        if (!sugarTable[sugarWeight]) {
          continue;
        }
        double sugarPercentage = 100.0 * sugarWeight / (waterWeight + sugarWeight);
        if (maxSugarPercentage < sugarPercentage) {
          maxSugarPercentage = sugarPercentage;
          answer = String.format("%d %d", waterWeight + sugarWeight, sugarWeight);
        }
      }
    }
    return answer;
  }
  
  private static void execute(ContestReader reader, PrintWriter out) {
    int a = reader.nextInt();
    int b = reader.nextInt();
    int c = reader.nextInt();
    int d = reader.nextInt();
    int e = reader.nextInt();
    int f = reader.nextInt();
    out.println(solve(a, b, c, d, e, f));
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
