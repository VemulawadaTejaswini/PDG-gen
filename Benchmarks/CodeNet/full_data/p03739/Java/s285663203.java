
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final List<Long> list = IntStream.range(0, n)
                .mapToObj(i -> scanner.nextLong())
                .collect(Collectors.toList());

        final long answer;
        if (list.get(0) != 0) {
            answer = sum(list.get(0), 0, list);
        } else {
            answer = Math.min(sum(1, 1, list), sum(-1, 1, list));
        }

        System.out.println(answer);
    }

    private static long sum(final long firstValue, final long firstCost, final List<Long> list) {
        long sum1 = firstValue, sum2 = firstValue;
        long cost1 = firstCost, cost2 = firstCost;
        long sign1 = 1, sign2 = -1;
        for (int i = 1; i < list.size(); i++) {
            final long a = list.get(i);
            sum1 += a;
            sum2 += a;

            if (sign1 == 1 && sum1 < 1) {
                cost1 += 1 - sum1;
                sum1 = 1;
            } else if (sign1 == -1 && sum1 > -1) {
                cost1 += sum1 + 1;
                sum1 = -1;
            }

            if (sign2 == 1 && sum2 < 1) {
                cost2 += 1 - sum2;
                sum2 = 1;
            } else if (sign2 == -1 && sum2 > -1) {
                cost2 += sum2 + 1;
                sum2 = -1;
            }

            sign1 *= -1;
            sign2 *= -1;
        }

        return Math.min(cost1, cost2);
    }
}
