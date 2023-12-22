import java.io.*;
import java.util.*;

class Solver {
  final char[] ss, ts;
  
  Solver(char[] ss, char[] ts) {
    this.ss = ss;
    this.ts = ts;
  }
  
  private boolean match(int i) {
    for (int j = 0; j < ts.length; j++) {
      if (ss[i + j] != '?' && ss[i + j] != ts[j]) {
        return false;
      }
    }
    return true;
  }
  
  private String createAnswer(int i) {
    StringBuffer sb = new StringBuffer();
    for (int j = 0; j < ss.length; j++) {
      if (i <= j && j < i + ts.length) {
        sb.append(ts[j - i]);
      } else if (ss[j] == '?') {
        sb.append('a');
      } else {
        sb.append(ss[j]);
      }
    }
    return sb.toString();
  }
  
  public String solve() {
    for (int i = ss.length - ts.length; i >= 0; i--) {
      if (match(i)) {
        return createAnswer(i);
      }
    }
    return "UNRESTORABLE";
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    char[] ss = reader.nextCharArray();
    char[] ts = reader.nextCharArray();
    out.println(new Solver(ss, ts).solve());
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
