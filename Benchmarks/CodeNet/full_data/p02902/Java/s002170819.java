// http://kmjp.hatenablog.jp/entry/2019/09/28/1030

import java.util.*;

public class Main {
  static Map<Integer, List<Integer>> edgeE = new HashMap<>();
  static List<Integer> vStack = new ArrayList<>();
  static List<Integer> cycle = new ArrayList<>();
  static int[] id;
  static int[] visState;

  static void dfs(int cur) {
    if (visState[cur] == 2) {
      if (cycle.isEmpty()) {
        for (int i = 0; i < vStack.size(); i++) {
          if (vStack.get(i) == cur) {
            for (int j = i; j < vStack.size(); j++) {
              cycle.add(vStack.get(j));
              id[vStack.get(j)] = j - i;
            }
            break;
          }
        }
      }
      return;
    }
    if (visState[cur] == 1) return;
    visState[cur] = 2;
    vStack.add(cur);
    for (Integer e : edgeE.get(cur)) {
      dfs(e);
    }
    vStack.remove(vStack.size() - 1);
    visState[cur] = 1;
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
    visState = new int[N + 1];
    Arrays.fill(id, -1);
    for (int i = 1; i <= N; i++) {
      Arrays.fill(visState, 0);
      vStack.clear();
      dfs(i);
    }
    if (cycle.isEmpty()) {
      System.out.println("-1");
      return;
    }
    retry:
    for (int i = 0; i < cycle.size(); i++) {
      for (Integer e : edgeE.get(cycle.get(i))) {
        if (id[e] != -1 && id[e] != (id[cycle.get(i)] + 1) % cycle.size()) {
          List<Integer> C2 = new ArrayList<>();
          int y = id[e];
          Arrays.fill(id, -1);
          for (int j = 0; j < cycle.size(); j++) {
            Integer t = cycle.get((y + j) % cycle.size());
            C2.add(t);
            id[t] = j;
            if (t == i) break;
          }
          List<Integer> tmp = cycle;
          cycle = C2;
          C2 = tmp;
          break retry;
        }
      }
    }
    System.out.println(cycle.size());
    for (Integer c : cycle) {
      System.out.println(c);
    }
  }
}
