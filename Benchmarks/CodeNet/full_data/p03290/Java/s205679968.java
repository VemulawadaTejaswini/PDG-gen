import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        long G = sc.nextLong();
        int[] p = new int[D];
        long[] c = new long[D];
        for(int i = 0; i < D; i++) {
            p[i] = sc.nextInt();
            c[i] = sc.nextLong();
        }

        long result1 = 0;
        long cnt1 = 0;

        for (int i = 0; i < D; i++) {
            int k1 = 0;
            for (int j = 1; j <= p[i]; j++) {
                k1++;
                cnt1++;
                result1 += (i + 1) * 100;

                if (result1 >= G) {
                    break;
                }
            }
            if (k1 == p[i]) {
                result1 += c[i];
            }

            if (result1 >= G) {
                break;
            }

        }
        long result2 = 0;
        long cnt2 = 0;

        for (int i = D - 1; i >= 0; i--) {
            int k2 = 0;
            for (int j = 1; j <= p[i]; j++) {
                k2++;
                cnt2++;
                result2 += (i + 1) * 100;

                if (result2 >= G) {
                    break;
                }
            }
            if (k2 == p[i]) {
                result2 += c[i];
            }

            if (result2 >= G) {
                break;
            }

        }

        if (cnt1 <= cnt2) {
            System.out.println(cnt1);
        } else {
            System.out.println(cnt2);

        }

    }
}