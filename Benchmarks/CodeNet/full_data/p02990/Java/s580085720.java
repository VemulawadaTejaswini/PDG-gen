import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.close();

        int blue = K;
        int red = N - K;

        BigDecimal div = BigDecimal.valueOf((Math.pow(10, 9) + 7));

        Map<Integer, BigDecimal> redCombMap = new HashMap<Integer, BigDecimal>();
        Map<Integer, BigDecimal> blueCombMap = new HashMap<Integer, BigDecimal>();

        for (int i = 0; i < blue; i++) {
            // 赤いボールの中に青いボールが入る位置の組み合わせ
            BigDecimal r = BigDecimal.ZERO;
            if (i <= red) {
                if (redCombMap.containsKey(i + 1)) {
                    r = redCombMap.get(i + 1);
                } else if (redCombMap.containsKey(red - i)) {
                    r = redCombMap.get(red - i);
                } else {
                    r = c(red + 1, i + 1);
                    redCombMap.put(i + 1, r);
                }
            } else {
                System.out.println(0);
                continue;
            }
            // 青いボールの分け方
            BigDecimal b;
            if (blueCombMap.containsKey(i)) {
                b = blueCombMap.get(i);
            } else if (blueCombMap.containsKey(blue - 1 - i)) {
                b = blueCombMap.get(blue - 1 - i);
            } else {
                b = c(blue - 1, i);
                blueCombMap.put(i, b);
            }

            long ans = r.multiply(b).remainder(div).longValue();
            System.out.println(ans);
        }

    }

    private static BigDecimal factorial(int n) {
        if (n > 0) {
            return BigDecimal.valueOf(n).multiply(factorial(n - 1));
        } else {
            return BigDecimal.ONE;
        }
    }

    private static BigDecimal comb(int a, int b) {
        if (a >= b) {
            BigDecimal denominator = factorial(b);
            BigDecimal numerator = BigDecimal.ONE;
            for (int i = a; i > a - b; i--) {
                BigDecimal bi = BigDecimal.valueOf(i);
                numerator = numerator.multiply(bi);
            }
            return numerator.divide(denominator);
        } else {
            return BigDecimal.ONE;
        }
    }

    private static BigDecimal c(int a, int b) {
        int c = a - b;
        if (c < b) {
            return comb(a, c);
        } else {
            return comb(a, b);
        }
    }
}