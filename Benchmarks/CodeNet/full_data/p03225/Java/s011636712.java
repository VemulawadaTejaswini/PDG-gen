import java.io.*;
import java.util.*;

class SubSolver {
  final int h, w;
  final char[][] cm;
  int[][] countLineMatrix;
  
  SubSolver (int h, int w, char[][] cm) {
    this.h = h;
    this.w = w;
    this.cm = cm;
  }
  
  public long solveRectangularTriangle() {
    long count = 0;
    for (int i = 0; i < h; i++) {
      for (int j = 0; j < w; j++) {
        if (cm[i][j] != '#') {
          continue;
        }
        for (int len = 1; j + len < w; len++) {
          if (cm[i][j + len] != '#') {
            continue;
          }
          if (i - len >= 0 && cm[i - len][j] == '#') count++;
          if (i - len >= 0 && cm[i - len][j + len] == '#') count++;
          if (i + len <  h && cm[i + len][j] == '#') count++;
          if (i + len <  h && cm[i + len][j + len] == '#') count++;
        }
      }
    }
    return count;
  }
  
  public long solvePartially() {
    countLineMatrix = new int[h][w + 1];
    for (int i = 0; i < h; i++) {
      countLineMatrix[i][0] = 0;
      for (int j = 0; j < w; j++) {
        countLineMatrix[i][j+1] = countLineMatrix[i][j];
        if (cm[i][j] == '#') {
          countLineMatrix[i][j+1]++;
        }
      }
    }
    
    long count = 0;
    for (int i = 0; i < h; i++) {
      for (int j = 0; j < w; j++) {
        if (cm[i][j] != '#') {
          continue;
        }
        for (int len = 2; j + len < w; len++) {
          if (cm[i][j + len] != '#') {
            continue;
          }
          if (i - len >= 0) {
//            System.err.printf("%d %d %d %d\n", i, j, len, countLineMatrix[i - len][j + len - 1] - countLineMatrix[i - len][j + 1]);
            count += countLineMatrix[i - len][j + len - 1] - countLineMatrix[i - len][j + 1];
          }
          if (i + len < h) {
//            System.err.printf("%d %d %d %d\n", i, j, len, countLineMatrix[i + len][j + len - 1] - countLineMatrix[i + len][j + 1]);
            count += countLineMatrix[i + len][j + len - 1] - countLineMatrix[i + len][j + 1];
          }
        }
      }
    }
    return count;
  }
}

class Solver {
  final int h, w;
  final char[][] cm;
  
  Solver (int h, int w, char[][] cm) {
    this.h = h;
    this.w = w;
    this.cm = cm;
  }
  
  
  public long solve() {
    char[][] rotated1 = new char[h + w][h + w];
    char[][] rotated2 = new char[h + w][h + w];
    for (char[] array : rotated1) {
      Arrays.fill(array, '.');
    }
    for (char[] array : rotated2) {
      Arrays.fill(array, '.');
    }
    for (int i = 0; i < h; i++) {
      for (int j = 0; j < w; j++) {
        rotated1[i + j    ][i - j + w] = cm[i][j];
        rotated2[i - j + w][i + j    ] = cm[i][j];
      }
    }
    
    /*
    System.err.println("rotated1");
    for (int i = 0; i < h+w; i++) {
      for (int j = 0; j < h+w; j++) {
        System.err.print(rotated1[i][j]);
      }
      System.err.println();
    }
    
    System.err.println("rotated2");
    for (int i = 0; i < h+w; i++) {
      for (int j = 0; j < h+w; j++) {
        System.err.print(rotated2[i][j]);
      }
      System.err.println();
    }
    */
    
    SubSolver subSolver1 = new SubSolver(h + w, h + w, rotated1);
    SubSolver subSolver2 = new SubSolver(h + w, h + w, rotated2);
//    System.err.println("rotated1");
    long count1 = subSolver1.solvePartially();
//    System.err.println("rotated2");
    long count2 = subSolver2.solvePartially();
    long count3 = subSolver1.solveRectangularTriangle();
//    System.err.printf("%d %d %d\n", count1, count2, count3);
    return count1 + count2 + count3;
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int h = reader.nextInt();
    int w = reader.nextInt();
    char[][] cm = new char[h][];
    for (int i = 0; i < h; i++) {
      cm[i] = reader.next().toCharArray();
    }
    out.println(new Solver(h, w, cm).solve());
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
  
  ModCalculator(long mod) {
    this.mod = mod;
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
}
 
class ModCombinationCache {
  private final ModCalculator modCalculator;
  private final List<Long> factorialCache;
  private final List<Long> factorialInverseCache;
  
  public ModCombinationCache(ModCalculator modCalculator) {
    this.modCalculator = modCalculator;
    factorialCache = new ArrayList<>();
    factorialCache.add(1L);
    factorialInverseCache = new ArrayList<>();
    factorialInverseCache.add(1L);
  }
  
  private void resize(int n) {
    for (int i = factorialCache.size() - 1; i < n; i++) {
      long v = modCalculator.mul(factorialCache.get(i), i + 1);
      factorialCache.add(v);
      factorialInverseCache.add(modCalculator.inverse(v));
    }
  }
  
  public long getP(int n) {
    resize(n);
    return factorialCache.get(n);
  }
  
  public long getC(int n, int k) {
    resize(n);
    return modCalculator.mul(factorialCache.get(n), modCalculator.mul(factorialInverseCache.get(k), factorialInverseCache.get(n-k)));
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
