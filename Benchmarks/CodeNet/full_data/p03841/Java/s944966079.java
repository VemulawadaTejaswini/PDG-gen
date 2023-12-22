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

class Pair implements Comparable<Pair> {
  int v;
  int x;
  
  Pair(int v, int x) {
    this.v = v;
    this.x = x;
  }
  
  public int compareTo(Pair p) {
    return this.x - p.x;
  }
}

class Node {
  int v;
  int counts;
  boolean front;
  
  Node(int v, int counts, boolean front) {
    this.v = v;
    this.counts = counts;
    this.front = front;
  }
}

class Solver {
  public int[] solve(int n, int[] x) {
    int[] output = new int[n*n];
    Pair[] pairs = new Pair[n];
    for (int i = 0; i < n; i++) {
      pairs[i] = new Pair(i + 1, x[i]);
      output[x[i] - 1] = i + 1;
    }
    Arrays.sort(pairs);
    
    ArrayDeque<Node> queue = new ArrayDeque<>();
    for (int i = 0; i < pairs.length; i++) {
      int v = pairs[i].v;
      if (v - 1 > 0) {
        queue.addLast(new Node(v, v - 1, true));
      }
    }
    for (int i = 0; i < pairs.length; i++) {
      int v = pairs[i].v;
      if (n - v > 0) {
        queue.addLast(new Node(v, n - v, false));
      }
    }
    
    for (int i = 0; i < n*n; i++) {
      if (output[i] > 0) {
        continue;
      }
      
      Node node = queue.peekFirst();
      if (i < x[node.v - 1] != node.front) {
        return null;
      }
      output[i] = node.v;
      node.counts--;
      if (node.counts == 0) {
        queue.pollFirst();
      }
    }
    return output;
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int[] x = reader.nextIntArray(n);
    int[] answer = new Solver().solve(n, x);
    if (answer != null) {
      out.println("Yes");
      out.print(answer[0]);
      for (int i = 1; i < answer.length; i++) {
        out.print(" ");
        out.print(answer[i]);
      }
      out.println();
    } else {
      out.println("No");
    }
  }
  
  public static void main(String[] args) {
    ContestReader reader = new ContestReader(System.in);
    PrintWriter out = new PrintWriter(System.out);
    execute(reader, out);
    out.flush();
  }
}

