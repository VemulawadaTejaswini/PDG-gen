import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author teiwa
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int M = in.nextInt();
            List<List<Integer>> A = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                List<Integer> tmp = new ArrayList<>();
                tmp.add(in.nextInt());
                tmp.add(in.nextInt());
                A.add(tmp);
            }
            A.sort(Comparator.comparing(a -> a.get(0)));

            long buyNum = 0;
            long budget = 0;
            for (int i = 0; i < A.size(); i++) {
                if (buyNum == M) {
                    break;
                }
                long price = A.get(i).get(0);
                long upperBuyingNum = A.get(i).get(1);
                // 上限いっぱい購入
                if (buyNum + upperBuyingNum <= M) {
                    buyNum += upperBuyingNum;
                    budget += price * upperBuyingNum;
                } else {
                    while (buyNum < M) {
                        buyNum++;
                        budget += price;
                    }
                }
            }

            if (buyNum == M) {
                out.println(budget);
            }
        }

    }
}

