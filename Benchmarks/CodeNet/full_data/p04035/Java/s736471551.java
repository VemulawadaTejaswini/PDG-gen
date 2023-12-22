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
  private static ArrayList<String> solve(long l, long[] as) {
    ArrayList<String> answer = new ArrayList<String>();
    for (int i = 1; i < as.length; i++) {
      if (as[i-1] + as[i] >= l) {
        answer.add("Possible");
        for (int k = 1; k < i; k++) {
          answer.add("" + k);
        }
        for (int k = as.length - 1; k > i; k--) {
          answer.add("" + k);
        }
        answer.add("" + i);
        return answer;
      }
    }
    answer.add("Impossible");
    return answer;
  }
  
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    long l = reader.nextLong();
    long[] as = new long[n];
    for (int i = 0; i < n; i++) {
      as[i] = reader.nextLong();
    }
    
    ArrayList<String> answer = solve(l, as);
    for (String s : answer) {
      out.println(s);
    }
  }
  
  public static void main(String[] args) {
    ContestReader reader = new ContestReader(System.in);
    PrintWriter out = new PrintWriter(System.out);
    execute(reader, out);
    out.flush();
  }
}

