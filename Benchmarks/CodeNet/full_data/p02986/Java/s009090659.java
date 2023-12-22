import java.io.*;
import java.util.*;

class Edge {
  final int src, dst, color, cost;
  
  Edge(int src, int dst, int color, int cost) {
    this.src = src;
    this.dst = dst;
    this.color = color;
    this.cost = cost;
  }
}

class Solver {
  final int n, q;
  final int[][] abcds, xyuvs;
  
  List<List<Edge>> graph;
  
  int logN;
  int[][] ancestorTable;
  int[] depthTable;
  int[] distanceTable;
  
  int eulerTourIndex;
  int[] eulerTourIndexTable;
  int[] colorEulerTourCostSum;
  int[] colorEulerTourCountSum;
  List<TreeMap<Integer, Integer>> colorEulerTourCostSumTable;
  List<TreeMap<Integer, Integer>> colorEulerTourCountSumTable;
  
  Solver(int n, int q, int[][] abcds, int[][] xyuvs) {
    this.n = n;
    this.q = q;
    this.abcds = abcds;
    this.xyuvs = xyuvs;
  }
  
  private int getAncestor(int index, int depth) {
    for (int i = logN - 1; i >= 0; i--) {
      if (((depth >> i) & 1) == 1) {
        index = ancestorTable[i][index];
      }
    }
    return index;
  }
  
  private int getCommonAncestor(int u, int v) {
    if (depthTable[u] > depthTable[v]) {
      return getCommonAncestor(v, u);
    }
    v = getAncestor(v, depthTable[v] - depthTable[u]);
    if (u == v) {
      return u;
    }
    for (int i = logN - 1; i >= 0; i--) {
      if (ancestorTable[i][u] != ancestorTable[i][v]) {
        u = ancestorTable[i][u];
        v = ancestorTable[i][v];
      }
    }
    return ancestorTable[0][u];
  }
  
  private int calculatePathValue(TreeMap<Integer, Integer> table, int u, int v, int commonAncestor) {
    return table.floorEntry(eulerTourIndexTable[u]).getValue() + table.floorEntry(eulerTourIndexTable[v]).getValue() - 2 * table.floorEntry(eulerTourIndexTable[commonAncestor]).getValue();
  }
  
  private int solve(int x, int y, int u, int v) {
    int commonAncestor = getCommonAncestor(u, v);
    int baseDistance = distanceTable[u] + distanceTable[v] - 2 * distanceTable[commonAncestor];
    int colorDistance = calculatePathValue(colorEulerTourCostSumTable.get(x), u, v, commonAncestor);
    int colorCount = calculatePathValue(colorEulerTourCountSumTable.get(x), u, v, commonAncestor);
    /*
    System.err.printf("%d %d %d %d %d\n", x, y, u, v, commonAncestor);
    System.err.printf("%d %d %d %d\n", distanceTable[u], distanceTable[v], distanceTable[commonAncestor], baseDistance);
    System.err.printf("%d %d\n", colorDistance, colorCount);
    */
    return baseDistance - colorDistance + colorCount * y;
  }
  
  private void dfs(int index, int parentIndex, int distance, int depth, Edge sourceEdge) {
    depthTable[index] = depth;
    distanceTable[index] = distance;
    ancestorTable[0][index] = parentIndex;
    if (sourceEdge != null) {
      int color = sourceEdge.color;
      eulerTourIndex++;
      eulerTourIndexTable[index] = eulerTourIndex;
      colorEulerTourCostSum[color] += sourceEdge.cost;
      colorEulerTourCountSum[color]++;
      colorEulerTourCostSumTable.get(color).put(eulerTourIndex, colorEulerTourCostSum[color]);
      colorEulerTourCountSumTable.get(color).put(eulerTourIndex, colorEulerTourCountSum[color]);
    }
    for (Edge edge : graph.get(index)) {
      if (edge.dst == parentIndex) {
        continue;
      }
      dfs(edge.dst, index, distance + edge.cost, depth + 1, edge);
    }
    if (sourceEdge != null) {
      int color = sourceEdge.color;
      eulerTourIndex++;
      colorEulerTourCostSum[color] -= sourceEdge.cost;
      colorEulerTourCountSum[color]--;
      colorEulerTourCostSumTable.get(color).put(eulerTourIndex, colorEulerTourCostSum[color]);
      colorEulerTourCountSumTable.get(color).put(eulerTourIndex, colorEulerTourCountSum[color]);
    }
  }
  
  public int[] solve() {
    graph = new ArrayList<>();
    for (int i = 0; i <= n; i++) {
      graph.add(new ArrayList<>());
    }
    for (int[] abcd : abcds) {
      int a = abcd[0];
      int b = abcd[1];
      int c = abcd[2];
      int d = abcd[3];
      graph.get(a).add(new Edge(a, b, c, d));
      graph.get(b).add(new Edge(b, a, c, d));
    }
    
    logN = 1;
    while ((1 << logN) <= n) {
      logN++;
    }
    
    eulerTourIndex = 0;
    depthTable = new int[n + 1];
    distanceTable = new int[n + 1];
    ancestorTable = new int[logN][n + 1];
    eulerTourIndexTable = new int[n + 1];
    colorEulerTourCostSum = new int[n + 1];
    colorEulerTourCountSum = new int[n + 1];
    colorEulerTourCostSumTable = new ArrayList<>();
    colorEulerTourCountSumTable = new ArrayList<>();
    for (int i = 0; i <= n; i++) {
      colorEulerTourCostSumTable.add(new TreeMap<>());
      colorEulerTourCostSumTable.get(i).put(0, 0);
      colorEulerTourCountSumTable.add(new TreeMap<>());
      colorEulerTourCountSumTable.get(i).put(0, 0);
    }
    
    dfs(1, -1, 0, 0, null);
    for (int k = 0; k + 1 < logN; k++) {
      for (int i = 1; i <= n; i++) {
        if (ancestorTable[k][i] == -1) {
          ancestorTable[k+1][i] = -1;
        } else {
          ancestorTable[k+1][i] = ancestorTable[k][ancestorTable[k][i]];
        }
      }
    }
    /*
    for (int i = 0; i <= n; i++) {
      System.err.printf("%d %d %d\n", i, depthTable[i], distanceTable[i]);
    }
    */
    
    int[] answers = new int[q];
    for (int i = 0; i < q; i++) {
      int x = xyuvs[i][0];
      int y = xyuvs[i][1];
      int u = xyuvs[i][2];
      int v = xyuvs[i][3];
      answers[i] = solve(x, y, u, v);
    }
    
    return answers;
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int q = reader.nextInt();
    int[][] abcds = reader.nextInt(n - 1, 4);
    int[][] xyuvs = reader.nextInt(q, 4);
    for (int answer : new Solver(n, q, abcds, xyuvs).solve()) {
      out.println(answer);
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
