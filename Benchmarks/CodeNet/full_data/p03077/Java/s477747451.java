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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long N = in.nextLong();
            List<Long> passengerNum = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                passengerNum.add(in.nextLong());
            }

            List<Long> sortedPassengerNum = passengerNum.stream().sorted().collect(Collectors.toList());

            Long min = sortedPassengerNum.get(0);

            out.println((N - 1) / min + 5);
        }

    }
}

