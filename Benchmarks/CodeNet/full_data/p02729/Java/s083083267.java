import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

class Main {
  FastScanner in = new FastScanner(System.in);
  PrintWriter out = new PrintWriter(System.out);

  public static void main(String[] args) {
    new Main().calc();
  }

  public void calc() {
    int M = in.nextInt();
    int N = in.nextInt();
    int m = 0;
    if (M >= 2) {
      m = (M * (M - 1)) / 2;
    }
    int n = 0;
    if (N >= 2) {
      n = (N * (N - 1)) / 2;
    }
    out.println(m + n);
    out.close();
  }

  class FastScanner {
    private InputStream stream;
    private byte[] buf = new byte[1024];
    private int curChar;
    private int numChars;
  
    public FastScanner(InputStream stream) {
      this.stream = stream;
    }
  
    int read() {
      if (numChars == -1)
        throw new InputMismatchException();
      if (curChar >= numChars) {
        curChar = 0;
        try {
          numChars = stream.read(buf);
        } catch (IOException e) {
          throw new InputMismatchException();
        }
        if (numChars <= 0) 
          return 1;
      }
      return buf[curChar++];
    }
  
    boolean isSpaceChar(int c) {
      return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }
  
    boolean isEndline(int c) {
        return c == '\n' || c == '\r' || c == -1;
    }
  
    String next() {
      int c = read();
      while(isSpaceChar(c)) {
        c = read();
      }
      StringBuilder res = new StringBuilder();
      do {
        res.appendCodePoint(c);
        c = read();
      } while (!isSpaceChar(c));
      return res.toString();
    }
  
    int nextInt() {
      return Integer.parseInt(next());
    }
  
    int[] nextIntArray(int n) {
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = nextInt();
      }
      return arr;
    }
  
    int[][] nextIntMap(int n, int m) {
      int[][] map = new int[n][m];
      for (int i = 0; i < n; i++) {
          map[i] = in.nextIntArray(m);
      }
      return map;
    }
  
    long nextLong() {
        return Long.parseLong(next());
    }
  
    long[] nextLongArray(int n) {
        long[] array = new long[n];
        for (int i = 0; i < n; i++)
            array[i] = nextLong();
  
        return array;
    }
  
    long[][] nextLongMap(int n, int m) {
        long[][] map = new long[n][m];
        for (int i = 0; i < n; i++) {
            map[i] = in.nextLongArray(m);
        }
        return map;
    }
  
    double nextDouble() {
        return Double.parseDouble(next());
    }
  
    double[] nextDoubleArray(int n) {
        double[] array = new double[n];
        for (int i = 0; i < n; i++)
            array[i] = nextDouble();
  
        return array;
    }
  
    double[][] nextDoubleMap(int n, int m) {
        double[][] map = new double[n][m];
        for (int i = 0; i < n; i++) {
            map[i] = in.nextDoubleArray(m);
        }
        return map;
    }
  
    String[] nextStringArray(int n) {
      String[] array = new String[n];
      for (int i = 0; i < n; i++)
          array[i] = next();
  
      return array;
    }
  
    String nextLine() {
        int c = read();
        while (isEndline(c))
            c = read();
        StringBuilder res = new StringBuilder();
        do {
            res.appendCodePoint(c);
            c = read();
        } while (!isEndline(c));
        return res.toString();
    }
  }
}