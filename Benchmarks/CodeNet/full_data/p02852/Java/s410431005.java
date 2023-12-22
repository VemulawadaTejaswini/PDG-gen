import hiro116s.lib.io.scanner.FastScanner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

    public void solve() {
        int n = in.nextInt();
        int m = in.nextInt();
        String s = new StringBuilder(in.next()).reverse().toString();
        int[] prev = new int[n+1];
        for (int i = 1; i <= n; i++) {
            if (s.charAt(i) == '0') {
                prev[i] = i;
            } else {
                prev[i] = prev[i - 1];
            }
        }

        int cur = 0;
        List<Integer> res = new ArrayList<>();
        while (cur < n) {
            int next = prev[Math.min(cur + m, n)];
            if (cur == next) {
                System.out.println("-1");
                return;
            }
            res.add(next - cur);
            cur = next;
        }
        for (int i = res.size() - 1; i >= 0; i--) {
            out.print(res.get(i) + " ");
        }
        out.println();
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
