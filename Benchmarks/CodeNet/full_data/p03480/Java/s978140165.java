import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Comparator;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DWideFlip solver = new DWideFlip();
        solver.solve(1, in, out);
        out.close();
    }

    static class DWideFlip {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String s = in.next();
            ArrayList<Integer> al = new ArrayList();
            int cont = 1;
            int res = 0;
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) == s.charAt(i - 1)) {
                    cont++;
                } else {
                    al.add(cont);
                    cont = 1;
                }
            }
            al.add(cont);
            switch (al.size()) {
                case 1:
                    res = al.get(0);
                    break;
                case 2:
                    res = Math.max(al.get(0), al.get(1));
                    break;
                default:
                    ArrayList<Integer> b = new ArrayList<Integer>();
                    for (int i = 0; i < al.size() - 1; i++) {
                        b.add(al.get(i) + al.get(i + 1));
                    }
                    b.sort(Comparator.reverseOrder());
                    res = b.get(0);
            }
            out.println(res);
        }

    }
}

