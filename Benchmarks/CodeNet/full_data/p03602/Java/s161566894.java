import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DRestoringRoadNetwork solver = new DRestoringRoadNetwork();
        solver.solve(1, in, out);
        out.close();
    }

    static class DRestoringRoadNetwork {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 残っている道の中で最小の道が正しい道としてやる
            // だから道を一応並べ替える必要がある？
            // 安い順に道を見て行って矛盾があれば・・みたいな
            //　どういう順番に更新していけばいいんだろう…
            // O(N^2)で更新ができそう
            // 矛盾ってどう見つけるんだろう
            // たとえば i->j , cost:cについて
            // i->k, k->jで道が存在してcost < c => 矛盾
            // i->k, k->jでの道すべてに対してcost > c => 矛盾しない、直接結ぶ道が必要
            // i->k, k->jで道が存在してcost = c => 矛盾しないが、道は必要ない
            // それでよさそう
            int n = in.nextInt();
            int[][] remTable = new int[n][n];
            long ans = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    remTable[i][j] = in.nextInt();
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    // 各道(i->j)について考える
                    boolean need = true;
                    for (int k = 0; k < n; k++) {
                        if (i == k || k == j) continue;
                        // i = 0
                        // j = 2
                        if (remTable[i][j] > remTable[i][k] + remTable[k][j]) {
                            // 矛盾
                            ans = -1;
                            break;
                        } else if (remTable[i][j] == remTable[i][k] + remTable[k][j]) {
                            need = false;
                        }
                    }
                    if (ans == -1) continue;
                    if (need) {
                        ans += remTable[i][j];
                    }
                }
            }
            out.println(ans);


        }

    }
}

