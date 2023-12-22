import java.io.*;
import java.util.*;

public class Main {
  private static final long MOD = 1_000_000_007L;
  
  private static long add(long a, long b) {
    return (a + b) % MOD;
  }
  
  private static long mul(long a, long b) {
    return (a * b) % MOD;
  }
  
  private static boolean valid(boolean[] hasBar) {
    for (int i = 1; i < hasBar.length; i++) {
      if (hasBar[i-1] && hasBar[i]) {
        return false;
      }
    }
    return true;
  }
  
  private static long combination1(int src, int w) {
    int count = 0;
    for (int i = 0; i < (1 << (w - 1)); i++) {
      boolean[] hasBar = new boolean[w - 1];
      for (int j = 0; j < w-1; j++) {
        hasBar[j] = ((i >> j) & 1) == 1;
      }
      if (!valid(hasBar)) {
        continue;
      }
      if (src - 1 >= 0 && hasBar[src - 1]) {
        continue;
      }
      if (src < w-1 && hasBar[src]) {
        continue;
      }
      count++;
    }
    return count;
  }
  
  private static long combination2(int src, int w) {
    int count = 0;
    for (int i = 0; i < (1 << (w - 1)); i++) {
      boolean[] hasBar = new boolean[w - 1];
      for (int j = 0; j < w-1; j++) {
        hasBar[j] = ((i >> j) & 1) == 1;
      }
      if (!valid(hasBar)) {
        continue;
      }
      if (src - 1 >= 0 && hasBar[src - 1]) {
        continue;
      }
      if (!hasBar[src]) {
        continue;
      }
      if (src + 1 < w-1 && hasBar[src + 1]) {
        continue;
      }
      count++;
    }
    return count;
  }
  
  private static long solve(int h, int w, int k) {
    if (w == 1) {
      return 1;
    }
    
    long[][] table = new long[w][w];
    for (int i = 0; i < w; i++) {
      table[i][i] = combination1(i, w);
    }
    for (int i = 0; i < w-1; i++) {
      table[i][i+1] = combination2(i, w);
      table[i+1][i] = table[i][i+1];
    }
    
    long[][] dptable = new long[h + 1][w];
    dptable[0][0] = 1;
    for (int i = 1; i <= h; i++) {
      for (int j = 0; j < w; j++) {
        for (int d = -1; d <= 1; d++) {
          if (j + d < 0 || w <= j + d) {
            continue;
          }
          dptable[i][j + d] = add(dptable[i][j + d], mul(dptable[i-1][j], table[j][j + d]));
        }
      }
    }
    return dptable[h][k - 1];
  }
  
  private static void execute(ContestReader reader, PrintWriter out) {
    int h = reader.nextInt();
    int w = reader.nextInt();
    int k = reader.nextInt();
    out.println(solve(h, w, k));
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
  
  public int[] nextIntArray(int n) {
    int[] array = new int[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextInt();
    }
    return array;
  }
  
  public long[] nextLongArray(int n) {
    long[] array = new long[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextLong();
    }
    return array;
  }
  
  public double[] nextDoubleArray(int n) {
    double[] array = new double[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextDouble();
    }
    return array;
  }
  
  public int[][] nextIntMatrix(int n, int m) {
    int[][] matrix = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = nextInt();
      }
    }
    return matrix;
  }
  
  public long[][] nextLongMatrix(int n, int m) {
    long[][] matrix = new long[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = nextLong();
      }
    }
    return matrix;
  }
  
  public double[][] nextDoubleMatrix(int n, int m) {
    double[][] matrix = new double[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = nextDouble();
      }
    }
    return matrix;
  }
}

class Algorithm {
  private static void swap(Object[] list, int a, int b) {
    Object tmp = list[a];
    list[a] = list[b];
    list[b] = tmp;
  }
  
  public static <T extends Comparable<? super T>> boolean nextPermutation(T[] ts) {
    int rightMostAscendingOrderIndex = ts.length - 2;
    while (rightMostAscendingOrderIndex >= 0 &&
        ts[rightMostAscendingOrderIndex].compareTo(ts[rightMostAscendingOrderIndex + 1]) >= 0) {
      rightMostAscendingOrderIndex--;
    }
    if (rightMostAscendingOrderIndex < 0) {
      return false;
    }
    
    int rightMostGreatorIndex = ts.length - 1;
    while (ts[rightMostAscendingOrderIndex].compareTo(ts[rightMostGreatorIndex]) >= 0) {
      rightMostGreatorIndex--;
    }
    
    swap(ts, rightMostAscendingOrderIndex, rightMostGreatorIndex);
    for (int i = 0; i < (ts.length - rightMostAscendingOrderIndex - 1) / 2; i++) {
      swap(ts, rightMostAscendingOrderIndex + 1 + i, ts.length - 1 - i);
    }
    return true;
  }
  
  public static void shuffle(int[] array) {
    Random random = new Random();
    int n = array.length;
    for (int i = 0; i < n; i++) {
      int randomIndex = i + random.nextInt(n - i);
      
      int temp = array[i];
      array[i] = array[randomIndex];
      array[randomIndex] = temp;
    }
  }
  
  public static void shuffle(long[] array) {
    Random random = new Random();
    int n = array.length;
    for (int i = 0; i < n; i++) {
      int randomIndex = i + random.nextInt(n - i);
      
      long temp = array[i];
      array[i] = array[randomIndex];
      array[randomIndex] = temp;
    }
  }
  
  public static void sort(int[] array) {
    shuffle(array);
    Arrays.sort(array);
  }
  
  public static void sort(long[] array) {
    shuffle(array);
    Arrays.sort(array);
  }
}

