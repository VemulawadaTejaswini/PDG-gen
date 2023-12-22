import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int C = scanner.nextInt();

        Map<Integer, Integer>[] a = new Map[C];
        int[] count = new int[100002];

        for (int i = 0; i < n; i++) {
            int s = scanner.nextInt();
            int t = scanner.nextInt();
            int c = scanner.nextInt() - 1;

            if (a[c] == null)
                a[c] = new HashMap<>();

            a[c].put(s, a[c].getOrDefault(s, 0) + 1);
            a[c].put(t + 1, a[c].getOrDefault(t + 1, 0) - 1);
        }

        for (int i = 0; i < C; i++) {
            for (int j = 1, t = 0; j < 1000002; j++) {
                if (a[i] != null && a[i].containsKey(j))
                    t += a[i].get(j);
                count[j] += t;
            }
        }

        Arrays.stream(count).max().ifPresent(System.out::println);
    }
}