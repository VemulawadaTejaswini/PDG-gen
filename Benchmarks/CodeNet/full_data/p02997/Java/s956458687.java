// %%
import java.util.*;

// %%
public class Main {

    private static int N;
    private static int K;

    public static void main(String[] args) {
        load();
        solve();
    }

    private static void load() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
    }

    private static void solve() {
        if (K > (N - 1) * (N - 2) / 2) {
            System.out.println("-1");
            return;
        }

        int cnt = (N - 1) * (N - 2) / 2;
        String rendered = String.format("%d\n", N - 1 + cnt - K );

        for (int i = 2; i <= N; i += 1) {
            rendered += String.format("1 %d\n", i);
        }

        int from = 2;
        boolean finished = false;
        while (true) {
            int to = from + 1;
            while (to <= N) {
                rendered += String.format("%d %d\n", from, to);
                cnt -= 1;
                if (cnt == K) {
                    finished = true;
                    break;
                }
                to += 1;
            }
            if (finished) {
                break;
            }
            from += 1;
        }

        System.out.println(rendered);
    }

}

// %%
// Main.main(new String[0]);
