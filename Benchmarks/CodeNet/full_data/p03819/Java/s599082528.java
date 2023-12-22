import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    private static void solve(Scanner in) {
        int N = in.nextInt(), M = in.nextInt();
        int[] l = new int[N + 1], r = new int[N + 1];
        for (int i = 1; i < N + 1; i++) {
            l[i] = in.nextInt();// 1 <= l <= r <= M
            r[i] = in.nextInt();
        }

        Map<Integer, List<Integer>> nByLen = new HashMap<>();
        for (int n = 1; n < N + 1; n++) {
            int s = r[n] - l[n] + 1;
            if (nByLen.get(s) == null) {
                nByLen.put(s, new ArrayList<>());
            }
            nByLen.get(s).add(n);
        }

        int accum = N;

        Fenwick F = new Fenwick(M);
        for (int d = 1; d < M + 1; d++) {
            if (nByLen.get(d) != null) {
                accum -= nByLen.get(d).size();
                for (int i : nByLen.get(d)) {
                    F.add(l[i], 1);
                    F.add(r[i] + 1, -1);
                }
            }
            int sum = accum;
            for (int e = d; e < M + 1; e += d) {
                sum += F.accum(e);
            }
            System.out.println(sum);
        }
    }
}

class Fenwick {
    private final long[] fenwick;

    public Fenwick(int n) {
        fenwick = new long[n + 1];
    }

    public long accum(int i) {
        long sum = 0;
        for (; i >= 0; i = (i & (i + 1)) - 1) {
            sum += fenwick[i];
        }
        return sum;
    }

    public long sum(int begin, int end) {
        return accum(end) - accum(begin - 1);
    }

    public void add(int i, long a) {
        for (; i < fenwick.length; i = i | i + 1) {
            fenwick[i] += a;
        }
    }

    @Override
    public String toString() {
        int N = fenwick.length;
        long[] raw = new long[N];
        long[] acc = new long[N];
        for (int i = 1; i < N; i++) {
            acc[i] = accum(i);
            raw[i] = acc[i] - acc[i - 1];
        }
        StringBuilder s = new StringBuilder();
        s.append("Fenwick [\n");
        s.append(" fenwick=" + Arrays.toString(fenwick) + "\n");
        s.append(" accum  =" + Arrays.toString(acc) + "\n");
        s.append(" raw    =" + Arrays.toString(raw) + "\n]");
        return s.toString();
    }
}