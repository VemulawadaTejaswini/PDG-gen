

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println(solve());
    }

    private static int solve() {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] a = new int[N];
        Arrays.fill(a, -1);

        for (int i = 0; i < M; i++) {
            int s = sc.nextInt() - 1;
            int c = sc.nextInt();

            if (a[s] != -1 && a[s] != c) {
                return -1;
            }

            a[s] = c;
        }

        if (a[0] == 0) {
            if (N == 1) {
                return 0;
            } else {
                return -1;
            }

        } else {
            if (a[0] == -1) {
                if (N == 1) {
                    return 0;
                }
                a[0] = 1;
            }

            for (int i = 1; i < N; i++) {
                if (a[i] == -1) {
                    a[i] = 0;
                }
            }

            int ans = 0;
            for (int i = 0; i < N; i++) {
                ans = ans * 10;
                ans += a[i];
            }

            return ans;
        }

    }

}
