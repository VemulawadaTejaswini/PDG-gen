import java.util.*;
import java.util.stream.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int a = scanner.nextInt(), b = scanner.nextInt(), q = scanner.nextInt();
        List<Long> s = IntStream.range(0, a).mapToObj(i -> scanner.nextLong()).collect(Collectors.toList());
        List<Long> t = IntStream.range(0, b).mapToObj(i -> scanner.nextLong()).collect(Collectors.toList());
        s.sort(Long::compareTo);
        t.sort(Long::compareTo);
        s.add(Long.MAX_VALUE);
        t.add(Long.MAX_VALUE);
        s.add(0, Long.MIN_VALUE);
        t.add(0, Long.MIN_VALUE);

        for (int i = 0; i < q; i++) {
            long x = scanner.nextLong();
            int s1 = Util.binarySearch(s, (e, j) -> e < x);
            int t1 = Util.binarySearch(t, (e, j) -> e < x);
            long sa = s.get(s1) == Long.MIN_VALUE ? s.get(s1 + 1) : s.get(s1);
            long sb = s.get(s1 + 1) == Long.MAX_VALUE ? s.get(s1) : s.get(s1 + 1);
            long ta = t.get(t1) == Long.MIN_VALUE ? t.get(t1 + 1) : t.get(t1);
            long tb = t.get(t1 + 1) == Long.MAX_VALUE ? t.get(t1) : t.get(t1 + 1);
            System.out.println(Math.min(Math.min(Math.min(Math.abs(x - sa) + Math.abs(sa - ta), Math.abs(x - sa) + Math.abs(sa - tb)), Math.min(Math.abs(x - sb) + Math.abs(sb - ta), Math.abs(x - sb) + Math.abs(sb - tb))), Math.min(Math.min(Math.abs(x - ta) + Math.abs(ta - sa), Math.abs(x - ta) + Math.abs(ta - sb)), Math.min(Math.abs(x - tb) + Math.abs(tb - sa), Math.abs(x - tb) + Math.abs(tb - sb)))));
        }
    }
}