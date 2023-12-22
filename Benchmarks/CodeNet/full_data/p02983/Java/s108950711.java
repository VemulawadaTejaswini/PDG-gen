import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Collections;
import java.util.ArrayList;

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
        RemainderMinimization2019 solver = new RemainderMinimization2019();
        solver.solve(1, in, out);
        out.close();
    }

    static class RemainderMinimization2019 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            HashSet<Long> set = new HashSet<>();
            long l = in.nextLong();
            long r = in.nextLong();
            List<Long> mods = new ArrayList<>();

            for (long i = l; i <= r; i++) {
                mods.add(i % 2019);
            }

            Collections.sort(mods, Comparator.naturalOrder());

            out.println(mods.get(0) * mods.get(1) % 2019);


        }

    }
}

