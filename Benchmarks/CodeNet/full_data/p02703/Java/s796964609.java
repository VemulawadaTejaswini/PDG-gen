import java.io.*;
import java.util.*;

class Node implements Comparable<Node> {
  final int city, silver;
  final long cost;

  Node(int city, int silver, long cost) {
    this.city = city;
    this.silver = silver;
    this.cost = cost;
  }

  public int compareTo(Node node) {
    return Long.compare(this.cost, node.cost);
  }
}

class Edge {
  final int dst, a, b;

  Edge(int dst, int a, int b) {
    this.dst = dst;
    this.a = a;
    this.b = b;
  }
}

class Solver {
  private static final int A_MAX = 50;
  final int n, m, s;
  final int[][] uvabs, cds;

  Solver(int n, int m, int s, int[][] uvabs, int[][] cds) {
    this.n = n;
    this.m = m;
    this.s = s;
    this.uvabs = uvabs;
    this.cds = cds;
  }

  public List<Long> solve() {
    List<List<Edge>> edges = new ArrayList<>();
    for (int i = 0; i <= n; i++) {
      edges.add(new ArrayList<>());
    }
    for (int[] uvab : uvabs) {
      int u = uvab[0];
      int v = uvab[1];
      int a = uvab[2];
      int b = uvab[3];
      edges.get(u).add(new Edge(v, a, b));
      edges.get(v).add(new Edge(u, a, b));
    }

    int aLimit = A_MAX * (n - 1);
    Node initialNode = new Node(1, Math.min(aLimit, s), 0);
    PriorityQueue<Node> queue = new PriorityQueue<>();
    boolean[][] visited = new boolean[n + 1][aLimit + 1];
    long[][] tempCost = new long[n + 1][aLimit + 1];
    long[] costs = new long[n + 1];

    int count = 0;
    queue.add(initialNode);
    Arrays.fill(costs, Long.MAX_VALUE);
    for (long[] array : tempCost) {
      Arrays.fill(array, Long.MAX_VALUE);
    }
    while (!queue.isEmpty()) {
      Node node = queue.poll();
      int city = node.city;
      int silver = node.silver;
      long cost = node.cost;
      if (visited[city][silver]) {
        continue;
      }
      visited[city][silver] = true;
      if (costs[city] == Long.MAX_VALUE) {
        costs[city] = cost;
        count++;
      }
      if (count >= n) {
        break;
      }
      for (Edge edge : edges.get(city)) {
        int next = edge.dst;
        int a = edge.a;
        int b = edge.b;
        int nextSilver = silver - a;
        long nextCost = cost + b;
        if (nextSilver < 0 || visited[next][nextSilver] || tempCost[next][nextSilver] <= nextCost) {
          continue;
        }
        tempCost[next][nextSilver] = nextCost;
        queue.add(new Node(next, silver - a, cost + b));
      }
      int c = cds[city - 1][0];
      long d = cds[city - 1][1];
      for (int i = 1; true; i++) {
        int nextSilver = Math.min(silver + c * i, aLimit);
        long nextCost = cost + d * i;
        if (!visited[city][nextSilver] && nextCost < tempCost[city][nextSilver]) {
          queue.add(new Node(city, nextSilver, nextCost));
          tempCost[city][nextSilver] = nextCost;
        }
        if (nextSilver >= aLimit) {
          break;
        }
      }
    }
    List<Long> answers = new ArrayList<>();
    for (int i = 2; i <= n; i++) {
      answers.add(costs[i]);
    }
    return answers;
  }
}

public class Main {
  private static void execute(ContestReader reader, ContestWriter out) {
    int n = reader.nextInt();
    int m = reader.nextInt();
    int s = reader.nextInt();
    int[][] uvabs = reader.nextInt(m, 4);
    int[][] cds = reader.nextInt(n, 2);
    out.printList(new Solver(n, m, s, uvabs, cds).solve());
  }
  
  public static void main(String[] args) {
    ContestReader reader = new ContestReader(System.in);
    ContestWriter out = new ContestWriter(System.out);
    execute(reader, out);
    out.flush();
  }
}

