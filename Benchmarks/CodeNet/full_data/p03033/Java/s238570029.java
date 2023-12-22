import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Roadwork
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int Q = sc.nextInt();

            List<Event> events = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                int S = sc.nextInt();
                int T = sc.nextInt();
                int X = sc.nextInt();

                events.add(new Event(S - X, 1, X));
                events.add(new Event(T - X, -1, X));
            }

            Collections.sort(events, (o1, o2) -> {
                return Integer.compare(o1.time, o2.time);
            });

            int[] D = new int[Q];
            for (int i = 0; i < Q; i++) {
                D[i] = sc.nextInt();
            }

            int[] A = new int[Q];
            Arrays.fill(A, -1);

            List<Integer> queue = new ArrayList<>();
            int index = 0;

            for (Event event : events) {
                while (index < D.length && event.time > D[index]) {
                    if (!queue.isEmpty()) {
                        A[index] = queue.get(0);
                    }
                    index++;
                }

                if (event.type == 1) {
                    int pos = Collections.binarySearch(queue, event.x);
                    if (pos < 0) {
                        pos = -(pos + 1);
                    }
                    queue.add(pos, event.x);
                } else {
                    int pos = Collections.binarySearch(queue, event.x);
                    queue.remove(pos);
                }
            }

            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < Q; i++) {
                ans.append(A[i]).append("\n");
            }

            System.out.print(ans.toString());
        }
    }

    static class Event {

        int time;

        int type;

        int x;

        public Event(int time, int type, int x) {
            this.time = time;
            this.type = type;
            this.x = x;
        }

    }

}
