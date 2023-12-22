import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static Scanner sc;
    public static void main(String[] args) {
        Main instance = new Main();
        sc = instance.new Scanner();
        instance.solve();
    }

    private void solve() {
        try {

            int n = sc.nextInt();
            int k = sc.nextInt();
            int v[] = new int[n];
            for (int i = 0; i < n; i++) {
                v[i] = sc.nextInt();
            }
            int former[] = new int[n];
            int latter[] = new int[n];

            former[0] = v[0];
            latter[0] = v[n-1];
            for (int i = 1; i < n; i++) {
                former[i] = former[i-1] + v[i];
            }
            for (int i = 1; i < n; i++) {
                latter[i] = latter[i-1] + v[n-1-i];
            }

            int max = Integer.MIN_VALUE;

            for (int i = 0; i < k && i < n; i++) {
                for (int j = 0; j < k - i && j < n; j++) {
                    int l = k - i - j;
                    int sum = 0;
                    if (i > 0) sum += former[i-1];
                    if (j > 0) sum += latter[j-1];

                    List<Integer> tmp = new ArrayList<>();

                    for (int m = 0; m < i; m++) {
                        tmp.add(v[m]);
                    }

                    for (int m = 0; m < j; m++) {
                        tmp.add(v[n-1-m]);
                    }

                    tmp.sort(Comparator.naturalOrder());

                    for (int m = 0; m < l && m < tmp.size(); m++) {
                        if (tmp.get(m) < 0) {
                            sum -= tmp.get(m);
                        }
                    }
                    if (max < sum) max = sum;
                }
            }
            System.out.println(max);


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