
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n + 1];
        int[] sum = new int[n + 1];
        for (int i = 1; i <= n; i++) ar[i] = sc.nextInt();

        for (int i = n; i > 0; i--) {
            sum[i] += ar[i];
            if (i != 1) sum[1] += ar[i];
            for (int j = 2;1L * j * j <= 1L * n; j++) if (n % j == 0) {
                sum[j] += ar[i];
            }
        }
//        debug(sum);
        boolean ok = true;
        int cnt = 0;
        LinkedList<Integer> ans = new LinkedList<>();
        PrintWriter out = new PrintWriter(System.out);
        for (int i = n; i > 0; i--) {
            ok &= ar[i] == (sum[i] % 2);
            if (ar[i] != ((sum[i] - ar[i]) % 2)) {
                ans.addFirst(i);
                cnt++;
            }
        }
        if (ok) {
            out.println(cnt);
            if (cnt != 0) {
                out.print(ans.removeFirst());
                for (int a : ans) out.print(" " + a);
                out.println();
            }
        } else {
            out.println(-1);
        }
        out.flush();
    }

    void debug(Object...os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
