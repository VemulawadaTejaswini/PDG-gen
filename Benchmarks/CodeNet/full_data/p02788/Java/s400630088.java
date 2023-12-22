import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();
        int A = sc.nextInt();

        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->a.x-b.x);
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int h = sc.nextInt();
            pq.offer(new Pair(x, h));
        }

        long totalDamage = 0;
        long ans = 0;
        LinkedList<Pair> q = new LinkedList<>();
        while (!pq.isEmpty()) {
            Pair m = pq.poll();
            int x = m.x;
            long h = m.v;
            while (q.size() > 0 && q.peek().x < x) {
                totalDamage -= q.poll().v;
            }
            
            if (h >= totalDamage) {
                h -= totalDamage;
                long atackNum = Math.max((h+A-1)/A, 0);
                ans += atackNum;
                totalDamage += atackNum*A;
                q.offer(new Pair(x+2*D, atackNum*A));
            }
        }

        System.out.println(ans);
    }

    private static class Pair {
        private final int x;
        private final long v;
        Pair(int x, long v) {
            this.x = x;
            this.v = v;
        }
    }
}
