// http://kmjp.hatenablog.jp/entry/2019/09/28/1030

import java.util.*;

public class Main {
  static Map<Integer, List<Integer>> edgeE = new HashMap<>();
  static List<Integer> V = new ArrayList<>();
  static List<Integer> C = new ArrayList<>();
  static int[] id;
  static int[] vis;

  static void dfs(int cur) {
    if (vis[cur] == 2) {
      if (C.isEmpty()) {
        for (int i = 0; i < V.size(); i++) {
          if (V.get(i) == cur) {
            for (int j = i; j < V.size(); j++) {
              C.add(V.get(j));
              id[V.get(j)] = j - i;
            }
            break;
          }
        }
      }
      return;
    }
    if (vis[cur] == 1) return;
    vis[cur] = 2;
    V.add(cur);
    for (Integer e : edgeE.get(cur)) {
      dfs(e);
    }
    V.remove(V.size() - 1);
    vis[cur] = 1;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    for (int i = 1; i <= N; i++) {
      edgeE.put(i, new ArrayList<>());
    }
    int M = sc.nextInt();
    for (int i = 0; i < M; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      edgeE.get(a).add(b);
    }
    id = new int[N + 1];
    vis = new int[N + 1];
    Arrays.fill(id, -1);
    for (int i = 1; i <= N; i++) {
      Arrays.fill(vis, 0);
      V.clear();
      dfs(i);
    }
    if (C.isEmpty()) {
      System.out.println("-1");
      return;
    }
    retry:
    for (int i = 0; i < C.size(); i++) {
      for (Integer e : edgeE.get(C.get(i))) {
        if (id[e] != -1 && id[e] != (id[C.get(i)] + 1) % C.size()) {
          List<Integer> C2 = new ArrayList<>();
          int y = id[e];
          Arrays.fill(id, -1);
          for (int j = 0; j < C.size(); j++) {
            Integer t = C.get((y + j) % C.size());
            C2.add(t);
            id[t] = j;
            if (t == i) break;
          }
          List<Integer> tmp = C;
          C = C2;
          C2 = tmp;
          break retry;
        }
      }
    }
    System.out.println(C.size());
    for (Integer c : C) {
      System.out.println(c);
    }
  }
}
