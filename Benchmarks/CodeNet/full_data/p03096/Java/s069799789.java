
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    private static long MOD = 1_000_000_007;

    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final List<Integer> list = IntStream.range(0, n)
                .mapToObj(i -> scanner.nextInt())
                .collect(Collectors.toList());

        final Map<Integer, List<Integer>> map = new HashMap<>();
        final long[] sums = new long[n];
        int prev = list.get(0);
        sums[0] = 1;
        map.computeIfAbsent(list.get(0), v -> new ArrayList<>()).add(0);
        for (int i = 1; i < list.size(); i++) {
            sums[i] = sums[i - 1];
            final int current = list.get(i);
            if (prev == current) {
                continue;
            }
            prev = current;

            final List<Integer> indices = map.get(current);
            if (indices == null) {
                map.put(current, new ArrayList<>());
                map.get(current).add(i);
                continue;
            }

            for (final int index : indices) {
                if (index == 0) {
                    sums[i]++;
                    sums[i] %= MOD;
                    continue;
                }
                sums[i] += sums[index - 1];
                sums[i] %= MOD;
            }
            indices.add(i);
        }
        System.out.println(sums[n - 1]);
    }
}
