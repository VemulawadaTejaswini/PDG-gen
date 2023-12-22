import java.io.*;
import java.util.*;

class Solver {
  final int n;
  final char[] cs;
  
  Solver(int n, char[] cs) {
    this.n = n;
    this.cs = cs;
  }
  
  private Map<String, Long> createMap(char[] halfCs) {
    Map<String, Long> map = new HashMap<>();
    for (int i = 0; i < (1 << n); i++) {
      StringBuffer sb1 = new StringBuffer();
      StringBuffer sb2 = new StringBuffer();
      for (int j = 0; j < n; j++) {
        if (((i >> j) & 1) == 1) {
          sb1.append(halfCs[j]);
        } else {
          sb2.append(halfCs[j]);
        }
      }
      String s = sb1.toString() + "/" + sb2.toString();
      map.put(s, map.getOrDefault(s, 0L) + 1);
    }
    return map;
  }
  
  public long solve() {
    Map<String, Long> leftCounter = createMap(cs);
    char[] reverse = new char[n];
    for (int i = 0; i < n; i++) {
      reverse[i] = cs[2 * n - 1 - i];
    }
    Map<String, Long> rightCounter = createMap(reverse);
    
    long answer = 0;
    for (Map.Entry<String, Long> leftEntry : leftCounter.entrySet()) {
//      System.err.printf("%s %d\n", leftEntry.getKey(), leftEntry.getValue());
      answer += leftEntry.getValue() * rightCounter.getOrDefault(leftEntry.getKey(), 0L);
    }
    return answer;
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    char[] cs = reader.nextCharArray();
    out.println(new Solver(n, cs).solve());
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
