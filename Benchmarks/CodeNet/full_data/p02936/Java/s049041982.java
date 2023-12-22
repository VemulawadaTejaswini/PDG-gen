import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int Q = sc.nextInt();
    Node[] map = new Node[N + 1];
    for (int i = 0; i < map.length; i++) {
      map[i] = new Node(i, 0);
    }
    for (int i = 0; i < N - 1; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      map[a].to.add(b);
      map[b].to.add(a);
    }
    int[] X = new int[N + 1];
    for (int i = 0; i < Q; i++) {
      int p = sc.nextInt();
      int x = sc.nextInt();
      X[p] += x;
    }
    boolean[] isVisited = new boolean[N+1];
    Queue<PNode> queue = new ArrayDeque<>();
    queue.add(new PNode(-1, map[1]));
    while (!queue.isEmpty()) {
      PNode pnode = queue.poll();
      Node cur = pnode.me;
      if (isVisited[cur.n]) continue;
      isVisited[cur.n] = true;
      cur.weight += X[cur.n];
      for (Integer next : cur.to) {
        if (next != pnode.paren) {
          map[next].weight += cur.weight;
          queue.add(new PNode(cur.n, map[next]));
        }
      }
    }
    System.out.print(map[1].weight);
    for (int i = 2; i <= N; i++) {
      System.out.print(" " + map[i].weight);
    }
  }

  static class Node {
    int n, weight;
    ArrayList<Integer> to = new ArrayList<>();

    Node(int n, int weight) {
      this.n = n;
      this.weight = weight;
    }
  }
  static class PNode {
    int paren;
    Node me;
    PNode(int paren, Node me) {
      this.paren = paren;
      this.me = me;
    }
  }
}