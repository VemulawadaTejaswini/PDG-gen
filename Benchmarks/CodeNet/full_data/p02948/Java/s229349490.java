import java.io.*;
import java.util.*;

public class Main {
    public static final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static final PrintStream out = System.out;

    public static void main(String[] args) {
        int N = in.nextInt();
        int M = in.nextInt();

        NavigableMap<Integer, List<Integer>> T = new TreeMap<>();
        for (int i = 0; i < N; i++) {
            T.computeIfAbsent(in.nextInt(), k -> new LinkedList<>())
                    .add(in.nextInt());
        }
        T.forEach((k, v) -> v.sort(Comparator.reverseOrder()));

        int cost = 0;
        for (int i = 1; i <= M; i++) {
            Map.Entry<Integer, List<Integer>> maxE = null;
            for (Map.Entry<Integer, List<Integer>> entry : T.headMap(i, true).entrySet()) {
                if (maxE == null) {
                    maxE = entry;
                } else if (maxE.getValue().get(0) < entry.getValue().get(0)) {
                    maxE = entry;
                }
            }
            if (maxE != null) {
                int key = maxE.getKey();
                List<Integer> Bs = maxE.getValue();

                cost += Bs.remove((int) 0);
                if (Bs.isEmpty()) {
                    T.remove(key);
                }
            }
        }

        out.println(cost);
    }
}
