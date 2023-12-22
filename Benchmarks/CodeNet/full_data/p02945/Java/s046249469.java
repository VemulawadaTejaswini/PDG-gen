import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Long> map = IntStream.range(0, n)
                .mapToObj(m -> {
                    sc.nextLine();
                    char[] chars = sc.next().toCharArray();
                    Arrays.sort(chars);
                    return new String(chars);
                })
                .collect(Collectors.groupingBy(m -> m, Collectors.counting()));
        System.out.println(map.values().stream().map(m -> m * (m-1)/2).mapToLong(m -> m).sum());
    }
}
