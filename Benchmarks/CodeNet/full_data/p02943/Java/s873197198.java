import java.io.*;
import java.util.*;

class SuffixArrayBuilder {
  public static int[] create(char[] cs) {
    int n = cs.length;
    
    Integer[] suffixArrayInteger = new Integer[n + 1];
    int[] rank = new int[n + 1];
    for (int i = 0; i < n; i++) {
      suffixArrayInteger[i] = i;
      rank[i] = (int) cs[i];
      
    }
    suffixArrayInteger[n] = n;
    rank[n] = -1;
    
    for (int k = 1; k <= n; k *= 2) {
      final int kFinal = k;
      final int[] rankFinal = rank;
      final Comparator<Integer> comparator = new Comparator<Integer>() {
        public int compare(Integer i1, Integer i2) {
          if (rankFinal[i1] != rankFinal[i2]) {
            return rankFinal[i1] - rankFinal[i2];
          }
          int rank1 = i1 + kFinal <= n ? rankFinal[i1 + kFinal] : -1;
          int rank2 = i2 + kFinal <= n ? rankFinal[i2 + kFinal] : -1;
          return rank1 - rank2;
        }
      };
      
      Arrays.sort(suffixArrayInteger, comparator);
      int[] nextRank = new int[n + 1];
      for (int i = 1; i <= n; i++) {
        nextRank[i] = rank[i];
      }
      nextRank[suffixArrayInteger[0]] = 0;
      for (int i = 1; i <= n; i++) {
        nextRank[suffixArrayInteger[i]] = nextRank[suffixArrayInteger[i - 1]]
            + (comparator.compare(suffixArrayInteger[i - 1], suffixArrayInteger[i]) < 0 ? 1 : 0);
      }
      rank = nextRank;
      
      /*
      System.out.println("------------------------");
      for (int i = 0; i <= n; i++) {
        String temp = new String(cs).substring(suffixArrayInteger[i]);
        System.out.printf("%3d: %3d, %40s %40s\n", i, suffixArrayInteger[i], temp.substring(0, Math.min(k, temp.length())), temp);
      }
      */
    }
    
    int[] suffixArray = new int[n + 1];
    for (int i = 0; i <= n; i++) {
      suffixArray[i] = suffixArrayInteger[i];
    }
    
    return suffixArray;
  }
}

public class Main {
  private static String solve(int n, int k, char[] cs) {
    char[] us = new char[2 * n];
    for (int i = 0; i < n; i++) {
      us[i] = cs[i];
    }
    for (int i = 0; i < n; i++) {
      us[n + i] = cs[n - 1 - i];
    }
    int[] suffixArray = SuffixArrayBuilder.create(us);
    for (int i = 0; true; i++) {
      if (suffixArray[i] + n <= 2 * n) {
        char first = us[suffixArray[i]];
        int j = 1;
        for (; j < n; j++) {
          if (us[suffixArray[i] + j] != first) {
            break;
          }
        }
        int firstCharLength = j;
//        System.err.println(j);
        for (int a = 1; a < k; a++) {
          firstCharLength *= 2;
          if (firstCharLength > n) {
            break;
          }
        }
//        System.err.println(firstCharLength);
        StringBuffer sb = new StringBuffer();
        for (int a = 0; a < Math.min(firstCharLength, n); a++) {
          sb.append(first);
        }
        int limit = n - sb.length();
        for (int a = 0; a < limit; a++) {
          sb.append(us[suffixArray[i] + j + a]);
        }
        return sb.toString();
      }
    }
  }
  
  private static void execute(ContestReader reader, PrintWriter out) {
    /*
    int[] suffixArray = SuffixArrayBuilder.create("aaaabbbbaaabbbaabbabaabbaaabbbaaaabbbb".toCharArray());
    for (int i = 0; i < suffixArray.length; i++) {
      System.out.printf("%3d: %3d\n", i, suffixArray[i]);
    }
    */
    int n = reader.nextInt();
    int k = reader.nextInt();
    char[] cs = reader.next().toCharArray();
    out.println(solve(n, k, cs));
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
