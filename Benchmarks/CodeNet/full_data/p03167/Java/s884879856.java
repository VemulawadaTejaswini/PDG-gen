import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        init();

        int H = nextInt(), W = nextInt();
        grid = new char[H][W];
        numOfWays = new int[H][W];
        seen = new boolean[H][W];
        for (int i = 0; i < H; i++) grid[i] = next().toCharArray();

        System.out.println(calcWays(0, 0));
    }

    private static char[][] grid;
    private static int[][] numOfWays;
    private static boolean[][] seen;

    private static int calcWays(int r, int c) {
        if (seen[r][c]) return numOfWays[r][c];
        seen[r][c] = true;
        if (grid[r][c] == '#') return 0;
        if (r == grid.length - 1 && c == grid[0].length - 1) {
            numOfWays[r][c] = 1;
            return 1;
        }
        int ways = 0;
        if (r + 1 < grid.length) ways += calcWays(r + 1, c);
        if (c + 1 < grid[0].length) ways += calcWays(r, c + 1);

        numOfWays[r][c] = ways % 1000000007;
        return numOfWays[r][c];
    }

    //Input Reader
    private static BufferedReader reader;
    private static StringTokenizer tokenizer;

    private static void init() {
        reader = new BufferedReader(new InputStreamReader(System.in));
        tokenizer = new StringTokenizer("");
    }

    private static String next() throws IOException {
        String read;
        while (!tokenizer.hasMoreTokens()) {
            read = reader.readLine();
            if (read == null || read.equals(""))
                return "-1";
            tokenizer = new StringTokenizer(read);
        }

        return tokenizer.nextToken();
    }

    private static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }
}