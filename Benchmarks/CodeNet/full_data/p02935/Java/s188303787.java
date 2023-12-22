import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        List<BigDecimal> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(new BigDecimal(sc.next()));
        }
        list = list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());

        BigDecimal result = list.get(0);
        for (int i = 1; i < N; i++) {
            BigDecimal sum = result.add(list.get(i));

            result = sum.divide(new BigDecimal("2"), 7, RoundingMode.HALF_EVEN);
        }

        System.out.println(result.toPlainString());
        sc.close();
    }
}