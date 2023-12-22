import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.TreeMap;
import java.util.PriorityQueue;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Comparator;

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
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int n = Integer.parseInt(in.next());
            int k = Integer.parseInt(in.next());
            int[] a = new int[n];
            int cnt = 0;
            Map<Integer, Integer> num = new TreeMap<>(new Comparator<Integer>() {

                public int compare(Integer integer, Integer t1) {
                    if (t1.compareTo(integer) == 0) {
                        return 0;
                    } else if (t1.compareTo(integer) > 0) {
                        return -1;
                    } else {
                        return 1;
                    }
//                return t1.compareTo(integer);
                }
            });
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(in.next());
                if (num.containsKey(a[i])) {
                    int tmp = num.get(a[i]) + 1;
                    num.put(a[i], tmp);
                } else {
                    num.put(a[i], 1);
                    cnt++;
                }
            }
            int ans = 0;
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for (Map.Entry<Integer, Integer> e : num.entrySet()) {
                pq.add(e.getValue());
            }
            while (pq.size() > k) {
                ans += pq.poll();
            }

            out.println(ans);

        }

    }
}

