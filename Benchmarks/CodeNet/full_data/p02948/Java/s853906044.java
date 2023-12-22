import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.solve();
    }
    public void solve() throws Exception {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int M = scan.nextInt();
        PriorityQueue<Task> queue = new PriorityQueue<>(new TaskComparator());
        for (int i = 0; i < N; i++) {
            int A = scan.nextInt();
            long B = scan.nextLong();
            Task t = new Task();
            t.DEAD = M - A;
            t.A = A;
            t.B = B;
            queue.add(t);
        }
        long answer = 0;
        for (int i = 0; i < N; i++) {
            Task t = queue.poll();
            if (t.DEAD < i) {
                continue;
            }
            answer += t.B;
        }
        System.out.println(answer);
    }
    class Task {
        int DEAD;
        int A;
        long B;
    }
    class TaskComparator implements Comparator<Task> {
        @Override
        public int compare(Task o1, Task o2) {
            if (o1.B == o2.B) {
                return Integer.compare(o1.DEAD, o2.DEAD);
            }
            return -Long.compare(o1.B, o2.B);
        }
    }
    class LowerBoundTaskComparator implements Comparator<Task> {
        public int compare(Task o1, Task o2) {
            if (o1.A == o2.A) {
                return Long.compare(o1.B, o2.B) <= 0 ? 1 : -1;
            }
            return Integer.compare(o1.A, o2.A) <= 0 ? 1 : -1;
        }
    }
}
