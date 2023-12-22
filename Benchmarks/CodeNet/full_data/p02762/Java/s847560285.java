import java.util.Scanner;

/**
 * Main
 */
public class Main {
  Scanner sc;
  int[][] relations;
  int n, m, k;

  public static void main(String[] args) {
    (new Main()).run();
  }

  public void run() {
    sc = new Scanner(System.in);
    // number of people
    n = sc.nextInt();
    // number of friend-relations
    m = sc.nextInt();
    // number of blocks-relations
    k = sc.nextInt();

    int[] count = new int[n];

    relations = new int[n][n];
    for (int i = 0; i < m; i++) {
      int a = sc.nextInt() - 1;
      int b = sc.nextInt() - 1;
      relations[a][b] = 1;
      relations[b][a] = 1;
    }
    for (int i = 0; i < k; i++) {
      int c = sc.nextInt() - 1;
      int d = sc.nextInt() - 1;
      relations[c][d] = -1;
      relations[d][c] = -1;
    }
    for (int person = 0; person < n; person++) {
      int[] status = new int[n];
      boolean[] already = new boolean[n];
      for (int target = 0; target < n; target++) {
        if (person == target) {
          status[target] = -9;
          continue; // 自分自身
        }
        if (relations[person][target] == 1) {
          status[target] = 9;
          continue; // すでに友達
        }
        if (relations[person][target] == -1) {
          status[target] = -9;
          continue; // すでにブロック
        }
        dfs(-1, person, target, 0, status, already);
      }
      for (int i = 0; i < n; i++) {
        if (status[i] == 1) {
          count[person]++;
        }
      }
    }
    for (int i = 0; i < n; i++) {
      System.out.print(count[i]);
      if (i == n - 1) {
        System.out.println();
      } else {
        System.out.print(" ");
      }
    }
  }

  public void dfs(int parent, int from, int to, int depth, int[] status, boolean[] already) {
    if (n < depth) {
      return;
    }
    if (from == to) {
      status[to] = 1; // NEW friend!
      return;
    }
    for (int i = 0; i < n; i++) {
      if (parent == i) {
        continue; // 戻るのはNG
      }
      if (already[i]) {
        continue;
      }
      if (relations[from][i] == 1 && (status[i] == 0 || status[i] == 9)) {
        if (status[i] == 0) {
          status[i] = 1; // NEW friend!
        }
        already[i] = true;
        dfs(from, i, to, depth + 1, status, already);
      }
    }
  }
}