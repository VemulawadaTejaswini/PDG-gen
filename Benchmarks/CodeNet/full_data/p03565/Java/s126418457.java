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
        DubiousDocument2 solver = new DubiousDocument2();
        solver.solve(1, in, out);
        out.close();
    }

    static class DubiousDocument2 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String sstr = in.next();
            String tstr = in.next();
            char[] s = sstr.toCharArray();
            char[] t = tstr.toCharArray();
            List<String> list = new ArrayList<>();

            for (int i = 0; i < s.length; i++) {
                boolean can_replace = false;
                if (s[i] == '?' || s[i] == t[0]) {
                    int j = i;
                    int k = 0;
                    while (true) {
                        if (s.length - 1 < j) {
                            break;
                        }
                        if (s[j] == '?' || s[j] == t[k]) {
                            j++;
                            k++;
                            if (k == t.length) {
                                can_replace = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }

                    if (can_replace) {
                        char[] z = s.clone();
                        int from = i;
                        int kk = 0;
                        int to = from + t.length - 1;
                        for (int x = 0; x < z.length; x++) {
                            if (from <= x && x <= to) {
                                z[x] = t[kk];
                                kk++;
                            } else if (z[x] == '?') {
                                z[x] = 'a';
                            }
                        }
                        list.add(new String(z));
                    }
                }
            }

            if (list.isEmpty()) {
                out.print("UNRESTORABLE");
                return;
            }
            list.sort(String::compareTo);
            out.print(list.get(0));
        }

    }
}

