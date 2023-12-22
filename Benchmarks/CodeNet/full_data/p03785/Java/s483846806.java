import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int n = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        int[] ts = new int[n];
        for (int i = 0; i < n; i++) {
            ts[i] = sc.nextInt();
        }

        Arrays.sort(ts);

        int ans = 0;
        int count = 0;
        int departT = ts[0] + k;
        for (int t : ts) {
            if (t > departT) {
                ans++;
                count = 0;
                departT = t + k;
            }

            count++;
            if (count == c) {
                ans++;
                count = 0;
            }
        }

        if (count > 0) {
            ans++;
        }

        System.out.println(ans);
    }
}
