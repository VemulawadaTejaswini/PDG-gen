import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(Integer.parseInt(sc.next()));
            }
            System.out.println(calc(list));
        }
    }

    public static double calc(List<Integer> list) {
        BigDecimal child = BigDecimal.ONE;
        BigDecimal sum = BigDecimal.ZERO;
        for (int i = 0; i < list.size(); i++) {
            BigDecimal cache = BigDecimal.ONE;
            for (int j = 0; j < list.size(); j++) {
                if (i != j) {
                    cache = cache.multiply(BigDecimal.valueOf(list.get(j)));
                }
            }

            sum = sum.add(cache);
            child = child.multiply(BigDecimal.valueOf(list.get(i)));
        }

        return child.divide(sum, 10, RoundingMode.UP).doubleValue();
    }

}
