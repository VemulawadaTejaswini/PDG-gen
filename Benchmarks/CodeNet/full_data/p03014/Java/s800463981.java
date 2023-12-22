import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){
        FastScanner sc = new FastScanner();
        int H = sc.nextInt();
        int W = sc.nextInt();
        int map[][] = new int[H][W];

        for (int i=0;i<H;i++) {
            String S = sc.nextToken();
            for (int j=0;j<W;j++) {
                if (S.charAt(j) == '.') {
                    map[i][j] = 0;
                } else {
                    map[i][j] = 1;
                }
            }
        }

        int w_count[][] = new int[H][W];
        for (int i=0;i<H;i++) {
            int s = 0;
            for (int j=0;j<W;j++) {
                if (map[i][j] == 1) {
                    for (int k=s;k<j;k++) {
                        w_count[i][k] = j - s;
                    }
                    s = j+1;
                } else {

                }
            }
            {
                for (int k=s;k<W;k++) {
                    w_count[i][k] = W - s;
                }
            }
        }

        int h_count[][] = new int[H][W];
        for (int j=0;j<W;j++) {
            int s = 0;
            for (int i=0;i<H;i++) {
                if (map[i][j] == 1) {
                    for (int k=s;k<i;k++) {
                        h_count[k][j] = i - s;
                    }
                    s = i+1;
                } else {

                }
            }
            {
                for (int k=s;k<H;k++) {
                    h_count[k][j] = H - s;
                }
            }
        }

        int ans = 0;
        for (int i=0;i<H;i++) {
            for (int j=0;j<W;j++) {
                ans = Math.max(ans, w_count[i][j] + h_count[i][j] - 1);
            }
        }

        System.out.println(ans);
    }

    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String nextToken() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(nextToken());
        }

        long nextLong() {
            return Long.parseLong(nextToken());
        }

        double nextDouble() {
            return Double.parseDouble(nextToken());
        }
    }
}