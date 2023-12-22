import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashMap<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            int a = sc.nextInt(); //day
            int b = sc.nextInt(); // payment
            if (map.containsKey(a)) {
                map.get(a).add(b);
            } else {
                PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
                pq.add(b);
                map.put(a, pq);
            }
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((x, y) -> y.amount - x.amount);
        long count = 0;
        for(int i = 1; i <= m; i++) {
            if (map.containsKey(i)) {
                PriorityQueue<Integer> queue = map.get(i);
                if (queue.peek() != null) {
                    pq.add(new Pair(i, queue.poll()));
                }
            }
            if (!pq.isEmpty()) {
                Pair p = pq.poll();
                count += p.amount;
                PriorityQueue<Integer> queue = map.get(p.index);
                if (!queue.isEmpty()) {
                    pq.add(new Pair(p.index, queue.poll()));
                }
            }
        }
        System.out.println(count);
    }

    public static class Pair {
        int index;
        int amount;
        Pair(int index, int amount) {
            this.index = index;
            this.amount = amount;
        }
    }

}

