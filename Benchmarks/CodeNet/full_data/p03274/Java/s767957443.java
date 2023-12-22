
import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }

        int ls = -1;
        int rs = n;
        boolean ez = false;
        for (int i = 0; i < n; i++) {
            if (x[i] == 0)
                ez = true;
            if (x[i] < 0)
                ls = i;
        }

        for (int i = n - 1; i >= 0; i--) {
            if (x[i] > 0)
                rs = i;
        }

        int nl = ls + 1;
        int nr = n - rs;
        if (ez) {
            k--;
        }

        int ans = -1;

        for (int i = 0; i <= nl; i++) {
            int toL = 0;
            if (i != 0) {
                toL = x[ls - i + 1];
            }

            int needR = k - i;
            if (needR > nr)
                continue;
            int toR = 0;
            if (needR != 0) {
                toR = x[rs + needR - 1];
            }

            int a1 = Math.abs(2 * toL) + Math.abs(toR);
            int a2 = Math.abs(2 * toR) + Math.abs(toL);
            // System.out.println(a1 + " " + a2 + " " + toR + " " + toL);
            if (ans == -1) {
                ans = Math.min(a1, a2);
            } else {
                ans = Math.min(Math.min(a1, a2), ans);
            }

        }
        System.out.println(ans);
    }

}
