
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] t = new int[N];
    int[] d = new int[N];
    for (int i = 0; i < N; i++) {
      t[i] = sc.nextInt();
      d[i] = sc.nextInt();
    }
    Main abc116D = new Main();
    System.out.println(abc116D.solve(N, K, t, d));
  }

  long solve(int N, int K, int[] t, int[] d) {
    ABC116DSolve abc116DSolve = new ABC116DSolve(N, K, t, d);
    return abc116DSolve.solve();
  }

  class ABC116DSolve {
    int N;
    int K;
    int[] t;
    int[] d;
    int[] sortIndex;

    public ABC116DSolve(int N, int K, int[] t, int[] d) {
      this.N = N;
      this.K = K;
      this.t = t;
      this.d = d;
      this.sortIndex = new int[this.N];
      for (int i = 0; i < N; i++) {
        this.sortIndex[i] = i;
      }
      this.setSortIndex(0, N - 1);
    }

    public long solve() {
      return searchAns();
    }

    private long searchAns() {
      Set<Integer> types = new HashSet<>();
      Queue<Integer> kouho = new LinkedList();
      Stack<Integer> chohukus = new Stack();
      long point = 0;
      long size = 0;
      for (int i = 0; i < K; i++) {
        point += d[sortIndex[i]];
        if (types.contains(t[sortIndex[i]])) {
          chohukus.push(i);
        } else {
          types.add(t[sortIndex[i]]);
          size += 1;
        }
      }
      long ans = point + size * size;

      for(int i = K; i < N; i++ ) {
        if (!types.contains(t[sortIndex[i]])) {
          types.add(t[sortIndex[i]]);
          kouho.add(i);
        }
      }

      while (!chohukus.isEmpty() && !kouho.isEmpty()) {
        Integer delIndex = chohukus.pop();
        Integer addIndex = kouho.poll();
        point = point - d[sortIndex[delIndex]] + d[sortIndex[addIndex]];
        size += 1;
        long nextAns = point + size * size;

        if (nextAns > ans) {
          ans = nextAns;
        }
      }
      return ans;
    }

    private void setSortIndex(int start, int end) {
      if (start >= end) {
        return;
      }
      int center = d[sortIndex[(start + end) / 2]];
      int l = start, r = end, tmp = 0;
      while (l <= r) {
        while (d[sortIndex[l]] > center && l < this.K) l++;
        while (d[sortIndex[r]] < center && r >= 0) r--;
        if (l <= r) {
          tmp = sortIndex[l];
          sortIndex[l] = sortIndex[r];
          sortIndex[r] = tmp;
          l++;
          r--;
        }
      }
      setSortIndex(start, r);
      setSortIndex(l, end);
    }
  }
}