class ContestWriter extends PrintWriter {
  ContestWriter(PrintStream printeStream) {
    super(printeStream);
  }

  public void printList(List<? extends Object> list) {
    for (Object object : list) {
      println(object);
    }
  }

  public void printListOneLine(List<? extends Object> list) {
    List<String> stringList = new ArrayList<>();
    for (Object object : list) {
      stringList.add(object.toString());
    }
    println(String.join(" ", stringList));
  }
}

class ContestReader {
  private static final int BUFFER_SIZE = 1024;
  
  private final InputStream stream;
  private final byte[] buffer;
  private int pointer;
  private int bufferLength;
  
  ContestReader(InputStream stream) {
    this.stream = stream;
    this.buffer = new byte[BUFFER_SIZE];
    this.pointer = 0;
    this.bufferLength = 0;
  }
  
  private boolean hasNextByte() {
    if (pointer < bufferLength) {
      return true;
    }
    
    pointer = 0;
    try {
      bufferLength = stream.read(buffer);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    return bufferLength > 0;
  }
  
  private int readByte() {
    if (hasNextByte()) {
      return buffer[pointer++];
    } else {
      return -1;
    }
  }
  
  private static boolean isPrintableChar(int c) {
    return 33 <= c && c <= 126;
  }
  
  public boolean hasNext() {
    while (hasNextByte() && !isPrintableChar(buffer[pointer])) {
      pointer++;
    }
    return hasNextByte();
  }
  
  public String next() {
    if (!hasNext()) {
      throw new NoSuchElementException();
    }
    StringBuilder sb = new StringBuilder();
    while(true) {
      int b = readByte();
      if (!isPrintableChar(b)) {
        break;
      }
      sb.appendCodePoint(b);
    }
    return sb.toString();
  }
  
  public String nextLine() {
    if (!hasNext()) {
      throw new NoSuchElementException();
    }
    StringBuilder sb = new StringBuilder();
    while(true) {
      int b = readByte();
      if (!isPrintableChar(b) && b != 0x20) {
        break;
      }
      sb.appendCodePoint(b);
    }
    return sb.toString();
  }
  
  public char nextChar() {
    return next().charAt(0);
  }
  
  public int nextInt() {
    if (!hasNext()) {
      throw new NoSuchElementException();
    }
    
    int n = 0;
    boolean minus = false;
    
    {
      int b = readByte();
      if (b == '-') {
        minus = true;
      } else if ('0' <= b && b <= '9') {
        n = b - '0';
      } else {
        throw new NumberFormatException();
      }
    }
    
    while(true){
      int b = readByte();
      if ('0' <= b && b <= '9') {
        n *= 10;
        n += b - '0';
      } else if (b == -1 || !isPrintableChar(b)) {
        return minus ? -n : n;
      } else {
        throw new NumberFormatException();
      }
    }
  }
  
  public long nextLong() {
    if (!hasNext()) {
      throw new NoSuchElementException();
    }
    
    long n = 0;
    boolean minus = false;
    
    {
      int b = readByte();
      if (b == '-') {
        minus = true;
      } else if ('0' <= b && b <= '9') {
        n = b - '0';
      } else {
        throw new NumberFormatException();
      }
    }
    
    while(true){
      int b = readByte();
      if ('0' <= b && b <= '9') {
        n *= 10;
        n += b - '0';
      } else if (b == -1 || !isPrintableChar(b)) {
        return minus ? -n : n;
      } else {
        throw new NumberFormatException();
      }
    }
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
  
  public String[] nextLine(int n) {
    String[] array = new String[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextLine();
    }
    return array;
  }
  
  public char[] nextChar(int n) {
    char[] array = new char[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextChar();
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
  
  public String[][] next(int n, int m) {
    String[][] matrix = new String[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = next();
      }
    }
    return matrix;
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
  
  public char[][] nextChar(int n, int m) {
    char[][] matrix = new char[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = nextChar();
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
