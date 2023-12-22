import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int Q = Integer.parseInt(sc.next());
    List<Node> nodes = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      nodes.add(new Node());
    }
    for (int i = 0; i < N-1; i++) {
      int a = Integer.parseInt(sc.next());
      int b = Integer.parseInt(sc.next());
      nodes.get(a-1).children.add(b);
    }
    
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < Q; i++) {
      int p = Integer.parseInt(sc.next());
      int x = Integer.parseInt(sc.next());
      map.put(p, map.getOrDefault(p, 0)+x);
    }

    //
    dfs(1, nodes, map, map.getOrDefault(1, 0));
    
    for (int i = 0; i < N; i++) {
      System.out.print(nodes.get(i).counter + " ");
    }
    System.out.println();
  }
  
  private static class Node {
    int counter = 0;
    List<Integer> children = new ArrayList<>();
  }
  
  private static void dfs(int n, List<Node> nodes, Map<Integer, Integer> map, int counter) {

    nodes.get(n-1).counter = counter;

    if (nodes.get(n-1).children.isEmpty()) {
      return;
    }

    for (int child : nodes.get(n-1).children) {
      dfs(child, nodes, map, counter + map.getOrDefault(child, 0));
    }
  }
}
