import java.io.*;
import java.util.*;

class Solver {
  final int n;
  final long[] as;
  
  Solver(int n, long[] as) {
    this.n = n;
    this.as = as;
  }
  
  List<Long> solve() {
    long[] dptable = new long[n];
    boolean[] used = new boolean[n];
    dptable[0] = as[0];
    used[0] = true;
    dptable[1] = as[1];
    used[1] = true;
    for (int i = 2; i < n; i++) {
      dptable[i] = Math.max(Math.max(dptable[i-2], as[i]), dptable[i-2] + as[i]);
      if (dptable[i] == dptable[i-2] + as[i]) {
        used[i] = true;
      } else if (dptable[i] == as[i]) {
        used[i] = true;
        for (int j = i - 2; j >= 0; j -= 2) {
          used[j] = false;
        }
      }
    }
    
    long maxValue;
    if (dptable[n-1] > dptable[n-2]) {
      maxValue = dptable[n - 1];
      for (int j = n - 2; j >= 0; j -= 2) {
        used[j] = false;
      }
    } else {
      maxValue = dptable[n - 2];
      for (int j = n - 1; j >= 0; j -= 2) {
        used[j] = false;
      }
    }
    
    List<Integer> indexes = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      if (used[i]) {
        indexes.add(i + 1);
      }
    }
    
    List<Long> removeIndexes = new ArrayList<>();
    for (int i = n; i > indexes.get(indexes.size() - 1); i--) {
      removeIndexes.add((long) i);
    }
    for (int i = indexes.size() - 2; i >= 0; i--) {
      int index1 = indexes.get(i);
      int index2 = indexes.get(i + 1);
      int diff = index2 - index1;
      while (diff > 2) {
        removeIndexes.add((long) (index1 + 2));
        diff -= 2;
      }
      removeIndexes.add((long) (index1 + 1));
    }
    for (int i = 1; i < indexes.get(0); i++) {
      removeIndexes.add(1L);
    }
    
    List<Long> answers = new ArrayList<>();
    answers.add(maxValue);
    answers.add((long) removeIndexes.size());
    answers.addAll(removeIndexes);
    return answers;
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    long[] as = reader.nextLongArray(n);
    for (long answer : new Solver(n, as).solve()) {
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
  
  public String[] nextArray(int n) {
    String[] array = new String[n];
    for (int i = 0; i < n; i++) {
      array[i] = next();
    }
    return array;
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

class ModCalculator {
  private final long mod;
  private final ModCombinationCache modCombinationCache;
  
  ModCalculator(long mod) {
    this.mod = mod;
    this.modCombinationCache = new ModCombinationCache();
  }
  
  public long add(long a, long b) {
    return (a + b) % mod;
  }
  
  public long sub(long a, long b) {
    return (a - b + mod) % mod;
  }
  
  public long mul(long a, long b) {
    return (a * b) % mod;
  }
  
  public long pow(long a, long b) {
    if (b == 0) {
      return 1;
    }
    long v = pow(mul(a, a), b / 2);
    if (b % 2 == 1) {
      return mul(v, a);
    } else {
      return v;
    }
  }
  
  public long inverse(long a) {
    return pow(a, mod - 2);
  }
  
  public long div(long a, long b) {
    return mul(a, inverse(b));
  }
  
  public long getF(int n) {
    return modCombinationCache.getF(n);
  }
  
  public long getP(int n, int r) {
    return modCombinationCache.getP(n, r);
  }
  
  public long getC(int n, int k) {
    return modCombinationCache.getC(n, k);
  }
  
  class ModCombinationCache {
    private final List<Long> factorialCache;
    private final List<Long> factorialInverseCache;
    
    public ModCombinationCache() {
      factorialCache = new ArrayList<>();
      factorialCache.add(1L);
      factorialInverseCache = new ArrayList<>();
      factorialInverseCache.add(1L);
    }
    
    private void resize(int n) {
      for (int i = factorialCache.size() - 1; i < n; i++) {
        long v = mul(factorialCache.get(i), i + 1);
        factorialCache.add(v);
        factorialInverseCache.add(inverse(v));
      }
    }
    
    long getF(int n) {
      resize(n);
      return factorialCache.get(n);
    }
    
    long getP(int n, int r) {
      resize(n);
      return mul(factorialCache.get(n), factorialInverseCache.get(n - r));
    }
    
    long getC(int n, int k) {
      resize(n);
      return mul(factorialCache.get(n), mul(factorialInverseCache.get(k), factorialInverseCache.get(n-k)));
    }
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

class UnionFind {
  int[] parents;
  int[] ranks;

  UnionFind(int n) {
    parents = new int[n];
    ranks = new int[n];

    for (int i = 0; i < n; i++) {
      parents[i] = i;
    }
  }

  public int getRoot(int index) {
    if (parents[index] == index) {
      return index;
    } else {
      parents[index] = getRoot(parents[index]);
      return parents[index];
    }
  }

  public boolean sameGroup(int a, int b) {
    return getRoot(a) == getRoot(b);
  }

  public void merge(int a, int b) {
    int rootA = getRoot(a);
    int rootB = getRoot(b);
    if (rootA == rootB) {
      return;
    }
    if (ranks[rootA] < ranks[rootB]) {
      parents[rootA] = rootB;
    } else if (ranks[rootB] < ranks[rootA]) {
      parents[rootB] = rootA;
    } else {
      parents[rootA] = rootB;
      ranks[rootB]++;
    }
  }
}
