
import java.io.*;
import java.util.*;

public class Main {
    public static final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static final PrintStream out = System.out;

    public static void main(String[] args) {
        int N = in.nextInt();
        int M = in.nextInt();

        int[][] T = new int[N][2];
        for (int i = 0; i < N; i++) {
            T[i][0] = in.nextInt();
            T[i][1] = in.nextInt();
        }

        HashMap<BitSet, Long> map = new HashMap<>();
        map.put(new BitSet(), 0L);
        for (int i = M; 0 < i; i--) {
            HashMap<BitSet, Long> tmp = new HashMap<>();

            for (Map.Entry<BitSet, Long> entry : map.entrySet()) {
                BitSet done = entry.getKey();
                Long v = entry.getValue();

                tmp.put(done,v);
                for (int j = 0; j < N; j++) {
                    if (done.get(j)) continue;
                    if (i < T[j][0]) continue;

                    BitSet nk = new BitSet();
                    nk.or(done);
                    nk.set(j);
                    tmp.merge(nk, v + T[j][1], Math::max);
                }
            }

            map = tmp;
        }

        out.println(map.values().stream().max(Comparator.naturalOrder()).orElse(0L));
    }
}
