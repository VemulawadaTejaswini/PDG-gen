import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

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
        GatheringChildren solver = new GatheringChildren();
        solver.solve(1, in, out);
        out.close();
    }

    static class GatheringChildren {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            char[] s = in.next().toCharArray();
            int[] c = new int[s.length];

            int even = 0; // 偶数
            int odd = 0;

            for (int i = 0; i < s.length - 1; i++) {

                if ((i + 1) % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }

                if (s[i] == 'R' && s[i + 1] == 'L') {
                    int r_pos = i + 1;
                    while (true) {
                        r_pos++;
                        if (s.length <= r_pos) {
                            break;
                        }
                        if (s[r_pos - 1] == 'L' && s[r_pos] == 'R') {
                            break;
                        }
                    }
                    for (int j = i + 1; j < r_pos; j++) {
                        if ((j + 1) % 2 == 0) {
                            even++;
                        } else {
                            odd++;
                        }
                    }

                    if (i % 2 == 0) {
                        c[i] = odd;
                        c[i + 1] = even;
                    } else {
                        c[i] = even;
                        c[i + 1] = odd;
                    }
                    i = r_pos - 1;
                    even = 0;
                    odd = 0;
                }
            }

            for (int i = 0; i < s.length; i++) {
                out.print(c[i] + " ");
            }
        }

    }
}

