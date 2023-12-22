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
  private static String solve(String text) {
    boolean hasN = text.contains("N");
    boolean hasW = text.contains("W");
    boolean hasS = text.contains("S");
    boolean hasE = text.contains("E");
    if (hasN == hasS && hasW == hasE) {
      return "Yes";
    } else {
      return "No";
    }
  }
  
  private static void execute(ContestReader reader, PrintWriter out) {
    String text = reader.next();
    out.println(solve(text));
  }
  
  public static void main(String[] args) {
    ContestReader reader = new ContestReader(System.in);
    PrintWriter out = new PrintWriter(System.out);
    execute(reader, out);
    out.flush();
  }
}

