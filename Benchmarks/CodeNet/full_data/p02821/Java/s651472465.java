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
        long M = scan.nextLong();
        List<Long> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(scan.nextLong());
        }
        A.sort(Comparator.reverseOrder());
        PriorityQueue<HandShake> queue = new PriorityQueue<>(new HandShakeComparator());
        HashSet<String> added = new HashSet<>();
        for (int i = 0; i < N; i++) {
            HandShake s = new HandShake(0, A.get(0), i, A.get(i));
            added.add(s.key());
            queue.add(s);
        }
        long answer = 0;
        long count = 0;
        while(!queue.isEmpty() && count < M) {
            HandShake s = queue.poll();
            answer += s.point();
            count += 1;
            if (s.left_index + 1 < N) {
                String key = (s.left_index + 1) + ":" + s.right_index;
                if (!added.contains(key)) {
                    added.add(key);
                    queue.add(new HandShake(s.left_index + 1, A.get(s.left_index + 1), s.right_index, A.get(s.right_index)));
                }
            }
            if (s.right_index + 1 < N) {
                String key = s.left_index + ":" + (s.right_index + 1);
                if (!added.contains(key)) {
                    added.add(key);
                    queue.add(new HandShake(s.left_index, A.get(s.left_index), s.right_index + 1, A.get(s.right_index + 1)));
                }
            }
        }
        System.out.println(answer);
    }
    class HandShake {
        int left_index;
        int right_index;
        long left_value;
        long right_value;
        HandShake(int left_index, long left_value, int right_index, long right_value) {
            this.left_index = left_index;
            this.right_index = right_index;
            this.left_value = left_value;
            this.right_value = right_value;
        }
        long point() {
            return this.left_value + this.right_value;
        }
        String key() {
            return this.left_index + ":" + this.right_index;
        }
    }
    class HandShakeComparator implements Comparator<HandShake> {
        @Override
        public int compare(HandShake o1, HandShake o2) {
            long p1 = o1.point();
            long p2 = o2.point();
            if (p1 != p2) {
                return -Long.compare(p1, p2);
            }
            if (o1.left_index != o2.left_index) {
                return Long.compare(o1.left_index, o2.left_index);
            }
            return Long.compare(o1.right_index, o2.right_index);
        }
    }
}
