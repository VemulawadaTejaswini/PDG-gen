import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = sc.nextInt();

        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        int cnt1 = 0;
        int cnt2 = 0;
        int[] a1 = new int[N];
        int[] a2 = new int[N];
        System.arraycopy(a, 0, a1, 0, N);
        System.arraycopy(a, 0, a2, 0, N);
        for (int i = 0; i < N - 1; i++) {
            if (a1[i] + a1[i + 1] > x) {
                cnt1 += a1[i] + a1[i + 1] - x;
                a1[i + 1] = x - a1[i];
            }

            if (a2[i] + a2[i + 1] > x) {
                cnt2 += a2[i] + a2[i + 1] - x;
                a2[i] = x - a2[i + 1];
            }
        }
        out.println(Math.min(cnt1, cnt2));
    }
}