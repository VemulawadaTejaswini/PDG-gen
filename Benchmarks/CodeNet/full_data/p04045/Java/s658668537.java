import java.util.*;

public class Main {
    public static void main(String args[]) {
        FastScanner cin = new FastScanner();
        int n = cin.nextInt();
        int k = cin.nextInt();
        int[] d = new int[10];
        Arrays.fill(d, 0);

        for (int i = 0; i < k; ++i) {
            int x = cin.nextInt();
            d[x] = 1;
        }

        int res = 999999999;

        for (int i = 1; i < 10; ++i) {
            if (d[i] == 1)
                continue;

            res = Math.min(res, solve(n, d, i));
        }

        System.out.println(res);
    }

    private static int solve(int n, int[] d, int s) {
        if (s >= n)
            return s;

        int res = 999999999;

        for (int i = 0; i < 10; ++i) {
            if (d[i] == 1)
                continue;

            res = Math.min(res, solve(n, d, s * 10 + i));
        }

        return res;
    }

    static class FastScanner {
        StringTokenizer tokenizer;
        Scanner scanner;

        FastScanner() {
            tokenizer = null;
            scanner = new Scanner(System.in);
        }

        int nextInt() {
            while (tokenizer == null || !tokenizer.hasMoreTokens())
                tokenizer = new StringTokenizer(scanner.nextLine());

            return Integer.parseInt(tokenizer.nextToken());
        }

        String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens())
                tokenizer = new StringTokenizer(scanner.nextLine());

            return tokenizer.nextToken();
        }
    }
}

