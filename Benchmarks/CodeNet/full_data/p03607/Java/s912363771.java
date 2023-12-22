import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < N; ++i) {
            String S = sc.next();
            map.put(S, map.getOrDefault(S, 0));
            map.put(S, map.get(S) + 1);
        }
        sc.close();

        int ans = 0;
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if (e.getValue() % 2 != 0) {
                ++ans;
            }
        }

        System.out.println(ans);

    }
}