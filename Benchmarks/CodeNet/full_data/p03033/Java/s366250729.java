import java.io.*;
import java.util.*;

public class Main {

    public enum EventType {
        INSERT,
        DELETE
    }
    public static class Event {
        final long time;
        final EventType type;
        final long x;

        public Event(final long time, final EventType type, final long x) {
            this.time = time;
            this.type = type;
            this.x = x;
        }
    }

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        long Q;
        Q = sc.nextLong();
        final List<Event> events = new ArrayList<>();
        for(int i = 0 ; i < N ; i++){
            long S = sc.nextLong();
            long T = sc.nextLong();
            long X = sc.nextLong();

            events.add(new Event(S - X, EventType.INSERT, X));
            events.add(new Event(T - X, EventType.DELETE, X));
        }
        long[] D = new long[(int)(Q)];
        for(int i = 0 ; i < Q ; i++){
            D[i] = sc.nextLong();
        }

        final Solver solver = new Solver();
        solver.solve(N, Q, events, D);
    }
}

class Solver {
    public void solve(long N, long Q, List<Main.Event> events, long[] D) {
        events.sort(Comparator.comparingLong(e -> e.time));

        for (int i = 0; i < Q; i++) {
            final TreeSet<Long> blocks = new TreeSet<>();
            for (final Main.Event event : events) {
                if (event.time > D[i]) {
                    break;
                }

                if (event.type == Main.EventType.INSERT) {
                    blocks.add(event.x);
                } else {
                    blocks.remove(event.x);
                }
            }

            if (blocks.isEmpty()) {
                System.out.println(-1);
            }
            else {
                System.out.println(blocks.first());
            }
        }
    }
}

