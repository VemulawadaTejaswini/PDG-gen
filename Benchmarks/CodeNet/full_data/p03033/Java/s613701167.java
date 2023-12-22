import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static class Node {
        int val;
        int to;

        public Node(int val, int to) {
            this.val = val;
            this.to = to;
        }
    }

    static class Event {
        int time;
        int cnt;
        int id;

        public Event(int time, int cnt, int id) {
            this.time = time;
            this.cnt = cnt;
            this.id = id;
        }
    }

    static class Val {
        int val;
        int index;

        public Val(int val, int index) {
            this.val = val;
            this.index = index;
        }
    }

    // int N = scanner.nextInt();
    // scanner.nextLine();
    // int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    static void solve(Scanner scanner) {
        int N = scanner.nextInt(), Q = scanner.nextInt();
        scanner.nextLine();
        Event[] events = new Event[2 * N];
        for (int i = 0; i < N; i++) {
            int q[] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            events[i] = new Event(q[0] - q[2], 1, q[2]);
            events[N + i] = new Event(q[1] - q[2], -1, q[2]);
        }
        Arrays.sort(events, Comparator.comparingInt(x -> x.time));

        TreeSet<Val> rem = new TreeSet<>(Comparator.comparingInt(x -> x.val));
        for (int i = 0; i < Q; i++) {
            rem.add(new Val(Integer.parseInt(scanner.nextLine()), i));
        }

        TreeMap<Integer, Integer> activeEvents = new TreeMap<>();
        int[] ans = new int[Q];
        for (int i = 0; i < events.length; i++) {
            Event e = events[i];
            if (i == events.length - 1 || e.time < events[i + 1].time) {
                for (Val v : new ArrayList<>(rem.subSet(new Val(Integer.MIN_VALUE, 0), new Val(e.time, 0)))) {
                    if (activeEvents.isEmpty()) {
                        ans[v.index] = -1;
                    } else {
                        ans[v.index] = activeEvents.firstKey();
                    }
                    rem.remove(v);
                }
            }
            if (e.cnt == 1) {
                activeEvents.put(e.id, activeEvents.getOrDefault(e.id, 0) + 1);
            } else {
                activeEvents.put(e.id, activeEvents.getOrDefault(e.id, 1) - 1);
                if (activeEvents.get(e.id) == 0) {
                    activeEvents.remove(e.id);
                }
            }

        }

        for (Val v : rem) {
            ans[v.index] = -1;
        }

        for (int i : ans) {
            System.out.println(i);
        }
    }

}