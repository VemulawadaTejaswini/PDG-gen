import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer N = Integer.parseInt(scanner.next());
        Integer M = Integer.parseInt(scanner.next());
        Integer[] x = new Integer[M];
        Integer[] d = new Integer[M];
        Arrays.fill(d, 0);

        for (int i = 0; i < M; i++) {
            x[i] = Integer.parseInt(scanner.next());
        }

        Arrays.sort(x);

        for (int i = 0; i < M-1; i++) {
            d[i] = x[i+1] - x[i];
        }
        Arrays.sort(d, Comparator.reverseOrder());

        for (int i = 0; i < N-1; i++) {
            d[i] = 0;
        }

        int sum = Stream.of(d).mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
