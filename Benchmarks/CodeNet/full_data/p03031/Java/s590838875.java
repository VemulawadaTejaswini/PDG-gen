import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int[][] s = new int[m][n];

        for (int i = 0; i < m; i++) {
            int k = Integer.parseInt(sc.next());
            for (int j = 0; j < k; j++) {
                s[i][j] = Integer.parseInt(sc.next());
            }
        }

        int[] p = new int[m];
        for (int i = 0; i < m; i++) {
            p[i] = Integer.parseInt(sc.next());
        }

        int ans = 0;
        for (int i = 0; i < (1 << n); i++) {
            int[] sw = new int[n];
            for (int j = 0; j < n; j++) {
                if ((1 & i >> j) == 1) {
                    sw[j] = 1;
                }
            }

            boolean ok = true;
            for (int j = 0; j < m; j++) {
                int cnt = 0;
                for (int k = 0; k < n; k++) {
                    if (s[j][k] == 0) {
                        break;
                    }
                    if (sw[s[j][k] - 1] == 1) {
                        cnt++;
                    }
                }
                if (cnt % 2 != p[j]) {
                    ok = false;
                }
            }

            if (ok) {
                ans++;
            }
        }

        System.out.println(ans);
        sc.close();
    }
}