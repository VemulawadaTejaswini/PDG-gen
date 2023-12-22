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
        list.sort((i1, i2) -> i1 - i2);

        BigDecimal num = new BigDecimal((list.get(0) + list.get(1))).divide(new BigDecimal(2), 10, RoundingMode.UP);
        for (int i = 2; i < list.size(); i++) {
            num = num.add(BigDecimal.valueOf(list.get(i))).divide(new BigDecimal(2), 10, RoundingMode.UP);
        }
        return num.doubleValue();

    }

}
