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
}

class Solver {
  int n;
  long x;
  long[] as;
  
  private long[] createNextRangeMin(long[] rangeMin, int numShift) {
    long[] nextRangeMin = new long[n];
    for (int i = 0; i < n; i++) {
      nextRangeMin[i] = Math.min(rangeMin[i], as[(i - numShift + n) % n]);
    }
    return nextRangeMin;
  }
  
  public long solve(int n, long x, long[] as) {
    this.n = n;
    this.x = x;
    this.as = as;
    
    long[] previousRangeMin = as;
    long answer = Long.MAX_VALUE;
    for (int numShift = 0; numShift < n; numShift++) {
      long[] rangeMin = createNextRangeMin(previousRangeMin, numShift);
      long sumCreateCost = 0;
      for (long min : rangeMin) {
        sumCreateCost += min;
      }
      answer = Math.min(answer, sumCreateCost + x * numShift);
      previousRangeMin = rangeMin;
    }
    return answer;
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    long x = reader.nextLong();
    long[] as = new long[n];
    for (int i = 0; i < n; i++) {
      as[i] = reader.nextLong();
    }
    out.println(new Solver().solve(n, x, as));
  }
  
  public static void main(String[] args) {
    ContestReader reader = new ContestReader(System.in);
    PrintWriter out = new PrintWriter(System.out);
    execute(reader, out);
    out.flush();
  }
}

