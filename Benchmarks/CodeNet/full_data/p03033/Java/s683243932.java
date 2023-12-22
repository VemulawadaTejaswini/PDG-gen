import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br;
    static StringTokenizer st;

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
        br = new BufferedReader(new InputStreamReader(System.in));

        long N;
        N = readLong();
        long Q;
        Q = readLong();
        final List<Event> events = new ArrayList<>();
        for(int i = 0 ; i < N ; i++){
            long S = readLong();
            long T = readLong();
            long X = readLong();

            events.add(new Event(S - X, EventType.INSERT, X));
            events.add(new Event(T - X, EventType.DELETE, X));
        }

        for(int i = 0 ; i < Q ; i++){
            final long D = readLong();
            events.add(new Event(D, EventType.QUERY, i));
        }

        final Solver solver = new Solver();
        solver.solve(Q, events);
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }

    static long readLong() throws IOException {
        return Long.parseLong(next());
    }
}

class Solver {
    public void solve(long Q, List<Main.Event> events) {
        events.sort(Comparator.comparingLong(e -> e.time));

        long[] ANS = new long[(int)(Q)];
        final TreeSet<Long> blocks = new TreeSet<>();

        for (final Main.Event event : events) {
            switch (event.type) {
                case INSERT:
                    blocks.add(event.x);
                    break;
                case DELETE:
                    blocks.remove(event.x);
                    break;
                case QUERY:
                    ANS[(int) event.x] = blocks.isEmpty() ? -1 : blocks.first();
                    break;
            }
        }

        for (final long ans : ANS) {
            System.out.println(ans);
        }
    }
}

