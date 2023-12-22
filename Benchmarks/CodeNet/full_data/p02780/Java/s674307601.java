import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.nextLine();
        List<BigDecimal> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            BigDecimal decimal = BigDecimal.valueOf(value);
            int sum = 0;
            for (int j = 1; j <= value; j++) {
                sum += j;
            }
            BigDecimal expect = BigDecimal.valueOf(sum).divide(decimal, 13, RoundingMode.HALF_UP);
            list.add(expect);
        }
        List<BigDecimal> sumList = new ArrayList<>();
        for (int i = 0; i <= n - k; i++) {
            BigDecimal sum = BigDecimal.valueOf(0);
            List<BigDecimal> subList = list.subList(i, i + k);
            for (int j = 0; j < subList.size(); j++){
                sum = sum.add(subList.get(j));
            }
            sumList.add(sum);
        }
        OptionalDouble max = sumList.stream().mapToDouble(m -> m.setScale(12, RoundingMode.HALF_UP).doubleValue()).max();
        System.out.println(String.format("%.12f", max.getAsDouble()));
    }
}
