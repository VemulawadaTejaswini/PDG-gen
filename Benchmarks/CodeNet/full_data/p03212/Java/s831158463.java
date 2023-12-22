import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        long N = in.nextLong();

        Queue<Long> q = new PriorityQueue<>();
        q.add(3L);
        q.add(5L);
        q.add(7L);

        long res = 0;
        while (!q.isEmpty()) {
            long a = q.poll();
            if (a > N) {
                break;
            }

            String s = Long.toString(a);
            if (s.contains("3") && s.contains("5") && s.contains("7")) {
                res += 1;
            }
            q.add(a * 10 + 3);
            q.add(a * 10 + 5);
            q.add(a * 10 + 7);
        }

        System.out.println(res);
    }
}

