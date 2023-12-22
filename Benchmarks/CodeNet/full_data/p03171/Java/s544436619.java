import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        init();

        int n = nextInt();
        int[] values = new int[n];
        for (int i = 0; i < values.length; i++) values[i] = nextInt();

        long[][][] optimalScores = new long[n][n][2];

        for (int l = 1; l <= n; l++) {
            for (int i = 0; i + l - 1 < n; i++) {
                int j = i + l - 1;
                if (l % 2 == n % 2) {
                    long takeI = values[i] + (i + 1 < n ? optimalScores[i + 1][j][0] : 0);
                    long takeJ = values[j] + (j - 1 >= 0 ? optimalScores[i][j - 1][0] : 0);
                    if (takeI > takeJ) {
                        optimalScores[i][j][0] = takeI;
                        optimalScores[i][j][1] = (i + 1 < n ? optimalScores[i + 1][j][1] : 0);
                    } else {
                        optimalScores[i][j][0] = takeJ;
                        optimalScores[i][j][1] = (j - 1 >= 0 ? optimalScores[i][j - 1][1] : 0);
                    }
                } else {
                    long takeI = values[i] + (i + 1 < n ? optimalScores[i + 1][j][1] : 0);
                    long takeJ = values[j] + (j - 1 >= 0 ? optimalScores[i][j - 1][1] : 0);
                    if (takeI > takeJ) {
                        optimalScores[i][j][1] = takeI;
                        optimalScores[i][j][0] = (i + 1 < n ? optimalScores[i + 1][j][0] : 0);
                    } else {
                        optimalScores[i][j][1] = takeJ;
                        optimalScores[i][j][0] = (j - 1 >= 0 ? optimalScores[i][j - 1][0] : 0);
                    }
                }
            }
        }

        System.out.println(optimalScores[0][n - 1][0] - optimalScores[0][n - 1][1]);
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