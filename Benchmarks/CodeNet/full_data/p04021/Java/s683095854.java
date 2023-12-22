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

class Node implements Comparable<Node> {
  int a;
  int originalIndex;
  
  Node(int a, int originalIndex) {
    this.a = a;
    this.originalIndex = originalIndex;
  }
  
  public int compareTo(Node node) {
    return this.a - node.a;
  }
}

public class Main {
  private static int solve(int[] as) {
    Node[] nodes = new Node[as.length];
    for (int i = 0; i < as.length; i++) {
      nodes[i] = new Node(as[i], i);
    }
    Arrays.sort(nodes);
    
    int paritySum = 0;
    for (int i = 0; i < nodes.length; i++) {
      if (nodes[i].originalIndex % 2 != i % 2) {
        paritySum++;
      }
    }
    return paritySum / 2;
  }
  
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int[] as = new int[n];
    for (int i = 0; i < n; i++) {
      as[i] = reader.nextInt();
    }
    out.println(solve(as));
  }
  
  public static void main(String[] args) {
    ContestReader reader = new ContestReader(System.in);
    PrintWriter out = new PrintWriter(System.out);
    execute(reader, out);
    out.flush();
  }
}

