import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        PriorityQueue<Integer> a = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            a.add(Integer.parseInt(sc.next()));
        }
        for (int i = 0; i < m; i++) {
            int u = Integer.parseInt(sc.next());
            int v = Integer.parseInt(sc.next());
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
        long sum = a.stream().collect(Collectors.summingInt(Integer::intValue));
        System.out.println(sum);
    }
}