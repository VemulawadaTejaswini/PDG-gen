// http://kmjp.hatenablog.jp/entry/2019/09/28/1030

import java.util.*;

public class Main {
  static Map<Integer, List<Integer>> edgeE = new HashMap<>();
  static List<Integer> vStack = new ArrayList<>(); // stack in DFS
  static int[] vStackState; // state of DFS.
  static List<Integer> cycle = new ArrayList<>();
  static Integer[] cycleSeqId; // id of cycle member.

  static void dfs(int cur) {
    if (vStackState[cur] == 2) { // Found node visited in current dfs. (a cycle)
      if (cycle.isEmpty()) {
        for (int i = 0; i < vStack.size(); i++) {
          if (vStack.get(i) == cur) { // Find starting point to avoid circle shape of `6`.
            for (int j = i; j < vStack.size(); j++) {
              cycle.add(vStack.get(j));
              cycleSeqId[vStack.get(j)] = j - i;
            }
            break;
          }
        }
      }
      return;
    }
    if (vStackState[cur] == 1) return;
    vStackState[cur] = 2;
    vStack.add(cur);
    for (Integer e : edgeE.get(cur)) {
      dfs(e);
    }
    vStack.remove(vStack.size() - 1);
    vStackState[cur] = 1;
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
    cycleSeqId = new Integer[N + 1];
    vStackState = new int[N + 1]; // 1-indexed (skip 0-th)
    Arrays.fill(cycleSeqId, -1);
    /* Search cycle. */
    for (int i = 1; i <= N; i++) { // if cycle is already found, loop is useless?
      Arrays.fill(vStackState, 0);
      vStack.clear();
      dfs(i);
    }
    if (cycle.isEmpty()) {
      System.out.println("-1");
      return;
    }
    retry:
    for (int idxStart = 0; idxStart < cycle.size(); idxStart++) {
      Integer nodeIdxFrom = cycle.get(idxStart);
      for (Integer to : edgeE.get(nodeIdxFrom)) {
        if (
        /*member of cycle */ cycleSeqId[to] != -1
            && /* If path split. This is smaller cycle. */
          cycleSeqId[to] != (cycleSeqId[nodeIdxFrom] + 1) % cycle.size()) {
          List<Integer> C2 = new ArrayList<>();
          int newStartIdxInCycle = cycleSeqId[to]; // New starting point to avoid circle shape of `6`.
          Arrays.fill(cycleSeqId, -1);
          for (int j = 0; j < cycle.size(); j++) {
            Integer nodeIdx = cycle.get((newStartIdxInCycle + j) % cycle.size());
            C2.add(nodeIdx);
            cycleSeqId[nodeIdx] = j;
            if (nodeIdx.equals(nodeIdxFrom)) break;
          }
          List<Integer> tmp = cycle;
          cycle = C2;
          idxStart = 0;
          continue retry;
        }
      }
    }
    System.out.println(cycle.size());
    for (Integer c : cycle) {
      System.out.println(c);
    }
  }
}
