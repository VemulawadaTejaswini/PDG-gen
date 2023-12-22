import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();
        final int M = sc.nextInt();

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (map.get(a) == null) map.put(a, 0);
            if (map.get(b) == null) map.put(b, 0);
            map.put(a, map.get(a) + 1);
            map.put(b, map.get(b) + 1);
        }

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            System.out.println(e.getValue());
        }
    }
}
