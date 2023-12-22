import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int X = sc.nextInt() - 1;
    int Y = sc.nextInt() - 1;
    Map<Integer, Node> map = new HashMap<>();
    for (int i = 0; i < N; i++) {
      map.put(i, new Node(i));
    }
    for (int i = 1; i < N; i++) {
      Node n1 = map.get(i - 1);
      Node n2 = map.get(i);
      n1.adj.add(n2);
      n2.adj.add(n1);
    }
    {
      Node x1 = map.get(X);
      Node y1 = map.get(Y);
      x1.adj.add(y1);
      y1.adj.add(x1);
    }
    int[] ans = new int[N]; // ans for length [0...N-1]
    for (int i = 0; i < N; i++) {
      boolean[] isVisited = new boolean[N];
      Queue<NodeDist> q = new LinkedList<>();
      q.add(new NodeDist(map.get(i), 0));
      while (!q.isEmpty()) {
        NodeDist d = q.poll();
        if (isVisited[d.node.val]) continue;
        isVisited[d.node.val] = true;
        ans[d.dist]++;
        for (Node next : d.node.adj) {
          q.add(new NodeDist(next, d.dist + 1));
        }
      }
    }
    for (int i = 1; i < N; i++) {
      System.out.println(ans[i] / 2);
    }
  }

  static class NodeDist {
    Node node;
    int dist;

    NodeDist(Node n, int d) {
      node = n;
      dist = d;
    }
  }

  static class Node {
    List<Node> adj = new LinkedList<>();
    Integer val;

    Node(Integer i) {
      val = i;
    }
  }
}
