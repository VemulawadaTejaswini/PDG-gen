import java.io.*;
import java.util.*;

class SegmentTree {
  int n;
  long[] values;
  long[] lazies;
  
  SegmentTree(long[] initialValues) {
    int size = initialValues.length;
    n = 1;
    while (n < size) {
      n *= 2;
    }
    values = new long[2 * n - 1];
    lazies = new long[2 * n - 1];
    for (int i = 0; i < size; i++) {
      values[i + n - 1] = initialValues[i];
    }
  }
  
  void eval(int k, int l, int r) {
    if (lazies[k] != 0) {
      values[k] += lazies[k];
      if (r - l > 1) {
        lazies[2 * k + 1] += lazies[k];
        lazies[2 * k + 2] += lazies[k];
      }
      lazies[k] = 0;
    }
  }
  
  private void add(int a, int b, long x, int k, int l, int r) {
//    System.err.printf("%d %d %d %d %d %d\n", a, b, x, k, l, r);
    eval(k, l, r);
    if (b <= l || r <= a) {
      return;
    }
    if (a <= l && r <= b) {
      lazies[k] += x;
      eval(k, l, r);
    } else {
      add(a, b, x, 2 * k + 1, l, (l + r) / 2);
      add(a, b, x, 2 * k + 2, (l + r) / 2, r);
    }
  }
  
  void add(int a, int b, long x) {
//    System.err.printf("%d %d %d\n", a, b, x);
    add(a, b, x, 0, 0, n);
  }
  
  long get(int index, int k, int l, int r) {
//    System.err.printf("get: %d %d %d %d\n", index, k, l, r);
    eval(k, l, r);
    if (r - l == 1) {
//      System.err.printf("k : %d, values[k]: %d\n", k, values[k]);
      if (lazies[index + n - 1] != 0) {
        values[index + n - 1] += lazies[index + n - 1];
        lazies[index + n - 1] = 0;
      }
      /*
    for (int i = 0; i < values.length; i++) {
      System.err.printf("%d %d %d\n", i, lazies[i], values[i]);
    }
    */
      
      return values[index + n - 1];
    }
    if (index < (l + r) / 2) {
      return get(index, 2 * k + 1, l, (l + r) / 2);
    } else {
      return get(index, 2 * k + 2, (l + r) / 2, r);
    }
  }
  
  long get(int index) {
    return get(index, 0, 0, n);
  }
  
  void dump() {
    for (int i = 0; i < values.length; i++) {
      System.err.printf("%d %d %d\n", i, lazies[i], values[i]);
    }
  }
}

class Enemy implements Comparable<Enemy> {
  final long x, h;
  
  Enemy(long x, long h) {
    this.x = x;
    this.h = h;
  }
  
  public int compareTo(Enemy enemy) {
    return Long.compare(this.x, enemy.x);
  }
}

class Solver {
  final int n;
  long d, a;
  final long[][] xhs;
  
  Solver(int n, int d, int a, long[][] xhs) {
    this.n = n;
    this.d = d;
    this.a = a;
    this.xhs = xhs;
  }
  
  public long solve() {
    List<Enemy> enemies = new ArrayList<>();
    for (long[] xh : xhs) {
      enemies.add(new Enemy(xh[0], xh[1]));
    }
    Collections.sort(enemies);
    
    long[] hs = new long[n];
    for (int i = 0; i < n; i++) {
      hs[i] = enemies.get(i).h;
    }
    
    SegmentTree segmentTree = new SegmentTree(hs);
    int leftMostAliveIndex = 0;
    int rightIndex = 0;
    long count = 0;
    while (leftMostAliveIndex < n) {
//      System.err.printf("leftMostAliveIndex: %d\n", leftMostAliveIndex);
      long leftH = segmentTree.get(leftMostAliveIndex);
//      System.err.printf("leftH: %d\n", leftH);
      long c = leftH / a + (leftH % a > 0 ? 1 : 0);
      count += c;
      while (rightIndex < n && enemies.get(rightIndex).x <= enemies.get(leftMostAliveIndex).x + 2 * d) {
        rightIndex++;
      }
//      System.err.printf("rightIndex: %d\n", rightIndex);
//      System.err.printf("%d %d %d\n", leftMostAliveIndex, rightIndex, -1 * a * c);
//      segmentTree.dump();
      segmentTree.add(leftMostAliveIndex, rightIndex, -1 * a * c);
//      segmentTree.dump();
      leftMostAliveIndex++;
      while (leftMostAliveIndex < n && segmentTree.get(leftMostAliveIndex) <= 0) {
        leftMostAliveIndex++;
      }
    }
    return count;
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int d = reader.nextInt();
    int a = reader.nextInt();
    long[][] xhs = reader.nextLong(n, 2);
    out.println(new Solver(n, d, a, xhs).solve());
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
