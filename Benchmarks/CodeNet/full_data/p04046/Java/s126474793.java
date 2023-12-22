import java.util.*;

class Main {
    public static void main(String args[]) {
        FastScanner cin = new FastScanner();

        int h = cin.nextInt();
        int w = cin.nextInt();
        int a = cin.nextInt();
        int b = cin.nextInt();
        int[][] grid = new int[h + 1][w + 1];
        grid[1][0] = 1;

        for (int i = 1; i <= h; ++i) {
            for (int j = 1; j <= w; ++j) {
                if (h - i < a && j <= b)
                    continue;

                grid[i][j] = (grid[i - 1][j] + grid[i][j - 1]) % 1000000007;
            }
        }

        System.out.println(grid[h][w]);
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
