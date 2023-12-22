import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    Node[] nodes = new Node[n+1];
    for(int i = 1; i <= n; i++) {
      nodes[i] = new Node(i);
    }
    for(int i = 0; i < m; i++) {
      int node1 = sc.nextInt();
      int node2 = sc.nextInt();
      nodes[node1].edges.add(node2);
      nodes[node2].edges.add(node1);
    }
    if(m % 2 == 1 || m % 2 == 1) {
      System.out.println(-1);
      return;
    }
    boolean flag = true;
    for(int i = 1; i <= n; i++) {
      Node node = nodes[i];
      if(node.edges.size() % 2 == 0) {
        flag = false;
        break;
      }
    }
    if(flag) {
      System.out.println(-1);
      return;
    }
    PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> a.edges.size() - b.edges.size());
    for(int i = 1; i <= n; i++) {
      pq.add(nodes[i]);
    }
    while(!pq.isEmpty()) {
      Node node = pq.remove();
      HashSet<Integer> set = node.edges;
      if(set.size() == 0) continue;
      ArrayList<Integer> list = new ArrayList<>(set);
      if(set.size() == 1) {
        int node1 = node.num;
        for(int node2: list) {
          System.out.println(node2 + " " + node1);
          nodes[node2].edges.remove(node1);
          nodes[node1].edges.remove(node2);
        }
        continue;
      }
      if(set.size() % 2 == 0) {
        int node1 = node.num;
        for(int node2: list) {
          System.out.println(node1 + " " + node2);
          nodes[node1].edges.remove(node2);
          nodes[node2].edges.remove(node1);
        }
      } else {
        pq.add(node);
      }
    }
  }

  public static class Node {
    int num;
    HashSet<Integer> edges;
    Node(int num) {
       this.num = num;
       edges = new HashSet<>();
    }
  }
}