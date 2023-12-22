import java.io.*;
import java.util.*;

class CharSequence {
  final char[] cs;
  
  CharSequence(char[] cs) {
    this.cs = cs;
  }
  
  public char get(int index) {
    if (index < cs.length) {
      return cs[index];
    }
    return 'a' - 1;
  }
}

class CompressedTrieNode {
  final CompressedTrieNode[] children;
  final int depth;
  final int count;
  
  private CompressedTrieNode(CompressedTrieNode[] children, int depth, int count) {
    this.children = children;
    this.depth = depth;
    this.count = count;
  }
  
  public int countLower(CharSequence cs, char[] order) {
    char c = cs.get(depth);
    if (children == null || c < 'a') {
      return 0;
    }
    int sum = children[0].count;
    for (char lowerC : order) {
      if (lowerC == c) {
        break;
      }
      sum += children[lowerC - 'a' + 1].count;
    }
    
    return sum + children[c - 'a' + 1].countLower(cs, order);
  }
  
  private static CompressedTrieNode create(CharSequence[] cm, int depth, int begin, int end) {
    int count = end - begin;
    if (count <= 1) {
      return new CompressedTrieNode(null, depth + 1, count);
    }
    
    while (true) {
      final int finalDepth = depth;
      Arrays.sort(cm, begin, end, new Comparator<CharSequence>(){
        public int compare(CharSequence cs1, CharSequence cs2) {
          return cs1.get(finalDepth) - cs2.get(finalDepth);
        }
      });
      if (cm[begin].get(finalDepth) != cm[end - 1].get(finalDepth)) {
        break;
      }
      depth++;
    }
    CompressedTrieNode[] children = new CompressedTrieNode[27];
    int nextBegin = begin;
    for (int i = 0; i < 27; i++) {
      while (nextBegin < end && cm[nextBegin].get(depth) - 'a' + 1 <= i) {
        nextBegin++;
      }
      children[i] = create(cm, depth + 1, begin, nextBegin);
      begin = nextBegin;
    }
    
    return new CompressedTrieNode(children, depth, count);
  }
  
  public static CompressedTrieNode create(CharSequence[] cm) {
    CharSequence[] copyCm = new CharSequence[cm.length];
    for (int i = 0; i < cm.length; i++) {
      copyCm[i] = cm[i];
    }
    return create(copyCm, 0, 0, cm.length); 
  }
}

class Solver {
  final int n;
  final char[][] csm;
  final int q;
  final int[] ks;
  final char[][] pm;
  
  Solver(int n, char[][] csm, int q, int[] ks, char[][] pm) {
    this.n = n;
    this.csm = csm;
    this.q = q;
    this.ks = ks;
    this.pm = pm;
  }
  
  public int[] solve() {
    CharSequence[] cm = new CharSequence[n];
    for (int i = 0; i < n; i++) {
      cm[i] = new CharSequence(csm[i]);
    }
    CompressedTrieNode compressedTrieNode = CompressedTrieNode.create(cm);
    
    int[] answers = new int[q];
    for (int i = 0; i < q; i++) {
      answers[i] = compressedTrieNode.countLower(cm[ks[i] - 1], pm[i]) + 1;
    }
    return answers;
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    char[][] csm = reader.nextCharArray(n);
    int q = reader.nextInt();
    int[] ks = new int[q];
    char[][] pm = new char[q][];
    for (int i = 0; i < q; i++) {
      ks[i] = reader.nextInt();
      pm[i] = reader.nextCharArray();
    }
    for (int answer : new Solver(n, csm, q, ks, pm).solve()) {
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
