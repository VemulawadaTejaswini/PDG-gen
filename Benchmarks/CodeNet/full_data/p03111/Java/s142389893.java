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
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        SyntheticKadomatsu solver = new SyntheticKadomatsu();
        solver.solve(1, in, out);
        out.close();
    }

    static class SyntheticKadomatsu {
        List<Integer> l;
        List<Integer> abc;
        int n;
        int a;
        int b;
        int c;
        int result = Integer.MAX_VALUE;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            n = in.nextInt();
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
            l = new ArrayList<>();
            abc = new ArrayList<>();

            abc.add(a);
            abc.add(b);
            abc.add(c);

            for (int i = 0; i < n; i++) {
                l.add(in.nextInt());
            }

            for (int bit = 0; bit < (1 << (2 * n)); bit++) {
                List<List<Integer>> d = new ArrayList<>();
                // a,b,c,none
                for (int i = 0; i < 4; i++) {
                    d.add(new ArrayList<>());
                }
                for (int i = 0; i < n; i++) {
                    int index = (bit >> (2 * i)) & 3;
                    d.get(index).add(l.get(i));
                }

                boolean zero_exists = false;
                for (int i = 0; i < 3; i++) {
                    if (d.get(i).size() == 0) {
                        zero_exists = true;
                        break;
                    }
                }

                if (zero_exists) {
                    continue;
                }

                int score = 0;
                for (int i = 0; i < 3; i++) {
                    score += 10 * (d.get(i).size() - 1);
                    int total = 0;
                    for (Integer num : d.get(i)) {
                        total += num;
                    }
                    score += Math.abs(abc.get(i) - total);
                }
                result = Math.min(result, score);
            }

//        recursive(0, 0, 0, 0, 0);
            out.println(result);
        }

    }
}

