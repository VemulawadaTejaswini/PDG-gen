import java.io.*;
import java.util.*;

class Node {
  final int a, b;
  
  Node(int a, int b) {
    this.a = a;
    this.b = b;
  }
  
  public int hashCode() {
    return 13 * a + b;
  }
  
  public boolean equals(Object object) {
    Node node = (Node) object;
    return this.a == node.a && this.b == node.b;
  }
}

class Query implements Comparable<Query> {
  final Node node;
  final int cost;
  final int enqueueWithoutContribution;
  
  Query(Node node, int cost, int enqueueWithoutContribution) {
    this.node = node;
    this.cost = cost;
    this.enqueueWithoutContribution = enqueueWithoutContribution;
  }
  
  public int compareTo(Query query) {
    if (this.cost != query.cost) {
      return this.cost - query.cost;
    }
    return this.enqueueWithoutContribution - query.enqueueWithoutContribution;
  }
}

class Solver {
  final int n, q;
  final int[][] abcs;
  
  Solver(int n, int q, int[][] abcs) {
    this.n = n;
    this.q = q;
    this.abcs = abcs;
  }
  
  public Node calculateNextNode(Node node) {
    return new Node(node.b, (node.a + 1) % n);
  }
  
  public long solve() {
    PriorityQueue<Query> queue = new PriorityQueue<>();
    for (int[] abc : abcs) {
      int a = abc[0];
      int b = abc[1];
      int c = abc[2];
      queue.add(new Query(new Node(a, b), c, 0));
    }
    
    int count = 0;
    long cost = 0;
    UnionFind unionFind = new UnionFind(n);
    Set<Node> visited = new HashSet<>();
    while (count < n - 1) {
      Query query = queue.poll();
      Node node = query.node;
      if (visited.contains(node)) {
        continue;
      }
      visited.add(node);
      boolean contribution = false;
      if (!unionFind.sameGroup(node.a, node.b)) {
        count++;
        cost += query.cost;
        unionFind.merge(node.a, node.b);
        contribution = true;
      }
      
      int nextEnqueueWithoutContribution = contribution ? 0 : query.enqueueWithoutContribution;
      if (nextEnqueueWithoutContribution >= 4) {
        continue;
      }
      
      int nextA = node.b;
      int nextB = (node.a + 1) % n;
      Node nextNode = new Node(nextA, nextB);
      queue.add(new Query(nextNode, query.cost + 1, nextEnqueueWithoutContribution));
    }
    
    return cost;
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int q = reader.nextInt();
    int[][] abcs = reader.nextInt(q, 3);
    out.println(new Solver(n, q, abcs).solve());
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
