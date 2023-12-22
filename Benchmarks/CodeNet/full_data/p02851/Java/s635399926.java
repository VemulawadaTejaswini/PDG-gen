import java.io.*;
import java.util.*;

class Solver {
  final int n;
  final int k;
  final long[] as;
  long[] sumAs;
  Map<Long, TreeMap<Integer, Integer>> treeMapMap;
  
  Solver(int n, int k, long[] as) {
    this.n = n;
    this.k = k;
    this.as = as;
  }
  
  private void put(long value, int index) {
    if (treeMapMap.get(value) == null) {
      treeMapMap.put(value, new TreeMap<>());
    }
    TreeMap<Integer, Integer> treeMap = treeMapMap.get(value);
    treeMap.put(index, treeMap.size() + 1);
  }
  
  public long solve() {
    treeMapMap = new HashMap<>();
    
    long sumAs = 0;
    put(0, 0);
    for (int i = 0; i < n; i++) {
      sumAs = (sumAs + as[i] - 1 + k) % k;
      put(sumAs, i + 1);
    }
    
    long answer = 0;
    for (TreeMap<Integer, Integer> treeMap : treeMapMap.values()) {
      for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
        int index = entry.getKey();
        int size = entry.getValue();
        Map.Entry<Integer, Integer> floorEntry = treeMap.lowerEntry(index + k);
//        System.err.printf("%d %d %d %d\n", index, size, floorEntry.getKey(), floorEntry.getValue());
        answer += floorEntry.getValue() - size;
      }
    }
    return answer;
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int k = reader.nextInt();
    long[] as = reader.nextLong(n);
    out.println(new Solver( n, k, as).solve());
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
