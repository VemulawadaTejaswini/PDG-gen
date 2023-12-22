import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        SequenceDecomposing solver = new SequenceDecomposing();
        solver.solve(1, in, out);
        out.close();
    }

    static class SequenceDecomposing {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextLong();
            }
            List<Long> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                long aa = a[i];
                int pos = Collections.binarySearch(list, aa, new LowerBoundComparator<>());
                if (pos < 0) {
                    pos = ~pos;
                }
                if (pos == 0) {
                    list.add(aa);
                } else {
                    list.set(pos - 1, aa);
                }
            }
            out.println(list.size());

        }

        class LowerBoundComparator<T extends Comparable<? super T>> implements Comparator<T> {
            public int compare(T x, T y) {
                return (x.compareTo(y) >= 0) ? 1 : -1;
            }

        }

    }
}

