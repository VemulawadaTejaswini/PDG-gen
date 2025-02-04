
import java.util.*;

public class Main {

    long MOD = (long) 1e9 + 7;

    void run() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n + 1];
        int[] b = new int[n + 1];
        int[] c0 = new int[n + 1];
        c0[0] = 1;

        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
            b[i] ^= b[i - 1] ^ a[i];
            c0[i] = c0[i - 1] + (b[i] == 0 ? 1 : 0);
            if (b[i] != 0) {
                ArrayList<Integer> l = map.getOrDefault(b[i], new ArrayList<>());
                l.add(i);
                map.put(b[i], l);
            }
        }

//        debug(a);
//        debug(b);
//        debug(c0);
//        debug(map);

        if (b[n] != 0) {
            long[] z = new long[2];
            long[] x = new long[2];

            int f = 0;
            z[0] = 1;

            for (int i = 1; i <= n; i++) {
                f = 1 - f;
                z[f] = (z[1 - f] + (b[f] == b[n] ? x[1 - f] : 0)) % MOD;
                x[f] = (x[1 - f] + (b[f] == 0 ? z[1 - f] : 0)) % MOD;
//                debug(x[f], z[f]);
            }

            System.out.println(x[f]);
        } else {
            long ans = 1;
            for (int i = 1; i <= c0[n] - 2; i++) ans = (ans * 2) % MOD;
            for (Map.Entry<Integer, ArrayList<Integer>> entry: map.entrySet()) {
                long[] z = new long[2];
                long[] x = new long[2];

                int f = 0;
                z[0] = 1;

                ArrayList<Integer> ps = entry.getValue();
                int len = ps.size();
                for (int i = 1; i < len; i++) {
                    f = 1 - f;
                    z[f] = (z[1 - f] + x[1 - f] * (c0[ps.get(i)] - c0[ps.get(i - 1) - 1]) + 1) % MOD;
                    x[f] = (x[1 - f] + z[1 - f] * (c0[ps.get(i)] - c0[ps.get(i - 1) - 1]) + 1) % MOD;
//                    debug(entry.getKey(), z[f], x[f]);
                }
//                debug(entry.getKey(), x[f], z[f]);
                ans = (ans + x[f] + 1) % MOD;
            }
            System.out.println(ans);
        }

    }

    void debug(Object...os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
