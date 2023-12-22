import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int n, m;
    static int[] s, c;

    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        n = sc.nextInt();
        m = sc.nextInt();
        s = new int[m];
        c = new int[m];

        for (int i = 0; i < m; i++) {
            s[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }

        for (int i = 0; i < 1000; i++) {
            if (isAns(i)) {
                System.out.println(i);
                System.exit(0);
            }
        }

        System.out.println(-1);
    }

    static boolean isAns(int a) {
        boolean isAns = true;
        switch (n) {
            case 1:
                if (a >= 10)
                    isAns = false;
                break;
            case 2:
                if (a < 10 || a >= 100)
                    isAns = false;
                break;
            case 3:
                if (a < 100)
                    isAns = false;
        }

        if (isAns) {
            int[] ans = new int[3];
            int tmp = a;
            for (int i = 0; i < 3; i++) {
                ans[i] = tmp % 10;
                tmp /= 10;
            }
            for (int i = 0; i < m; i++) {
                if (ans[n-s[i]] != c[i]) {
                    isAns = false;
                    break;
                }
            }
        }

        return isAns;
    }

    static class MyScanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1 << 15);
        StringTokenizer tokenizer;

        String next() {
            try {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                    tokenizer = new StringTokenizer(reader.readLine());
                }
            } catch (IOException ignored) {
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}