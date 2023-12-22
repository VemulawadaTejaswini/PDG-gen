
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static Scanner sc;
    public static void main(String[] args) {
        Main instance = new Main();
        sc = instance.new Scanner();
        instance.solve();
    }

    private void solve() {
        try {
            int h,w;
            String[] s;

            h = sc.nextInt();
            w = sc.nextInt();
            s = new String[h];

            for (int i = 0; i < h; i++) {
                s[i] = sc.next();
            }

            int[][] hsum = new int[h][w];
            int[][] wsum = new int[h][w];



            for (int i = 0; i < h; i++) {
                int sum = 0;
                int left = 0;
                boolean now = false;
                for (int j = 0; j < w + 1; j++) {
                    if (j == w) {
                        if (now) {
                            for (int k = left; k < j; k++) {
                                hsum[i][k] = sum;
                            }
                        }
                        break;
                    } else if (!now && s[i].charAt(j) == '.') {
                        now = true;
                        left = j;
                        sum ++;
                    } else if (s[i].charAt(j) == '.') {
                        sum ++;
                    } else if (now) {
                        now = false;
                        for (int k = left; k < j; k++) {
                            hsum[i][k] = sum;
                        }
                        sum = 0;
                    }
                }
            }

            for (int i = 0; i < w; i++) {
                int sum = 0;
                int left = 0;
                boolean now = false;
                for (int j = 0; j < h + 1; j++) {
                    if (j == h) {
                        if (now) {
                            for (int k = left; k < j; k++) {
                                wsum[k][i] = sum;
                            }
                        }
                        break;
                    } else if (!now && s[j].charAt(i) == '.') {
                        now = true;
                        left = j;
                        sum ++;
                    } else if (s[j].charAt(i) == '.') {
                        sum ++;
                    } else if (now) {
                        now = false;
                        for (int k = left; k < j; k++) {
                            wsum[k][i] = sum;
                        }
                        sum = 0;
                    }
                }
            }

            int max = 0;

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    int sum = wsum[i][j] + hsum[i][j];
                    if (max < sum) max = sum;
                }
            }
            System.out.println(max - 1);

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