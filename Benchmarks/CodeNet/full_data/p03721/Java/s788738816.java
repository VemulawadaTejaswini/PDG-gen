import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<Integer, Integer> map = new HashMap<>();
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());

        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());

            if (!map.containsKey(a)) map.put(a, 0);

            map.put(a, map.get(a) + b);
        }

        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(map.entrySet());
        entries.sort((o1, o2) -> {
            if (o1.getKey() > o2.getKey()) return 1;
            if (o1.getKey() < o2.getKey()) return -1;
            return 0;
        });

        int ans = 0;
        for (Map.Entry<Integer, Integer> entry : entries) {
            if (entry.getValue() >= K) {
                ans = entry.getKey();
                break;
            } else {
                K -= entry.getValue();
            }
        }

        System.out.println(ans);
    }
}
