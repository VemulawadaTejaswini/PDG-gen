import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    static class Course {
        final int cost;
        final int time;

        Course(final int cost, final int time) {
            this.cost = cost;
            this.time = time;
        }
    }

    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int T = sc.nextInt();

        final PriorityQueue<Course> queue = new PriorityQueue<>((c1, c2) -> (c1.cost - c2.cost));
        for (int i = 0; i < N; i++) {
            final int c = sc.nextInt();
            final int t = sc.nextInt();
            if (t <= T) {
                queue.offer(new Course(c, t));
            }
        }
        if (queue.isEmpty()) {
            System.out.println("TLE");
            return;
        }
        System.out.println(queue.poll().cost);
    }
}
