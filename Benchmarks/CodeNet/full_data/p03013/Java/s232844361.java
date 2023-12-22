import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final String[] str = scanner.nextLine().split(" ");
        final int n = Integer.parseInt(str[0]);
        final int m = Integer.parseInt(str[1]);

        final int[] breaks = new int[m];
        for (int i = 0; i < m; i++) {
            breaks[i] = Integer.parseInt(scanner.nextLine());
        }

        final BigDecimal[] counts = new BigDecimal[n];
        for (int i = 0; i < breaks.length; i++) {
            counts[breaks[i] - 1] = new BigDecimal(0);
        }

        if (counts[0] == null) counts[0] = new BigDecimal(1);
        if (counts[1] == null) counts[1] = new BigDecimal(1).add(counts[0]);
        for (int i = 2; i < counts.length; i++) {
            if (counts[i] != null) continue;
            counts[i] = counts[i - 1].add(counts[i - 2]);
        }

        final BigDecimal[] result = counts[counts.length - 1].divideAndRemainder(new BigDecimal(1000000007L));
        System.out.println(result[1].longValue());

    }
}