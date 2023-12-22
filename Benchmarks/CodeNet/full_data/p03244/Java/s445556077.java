import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int N = scanner.nextInt();
            int[] vs = new int[N];
            for (int i = 0; i < N; i++) {
                vs[i] = scanner.nextInt();
            }
            Map<Integer, Integer> oddMap = new HashMap<>();
            Map<Integer, Integer> evenMap = new HashMap<>();
            for (int i = 0; i < N; i++) {
                if (i % 2 == 0) {
                    evenMap.compute(vs[i], (k,v) -> v == null ? 1 : v + 1);
                } else {
                    oddMap.compute(vs[i], (k,v) -> v == null ? 1 : v + 1);
                }
            }
            int result = Math.min(compute(N, evenMap, oddMap), compute(N, oddMap, evenMap));
            System.out.println(result);
        }
    }

    static int compute(int n, Map<Integer, Integer> firstMap, Map<Integer, Integer> secondMap) {
        Map.Entry<Integer, Integer> firstKv = firstMap.entrySet().stream().sorted((lhs, rhs) -> rhs.getValue() - lhs.getValue())
                .findFirst().get();
        final int firstVal = firstKv.getKey();
        int change = n / 2 - firstKv.getValue();

        Optional<Map.Entry<Integer, Integer>> secondKv = secondMap.entrySet().stream()
                .filter(kv -> kv.getKey() != firstVal)
                .sorted((lhs, rhs) -> rhs.getValue() - lhs.getValue())
                .findFirst();
        if (secondKv.isPresent()) {
            change += n / 2 - secondKv.get().getValue();
        } else {
            change += n / 2;
        }
        return change;
    }
}
