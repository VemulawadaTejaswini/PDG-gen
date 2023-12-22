import java.io.*;
import java.util.*;

class Edge {
  final int id;
  final int dst;
  
  Edge(int id, int dst) {
    this.id = id;
    this.dst = dst;
  }
}

class Solver {
  final int n;
  final int[][] abs;
  List<List<Edge>> edges;
  int[] colors;
  int maxColor;
  
  Solver(int n, int[][] abs) {
    this.n = n;
    this.abs = abs;
  }
  
  private void dfs(int index, int parentIndex, int parentEdgeColor) {
//    System.err.printf("%d %d %d\n", index, parentIndex, parentEdgeColor);
    int color = parentEdgeColor == 1 ? 2 : 1;
    for (Edge edge : edges.get(index)) {
//      System.err.printf("id: %d\n", edge.id);
      if (edge.dst == parentIndex) {
        continue;
      }
      colors[edge.id] = color;
//      System.err.printf("id: %d, color: %d\n", edge.id, color);
      dfs(edge.dst, index, color);
      maxColor = Math.max(maxColor, color);
      color++;
      if (color == parentEdgeColor) {
        color++;
      }
    }
  }
  
  public List<Integer> solve() {
    edges = new ArrayList<>();
    for (int i = 0; i <= n; i++) {
      edges.add(new ArrayList<>());
    }
    for (int i = 0; i < abs.length; i++) {
      int a = abs[i][0];
      int b = abs[i][1];
      edges.get(a).add(new Edge(i, b));
      edges.get(b).add(new Edge(i, a));
    }
    
    colors = new int[n];
    maxColor = 0;
    dfs(1, -1, -1);
    List<Integer> output = new ArrayList<>();
    output.add(maxColor);
    for (int i = 0; i < n - 1; i++) {
      output.add(colors[i]);
    }
    return output;
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int[][] abs = reader.nextInt(n - 1, 2);
    for (int c : new Solver(n, abs).solve()) {
      out.println(c);
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
