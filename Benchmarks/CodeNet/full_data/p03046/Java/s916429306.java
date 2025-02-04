
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    void run() {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), k = sc.nextInt();
        int[] pow = new int[m + 1];
        pow[0] = 1;
        for (int i = 1; i <= m; i++) {
            pow[i] = pow[i - 1] * 2;
        }
        if (k >= pow[m]) {
            System.out.println(-1);
            return;
        }
        int[] ans = new int[1 << (2 * m)];
        if (k == 0) {

            for (int i = 0; i < (1 << m); i++) {
                ans[i * 2] = ans[i * 2 + 1] = i;
            }
        } else {
            for (int i = 0; i < (1 << m); i++) {
                ans[i] = ans[(1 << m) + i] = i;
            }
            int t = ans[k + 1];
            ans[k + 1] = ans[(1 << m) + k - 1];
            ans[(1 << m) + k - 1] = t;
        }


        PrintWriter out = new PrintWriter(System.out);

        out.print(ans[0]);
        for (int i = 1; i < (1 << (2 * m)); i++) {
            out.print(" " + ans[i]);
        }
        out.println();
        out.flush();
    }

    void debug(Object...os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
