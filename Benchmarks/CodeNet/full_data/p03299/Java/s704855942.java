import java.io.*;
import java.util.*;

class Node {
  final int height;
  long numPure;
  long numNonPure;
  
  Node(int height, long numPure, long numNonPure) {
    this.height = height;
    this.numPure = numPure;
    this.numNonPure = numNonPure;
  }
}

class Solver {
  private final ModCalculator mc = new ModCalculator(1_000_000_007L);
  final int n;
  final int[] hs;
  
  Solver(int n, int[] hs) {
    this.n = n;
    this.hs = hs;
  }
  
  private Node createNewNode(int height, List<Node> newMergedNode, int newPileCount) {
    /*
    System.err.println();
    for (Node node : newMergedNode) {
      System.err.printf("%d %d\n", node.numPure, node.numNonPure);
    }
    System.err.println();
    System.err.println(newPileCount);
    System.err.println();
    */
    
    long newNumPure = 2;
    for (Node node : newMergedNode) {
      newNumPure = mc.mul(newNumPure, node.numPure);
    }
//    System.err.println(newNumPure);
    
    long newNumNonPure = mc.pow(2, newPileCount);
    for (Node node : newMergedNode) {
      newNumNonPure = mc.mul(newNumNonPure, mc.add(mc.mul(2, node.numPure), node.numNonPure));
    }
//    System.err.println(newNumNonPure);
    newNumNonPure = mc.sub(newNumNonPure, newNumPure);
//    System.err.println(newNumNonPure);
    
    return new Node(height, newNumPure, newNumNonPure);
  }
  
  public long solve() {
    Set<Integer> hSet = new HashSet<>();
//    hSet.add(0);
    for (int h : hs) {
      hSet.add(h);
    }
    if (!hSet.contains(1)) {
      hSet.add(1);
    }
    List<Integer> uniqueHList = new ArrayList<>();
    for (int h : hSet) {
      uniqueHList.add(h);
    }
    Collections.sort(uniqueHList);
    
    List<Node> nodeList = new ArrayList<>();
    nodeList.add(new Node(-1, 0, 0));
    for (int i = 0; i < n; i++) {
      nodeList.add(new Node(hs[i], 0, 0));
    }
    nodeList.add(new Node(-1, 0, 0));
    
    int prevHeight = Integer.MAX_VALUE;
    for (int i = uniqueHList.size() - 1; i >= 0; i--) {
      /*
      for (Node node : nodeList) {
        System.err.printf("%d %d %d\n", node.height, node.numPure, node.numNonPure);
      }
      System.err.println();
      */
      
      
      int height = uniqueHList.get(i);
      int diffHeight = prevHeight - height;
      long mul = mc.pow(2, diffHeight - 1);
//      System.err.printf("mul: %d\n", mul);
      for (Node node : nodeList) {
        node.numPure = mc.mul(node.numPure, mul);
      }
      
      List<Node> nextNodeList = new ArrayList<>();
      
      int newPileCount = 0;
      List<Node> newMergedNode = new ArrayList<>();
      for (Node node : nodeList) {
        if (node.height > height) {
          newMergedNode.add(node);
        } else if (node.height == height) {
          newPileCount++;
        } else if (newMergedNode.size() > 0 || newPileCount > 0) {
          nextNodeList.add(createNewNode(height, newMergedNode, newPileCount));
          newPileCount = 0;
          newMergedNode = new ArrayList<>();
          nextNodeList.add(node);
        } else {
          nextNodeList.add(node);
        }
      }
      
      nodeList = nextNodeList;
      prevHeight = height;
    }
    return mc.add(nodeList.get(1).numPure, nodeList.get(1).numNonPure);
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int[] hs = reader.nextInt(n);
    out.println(new Solver(n, hs).solve());
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

class ModCalculator {
  private final long mod;
  private final ModCombinationCache modCombinationCache;
  
  ModCalculator(long mod) {
    this.mod = mod;
    this.modCombinationCache = new ModCombinationCache();
  }
  
  public long add(long a, long b) {
    return (a + b) % mod;
  }
  
  public long sub(long a, long b) {
    return (a - b + mod) % mod;
  }
  
  public long mul(long a, long b) {
    return (a * b) % mod;
  }
  
  public long pow(long a, long b) {
    if (b == 0) {
      return 1;
    }
    long v = pow(mul(a, a), b / 2);
    if (b % 2 == 1) {
      return mul(v, a);
    } else {
      return v;
    }
  }
  
  public long inverse(long a) {
    return pow(a, mod - 2);
  }
  
  public long div(long a, long b) {
    return mul(a, inverse(b));
  }
  
  public long getF(int n) {
    return modCombinationCache.getF(n);
  }
  
  public long getP(int n, int r) {
    return modCombinationCache.getP(n, r);
  }
  
  public long getC(int n, int k) {
    return modCombinationCache.getC(n, k);
  }
  
  class ModCombinationCache {
    private final List<Long> factorialCache;
    private final List<Long> factorialInverseCache;
    
    public ModCombinationCache() {
      factorialCache = new ArrayList<>();
      factorialCache.add(1L);
      factorialInverseCache = new ArrayList<>();
      factorialInverseCache.add(1L);
    }
    
    private void resize(int n) {
      for (int i = factorialCache.size() - 1; i < n; i++) {
        long v = mul(factorialCache.get(i), i + 1);
        factorialCache.add(v);
        factorialInverseCache.add(inverse(v));
      }
    }
    
    long getF(int n) {
      resize(n);
      return factorialCache.get(n);
    }
    
    long getP(int n, int r) {
      resize(n);
      return mul(factorialCache.get(n), factorialInverseCache.get(n - r));
    }
    
    long getC(int n, int k) {
      resize(n);
      return mul(factorialCache.get(n), mul(factorialInverseCache.get(k), factorialInverseCache.get(n-k)));
    }
  }
}
