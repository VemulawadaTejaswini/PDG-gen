import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.stream.Stream;
import java.util.Collection;
import java.util.Scanner;
import java.util.stream.Collectors;
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
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int A = in.nextInt();
            int B = in.nextInt();

            int plusResult = A + B;
            int minusResult = A - B;
            int timesResult = A * B;

            List<Integer> resultList = new ArrayList<>();
            resultList.add(plusResult);
            resultList.add(minusResult);
            resultList.add(timesResult);

            List<Integer> sortResultList = resultList.stream().sorted().collect(Collectors.toList());
            out.println(sortResultList.get(sortResultList.size() - 1));
        }

    }
}

