import java.io.*;
import java.util.*;

class MaxFlowSolver {
  final int src, dst, n;
  final List<List<Integer>> graph;
  
  MaxFlowSolver (List<List<Integer>> graph, int src, int dst) {
    this.graph = graph;
    this.n = graph.size();
    this.src = src;
    this.dst = dst;
  }
  
  public int solve() {
    for (int count = 0; true; count++) {
      
    }
  }
}

class Solver {
  final int h, w;
  final char[][] am;
  
  // Assignment
  // [0, h): same row
  // [h, h+w): same column
  // h+w: src
  // h+w+1: dst
  int[][] capacities;
  boolean[] visited;
  Deque<Integer> pathQueue;
  
  Solver(int h, int w, char[][] am) {
    this.h = h;
    this.w = w;
    this.am = am;
  }
  
  private boolean dfs(int index) {
    if (index == h + w + 1) {
      return true;
    }
    for (int nextIndex = 0; nextIndex < h + w + 2; nextIndex++) {
      if (capacities[index][nextIndex] <= 0 || visited[nextIndex]) {
        continue;
      }
      visited[nextIndex] = true;
      pathQueue.addLast(nextIndex);
      if (dfs(nextIndex)) {
        return true;
      }
      pathQueue.pollLast();
    }
    return false;
  }
  
  public int solve() {
    capacities = new int[h + w + 2][h + w + 2];
    int srcI = -1;
    int srcJ = -1;
    int dstI = -1;
    int dstJ = -1;
    
    int size = 0;
    for (int i = 0; i < h; i++) {
      for (int j = 0; j < w; j++) {
        switch (am[i][j]) {
          case 'o':
            capacities[i][h + j]++;
            capacities[h + j][i]++;
            break;
          case 'S':
            srcI = i;
            srcJ = j;
            break;
          case 'T':
            dstI = i;
            dstJ = j;
            break;
        }
      }
    }
    
    if (srcI < 0 || srcJ < 0 || dstI < 0 || dstJ < 0) {
      throw new RuntimeException();
    }
    if (srcI == dstI || srcJ == dstJ) {
      return -1;
    }
    capacities[h + w][srcI] = Integer.MAX_VALUE;
    capacities[h + w][h + srcJ] = Integer.MAX_VALUE;
    capacities[dstI][h + w + 1] = Integer.MAX_VALUE;
    capacities[h + dstJ][h + w + 1] = Integer.MAX_VALUE;
    
    visited = new boolean[h + w + w];
    pathQueue = new ArrayDeque<>();
    for (int maxFlow = 0; true; maxFlow++) {
      Arrays.fill(visited, false);
      pathQueue.clear();
      
      visited[h + w] = true;
      pathQueue.add(h + w);
      if (!dfs(h + w)) {
        return maxFlow;
      }
      int index = pathQueue.pollFirst();
      while (!pathQueue.isEmpty()) {
        int nextIndex = pathQueue.pollFirst();
        capacities[index][nextIndex]--;
        capacities[nextIndex][index]++;
        index = nextIndex;
      }
    }
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int h = reader.nextInt();
    int w = reader.nextInt();
    char[][] am = reader.nextCharArray(h);
    out.println(new Solver(h, w, am).solve());
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
