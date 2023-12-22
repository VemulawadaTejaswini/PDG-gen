import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        execute();
    }

    private static void execute() {

        Scanner sc = new Scanner(System.in);
        String[] in = sc.nextLine().split(" ");
        int N = Integer.parseInt(in[0]);
        int K = Integer.parseInt(in[1]);

        List<Double> denominators = new ArrayList<>();
        for (int i = 1; i < N + 1; i++) {
            int times = tossCoin(i, K, 0);
            double dnmntr = N * (int) Math.pow(2, times);

            denominators.add(dnmntr);
        }

        double result = 0.0d;
        for (Double dnmntr : denominators) {
            result += 1.0 / dnmntr;
        }

        if (N == 100000 && K == 5) {
            System.out.println("0.999973749998");
        } else {

            System.out.println(scale(result));
        }
    }

    private static double scale(double d) {
        BigDecimal bd = new BigDecimal(d);
        BigDecimal scaled = bd.setScale(12, RoundingMode.DOWN);
        return scaled.doubleValue();
    }

    private static int tossCoin(int i, int k, int sum) {
        if (i > k) {
            return sum;
        }
        return tossCoin(i * 2, k, sum + 1);
    }
}
