import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        sc.close();

        int odd = 0;

        for (int i = 1; i <= N; i++) {

            if(!(i % 2 == 0)) {

                odd++;
            }
        }

        double ans = (double)odd/(double)N;

        BigDecimal ansBig = new BigDecimal(ans);
        ansBig.setScale(6, RoundingMode.HALF_UP);

        System.out.print(decimalToString10(ansBig));

    }

    public static String decimalToString10(BigDecimal big) {

        DecimalFormat format = new DecimalFormat("#.#");

        // 小数点以下の最小値
        format.setMinimumFractionDigits(10);
        // 小数点以下の最大値
        format.setMaximumFractionDigits(10);

        return format.format(big);
    }

}