import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.Collection;
import java.util.Scanner;
import java.util.stream.Collectors;
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
        FiveEverywhere solver = new FiveEverywhere();
        solver.solve(1, in, out);
        out.close();
    }

    static class FiveEverywhere {
        boolean[] prime;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            prime = eratos(55_555 * 5 + 1);
            boolean[] used = eratos(55_555 + 1);

            List<Integer> nums = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 55_556; j++) {
                    if (used[j]) {
                        nums.add(j);
                        used[j] = false;
                        if (i == n - 1 && !check(nums)) {
                            nums.remove(i);
                            i--;
                        }
                        break;
                    }
                }
            }

            out.print(nums.stream().map(Object::toString).collect(Collectors.joining(" ")));

        }

        boolean check(List<Integer> list) {
            for (int a = 0; a < list.size() - 4; a++) {
                int aa = list.get(a);
                for (int b = a + 1; b < list.size() - 3; b++) {
                    int bb = list.get(b);
                    for (int c = b + 1; c < list.size() - 2; c++) {
                        int cc = list.get(c);
                        for (int d = c + 1; d < list.size() - 1; d++) {
                            int dd = list.get(d);
                            for (int e = d + 1; e < list.size(); e++) {
                                int ee = list.get(e);
                                if (prime[aa + bb + cc + dd + ee]) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }

        static boolean[] eratos(int n) {
            boolean[] results = new boolean[n + 1];
            Arrays.fill(results, true);

            results[0] = false;
            results[1] = false;

            for (int i = 2; i <= n; i++) {
                int j = i + i;
                while (j <= n) {
                    results[j] = false;
                    j = j + i;
                }
            }
            return results;
        }

    }
}

