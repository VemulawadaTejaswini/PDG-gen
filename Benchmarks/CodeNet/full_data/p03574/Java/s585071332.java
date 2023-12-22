import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static Scanner sc;
    private static int[][] neg8 = new int[][]{{-1,-1}, {0,-1}, {1,-1}, {-1,0}, {1,0}, {-1,1}, {0,1}, {1,1}};

    public static void main(String[] args) {
        Main instance = new Main();
        sc = instance.new Scanner();
        instance.solve();
    }

    private void solve() {
        try {
            int H, W;
            H = sc.nextInt();
            W = sc.nextInt();
            char[][] arr = new char[H][W];
            for (int i = 0; i < H; i++) {
                String next = sc.next();
                for (int j = 0; j < W; j++) {
                    arr[i][j] = next.charAt(j);
                }
            }

            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    char c = arr[i][j];
                    if (c == '#') continue;

                    int count = 0;
                    for (int[] ints : neg8) {
                        try {
                            char c1 = arr[i + ints[0]][j + ints[1]];
                            if (c1 == '#') count++;
                        } catch (ArrayIndexOutOfBoundsException e) {
                        }
                    }
                    arr[i][j] = Character.forDigit(count, 10);
                }
            }

            for (char[] chars : arr) {
                for (char aChar : chars) {
                    System.out.print(aChar);
                }
                System.out.println();
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

