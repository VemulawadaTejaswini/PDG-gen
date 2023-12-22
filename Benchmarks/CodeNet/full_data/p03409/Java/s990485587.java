import java.io.*;
import java.util.*;

class Solver {
  final int n;
  final int[][] abs, cds;

  // assignment
  // 0: src
  // 1 - n: red (ai, bi)
  // n+1 - 2 * n: blue (ci, di)
  // 2 * n + 1: dst
  int[][] capacity;
  boolean[] visited;
  Deque<Integer> pathQueue;
  
  Solver(int n, int[][] abs, int[][] cds) {
    this.n = n;
    this.abs = abs;
    this.cds = cds;
  }
  
  private boolean dfs(int index) {
    if (index == 2 * n + 1) {
      return true;
    }
    for (int nextIndex = 0; nextIndex < 2 * n + 2; nextIndex++) {
      if (capacity[index][nextIndex] == 0 || visited[nextIndex]) {
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
    capacity = new int[2 * n + 2][2 * n + 2];
    for (int i = 0; i < n; i++) {
      int a = abs[i][0];
      int b = abs[i][1];
      for (int j = 0; j < n; j++) {
        int c = cds[j][0];
        int d = cds[j][1];
        if (a < c && b < d) {
          capacity[i + 1][j + n + 1] = 1;
        }
      }
    }
    for (int i = 0; i < n; i++) {
      capacity[0][i + 1] = 1;
      capacity[i + n + 1][2 * n + 1] = 1;
    }
    
    visited = new boolean[2 * n + 2];
    pathQueue = new ArrayDeque<>();
    for (int matching = 0; true; matching++) {
      Arrays.fill(visited, false);
      pathQueue.clear();
      
      visited[0] = true;
      pathQueue.add(0);
      if (!dfs(0)) {
        return matching;
      }
      int index = pathQueue.pollFirst();
      while (!pathQueue.isEmpty()) {
        int nextIndex = pathQueue.pollFirst();
        capacity[index][nextIndex] = 0;
        capacity[nextIndex][index] = 1;
        index = nextIndex;
      }
    }
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int[][] abs = reader.nextInt(n, 2);
    int[][] cds = reader.nextInt(n, 2);
    out.println(new Solver(n, abs, cds).solve());
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
