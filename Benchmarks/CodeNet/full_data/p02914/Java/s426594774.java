import java.io.*;
import java.util.*;

class Solver {
  final int n;
  final long[] as;
  
  Solver(int n, long[] as) {
    this.n = n;
    this.as = as;
  }
  
  public long solve() {
    long nonInterested = 0;
    for (long a : as) {
      nonInterested = nonInterested ^ a;
    }
//    System.err.printf("nonInterested:  %x\n", nonInterested);
    long interested = 0xFFFF_FFFF_FFFF_FFFFL ^ nonInterested;
    
    long[] interestedAs = new long[n];
    for (int i = 0; i < n; i++) {
      interestedAs[i] = interested & as[i];
//      System.err.printf("interestedAs: %d, %x\n", i, interestedAs[i]);
    }
    
    int fixedIndexSize = 0;
    for (int i = 59; i >= 0; i--) {
      /*
      System.err.printf("i: %d\n", i);
      for (int j = 0; j < n; j++) {
        System.err.printf("interestedAs: %d, %x\n", j, interestedAs[j]);
      }
      */
      
      
      boolean find = false;
      for (int j = fixedIndexSize; j < n; j++) {
        if (((interestedAs[j] >> i) & 1) == 1) {
          find = true;
          long temp = interestedAs[j];
          interestedAs[j] = interestedAs[fixedIndexSize];
          interestedAs[fixedIndexSize] = temp;
          break;
        }
      }
      if (!find) {
        continue;
      }
      for (int j = 0; j < n; j++) {
        if (j != fixedIndexSize && ((interestedAs[j] >> i) & 1) == 1) {
          interestedAs[j] = interestedAs[j] ^ interestedAs[fixedIndexSize];
        }
      }
      fixedIndexSize++;
    }
    
    long answer = 0;
    for (long a : interestedAs) {
      answer = answer ^ a;
    }
    return 2 * answer + nonInterested;
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    long[] as = reader.nextLong(n);
    out.println(new Solver(n, as).solve());
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
