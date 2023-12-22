import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int max = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            for (int j = l; j <= r; j++) {
                list.add(j);
            }
            min = l < min ? l : min;
            max = r > max ? r : max;
        }

        Map<Object, Long> mp = list.stream().collect(
                Collectors.groupingBy(x -> x, Collectors.counting())
        );

        int count = 0;

        for (int i = min; i <= max; i++) {
            Integer tmp = mp.get(i).intValue();
            if (tmp == m) {
                count++;
            }
        }
        System.out.println(count);
    }
}