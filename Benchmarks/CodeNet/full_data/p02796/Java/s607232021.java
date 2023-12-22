import java.io.*;
import java.util.*;

class Range implements Comparable<Range> {
  final int min, max;
  
  Range(int min, int max) {
    this.min = min;
    this.max = max;
  }
  
  public int compareTo(Range range) {
    return this.max - range.max;
  }
}

class Solver {
  final int n;
  final int[][] xls;
  
  Solver(int n, int[][] xls) {
    this.n = n;
    this.xls = xls;
  }
  
  public int solve() {
    List<Range> ranges = new ArrayList<>();
    for (int[] xl : xls) {
      int x = xl[0];
      int l = xl[1];
      ranges.add(new Range(x - l, x + l));
    }
    Collections.sort(ranges);
    
    TreeMap<Integer, Integer> map = new TreeMap<>();
    for (Range range : ranges) {
      Map.Entry<Integer, Integer> entry = map.floorEntry(range.min);
      int value;
      if (entry != null) {
        value = entry.getValue() + 1;
      } else {
        value = 1;        
      }
      
      Map.Entry<Integer, Integer> entry2 = map.floorEntry(range.max);
      if (entry2 == null || entry2.getValue() < value) {
        map.put(range.max, value);
      }
    }
    return map.lastEntry().getValue();
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int[][] xls = reader.nextInt(n, 2);
    out.println(new Solver(n, xls).solve());
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
