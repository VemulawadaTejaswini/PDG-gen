import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Node[] nodes = new Node[200_001];
    for (int i = 0; i < 200_001; i++) nodes[i] = new Node(i);
    int N = scanner.nextInt();
    for (int i = 0; i < N; i++) {
      int x = scanner.nextInt();
      int y = scanner.nextInt() + 100_000;
      nodes[x].adjacents.add(nodes[y]);
      nodes[y].adjacents.add(nodes[x]);
    }

    boolean[] visited = new boolean[200_001];
    long res = 0;
    for (int i = 0; i < 200_001; i++) {
      if (!visited[i]) {
        Result result = new Result();
        dfs(nodes[i], visited, result);
        res += (long) result.nx * result.ny - result.m / 2;
      }
    }
    System.out.println(res);
  }

  private static void dfs(Node node, boolean[] visited, Result result) {
    visited[node.id] = true;
    if (node.id <= 100_000) result.nx++;
    else result.ny++;
    for (Node n : node.adjacents) {
      result.m++;
      if (!visited[n.id]) {
        dfs(n, visited, result);
      }
    }
  }

  private static class Result {
    int nx;
    int ny;
    int m;
  }

  private static class Node {
    private final int id;
    private List<Node> adjacents = new ArrayList<>();
    public Node(int id) {
      this.id = id;
    }
  }
}
