
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int k = scanner.nextInt();
        final List<Long> list = IntStream.range(0, k)
                .mapToObj(i -> scanner.nextLong())
                .collect(Collectors.toList());

        Collections.reverse(list);
        if (list.get(0) != 2) {
            System.out.println(-1);
            return;
        }

        long min = 2;
        long max = 3;
        for (final long value : list) {
            if (value >= 2 * max) {
                System.out.println(-1);
                return;
            }

            min = (min + value -1) / value * value;
            max = value * (max / value) + value - 1;
        }

        System.out.println(min + " " + max);
    }
}
