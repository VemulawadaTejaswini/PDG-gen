import java.io.*;
import java.util.*;

class Solver {
  final int h, w;
  final int[][] am, bm;
  
  Solver(int h, int w, int[][] am, int[][] bm) {
    this.h = h;
    this.w = w;
    this.am = am;
    this.bm = bm;
  }
  
  public int solve() {
    List<List<Set<Integer>>> setMatrix = new ArrayList<>();
    for (int i = 0; i <= h; i++) {
      setMatrix.add(new ArrayList<>());
      for (int j = 0; j <= w; j++) {
        setMatrix.get(i).add(new HashSet<>());
      }
    }
    
    for (int i = 0; i <= h; i++) {
      setMatrix.get(i).get(0).add(0);
    }
    for (int j = 0; j <= w; j++) {
      setMatrix.get(0).get(j).add(0);
    }
    
    for (int i = 1; i <= h; i++) {
      for (int j = 1; j <= w; j++) {
        int diff = am[i - 1][j - 1] - bm[i - 1][j - 1];
        for (int v : setMatrix.get(i - 1).get(j)) {
          setMatrix.get(i).get(j).add(v + diff);
          setMatrix.get(i).get(j).add(v - diff);
        }
        for (int v : setMatrix.get(i).get(j - 1)) {
          setMatrix.get(i).get(j).add(v + diff);
          setMatrix.get(i).get(j).add(v - diff);
        }
      }
    }
    
    int minValue = Integer.MAX_VALUE;
    for (int v : setMatrix.get(h).get(w)) {
      minValue = Math.min(minValue, Math.abs(v));
    }
    return minValue;
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int h = reader.nextInt();
    int w = reader.nextInt();
    int[][] am = reader.nextInt(h, w);
    int[][] bm = reader.nextInt(h, w);
    out.println(new Solver(h, w, am, bm).solve());
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
