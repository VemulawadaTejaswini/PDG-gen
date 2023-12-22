import java.util.*;

public class Main {

    private static int N;
    private static int K;

    public static void main(String[] args) {
        load();
        // solve();
        tmp();
    }

    private static void load() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
    }

    private static void tmp() {
        System.out.println("-1");
    }

    private static void solve() {
        if (K > (N - 1) * (N - 2) / 2) {
            System.out.println("-1");
            return;
        }

        for (int i = 2; i <= N; i += 1) {
            System.out.println(String.format("%d %d", 1, i));
        }

        int cnt = (N - 1) * (N - 2) / 2;
        int from = 2;
        while (true) {
            int to = from + 1;
            while (to <= N) {
                System.out.println(String.format("%d %d", from, to));
                cnt -= 1;
                to += 1;
                if (cnt == K) {
                    return;
                }
            }
            from += 1;
        }
    }

}
