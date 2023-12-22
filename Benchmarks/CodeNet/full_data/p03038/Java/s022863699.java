import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        long m = Long.parseLong(sc.next());
        PriorityQueue<Long> a = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            a.add(Long.parseLong(sc.next()));
        }
        for (int i = 0; i < m; i++) {
            long u = Long.parseLong(sc.next());
            long v = Long.parseLong(sc.next());
            for (int j = 0; j < u; j++) {
                if (a.peek() < v) {
                    a.poll();
                    a.add(v);
                } else {
                    break;
                }
            }
        }
        sc.close();
        long sum = a.stream().collect(Collectors.summingLong(Long::longValue));
        System.out.println(sum);
    }
}