import java.io.*;
import java.util.*;

class Solver {
  int a, b, c, d;
  boolean[] map;
  
  private boolean reachable(int src, int dst) {
    if (!map[src] || !map[dst]) {
      return false;
    }
    for (int i = src + 2; i < dst; i++) {
      if (!map[i-1] && !map[i]) {
        return false;
      }
    }
    return true;
  }
  
  private boolean pass(int src, int dst) {
    for (int i = src; i <= dst; i++) {
      if (map[i-1] && map[i] && map[i+1]) {
        return true;
      }
    }
    return false;
  }
  
  public boolean solve(int a, int b, int c, int d, String s) {
    this.a = a;
    this.b = b;
    this.c = c;
    this.d = d;
    this.map = new boolean[s.length()];
    for (int i = 0; i < s.length(); i++) {
      this.map[i] = s.charAt(i) == '.';
    }
    
    if (c == d) {
      return false;
    } else if (c < d) {
      return reachable(a, c) && reachable(b, d);
    } else {
      return reachable(a, c) && reachable(b, d) && pass(b, d);
    }
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int a = reader.nextInt() - 1;
    int b = reader.nextInt() - 1;
    int c = reader.nextInt() - 1;
    int d = reader.nextInt() - 1;
    String s = reader.next();
    
    out.println(new Solver().solve(a, b, c, d, s) ? "Yes" : "No");
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
  
  public int[] nextIntArray(int n) {
    int[] array = new int[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextInt();
    }
    return array;
  }
  
  public long[] nextLongArray(int n) {
    long[] array = new long[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextLong();
    }
    return array;
  }
}

class Algorithm {
  private static void swap(Object[] list, int a, int b) {
    Object tmp = list[a];
    list[a] = list[b];
    list[b] = tmp;
  }
  
  public static <T extends Comparable<? super T>> boolean nextPermutation(T[] ts) {
    int rightMostAscendingOrderIndex = ts.length - 2;
    while (rightMostAscendingOrderIndex >= 0 &&
        ts[rightMostAscendingOrderIndex].compareTo(ts[rightMostAscendingOrderIndex + 1]) >= 0) {
      rightMostAscendingOrderIndex--;
    }
    if (rightMostAscendingOrderIndex < 0) {
      return false;
    }
    
    int rightMostGreatorIndex = ts.length - 1;
    while (ts[rightMostAscendingOrderIndex].compareTo(ts[rightMostGreatorIndex]) >= 0) {
      rightMostGreatorIndex--;
    }
    
    swap(ts, rightMostAscendingOrderIndex, rightMostGreatorIndex);
    for (int i = 0; i < (ts.length - rightMostAscendingOrderIndex - 1) / 2; i++) {
      swap(ts, rightMostAscendingOrderIndex + 1 + i, ts.length - 1 - i);
    }
    return true;
  }
}

