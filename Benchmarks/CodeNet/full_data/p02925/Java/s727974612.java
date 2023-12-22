
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static class Player {
        int[] expected;
        int index;
        int lastDay = -1;

        public Player(int[] expected) {
            this.expected = expected;
        }

        public void play(int day) {
            index++;
            lastDay = day;
        }

        public int who() {
            return expected[index];
        }

        public boolean isDone() {
            return index == expected.length;
        }
    }

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final int n = in.nextInt();
        final Map<Integer, Player> lists = new HashMap<>();
        for (int i = 0; i < n; i++) {
            final Queue<Integer> queue = new LinkedList<>();
            int[] expected = new int[n - 1];
            for (int j = 0; j < n - 1; j++) {
                expected[j] = in.nextInt() - 1;
            }
            lists.put(i, new Player(expected));
        }
        int count = 0;
        while (true) {
            boolean inProgress = false;
            boolean allEmpty = true;
            for (Iterator<Map.Entry<Integer, Player>> iterator = lists.entrySet().iterator(); iterator.hasNext(); ) {
                Map.Entry<Integer, Player> entry = iterator.next();
                final Integer i = entry.getKey();
                final Player from = entry.getValue();
                if (from.isDone()) {
                    iterator.remove();
                    continue;
                }
                if (from.lastDay == count) {
                    continue;
                }
                allEmpty = false;
                final int t = from.who();
                final Player target = lists.get(t);
                if (target.lastDay != count && target.who() == i) {
                    from.play(count);
                    target.play(count);
                    inProgress = true;
                }
            }
            if (allEmpty) {
                break;
            }
            count++;
            if (!inProgress) {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(count);
    }
}
