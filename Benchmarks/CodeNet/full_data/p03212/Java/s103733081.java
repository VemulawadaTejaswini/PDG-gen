import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.LinkedList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        static int n;
        static int keta;
        static int ans;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String str = in.next();
            n = Integer.parseInt(str);
            keta = str.length();
            ans = 0;

            LinkedList<String> A = new LinkedList<>();

            dfs(0, 0, 0, 0);

            out.println(ans);

        }

        public static int dfs(long num, int x, int y, int z) {
            if (num > n) {
                return 0;
            }
            dfs(num * 10 + 3, x + 1, y, z);
            dfs(num * 10 + 5, x, y + 1, z);
            dfs(num * 10 + 7, x, y, z + 1);
            if (x > 0 && y > 0 && z > 0) ans++;

            return ans;
        }

    }
}

