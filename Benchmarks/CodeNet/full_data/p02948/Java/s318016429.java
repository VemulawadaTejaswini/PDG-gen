import java.io.*;
import java.util.*;

public class Main {
    public static final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static final PrintStream out = System.out;

    public static void main(String[] args) {
        int N = in.nextInt();
        int M = in.nextInt();

        NavigableMap<Integer, Queue<Integer>> T = new TreeMap<>();
        for (int i = 0; i < N; i++) {
            T.computeIfAbsent(in.nextInt(), k -> new PriorityQueue<>(Comparator.reverseOrder()))
                    .add(in.nextInt());
        }

        int cost = 0;
        for (int i = 1; i <= M; i++) {
            Map.Entry<Integer, Queue<Integer>> maxE = null;
            for (Map.Entry<Integer, Queue<Integer>> entry : T.headMap(i, true).entrySet()) {
                if (maxE == null) {
                    maxE = entry;
                } else if (maxE.getValue().element() < entry.getValue().element()) {
                    maxE = entry;
                }
            }
            if (maxE != null) {
                int key = maxE.getKey();
                Queue<Integer> Bs = maxE.getValue();

                cost += maxE.getValue().remove();
                if (Bs.isEmpty()) {
                    T.remove(key);
                }
            }
        }

        out.println(cost);
    }
}
