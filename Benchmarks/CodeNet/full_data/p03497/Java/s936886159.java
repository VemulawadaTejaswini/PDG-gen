import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author hsy
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n, k;
            n = in.nextInt();
            k = in.nextInt();
            int[] num = new int[200000 + 10000];
            List<Integer> list = new ArrayList<>();
            List<Integer> list2 = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int x = in.nextInt();
                if (num[x] == 0) {
                    list.add(x);
                }
                num[x]++;
            }
            if (list.size() <= k) {
                out.println("0");
            } else {
                for (int x : list) {
                    list2.add(num[x]);
                }
                int sum = 0;
                Collections.sort(list2);
                int g = list.size();
                for (int x : list2) {
                    if (g <= k) {
                        break;
                    }
                    sum += x;
                    g--;
                }
                out.println(sum);
            }
        }

    }
}

