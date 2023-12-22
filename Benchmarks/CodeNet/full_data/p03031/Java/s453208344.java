import java.io.*;
import java.util.*;

class Solver {
  int n;
  int m;
  boolean[][] matrix;
  int[] ps;
  
  private boolean fire(int index, int assign) {
    int count = 0;
    for (int i = 0; i <= 10; i++) {
      if (((assign >> i) & 0x1) == 0x1 && matrix[index][i]) {
        count++;
      }
    }
    return count % 2 == ps[index];
  }
  
  private boolean fireAll(int assign) {
    for (int i = 0; i < m; i++) {
      if (!fire(i, assign)) {
        return false;
      }
    }
    return true;
  }
  
  public int solve(int n, int m, boolean[][] matrix, int[] ps) {
    this.n = n;
    this.m = m;
    this.matrix = matrix;
    this.ps = ps;
    
    int count = 0;
    for (int i = 0; i < (1 << n); i++) {
      if (fireAll(i)) {
        count++;
      }
    }
    return count;
  }
}

public class Main {
  
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int m = reader.nextInt();
    boolean[][] matrix = new boolean[m][n];
    for (int i = 0; i < m; i++) {
      int k = reader.nextInt();
      for (int j = 0; j < k; j++) {
        int s = reader.nextInt();
        matrix[i][s - 1] = true;
      }
    }
    int[] ps = new int[m];
    for (int i = 0; i < m; i++) {
      ps[i] = reader.nextInt();
    }
    
    out.println(new Solver().solve(n, m, matrix, ps));
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
}

