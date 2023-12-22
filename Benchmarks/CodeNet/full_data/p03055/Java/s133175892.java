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
  int index;
  int distance;
  
  Node(int index, int distance) {
    this.index = index;
    this.distance = distance;
  }
  
  public int compareTo(Node node) {
    return this.distance - node.distance;
  }
}

class Solver {
  int n;
  ArrayList<ArrayList<Integer>> edges;
  
  private Node dijkstra(int startIndex) {
    boolean[] visited = new boolean[n + 1];
    PriorityQueue<Node> queue = new PriorityQueue<>();
    Node lastNode = new Node(startIndex, 0);
    queue.add(lastNode);
    
    while (!queue.isEmpty()) {
      Node node = queue.poll();
      if (visited[node.index]) {
        continue;
      }
      visited[node.index] = true;
      lastNode = node;
      for (int nextIndex : edges.get(node.index)) {
        if (visited[nextIndex]) {
          continue;
        }
        queue.add(new Node(nextIndex, node.distance + 1));
      }
    }
    return lastNode;
  }
  
  public String solve(int n, ArrayList<ArrayList<Integer>> edges) {
    this.n = n;
    this.edges = edges;
    
    Node lastNode1 = dijkstra(1);
    Node lastNode2 = dijkstra(lastNode1.index);
    if ((lastNode2.distance + 1) % 3 != 2) {
      return "First";
    } else {
      return "Second";
    }
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
    for (int i = 0; i <= n; i++) {
      edges.add(new ArrayList<>());
    }
    for (int i = 0; i < n-1; i++) {
      int a = reader.nextInt();
      int b = reader.nextInt();
      edges.get(a).add(b);
      edges.get(b).add(a);
    }
    System.out.println(new Solver().solve(n, edges));
  }
  
  public static void main(String[] args) {
    ContestReader reader = new ContestReader(System.in);
    PrintWriter out = new PrintWriter(System.out);
    execute(reader, out);
    out.flush();
  }
}

