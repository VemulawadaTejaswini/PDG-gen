import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        List<Integer> a = IntStream.range(0, n)
                .mapToObj(i -> scanner.nextInt())
                .sorted(Integer::compareTo)
                .collect(Collectors.toList());
        List<Integer> b = IntStream.range(0, n)
                .mapToObj(i -> scanner.nextInt())
                .collect(Collectors.toList());
        List<Integer> c = IntStream.range(0, n)
                .mapToObj(i -> scanner.nextInt())
                .sorted(Integer::compareTo)
                .collect(Collectors.toList());
        System.out.println(b.stream()
                .mapToLong(i -> {
                    long aCount = Collections.binarySearch(a, i);
                    if (aCount < 0) aCount = -(aCount + 1);
                    long cCount = -Math.abs(Collections.binarySearch(c, i) + 1) + c.size();
                    return aCount * cCount;
                }).sum());
    }
}