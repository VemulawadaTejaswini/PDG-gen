import hiro116s.lib.io.scanner.FastScanner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Main {
    InputStream is;

    int __t__ = 1;
    int __f__ = 0;
    int __FILE_DEBUG_FLAG__ = __f__;
    String __DEBUG_FILE_NAME__ = "src/F5";

    FastScanner in;
    PrintWriter out;


    class Pair {
        final int p;
        final int cnt;

        public Pair(int p, int cnt) {
            this.p = p;
            this.cnt = cnt;
        }
    }

    public void solve() {
        int Q = in.nextInt();

        TreeSet<Pair> ts = new TreeSet<>((p1, p2) -> {
            if (p1.p == p2.p) {
                return p1.cnt - p2.cnt;
            } else {
                return p1.p - p2.p;
            }
        });
        Map<Integer, Integer> counts = new HashMap<>();

        Pair curValue = null;
        long res = 0;

        for (int q = 0; q < Q; q++) {
            int t = in.nextInt();
            if (t == 1) {
                int a = in.nextInt();
                int b = in.nextInt();

                int count = counts.getOrDefault(a, 0);
                counts.put(a, count + 1);
                Pair p = new Pair(a, count);
                ts.add(p);

                if (curValue == null) {
                    res += b;
                    curValue = p;
                } else if (ts.size() % 2 == 1 && curValue.p <= a) {
                    curValue = ts.higher(curValue);
                    res += Math.abs(curValue.p - (long) a) + b;
                } else if (ts.size() % 2 == 0 && curValue.p > a) {
                    res += Math.abs(curValue.p - (long) a) + b;
                    curValue = ts.lower(curValue);
                } else {
                    res += Math.abs(curValue.p - (long) a) + b;
                }
            } else {
                out.println(curValue.p + " " + res);
            }
        }
        out.close();
    }

    public void run() {
        if (__FILE_DEBUG_FLAG__ == __t__) {
            try {
                is = new FileInputStream(__DEBUG_FILE_NAME__);
            } catch (FileNotFoundException e) {
                // TODO 自動生成された catch ブロック
                e.printStackTrace();
            }
            System.out.println("FILE_INPUT!");
        } else {
            is = System.in;
        }
        in = new FastScanner(is);
        out = new PrintWriter(System.out);

        solve();
    }

    public static void main(final String[] args) {
        new Main().run();
    }

}
