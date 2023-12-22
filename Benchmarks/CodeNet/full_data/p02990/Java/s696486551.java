import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.close();

        int blue = K;
        int red = N - K;

        int div = (int) (Math.pow(10, 9) + 7);

        for (int i = 0; i < blue; i++) {
            // 赤いボールの中に青いボールが入る位置の組み合わせ
            long r = 0;
            if (i <= red) {
                r = comb(red + 1, i + 1);
            }
            // 青いボールの分け方
            long b = 1;
            if (i != 0 && i != blue - 1) {
                b = comb(blue - 1, i);
            }

            long ans = (r * b) % div;
            System.out.println(ans);
        }

    }

    private static int factorial(int n) {
        if (n > 0) {
            return n * factorial(n - 1);
        } else {
            return 1;
        }
    }

    private static long comb(int a, int b) {
        if (a >= b) {
            long denominator = factorial(b);
            BigDecimal numerator = new BigDecimal(1);
            for (int i = a; i > a - b; i--) {
                BigDecimal bi = new BigDecimal(i);
                numerator = numerator.multiply(bi);
            }
            return numerator.longValue() / denominator;
        } else {
            return 1;
        }
    }
}