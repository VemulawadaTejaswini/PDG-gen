import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] integers = new Integer[n];
        for (int idx = 0; idx < n; idx++) {
            integers[idx] = Integer.parseInt(scanner.next());
        }
        List<Integer> collect = Arrays.stream(integers)
                .filter(it -> it != 1 && it != 0).collect(Collectors.toList());
        if (collect.size() == 0) {
            System.out.println(0);
        } else {
            System.out.println(collect.stream().reduce(1, (integer, integer2) -> integer * integer2).intValue());
        }
    }
}
