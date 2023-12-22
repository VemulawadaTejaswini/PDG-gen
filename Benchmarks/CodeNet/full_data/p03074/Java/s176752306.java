import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author /\
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DHandstand solver = new DHandstand();
        solver.solve(1, in, out);
        out.close();
    }

    static class DHandstand {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            char[] str = in.nextLine().toCharArray();
            List<Integer> numCons = new ArrayList<>();
            int cnt = 1;
            for (int i = 0; i < n - 1; i++) {
                if (str[i + 1] == str[i]) {
                    cnt++;
                } else {
                    numCons.add(cnt);
                    cnt = 1;
                }
            }
            numCons.add(cnt);
            int l = numCons.size();
            numCons.add(0);
            int res = 0;
            if (str[0] == '1') {
                if (k >= l / 2) {
                    out.println(n);
                    return;
                }
                int init = 0;
                for (int i = 0; i < 2 * k + 1; i++) {
                    init += numCons.get(i);
                    res = Math.max(init, res);
                }
                for (int i = 0; i < l / 2 - k; i++) {
                    init -= numCons.get(2 * i);
                    init -= numCons.get(2 * i + 1);
                    init += numCons.get(2 * i + 2 * k + 1);
                    init += numCons.get(2 * i + 2 * k + 2);
                    res = Math.max(res, init);
                }
            } else {
                if (k >= l / 2 + 1) {
                    out.println(n);
                    return;
                }
                int init = 0;
                for (int i = 0; i < 2 * k; i++) {
                    init += numCons.get(i);
                    res = Math.max(init, res);
                }
                for (int i = 0; i < l / 2 - k; i++) {
                    if (i != 0) {
                        init -= numCons.get(2 * i - 1);
                    }
                    init -= numCons.get(2 * i);
                    init += numCons.get(2 * i + 2 * k);
                    init += numCons.get(2 * i + 2 * k + 1);
                    res = Math.max(res, init);
                }
            }
            out.println(res);
        }

    }

    static class Scanner {
        private StringTokenizer st;
        private BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    }
}

