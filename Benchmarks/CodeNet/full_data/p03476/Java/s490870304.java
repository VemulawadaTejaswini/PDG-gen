import java.io.*;
import java.util.*;

public class Main {
  private static List<Integer> solve(int q, int[][] lrs) {
    int vMax = 100_000;
    
    boolean[] isPrime = new boolean[vMax + 1];
    Arrays.fill(isPrime, true);
    isPrime[0] = false;
    isPrime[1] = false;
    for (int prime = 2; prime <= vMax; prime++) {
      if (!isPrime[prime]) {
        continue;
      }
      for (int k = 2; prime * k <= vMax; k++) {
        isPrime[prime * k] = false;
      }
    }
    
    boolean[] isLike2017 = new boolean[vMax + 1];
    for (int i = 0; i <= vMax; i++) {
      isLike2017[i] = isPrime[i] && isPrime[(i + 1) / 2];
    }
    
    int[] countLike2017 = new int[vMax + 1];
    countLike2017[0] = 0;
    for (int i = 1; i <= vMax; i++) {
      countLike2017[i] = countLike2017[i - 1] + (isLike2017[i] ? 1 : 0);
    }
    
    List<Integer> answers = new ArrayList<>();
    for (int[] lr : lrs) {
      int l = lr[0];
      int r = lr[1];
      answers.add(countLike2017[r] - countLike2017[l - 1]);
    }
    return answers;
  }
  
  private static void execute(ContestReader reader, PrintWriter out) {
    int q = reader.nextInt();
    int[][] lrs = reader.nextInt(q, 2);
    for (int answer : solve(q, lrs)) {
      out.println(answer);
    }
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
