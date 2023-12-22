import java.io.*;
import java.util.*;

class Solver {
  private static final long INF = 1_000_000_000_000_000_000L;
  
  final int n;
  final long k;
  final int[] as;
  
  int[] ys;
  long[][] gm;
  
  Solver(int n, long k, int[] as) {
    this.n = n;
    this.k = k;
    this.as = as;
  }
  
  private long calculate(long apply) {
    long sum = 0;
    int a = 0;
    for (int i = 62; i >= 0; i--) {
      if (((apply >> i) & 1) == 1) {
        sum += gm[i][a];
        a += (int)(gm[i][a] % n);
        a %= n;
        if (sum >= INF) {
          return INF;
        }
      }
    }
    return sum;
  }
  
  private boolean exceed(long apply) {
    return calculate(apply) >= (long)n * k;
  }
  
  public Deque<Integer> solve() {
//    System.err.println("solve: 1");
    Map<Integer, TreeSet<Integer>> xMapSet = new HashMap<>();
    for (int i = 0; i < n; i++) {
      if (xMapSet.get(as[i]) == null) {
        xMapSet.put(as[i], new TreeSet<>());
      }
      xMapSet.get(as[i]).add(i);
    }
    
//    System.err.println("solve: 2");
    ys = new int[n];
    for (int i = 0; i < n; i++) {
      Integer j = xMapSet.get(as[i]).higher(i);
      if (j != null) {
        ys[i] = j + 1 - i;
      } else {
        j = xMapSet.get(as[i]).first();
        ys[i] = n + j + 1 - i;
      }
    }
    
//    System.err.println("solve: 3");
    gm = new long[64][n];
    for (int j = 0; j < n; j++) {
      gm[0][j] = ys[j];
    }
    
//    System.err.println("solve: 4");
    for (int i = 1; i < 64; i++) {
      for (int j = 0; j < n; j++) {
        gm[i][j] = gm[i - 1][j] + gm[i - 1][(int)((j + gm[i - 1][j]) % n)];
        if (gm[i][j] > INF) {
          gm[i][j] = INF;
        }
      }
    }
    
//    System.err.println("solve: 5");
    long maxApply = (long)n * k;
    long minApply = 0;
    while (maxApply - minApply > 1) {
      long midApply = (maxApply + minApply) / 2;
//      System.err.printf("%d %d %d\n", minApply, maxApply, midApply);
      if (exceed(midApply)) {
        maxApply = midApply;
      } else {
        minApply = midApply;
      }
    }
    
//    System.err.println("solve: 6");
    long a = calculate(minApply);
    Deque<Integer> deque = new ArrayDeque<>();
    Set<Integer> inDeque = new HashSet<>();
    for (int i = (int)(a % n); i < n; i++) {
      if (inDeque.contains(as[i])) {
        while (true) {
          int polled = deque.pollLast();
          inDeque.remove(polled);
          if (polled == as[i]) {
            break;
          }
        }
      } else {
        deque.addLast(as[i]);
        inDeque.add(as[i]);
      }
    }
    return deque;
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    long k = reader.nextLong();
    int[] as = reader.nextInt(n);
    Deque<Integer> deque = new Solver(n, k, as).solve();
    while (!deque.isEmpty()) {
      out.println(deque.pollFirst());
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
