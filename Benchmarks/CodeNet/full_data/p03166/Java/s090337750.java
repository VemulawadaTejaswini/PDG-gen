
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = in.nextInt();
        int m = in.nextInt();
        Map<Integer, List<Integer>> path = new HashMap<>();
        int[] ins = new int[n];
        int[] r = new int[n];
        for (int i = 0; i < m; i++) {
            int from = in.nextInt();
            int to = in.nextInt();
            path.compute(from - 1, (integer, integers) -> {
                if (integers == null) {
                    integers = new ArrayList<>();
                }
                integers.add(to);
                return integers;
            });
            ins[to - 1]++;
        }

        while (true) {
            boolean done = true;
            for (int i = 0; i < n; i++) {
                if (ins[i] == 0) {
                    done = false;
                    ins[i] = -1;
                    List<Integer> tos = path.getOrDefault(i, Collections.emptyList());
                    for (Integer to : tos) {
                        r[to] = Math.max(r[to], r[i] + 1);
                        ins[to]--;
                    }
                }
            }
            if (done) {
                break;
            }
        }
        int result = Integer.MIN_VALUE;
        for (int j = 0; j < n; j++) {
            result = Math.max(result, r[j]);
        }
        System.out.println(1);
    }
}