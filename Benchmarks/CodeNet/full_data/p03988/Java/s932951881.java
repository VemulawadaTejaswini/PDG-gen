import java.io.*;
import java.util.*;

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

class Solver {
  private boolean solveEven(int minA, int maxA, int[] counter) {
    if (minA * 2 != maxA) {
      return false;
    }
    if (counter[minA] != 1) {
      return false;
    }
    for (int i = minA + 1; i <= maxA; i++) {
      if (counter[i] < 2) {
        return false;
      }
    }
    return true;
  }
  
  private boolean solveOdd(int minA, int maxA, int[] counter) {
    if (minA * 2 - 1 != maxA) {
      return false;
    }
    for (int i = minA; i <= maxA; i++) {
      if (counter[i] < 2) {
        return false;
      }
    }
    return true;
  }
  
  public boolean solve(int[] as) {
    int[] counter = new int[as.length];
    int maxA = 0;
    int minA = Integer.MAX_VALUE;
    for (int a : as) {
      counter[a]++;
      maxA = Math.max(maxA, a);
      minA = Math.min(minA, a);
    }
    
    if (maxA == 1) {
      return counter[maxA] == 2;
    } else if (maxA % 2 == 0) {
      return solveEven(minA, maxA, counter);
    } else {
      return solveOdd(minA, maxA, counter);
    }
  }
}

public class Main {
  
  
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int[] a = reader.nextIntArray(n);
    out.println(new Solver().solve(a) ? "Possible" : "Impossible");
  }
  
  public static void main(String[] args) {
    ContestReader reader = new ContestReader(System.in);
    PrintWriter out = new PrintWriter(System.out);
    execute(reader, out);
    out.flush();
  }
}

