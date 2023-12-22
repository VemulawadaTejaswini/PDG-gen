import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
  static int[] X;

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
      int a1 = Math.min(a, b);
      int b1 = Math.max(a, b);
      map[a1].to.add(b1);
    }
    X = new int[N + 1];
    for (int i = 0; i < Q; i++) {
      int p = sc.nextInt();
      int x = sc.nextInt();
      X[p] += x;
    }
    Queue<Node> queue = new ArrayDeque<>();
    queue.add(map[1]);
    while (!queue.isEmpty()) {
      Node cur = queue.poll();
      cur.weight += X[cur.n];
      for (Integer next : cur.to) {
        map[next].weight += cur.weight;
        queue.add(map[next]);
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
}