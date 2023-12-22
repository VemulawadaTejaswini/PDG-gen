import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    private static Scanner sc;
    public static void main(String[] args) {
        Main instance = new Main();
        sc = instance.new Scanner();
        instance.solve();
    }

    private void solve() {
        try {

            class sp {
                int index;
                String s;
                int p;
            }
            int n = sc.nextInt();
            List<sp> sps = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                sp tmp = new sp();
                tmp.index = i;
                tmp.s = sc.next();
                tmp.p = sc.nextInt();
                sps.add(tmp);
            }

            sps.sort(new Comparator<sp>() {
                @Override
                public int compare(sp sp1, sp sp2) {
                    if (sp1.s.equals(sp2.s)) return (sp2.p - sp1.p);
                    else return sp1.s.compareTo(sp2.s);
                }
            });
            for (int i = 0; i < n; i++) {
                System.out.println(sps.get(i).index + 1);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private class Scanner {
        String[] s;
        int i;
        BufferedReader br;
        String regex = " ";

        public Scanner() {
            s = new String[0];
            i = 0;
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        @Override
        protected void finalize() throws Throwable {
            try {
                super.finalize();
            } finally {
                destruction();
            }
        }

        private void destruction() throws IOException {
            if (br != null) br.close();
        }

        public String next() throws IOException {
            if (i < s.length) return s[i++];
            String st = br.readLine();
            while (st == "") st = br.readLine();
            s = st.split(regex, 0);
            i = 0;
            return s[i++];
        }

        public int nextInt() throws NumberFormatException, IOException {
            return Integer.parseInt(next());
        }

        public Long nextLong() throws NumberFormatException, IOException {
            return Long.parseLong(next());
        }

        public Double nextDouble() throws NumberFormatException, IOException {
            return Double.parseDouble(next());
        }
    }
}