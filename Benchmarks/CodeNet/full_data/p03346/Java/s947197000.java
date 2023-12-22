
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final List<Integer> list = IntStream.range(0, n)
                .mapToObj(i -> scanner.nextInt())
                .collect(Collectors.toList());

        final Operator increment = v -> v + 1;
        final Operator decrement = v -> v - 1;

        final int answer = n - Math.max(count(list, 1, increment), count(reverse(list), n, decrement));
        System.out.println(answer);
    }

    private static int count(final List<Integer> list, final int initialValue, final Operator operator) {
        int current = initialValue;
        int count = 0;
        for (final int p : list) {
            if (p == current) {
                count++;
                current = operator.apply(current);
            }
        }
        return count;
    }

    private static List<Integer> reverse(final List<Integer> list) {
        Collections.reverse(list);
        return list;
    }

    @FunctionalInterface
    interface Operator {
        int apply(int integer);
    }
}
