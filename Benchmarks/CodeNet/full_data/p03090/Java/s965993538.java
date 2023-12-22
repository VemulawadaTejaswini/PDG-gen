import java.util.*;

public class Main {

    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = n * (n + 1) / 2;

        if (sum % 2 == 0) {
            int[] dp = new int[sum + 1];
            Arrays.fill(dp, 1 << 20);

            dp[0] = 0;
            for (int i = 1; i <= n; i++) for (int j = sum - i; j >= 0; j--) if (dp[j] >= 0) {
                dp[j + i] = Math.min(dp[j + i], i);
            }

            HashSet<Integer> a = new HashSet<>();
            HashSet<Integer> b = new HashSet<>();
            int p = sum / 2;
            while (p != 0) {
                a.add(dp[p]);
                p = p - dp[p];
            }
            for (int i = 1; i <= n; i++) if (!a.contains(i)) {
                b.add(i);
            }

            int m = a.size() * b.size();

            System.out.println(m);
            for (int i: a) for (int j: b) {
                System.out.println(i + " " + j);
            }
        } else {
            int[] dp = new int[sum + 1];
            Arrays.fill(dp, 1 << 20);

            dp[0] = 0;
            for (int i = 2; i <= n; i++) for (int j = sum - i; j >= 0; j--) if (dp[j] >= 0) {
                dp[j + i] = Math.min(dp[j + i], i);
            }


            HashSet<Integer> a = new HashSet<>();
            HashSet<Integer> b = new HashSet<>();
            int p = sum / 2;
            while (p != 0) {
                a.add(dp[p]);
                p = p - dp[p];
            }
            for (int i = 1; i <= n; i++) if (!a.contains(i)) {
                b.add(i);
            }

            a.add(1);

            int m = a.size() * b.size() - 1;

            System.out.println(m);
            for (int i: a) for (int j: b) {
                if (i == j) continue;
                System.out.println(i + " " + j);
            }
        }
    }

    // 1 2 3 4 5

    void debug(Object...os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
