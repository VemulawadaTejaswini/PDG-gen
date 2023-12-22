import java.io.*;
import java.util.*;

class Solver {
  final int n, k, r, s, p;
  final char[] ts;
  
  Solver(int n, int k, int r, int s, int p, char[] ts) {
    this.n = n;
    this.k = k;
    this.r = r;
    this.p = p;
    this.s = s;
    this.ts = ts;
  }
  
  private final char[] HANDS = new char[]{'r', 's', 'p'};
  
  public int solve() {
    int[] WIN_SCORES = new int[]{p, r, s};
    
    int score = 0;
    for (int kMod = 0; kMod < k; kMod++) {
      int[][] dptable = new int[n / k + 2][3];
      dptable[0][0] = 0;
      dptable[0][1] = 0;
      dptable[0][2] = 0;
      int scoreMax = 0;
      for (int i = 0; k * i + kMod < n; i++) {
        for (int j = 0; j < 3; j++) {
          int winScore = 0;
          if (ts[k * i + kMod] == HANDS[j]) {
            winScore = WIN_SCORES[j];
          }
          
          dptable[i + 1][j] = Math.max(dptable[i][(j + 1) % 3], dptable[i][(j + 2) % 3]) + winScore;
        }
        scoreMax = Math.max(dptable[i+1][0], Math.max(dptable[i+1][1], dptable[i+1][2]));
//        System.err.printf("%d %d %d %d %d %d %d\n", kMod, i, k * i + kMod, dptable[i+1][0], dptable[i+1][1], dptable[i+1][2], scoreMax);
      }
      score += scoreMax;
    }
    return score;
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int k = reader.nextInt();
    int r = reader.nextInt();
    int s = reader.nextInt();
    int p = reader.nextInt();
    char[] ts = reader.nextCharArray();
    out.println(new Solver(n, k, r, s, p, ts).solve());
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
