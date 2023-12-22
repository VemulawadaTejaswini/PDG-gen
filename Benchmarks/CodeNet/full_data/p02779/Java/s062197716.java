import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = Long.parseLong(sc.nextLine());
        Stream<Long> stream = Arrays.stream(sc.nextLine().split(" ")).map(Long::parseLong);
        sc.close();
        List<Long> lists = stream.collect(Collectors.toList());
        Long[] arrays = lists.toArray(new Long[lists.size()]);

        Arrays.sort(arrays);

        for (int i = 0; i < N; i++) {
            long tt = arrays[i];
            if (i != N - 1) {
                long nt = arrays[i + 1];
                if (tt == nt) {
                    System.out.println("NO");
                    break;
                }
            } else {
                System.out.println("YES");
            }
        }
    }
}