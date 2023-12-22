import java.io.*;
import java.util.*;

class Solver {
  final int n, k;
  final int[][] abs, vps;
  List<List<Integer>> graph;
  int[] mins, maxs, values;
  
  Solver(int n, int[][] abs, int k, int[][] vps) {
    this.n = n;
    this.abs = abs;
    this.k = k;
    this.vps = vps;
  }
  
  private boolean dfsRange(int index, int parentIndex) {
//    System.err.printf("dfsRange: %d, %d, %d\n", 1, parentIndex, index);
    int parentMin = mins[parentIndex];
    int parentMax = maxs[parentIndex];
    if (values[index] != Integer.MAX_VALUE) {
//      System.err.printf("dfsRange: %d, %d, %d\n", 2, parentIndex, index);
//      System.err.printf("dfsRange: %d, %d, %d, %d, %d, %d\n", 2, parentIndex, index, values[index], parentMin - 1, parentMax + 1);
      if (values[index] < parentMin - 1 || parentMax + 1 < values[index] || Math.abs(parentMax + 1) % 2 != values[index] % 2) {
//        System.err.printf("dfsRange: %d, %d, %d\n", 3, parentIndex, index);
        return false;
      }
      mins[index] = values[index];
      maxs[index] = values[index];
      return true;
    }
    
    mins[index] = parentMin - 1;
    maxs[index] = parentMax + 1;
//    System.err.printf("dfsRange: %d, %d, %d\n", 4, parentIndex, index);
//    System.err.printf("dfsRange: %d, %d, %d, %d, %d\n", 4, parentIndex, index, mins[index], maxs[index]);
    for (int childIndex : graph.get(index)) {
//      System.err.printf("dfsRange: %d, %d, %d\n", 5, parentIndex, index);
//      System.err.printf("dfsRange: %d, %d, %d, %d\n", 5, parentIndex, index, childIndex);
      if (childIndex == parentIndex) {
//        System.err.printf("dfsRange: %d, %d, %d, %d\n", 6, parentIndex, index, childIndex);
        continue;
      }
//      System.err.printf("dfsRange: %d, %d, %d, %d\n", 7, parentIndex, index, childIndex);
      if (!dfsRange(childIndex, index)) {
//        System.err.printf("dfsRange: %d, %d, %d, %d\n", 8, parentIndex, index, childIndex);
        return false;
      }
//      System.err.printf("dfsRange: %d, %d, %d, %d\n", 9, parentIndex, index, childIndex);
      mins[index] = Math.max(mins[index], mins[childIndex] - 1);
      maxs[index] = Math.min(maxs[index], maxs[childIndex] + 1);
//      System.err.printf("dfsRange: %d, %d, %d, %d, %d, %d\n", 9, parentIndex, index, childIndex, mins[index], maxs[index]);
    }
    return true;
  }
  
  private void dfsValue(int index, int parentIndex) {
    int value = values[parentIndex];
    if (values[index] != Integer.MAX_VALUE) {
      return;
    }
    if (mins[index] <= value + 1 && value + 1 <= maxs[index]) {
      values[index] = value + 1;
    } else {
      values[index] = value - 1;
    }
    for (int childIndex : graph.get(index)) {
      if (childIndex == parentIndex) {
        continue;
      }
      dfsValue(childIndex, index);
    }
  }
  
  public List<String> solve() {
    graph = new ArrayList<>();
    for (int i = 0; i <= n; i++) {
      graph.add(new ArrayList<>());
    }
    for (int[] ab : abs) {
      int a = ab[0];
      int b = ab[1];
      graph.get(a).add(b);
      graph.get(b).add(a);
    }
    
    values = new int[n + 1];
    Arrays.fill(values, Integer.MAX_VALUE);
    for (int[] vp : vps) {
      int v = vp[0];
      int p = vp[1];
      values[v] = p;
    }
    
    mins = new int[n + 1];
    maxs = new int[n + 1];
    for (int[] vp : vps) {
      int v = vp[0];
      int p = vp[1];
      mins[v] = p;
      maxs[v] = p;
      for (int childIndex : graph.get(v)) {
        if (!dfsRange(childIndex, v)) {
          return Arrays.asList("No");
        }
        dfsValue(childIndex, v);
      }
    }
    List<String> output = new ArrayList<>();
    output.add("Yes");
    for (int i = 1; i <= n; i++) {
      output.add("" + values[i]);
    }
    return output;
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int[][] abs = reader.nextInt(n - 1, 2);
    int k = reader.nextInt();
    int[][] vps = reader.nextInt(k, 2);
    for (String line : new Solver(n, abs, k, vps).solve()) {
      out.println(line);
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
