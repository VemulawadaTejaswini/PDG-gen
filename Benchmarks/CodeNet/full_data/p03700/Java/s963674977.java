
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int a = scanner.nextInt();
        final int b = scanner.nextInt();

        final List<Integer> list = IntStream.range(0, n)
                .mapToObj(i -> scanner.nextInt())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        final int answer = binarySearch(list, 0, 1_000_000_000, a, b);
        System.out.println(answer);
    }

    private static int binarySearch(final List<Integer> list, final int begin, final int end, final int a, final int b) {
        if (end - begin <= 1) {
            return end;
        }

        final int mid = (end + begin) / 2;
        final List<Integer> bAttackedList = list.stream()
                .map(i -> i - mid * b)
                .filter(i -> i >= 0)
                .collect(Collectors.toList());

        if (bAttackedList.size() == 0) {
            return binarySearch(list, begin, mid, a, b);
        }

        int tmp = mid;
        final int attack = a - b;
        for (final int remainedHP : bAttackedList) {
            tmp -= (remainedHP + attack - 1) / attack;
        }

        if (tmp < 0) {
            return binarySearch(list, mid, end, a, b);
        } else {
            return binarySearch(list, begin, mid, a, b);
        }
    }
}
