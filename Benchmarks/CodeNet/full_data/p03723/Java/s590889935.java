import java.io.*;
import java.util.*;

class State {
  long a;
  long b;
  long c;
  
  State(long a, long b, long c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }
  
  public boolean hasOdd() {
    return a % 2 == 1 || b % 2 == 1 || c % 2 == 1;
  }
  
  public State next() {
    return new State(
      b / 2 + c / 2,
      c / 2 + a / 2,
      a / 2 + b / 2
    );
  }
  
  public int hashCode() {
    long code = 0;
    code += a;
    code *= 1000000007;
    code += b;
    code *= 1000000007;
    code += c;
    return Long.hashCode(code);
  }
  
  public boolean equals(Object object) {
    State s = (State)object;
    return this.a == s.a && this.b == s.b && this.c == s.c;
  }
}

public class Main {
  private static int solve(long a, long b, long c) {
    HashSet<State> set = new HashSet<>();
    State s = new State(a, b, c);
    int operations = 0;
    while (!s.hasOdd()) {
      operations++;
      State next = s.next();
      if (set.contains(next)) {
        return -1;
      }
      set.add(next);
      s = next;
    }
    return operations;
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

