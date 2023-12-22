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

public class Main {
  private static long solve(long a, long b, long c) {
    if (a % 2 == 0 || b % 2 == 0 || c % 2 == 0) {
      return 0;
    }
    long[] as = new long[]{a, b, c};
    Arrays.sort(as);
    return as[0] * as[1];
  }
  
  private static void execute(ContestReader reader, PrintWriter out) {
    long a = reader.nextLong();
    long b = reader.nextLong();
    long c = reader.nextLong();
    out.println(solve(a, b, c));
  }
  
  public static void main(String[] args) {
    ContestReader reader = new ContestReader(System.in);
    PrintWriter out = new PrintWriter(System.out);
    execute(reader, out);
    out.flush();
  }
}

