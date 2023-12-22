import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] a = new long[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextLong();
        }

        int cnt2 = 0;
        int cnt4 = 0;
        int cntOthers = 0;
        for (int i = 0; i < N; i++) {
            if (a[i] % 4 == 0) {
                cnt4++;
            } else if (a[i] % 2 == 0) {
                cnt2++;
            } else {
                cntOthers++;
            }
        }

        if (cnt2 == 0) {
            if (cnt4 >= cntOthers - 1) {
                out.println("Yes");
                return;
            }
        } else {
            if (cnt4 >= cntOthers) {
                out.println("Yes");
                return;
            }
        }
        out.println("No");
    }
}