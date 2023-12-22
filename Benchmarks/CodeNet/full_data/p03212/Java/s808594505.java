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
        static long tmp;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String str = in.next();
            n = Integer.parseInt(str);
            keta = str.length();
            ans = 0;

            LinkedList<String> A = new LinkedList<>();

            dfs(A);

            out.println(ans);

        }

        public static void dfs(LinkedList<String> A) {
            if (3 <= A.size() && A.size() <= keta) {
                tmp = Long.parseLong(String.join("", A));
                if (tmp <= n) {
                    if (A.contains("3") && A.contains("5") && A.contains("7")) ans++;
//                System.out.print(A.toString());
//                System.out.print("\n");
                }

                if (A.size() == keta) return;
            }

            for (int i = 3; i <= 7; i = i + 2) {
                A.offerLast(Integer.toString(i));
                dfs(A);
                A.pollLast();
            }
        }

    }
}

