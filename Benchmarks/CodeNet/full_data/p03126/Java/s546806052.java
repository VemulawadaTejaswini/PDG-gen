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
        int[] ms = new int[m];
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            for (int j = 0; j < k; j++) {
                int a = sc.nextInt();
                ms[a - 1]++;
            }
        }

        int ans = 0;
        for (int i = 0; i < m; i++) {
            if (ms[i] >= n) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
