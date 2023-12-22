import java.io.*;
import java.util.*;

public class Main {
    public static final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static final PrintStream out = System.out;

    public static void main(String[] args) {
        int N = in.nextInt();
        int M = in.nextInt();

        NavigableMap<Integer, TreeSet<Integer>> T = new TreeMap<>();
        for (int i = 0; i < N; i++) {
            T.computeIfAbsent(in.nextInt(), k -> new TreeSet<>(Comparator.reverseOrder()))
                    .add(in.nextInt());
        }

        int cost = 0;
        for (int i = 1; i <= M; i++) {
            Map.Entry<Integer, TreeSet<Integer>> maxE = null;
            for (Map.Entry<Integer, TreeSet<Integer>> entry : T.headMap(i, true).entrySet()) {
                if (maxE == null) {
                    maxE = entry;
                } else if (maxE.getValue().first() < entry.getValue().first()) {
                    maxE = entry;
                }
            }
            if (maxE != null) {
                int key = maxE.getKey();
                TreeSet<Integer> Bs = maxE.getValue();

                Integer first = Bs.first();
                cost += first;
                Bs.remove(first);

                if (Bs.isEmpty()) {
                    T.remove(key);
                }
            }
        }

        out.println(cost);
    }
}