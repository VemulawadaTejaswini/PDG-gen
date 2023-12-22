import hiro116s.lib.io.scanner.FastScanner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    InputStream is;

    int __t__ = 1;
    int __f__ = 0;
    int __FILE_DEBUG_FLAG__ = __f__;
    String __DEBUG_FILE_NAME__ = "src/E2";

    FastScanner in;
    PrintWriter out;

    public void solve() {
        int n = in.nextInt();
        int[] a = in.nextIntArray(n);
        Arrays.sort(a);

        StringBuilder res = new StringBuilder();
        int cur = a[0];
        int x = 1;
        while (x < n && a[x] < 0) x++;
        for (int i = x; i < n - 1; i++) {
            res.append(cur).append(" ").append(a[i]).append("\n");
            cur -= a[i];
        }
        res.append(a[n - 1]).append(" ").append(cur).append("\n");
        cur = a[n-1] - cur;
        for (int i = 1; i < x; i++) {
            res.append(cur).append(" ").append(a[i]).append("\n");
            cur -= a[i];
        }
        out.println(cur);
        out.print(res);
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
