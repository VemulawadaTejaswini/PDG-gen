import java.util.*;
import java.util.stream.*;

public class Main {
    public void main(Scanner sc) {
        int n = sc.nextInt();
        long maxw = sc.nextLong();
        Sina sina[] = new Sina[n];
        for (int i = 0; i < n; i++) {
            sina[i] = new Sina(sc.nextLong(), sc.nextLong());
        }

        Arrays.sort(sina,
            (o1, o2) -> (o1.w == o2.w) ? Long.compare(o2.v, o1.v) : Long.compare(o1.w, o2.w));

        Map<Long, Long> map = new HashMap<>();
        map.put(0L, 0L);
        for (int i = 0; i < n; i++) {
            long w = sina[i].w;
            long v = sina[i].v;

            List<Map.Entry<Long, Long>> list =
                map.entrySet().stream().sorted((o1, o2) -> Long.compare(o1.getKey(), o2.getKey()))
                    .collect(Collectors.toList());
            for (Map.Entry<Long, Long> e : list) {
                long newKey = e.getKey() + w;
                long newValue = e.getValue() + v;
                if (maxw < newKey) {
                    continue;
                }
                map.compute(newKey, (k, ov) -> ov == null ? newValue : Math.max(ov, newValue));
            }
        }

        System.out.println(map.values().stream().max((o1, o2) -> Long.compare(o1, o2)).get());
    }

    private class Sina {
        long w, v;

        public Sina(long w, long v) {
            this.w = w;
            this.v = v;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
