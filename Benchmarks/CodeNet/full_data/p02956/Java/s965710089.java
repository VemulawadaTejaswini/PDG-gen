import java.io.*;
import java.util.*;

class SegmentTree {
  final int n;
  final int[] rangeSum;
  
  SegmentTree(int n) {
    this.n = n;
    this.rangeSum = new int[2 * n - 1];
  }
  
  public void increment(int index) {
    int k = index + n - 1;
    while (true) {
      rangeSum[k]++;
      if (k == 0) {
        return;
      }
      k = (k - 1) / 2;
    }
  }
  
  private int calculateSum(int b, int k, int l, int r) {
    if (b <= l) {
      return 0;
    }
    if (r <= b) {
      return rangeSum[k];
    }
    int vl = calculateSum(b, 2 * k + 1, l, (l + r) / 2);
    int vr = calculateSum(b, 2 * k + 2, (l + r)/ 2, r);
    return vl + vr;
  }
  
  // [0, b)
  public int calculateSum(int b) {
    return calculateSum(b, 0, 0, n);
  }
  
  public int calculateTotal() {
    return rangeSum[0];
  }
}

class Pair implements Comparable<Pair> {
  final int x, y;
  
  Pair(int x, int y) {
    this.x = x;
    this.y = y;
  }
  
  public int compareTo(Pair pair) {
    return this.x - pair.x;
  }
}

class Solver {
  final int n;
  final int[] originalXs, originalYs;
  int[] xs, ys;
  
  Solver(int n, int[] originalXs, int[] originalYs) {
    this.n = n;
    this.originalXs = originalXs;
    this.originalYs = originalYs;
  }
  
  private int[] compress(int[] zs) {
    int[] sortedZs = new int[n];
    for (int i = 0; i < n; i++) {
      sortedZs[i] = zs[i];
    }
    Arrays.sort(sortedZs);
    
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < n; i++) {
      map.put(sortedZs[i], i);
    }
    
    int[] compressedZs = new int[n];
    for (int i = 0; i < n; i++) {
      compressedZs[i] = map.get(zs[i]);
    }
    return compressedZs;
  }
  
  public long solve() {
    xs = compress(originalXs);
    ys = compress(originalYs);
    Pair[] pairs = new Pair[n];
    for (int i = 0; i < n; i++) {
      pairs[i] = new Pair(xs[i], ys[i]);
    }
    Arrays.sort(pairs);
    
    int segmentTreeSize = 1;
    while (segmentTreeSize < n) {
      segmentTreeSize *= 2;
    }
    
    int[] topLeft = new int[n];
    int[] bottomLeft = new int[n];
    SegmentTree segmentTreeFromLeft = new SegmentTree(segmentTreeSize);
    for (int i = 0; i < n; i++) {
      int y = pairs[i].y;
      bottomLeft[i] = segmentTreeFromLeft.calculateSum(y);
      topLeft[i] = i - bottomLeft[i];
      segmentTreeFromLeft.increment(y);
    }
    
    int[] topRight = new int[n];
    int[] bottomRight = new int[n];
    SegmentTree segmentTreeFromRight = new SegmentTree(segmentTreeSize);
    for (int i = n-1; i >= 0; i--) {
      int y = pairs[i].y;
      bottomRight[i] = segmentTreeFromRight.calculateSum(y);
      topRight[i] = n - 1 - i - bottomRight[i];
      segmentTreeFromRight.increment(y); 
    }
    
    ModCalculator mc = new ModCalculator(998244353L);
    long answer = 0;
    for (int i = 0; i < n; i++) {
      long topLeftComb = mc.sub(mc.pow(2, topLeft[i]), 1);
      long bottomLeftComb = mc.sub(mc.pow(2, bottomLeft[i]), 1);
      long topRightComb = mc.sub(mc.pow(2, topRight[i]), 1);
      long bottomRightComb = mc.sub(mc.pow(2, bottomRight[i]), 1);
      
      long v4 = mc.mul(2, mc.mul(mc.mul(topLeftComb, bottomLeftComb), mc.mul(topRightComb, bottomRightComb)));
      long v31 = mc.mul(mc.mul(2, bottomLeftComb), mc.mul(topRightComb, bottomRightComb));
      long v32 = mc.mul(mc.mul(topLeftComb, 2), mc.mul(topRightComb, bottomRightComb));
      long v33 = mc.mul(mc.mul(topLeftComb, bottomLeftComb), mc.mul(2, bottomRightComb));
      long v34 = mc.mul(mc.mul(topLeftComb, bottomLeftComb), mc.mul(topRightComb, 2));
      long v21 = mc.mul(2, mc.mul(topLeftComb, bottomRightComb));
      long v22 = mc.mul(2, mc.mul(topRightComb, bottomLeftComb));
      long v23 = mc.mul(topLeftComb, topRightComb);
      long v24 = mc.mul(topRightComb, bottomRightComb);
      long v25 = mc.mul(bottomRightComb, bottomLeftComb);
      long v26 = mc.mul(bottomLeftComb, topLeftComb);
      long v11 = topLeftComb;
      long v12 = topRightComb;
      long v13 = bottomRightComb;
      long v14 = bottomLeftComb;
      long v0 = 1;
      
      answer = mc.add(
        answer,
        v4 + v31 + v32 + v33 + v34 + v21 + v22 + v23 + v24 + v25 + v26 + v11 + v12 + v13 + v14 + v0
      );
    }
    return answer;
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int[] xs = new int[n];
    int[] ys = new int[n];
    for (int i = 0; i < n; i++) {
      xs[i] = reader.nextInt();
      ys[i] = reader.nextInt();
    }
    out.println(new Solver(n, xs, ys).solve());
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
  private final long[] factorialCache;
  private final long[] factorialInverseCache;
  
  public ModCombinationCache(int n, ModCalculator modCalculator) {
    this.modCalculator = modCalculator;
    factorialCache = new long[n];
    factorialCache[0] = 1;
    for (int i = 1; i < n; i++) {
      factorialCache[i] = modCalculator.mul(factorialCache[i-1], i);
    }
    
    factorialInverseCache = new long[n];
    for (int i = 0; i < n; i++) {
      factorialInverseCache[i] = modCalculator.inverse(factorialCache[i]);
    }
  }
  
  public long getFactorial(int n) {
    return factorialCache[n];
  }
  
  public long getCombination(int n, int k) {
    return modCalculator.mul(factorialCache[n], modCalculator.mul(factorialInverseCache[k], factorialInverseCache[n-k]));
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
