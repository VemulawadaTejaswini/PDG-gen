import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<Integer> inputs = Stream.of(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int cnt = 0;
        System.out.println(reduce(inputs, cnt));
    }

    private static int reduce(List<Integer> list, int cnt) {
        if (isEven(list)) {
            cnt++;
            return reduce(division(list), cnt);
        } else {
            return cnt;
        }
    }

    private static List<Integer> division(List<Integer> list) {
        return list.stream()
                .map(num -> num / 2)
                .collect(Collectors.toList());
    }

    private static boolean isEven(List<Integer> list) {
        return list.stream()
                .filter(s -> s % 2 != 0)
                .count() == 0;
    }
}