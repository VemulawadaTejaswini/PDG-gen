import java.io.*;
import java.util.*;

class Monster implements Comparable<Monster> {
  final long x, h;
  
  Monster(long x, long h) {
    this.x = x;
    this.h = h;
  }
  
  public int compareTo(Monster monster) {
    return Long.compare(this.x, monster.x);
  }
}

public class Main {
  private static long solve(int n, long d, long a, long[][] xhs) {
    List<Monster> monsters = new ArrayList<>();
    for (long[] xh : xhs) {
      monsters.add(new Monster(xh[0], xh[1]));
    }
    Collections.sort(monsters);
    
    int leftIndex = 0;
    int rightIndex = 0;
    long totalDamage = 0;
    long[] recovers = new long[n + 1];
    long answer = 0;
    while (leftIndex < n) {
      while (rightIndex < n && monsters.get(rightIndex).x <= monsters.get(leftIndex).x + 2 * d) {
        rightIndex++;
      }
      long count = (monsters.get(leftIndex).h - totalDamage + a - 1) / a;
      answer += count;
      totalDamage += a * count;
      recovers[rightIndex] += a * count;
      leftIndex++;
      while (leftIndex < n) {
        totalDamage -= recovers[leftIndex];
        if (monsters.get(leftIndex).h > 0) {
          break;
        }
      }
    }
    return answer;
  }
  
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    long d = reader.nextLong();
    long a = reader.nextLong();
    long[][] xhs = reader.nextLong(n, 2);
    out.println(solve(n, d, a, xhs));
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
