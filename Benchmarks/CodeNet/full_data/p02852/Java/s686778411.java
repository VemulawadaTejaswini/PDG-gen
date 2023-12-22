import java.io.*;
import java.util.*;

class SourceCell implements Comparable<SourceCell> {
  final int minStep;
  final int minIndex;
  
  SourceCell(int minStep, int minIndex) {
    this.minStep = minStep;
    this.minIndex = minIndex;
  }
  
  public int compareTo(SourceCell sourceCell) {
    if (this.minStep != sourceCell.minStep) {
      return this.minStep - sourceCell.minStep;
    }
    return this.minIndex - sourceCell.minIndex;
  }
}

class Solver {
  final int n, m;
  char[] cs;
  
  Solver(int n, int m, char[] cs) {
    this.n = n;
    this.m = m;
    this.cs = cs;
  }
  
  List<Integer> solve() {
    int[] sourceCellIndexes = new int[n + 1];
    Arrays.fill(sourceCellIndexes, Integer.MAX_VALUE);
    PriorityQueue<SourceCell> queue = new PriorityQueue<>();
    queue.add(new SourceCell(0, 0));
    for (int i = 1; i <= n; i++) {
      if (cs[i] == '1') {
        continue;
      }
      while (!queue.isEmpty() && i - queue.peek().minIndex > m) {
        queue.poll();
      }
      if (queue.isEmpty()) {
        return Arrays.asList(-1);
      }
      sourceCellIndexes[i] = queue.peek().minIndex;
      queue.add(new SourceCell(queue.peek().minStep + 1, i));
    }
    
    /*
    for (int i = 0; i <= n; i++) {
      System.err.printf("%d %d\n", i, sourceCellIndexes[i]);
    }
    */
    
    Deque<Integer> deque = new ArrayDeque<>();
    int index = n;
    while (index > 0) {
      int prevIndex = sourceCellIndexes[index];
      deque.addFirst(index - prevIndex);
      index = prevIndex;
    }
    List<Integer> output = new ArrayList<>();
    output.addAll(deque);
    return output;
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int m = reader.nextInt();
    char[] cs = reader.nextCharArray();
    for (int index : new Solver(n, m, cs).solve()) {
      out.println(index);
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
