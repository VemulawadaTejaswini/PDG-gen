import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static Scanner sc;
    int n;
    List<String> s = new ArrayList<>();
    public static void main(String[] args) {
        Main instance = new Main();
        sc = instance.new Scanner();
        instance.solve();
    }

    private void solve() {
        try {
            n = sc.nextInt();
            int acount = 0;
            int bcount = 0;
            int abcount = 0;
            int count = 0;
            for (int i = 0; i < n; i++) {
                String tmp = sc.next();
                s.add(tmp);
                int index = 0;
                while(index > -1) {
                    index = tmp.indexOf("AB", index);
                    if (index > -1) {
                        count++;
                        index++;
                    }
                }
                if (tmp.charAt(tmp.length() - 1) == 'A' && tmp.charAt(0) == 'B') {
                    abcount ++;
                } else if (tmp.charAt(0) == 'B') {
                    bcount ++;
                } else if (tmp.charAt(tmp.length() - 1) == 'A') {
                    acount ++;
                }
            }

            if (abcount == n) {
                System.out.println(count + abcount - 1);
                return;
            }

            if (acount == 0 && bcount == 0 && abcount > 0) {
                System.out.println(count + abcount - 1);
                return;
            }

            if (bcount == 0) {
                System.out.println(count + abcount);
                return;
            }

            if (acount == 0) {
                System.out.println(count + abcount);
                return;
            }

            if (abcount > 0) {
                System.out.println(count + abcount + Math.min(acount, bcount));
            } else {
                System.out.println(count + Math.min(acount, bcount));
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