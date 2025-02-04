import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<Long, Long> map = new HashMap<>();
        long N = Long.parseLong(sc.next());
        BigInteger K = new BigInteger(sc.next());

        for (int i = 0; i < N; i++) {
            long a = Long.parseLong(sc.next());
            long b = Long.parseLong(sc.next());

            if (!map.containsKey(a)) map.put(a, 0L);

            map.put(a, map.get(a) + b);
        }

        List<Map.Entry<Long, Long>> entries = new ArrayList<>(map.entrySet());
        entries.sort((o1, o2) -> {
            if (o1.getKey() > o2.getKey()) return 1;
            if (o1.getKey() < o2.getKey()) return -1;
            return 0;
        });

        long ans = 0;
        for (Map.Entry<Long, Long> entry : entries) {
            if (K.compareTo(new BigInteger(String.valueOf(entry.getValue()))) <= 0) {
                ans = entry.getKey();
                break;
            } else {
                K = K.subtract(BigInteger.valueOf(entry.getValue()));
            }
        }

        System.out.println(ans);
    }
}
