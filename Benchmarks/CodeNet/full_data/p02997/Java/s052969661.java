// %%
import java.util.*;
import java.io.PrintWriter;

// %%
public class Main {

    private static int N;
    private static int K;
    private static PrintWriter pw = new PrintWriter(System.out);

    public static void main(String[] args) {
        load();
        solve();
        pw.flush();
    }

    private static void load() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
    }

    private static void solve() {
        if (K > (N - 1) * (N - 2) / 2) {
            pw.println(-1);
            return;
        }

        int cnt = N - 1 + (N - 1) * (N - 2) / 2 - K;
        pw.println(cnt);

        // for (int v = 1; v <= N; v += 1) {
        //     for (int w = v + 1; w <= N; w += 1) {
        //         pw.print(v);
        //         pw.print(' ');
        //         pw.println(w);
        //         cnt -= 1;
        //         if (cnt == 0) {
        //             return;
        //         }
        //     }
        // }

        int v = 1;
        while (true) {
            for (int w = v + 1; w <= N; w += 1) {
                pw.print(v);
                pw.print(' ');
                pw.println(w);
                cnt -= 1;
                if (cnt == 0) {
                    return;
                }
            }
            v += 1;
        }
    }

}

// %%
// Main.main(new String[0]);