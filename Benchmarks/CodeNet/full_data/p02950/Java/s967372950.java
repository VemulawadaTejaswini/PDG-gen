import java.io.*;
import java.util.*;

class Solver {
  final int p;
  final int[] as;
  
  int[] factCache;
  int[] factInverseCache;
  
  Solver(int p, int[] as) {
    this.p = p;
    this.as = as;
  }
  
  // 1 - (x - i)^(p - 1)
  // -x^(p-1) + C(p-1, 1) x^(p-2) - C(p-1, 2) i^1 x^(p - 3) + C(p-1, 3) i^2 x^(p-4) ... 1 +-
  private int[] expand(int i) {
    int[] fs = new int[p];
    for (int j = p-1; j >= 0; j--) {
      int sign = ((p - 1 - j) % 2) == 1 ? 1 : -1;
      int powFactor = pow(i, p - 1 - j);
      int combFactor = comb(p - 1, j);
      fs[j] = sign * mul(powFactor, combFactor);
    }
    fs[0] += 1;
    
    return fs;
  }
  
  private int mul(int a, int b) {
    return (a * b) % p;
  }
  
  private int pow(int a, int n) {
    if (n == 0) {
      return 1;
    }
    int a2 = pow(mul(a, a), n/2);
    if (n % 2 == 1) {
      return mul(a2, a);
    } else {
      return a2;
    }
  }
  
  private int comb(int n, int k) {
    return mul(factCache[n], mul(factInverseCache[k], factInverseCache[n-k]));
  }
  
  public int[] solve() {
    factCache = new int[p];
    factCache[0] = 1;
    for (int i = 1; i < p; i++) {
      factCache[i] = mul(factCache[i-1], i);
    }
    
    factInverseCache = new int[p];
    for (int i = 0; i < p; i++) {
      factInverseCache[i] = pow(factCache[i], p-2);
    }
    
    int[] bs = new int[p];
    for (int i = 0; i < p; i++) {
      if (as[i] == 1) {
        int[] fs = expand(i);
        for (int j = 0; j < p; j++) {
          bs[j] += fs[j];
        }
      }
    }
    
    for (int i = 0; i < p; i++) {
      if (bs[i] < 0) {
        bs[i] -= (bs[i] / p - 1) * p;
      }
      if (bs[i] >= p) {
        bs[i] %= p;
      }
    }
    return bs;
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int p = reader.nextInt();
    int[] as = reader.nextIntArray(p);
    
    int[] bs = new Solver(p, as).solve();
    
    out.print(bs[0]);
    for (int i = 1; i < bs.length; i++) {
      out.print(" ");
      out.print(bs[i]);
    }
    out.println();
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
        matrix[i][j] = nextInt();
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

