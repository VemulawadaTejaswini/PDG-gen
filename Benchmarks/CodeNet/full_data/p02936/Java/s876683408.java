import java.util.*;
import java.io.*;

public class Main {

  static boolean[] visited;
  static int[] point;
  static List<Integer>[] tree;

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int Q = sc.nextInt();
    visited = new boolean[N];
    point = new int[N];
    tree = new List[N];

    for (int i = 0; i < N; i++) {
      tree[i] = new ArrayList<>();
    }

    for (int i = 0; i < N - 1; i++) {
      int a = sc.nextInt() - 1;
      int b = sc.nextInt() - 1;
      tree[a].add(b);
      tree[b].add(a);
    }

    for (int i = 0; i < Q; i++) {
      int p = sc.nextInt() - 1;
      int x = sc.nextInt();
      point[p] += x;
    }

    sc.close();

    dfs(0);

    PrintWriter out = new PrintWriter(System.out);
    
    out.print(point[0]);

    for (int i = 1; i < N; i++) {
      out.print(" ");
      out.print(point[i]);
    }

    out.println("");

    out.flush();

  }

  static void dfs(int parent) {

    visited[parent] = true;
    
    List<Integer> next_ = tree[parent];
    
    for (int id_ : next_) {
      if (!visited[id_]) {
        point[id_] += point[parent];
        dfs(id_);
      }
    }

  }

}