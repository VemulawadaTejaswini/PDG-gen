import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long k = scanner.nextLong();
        List<Long> x = LongStream.range(0, n)
                .mapToObj(i -> scanner.nextLong())
                .sorted()
                .collect(Collectors.toList());

        System.out.println(LongStream.rangeClosed(0, k)
                .map(i -> x.stream()
                        .mapToLong(j -> i ^ j)
                        .sum())
                .max()
                .getAsLong());
    }
}