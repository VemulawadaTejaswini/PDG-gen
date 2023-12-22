import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        Map<String, Long> S = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String[] s = in.next().split("");
            Arrays.sort(s);
            String ss = String.join("", s);
            if (!S.containsKey(ss)) {
                S.put(ss, 1L);
            } else {
                S.put(ss, S.get(ss) + 1);
            }
        }

        long res = 0;
        for (long v : S.values()) {
            res += v * (v - 1) / 2;
        }

        System.out.println(res);
    }
}
