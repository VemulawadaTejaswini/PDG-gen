import java.io.*;
import java.util.*;

class Solver {
  final int n, m;
  final char[] cs;
  final int[][] abs;
  
  List<List<Integer>> graph;
  boolean[] valid;
  
  Solver(int n, int m, char[] cs, int[][] abs) {
    this.n = n;
    this.m = m;
    this.cs = cs;
    this.abs = abs;
  }
  
  private boolean isValid(int index) {
    boolean hasA = false;
    boolean hasB = false;
    for (int next : graph.get(index)) {
      if (valid[next]) {
        if (cs[next] == 'A') {
          hasA = true;
        } else {
          hasB = true;
        }
        if (hasA && hasB) {
          return true;
        }
      }
    }
    return false;
  }
  
  private void flipInvalid(int index) {
    valid[index] = false;
    for (int next : graph.get(index)) {
      if (valid[next] && !isValid(next)) {
        flipInvalid(next);
      }
    }
  }
  
  public boolean solve() {
    graph = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      graph.add(new ArrayList<>());
    }
    for (int[] ab : abs) {
      int a = ab[0] - 1;
      int b = ab[1] - 1;
      graph.get(a).add(b);
      graph.get(b).add(a);
    }
    
    valid = new boolean[n];
    Arrays.fill(valid, true);
    
    for (int i = 0; i < n; i++) {
      if (!valid[i]) {
        continue;
      }
      if (!isValid(i)) {
        flipInvalid(i);
      }
    }
    
    for (boolean v : valid) {
      if (v) {
        return true;
      }
    }
    
    return false;
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int m = reader.nextInt();
    char[] cs = reader.nextCharArray();
    int[][] abs = reader.nextInt(m, 2);
    out.println(new Solver(n, m, cs, abs).solve() ? "Yes" : "No");
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
