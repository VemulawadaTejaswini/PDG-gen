import java.util.stream.*;
import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] ab = IntStream.range(0, m).mapToObj(i -> new int[] {scanner.nextInt(), scanner.nextInt()}).sorted(Comparator.comparingInt(a -> a[1])).toArray(int[][]::new);

        int ans = 0;
        for (int i = 0, l = -1; i < m; i++) {
            if (ab[i][0] > l) {
                l = ab[i][1] - 1;
                ans++;
            }
        }
        System.out.println(ans);
    }
}