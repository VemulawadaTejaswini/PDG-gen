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
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Triangles solver = new Triangles();
        solver.solve(1, in, out);
        out.close();
    }

    static class Triangles {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                list.add(in.nextInt());
            }

            list.sort(Comparator.naturalOrder());

            long result = 0;
            for (int i = 0; i < list.size() - 2; i++) {
                int a = list.get(i);
                for (int j = i + 1; j < list.size() - 1; j++) {
                    int b = list.get(j);
                    for (int k = j + 1; k < list.size(); k++) {
                        int c = list.get(k);
                        if (b - a < c && c < a + b) {
                            result++;
                        }
                    }
                }
            }
            out.println(result);
        }

    }
}

