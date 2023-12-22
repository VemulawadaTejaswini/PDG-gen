import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    private static final BigDecimal TWO = BigDecimal.valueOf(2);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        BigDecimal n = BigDecimal.valueOf(sc.nextLong());
        // スペース区切りの整数の入力
        BigDecimal a = BigDecimal.valueOf(sc.nextLong());
        BigDecimal b = BigDecimal.valueOf(sc.nextLong());

        BigDecimal count;
        if ((b.subtract(a)).remainder(TWO).compareTo(BigDecimal.ZERO) == 0) {
            count = (b.subtract(a)).divide(TWO);
        } else {
            if (extAbs(a, n).compareTo(extAbs(b, n)) == 1) {
                // 入れ替える
                BigDecimal tmp = a;
                a = n.subtract(b).add(BigDecimal.ONE);
                b = n.subtract(tmp).add(BigDecimal.ONE);
            }

            count = a.subtract(BigDecimal.ONE);
            a = BigDecimal.ONE;
            b = b.subtract(count);

            while (b.subtract(a).remainder(TWO).compareTo(BigDecimal.ZERO) != 0) {
                count = count.add(BigDecimal.ONE);
                b = b.subtract(BigDecimal.ONE);
            }

            count = (b.subtract(a)).divide(TWO).add(count);
        }
        // 出力
        System.out.println(count);
    }

    private static BigDecimal extAbs(BigDecimal t, BigDecimal n) {
        if (t.compareTo(n.divide(TWO)) == -1) {
            return t;
        }
        return n.subtract(t).add(BigDecimal.ONE);
    }
}