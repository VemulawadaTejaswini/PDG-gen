import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }

    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        PriorityQueue<Pair> queue = new PriorityQueue<>(new PairComparator());
        for (int i = 0; i < N; i++) {
            long x = scan.nextLong();
            queue.add(new Pair(N, x, i));
        }
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            list.add(i);
        }
        int len = N;
        long ans = 0;
        while(!queue.isEmpty()) {
            Pair p = queue.poll();
            int candidate1 = list.get(0);
            int candidate2 = list.get(len-1);
            long d1 = Math.abs(p.index - candidate1);
            long d2 = Math.abs(p.index - candidate2);
            if (d1 < d2) {
                ans += p.x * d2;
                list.remove(len-1);
            } else {
                ans += p.x * d1;
                list.remove(0);
            }
            len -= 1;
        }
        System.out.println(ans);
    }
    class Pair {
        long x;
        long index;
        long power;
        Pair(long N, long x, long index) {
            this.x = x;
            this.index = index;
            this.power = Math.max(index, N - index) * x;
        }
    }
    class PairComparator implements Comparator<Pair> {
        @Override
        public int compare(Pair o1, Pair o2) {
            if (o1.power != o2.power) {
                return -Long.compare(o1.power, o2.power);
            }
            if (o1.x != o2.x) {
                return -Long.compare(o1.x, o2.x);
            }
            return Long.compare(o1.index, o2.index);
        }
    }
}
