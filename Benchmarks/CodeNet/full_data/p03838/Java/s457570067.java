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

class Node implements Comparable<Node> {
  int v;
  long cost;
  
  public Node(int v, long cost) {
    this.v = v;
    this.cost = cost;
  }
  
  public int compareTo(Node node) {
    return Long.compare(this.cost, node.cost);
  }
}

public class Main {
  
  private static long solve(int x, int y) {
    int[] targets = new int[]{x, y, -x, -y, 0};
    PriorityQueue<Node> queue = new PriorityQueue<>();
    HashSet<Integer> visited = new HashSet<>();
    
    queue.add(new Node(x, 0));
    while (!queue.isEmpty()) {
      Node node = queue.poll();
      if (node.v == y) {
        return node.cost;
      }
      visited.add(node.v);
      
      for (int v : targets) {
        if (!visited.contains(v) && node.v < v) {
          queue.add(new Node(v, node.cost + v - node.v));
        }
      }
      if (!visited.contains(-node.v)) {
        queue.add(new Node(-node.v, node.cost + 1));
      }
    }
    throw new RuntimeException();
  }
  
  private static void execute(ContestReader reader, PrintWriter out) {
    int x = reader.nextInt();
    int y = reader.nextInt();
    out.println(solve(x, y));
  }
  
  public static void main(String[] args) {
    ContestReader reader = new ContestReader(System.in);
    PrintWriter out = new PrintWriter(System.out);
    execute(reader, out);
    out.flush();
  }
}

