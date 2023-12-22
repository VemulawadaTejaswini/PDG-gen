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

        long pre = a[0];
        int cnt = 1;
        int i = 1;
        while (i < N - 1) {
            if (pre == a[i]) {
                i++;
            }

            if (pre < a[i]) {
                while (i < N - 1) {
                    pre = a[i];
                    if (pre > a[++i]) {
                        cnt++;
                        break;
                    }
                }
            } else {
                while (i < N - 1) {
                    pre = a[i];
                    if (pre < a[++i]) {
                        cnt++;
                        break;
                    }
                }
            }
            pre = a[i];
        }

        out.println(cnt);
    }
}