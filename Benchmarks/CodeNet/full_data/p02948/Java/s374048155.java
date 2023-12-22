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
        Queue<Integer> E = new PriorityQueue<>();
        Queue<Integer> Q = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 1; i <= M; i++) {
            Q.addAll(T.getOrDefault(i, E));

            if (!Q.isEmpty()) {
                cost += Q.remove();
            }
        }

        out.println(cost);
    }
}
