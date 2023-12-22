import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();

        if (n >= m) {
            System.out.println(0);
            return;
        }

        int[] xs = new int[m];
        for (int i = 0; i < m; i++) {
            xs[i] = sc.nextInt();
        }
        Arrays.sort(xs);

        Integer[] ds = new Integer[m - 1];
        for (int i = 0; i < m - 1; i++) {
            ds[i] = xs[i + 1] - xs[i];
        }
        Arrays.sort(ds, Collections.reverseOrder());

        int ans = 0;
        System.out.println(Arrays.toString(ds));
        for (int i = n - 1; i < m - 1; i++) {
            ans += ds[i];
        }
        System.out.println(ans);
    }
}