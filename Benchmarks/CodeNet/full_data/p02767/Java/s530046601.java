import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * AtCoder Beginner Contest 1xx
 *
 * https://atcoder.jp/contests/abc1xx/tasks/abc1xx_c
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<Integer> list = IntStream.range(0, n)
                .mapToObj(i -> {
                    return sc.nextInt();
                })
                .collect(Collectors.toList());
        int avg = (int) Math.round(list.stream().mapToInt(m -> m).average().getAsDouble());
        System.out.println(list.stream().mapToInt(m -> (int) Math.pow(m - avg, 2)).sum());
    }
}
