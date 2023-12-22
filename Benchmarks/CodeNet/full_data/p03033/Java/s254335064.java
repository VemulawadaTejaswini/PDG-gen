import java.io.*;
import java.util.*;

public class Main {

    public enum EventType {
        INSERT,
        DELETE,
        QUERY
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

        for(int i = 0 ; i < Q ; i++){
            final long D = sc.nextLong();
            events.add(new Event(D, EventType.QUERY, i));
        }

        final Solver solver = new Solver();
        solver.solve(N, Q, events);
    }
}

class Solver {
    public void solve(long N, long Q, List<Main.Event> events) {
        events.sort(Comparator.comparingLong(e -> e.time));

        long[] ANS = new long[(int)(Q)];
        final TreeSet<Long> blocks = new TreeSet<>();

        for (final Main.Event event : events) {
            switch (event.type) {
                case QUERY:
                    ANS[(int) event.x] = blocks.isEmpty() ? -1 : blocks.first();
                    break;
                case INSERT:
                    blocks.add(event.x);
                    break;
                case DELETE:
                    blocks.remove(event.x);
                    break;
            }
        }


        for (final long ans : ANS) {
            System.out.println(ans);
        }
    }
}

