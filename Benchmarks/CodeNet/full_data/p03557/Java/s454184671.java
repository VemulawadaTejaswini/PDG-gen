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
                .mapToLong(i -> binarySearchBefore(a, i) * (long)binarySearchAfter(c, i)).sum());
    }

    private static <T> int binarySearchBefore(List<? extends Comparable<? super T>> list, T key) {
        int i = Collections.binarySearch(list, key);
        if (i < 0) i = -(i + 1);
        while (i != 0 && list.get(i - 1) == key) i--;
        return i;
    }

    private static <T> int binarySearchAfter(List<? extends Comparable<? super T>> list, T key) {
        int i = Collections.binarySearch(list, key);
        if (i < 0) i = -(i + 1);
        while (i < list.size() && list.get(i) == key) i++;
        return list.size() - i;
    }
}