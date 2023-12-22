import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    HashMap<Integer, List<Integer>> nodeToNexts = new HashMap<>(), nodesFromPrev = new HashMap<>();
    for (int i = 0; i < M; i++) {
      int from = sc.nextInt() - 1; // 0-indexed.
      int to = sc.nextInt() - 1;
      nodeToNexts.computeIfAbsent(from, k -> new LinkedList<>()).add(to);
      nodesFromPrev.computeIfAbsent(to, k -> new LinkedList<>()).add(from);
    }

    double[] dpExp = new double[N]; // dpExp[v]:= Expectation(v->N)
    for (int i = N - 2; i >= 0; i--) {
      for (int next : nodeToNexts.get(i)) {
        dpExp[i] += dpExp[next];
      }
      dpExp[i] /= nodeToNexts.get(i).size();
      dpExp[i] += 1;
    }
//    double[] dpReachProb = new double[N]; // dpReachProb[v]:= probReach(0->v)
//    dpReachProb[0] = 1;
//    for (int idxNext = 1; idxNext < N; idxNext++) {
//      for (int prev : nodesFromPrev.get(idxNext)) {
//        double prob = 1 / (double) nodeToNexts.get(prev).size();
//        dpReachProb[idxNext] += dpReachProb[prev] * prob;
//      }
//    }
//
//
    double improve = 0;
//    for (int i = 0; i < N - 1; i++) {
//      List<Integer> nexts = nodeToNexts.get(i);
//      int preCutOutNum = nexts.size();
//      if (preCutOutNum <= 1) continue;
//      double maxExp = 0;
//      double nextExps = 0;
//      for (Integer next : nexts) {
//        maxExp = Math.max(dpExp[next], maxExp);
//        nextExps += dpExp[next];
//      }
//      double expPreCut = dpExp[i];
//      double expPostCut = (nextExps - maxExp) / (preCutOutNum  - 1) + 1;
//      double tmpImprove = (expPreCut - expPostCut) * dpReachProb[i]; // ?
//      if (improve < tmpImprove)
//        improve = tmpImprove;
//    }

    System.out.println(dpExp[0] - improve);
  }
}
