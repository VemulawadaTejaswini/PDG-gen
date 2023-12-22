
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

        long tmp = 2;
        for (int i = 0; i < list.size() - 1; i++) {
            final long current = list.get(i);
            final long next = list.get(i + 1);

            if (next > tmp + current - 1) {
                System.out.println(-1);
                return;
            }

            tmp = (tmp + next - 1) / next * next;
        }

        System.out.println(tmp + " " + (tmp + list.get(list.size() - 1) - 1));
    }
}
