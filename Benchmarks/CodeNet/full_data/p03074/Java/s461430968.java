import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Eric
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DHandstand solver = new DHandstand();
        solver.solve(1, in, out);
        out.close();
    }

    static class DHandstand {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int K = in.nextInt();
            String S = in.next();

            int res = solve(S, K);
            out.println(res);
        }

        public int solve(String S, int K) {
            char car0 = '0';
            char car1 = '1';

            List<Integer> list0 = new ArrayList<>();
            List<Integer> list1 = new ArrayList<>();
            char cur = '-';
            int nb = 0;
            for (int i = 0; i < S.length(); i++) {
                char c = S.charAt(i);
                if (c == cur) {
                    nb++;
                } else {
                    if (cur != '-') {
                        if (cur == car1)
                            list0.add(nb);
                        else if (cur == car0)
                            list1.add(nb);
                    }
                    nb = 1;
                    cur = c;
                }
            }
            if (cur == car1)
                list0.add(nb);
            else if (cur == car0)
                list1.add(nb);
            else
                throw new RuntimeException("!");

            Integer[] list1a = list0.toArray(new Integer[0]);
            Integer[] list0a = list1.toArray(new Integer[0]);

            int current = 0;
            int cur1 = 0;
            int cur0 = 0;
            if (S.charAt(0) == car1)
                current = list1a[cur1++];
            int k = 0;
            while (true) {
                k++;
                if (Math.abs(cur1 - cur0) > 1)
                    throw new RuntimeException("!");
                if (k > K) {
                    break;
                }
                if (cur0 >= list0a.length)
                    break;
                current += list0a[cur0++];

                if (cur1 >= list1a.length)
                    break;
                current += list1a[cur1++];
            }

            int res = current;
            while (true) {
                if (Math.abs(cur1 - cur0) > 1)
                    throw new RuntimeException("!");

                if (K > 0) {
                    if (cur0 >= K)
                        current -= list0a[cur0 - K];
                    if (cur1 >= K + 1)
                        current -= list1a[cur1 - K - 1];

                    if (cur0 >= list0a.length)
                        break;
                    current += list0a[cur0++];

                    if (cur1 >= list1a.length)
                        break;
                    current += list1a[cur1++];
                } else {
                    cur0++;
                    if (cur1 >= list1a.length)
                        break;
                    current = list1a[cur1++];
                }

                res = Math.max(res, current);
            }

            res = Math.max(res, current);


            return res;
        }

    }
}

