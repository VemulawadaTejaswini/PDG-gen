import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int X = sc.nextInt();
            int Y = sc.nextInt();

            if ((X + Y) % 3 != 0) {
                System.out.println(0);
                return;
            }

            int k = (X + Y) / 3;
            int i = 2 * k - X;
            int j = 2 * k - Y;

            if (i < 0 || j < 0) {
                System.out.println(0);
                return;
            }

            long kfac = 1;
            long ifac = 1;
            long jfac = 1;
            for (int n = 1; n <= k; n++) {
                kfac = kfac * n % 1000000007;
                if (n == i) {
                    ifac = kfac;
                }
                if (n == j) {
                    jfac = kfac;
                }
            }

            long ans = kfac;
            int m = 1000000007 - 2;
            while (m > 0) {
                if (m % 2 == 1) {
                    ans = ans * ifac % 1000000007;
                    ans = ans * jfac % 1000000007;
                    m--;
                }

                ifac = ifac * ifac % 1000000007;
                jfac = jfac * jfac % 1000000007;
                m = m / 2;
            }

            System.out.println(ans);
        }
    }

}
