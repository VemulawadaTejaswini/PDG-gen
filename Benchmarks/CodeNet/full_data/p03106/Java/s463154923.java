import java.util.*;
import java.util.stream.IntStream;

public class BKthCommonDivisor {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a = Integer.parseInt(s.next());
        int b = Integer.parseInt(s.next());
        int k = Integer.parseInt(s.next());

        int min = a < b ? a : b;

        Optional<Integer> an = IntStream.range(1, min)
                .filter(n -> a % n == 0 && b % n == 0)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(k - 1)
                .findFirst();

        System.out.println(an.orElse(0));
    }
}