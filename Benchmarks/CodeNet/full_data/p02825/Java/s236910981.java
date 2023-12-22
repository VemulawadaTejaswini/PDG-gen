import java.io.*;
import java.util.*;

class Solver {
  final int n;
  
  Solver(int n) {
    this.n = n;
  }
  
  private List<String> solve3() {
    List<String> answers = new ArrayList<>();
    for (int i = 0; i < n; i += 3) {
      StringBuffer sb0 = new StringBuffer();
      StringBuffer sb1 = new StringBuffer();
      StringBuffer sb2 = new StringBuffer();
      for (int j = 0; j < n; j += 3) {
        sb0.append("aab");
        sb1.append("c.b");
        sb2.append("cdd");
      }
      answers.add(sb0.toString());
      answers.add(sb1.toString());
      answers.add(sb2.toString());
    }
    return answers;
  }
  
  private List<String> solve4() {
    List<String> answers = new ArrayList<>();
    for (int i = 0; i < n; i += 4) {
      StringBuffer sb0 = new StringBuffer();
      StringBuffer sb1 = new StringBuffer();
      StringBuffer sb2 = new StringBuffer();
      StringBuffer sb3 = new StringBuffer();
      for (int j = 0; j < n; j += 4) {
        sb0.append("aacd");
        sb1.append("bbcd");
        sb2.append("efgg");
        sb3.append("efhh");
      }
      answers.add(sb0.toString());
      answers.add(sb1.toString());
      answers.add(sb2.toString());
      answers.add(sb3.toString());
    }
    return answers;
  }
  
  private List<String> solve7() {
    List<String> answers = new ArrayList<>();
    for (int i = 0; i < n; i += 7) {
      StringBuffer sb0 = new StringBuffer();
      StringBuffer sb1 = new StringBuffer();
      StringBuffer sb2 = new StringBuffer();
      StringBuffer sb3 = new StringBuffer();
      StringBuffer sb4 = new StringBuffer();
      StringBuffer sb5 = new StringBuffer();
      StringBuffer sb6 = new StringBuffer();
      for (int j = 0; j < n; j += 7) {
        sb0.append(".aabbaa");
        sb1.append("accd...");
        sb2.append("ad.d...");
        sb3.append("bdcc...");
        sb4.append("b...ccd");
        sb5.append("a...d.d");
        sb6.append("a...dcc");
      }
      answers.add(sb0.toString());
      answers.add(sb1.toString());
      answers.add(sb2.toString());
      answers.add(sb3.toString());
      answers.add(sb4.toString());
      answers.add(sb5.toString());
      answers.add(sb6.toString());
    }
    return answers;
  }
  
  public List<String> solve() {
    if (n % 3 == 0) {
      return solve3();
    }
    if (n % 4 == 0) {
      return solve4();
    }
    if (n % 7 == 0) {
      return solve7();
    }
    return Arrays.asList("-1");
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    for (String line : new Solver(n).solve()) {
      out.println(line);
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
