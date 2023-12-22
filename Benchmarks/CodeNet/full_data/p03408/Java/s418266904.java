import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String s = sc.next();
            if (!map.containsKey(s)) map.put(s, 0);
            map.put(s, map.get(s) + 1);
        }

        final int M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            String t = sc.next();
            if (!map.containsKey(t)) map.put(t, 0);
            if (map.get(t) > 0) map.put(t, map.get(t) - 1);
        }

        Map.Entry<String, Integer> ans = map.entrySet().stream()
                .max(Comparator.comparing(Map.Entry::getValue))
                .get();

        System.out.println(ans.getValue());
    }
}
