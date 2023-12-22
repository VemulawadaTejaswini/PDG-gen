
import java.io.*;
import java.security.*;
import java.util.*;

public class Main {
    public static final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static final PrintStream out = System.out;

    public static void main(String[] args) {
        int N = in.nextInt();
        int M = in.nextInt();

        Map<Integer, List<Integer>> T = new TreeMap<>(Comparator.reverseOrder());
        for (int i = 0; i < N; i++) {
            T.computeIfAbsent(in.nextInt(), k -> new ArrayList<>())
                    .add(in.nextInt());
        }
        T.forEach((k, v) -> v.sort(Comparator.reverseOrder()));

        //out.println(T);

        Map<Integer, Integer> data = new HashMap<>();
        data.put(M, 0);
        for (Map.Entry<Integer, List<Integer>> entry : T.entrySet()) {
            int A = entry.getKey();
            List<Integer> Bs = entry.getValue();

            Map<Integer, Integer> tmp = new HashMap<>();
            for (Map.Entry<Integer, Integer> e : data.entrySet()) {
                int remainTime = e.getKey();
                int cost = e.getValue();

                tmp.merge(remainTime, cost, Math::max);

                for (int i = 0; i < Bs.size() && A <= remainTime - i; i++) {
                    int B = Bs.get(i);
                    cost += B;
                    //out.println("A: " + A + ", remainTime: " + remainTime + ", i: " + i + ", B: " + B + ", cost:" + cost);

                    tmp.merge(remainTime - (i + 1), cost, Math::max);
                }
            }
            ///out.println(tmp);

            data = tmp;
        }

        out.println(data.values().stream().max(Comparator.naturalOrder()).orElse(0));
    }
}
