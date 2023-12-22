import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        init();

        int n = nextInt();
        int[] a = new int[n];
        int[][] x = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                x[i][j] = -1;
            }
        }
        for (int i = 0; i < n; i++) {
            a[i] = nextInt();
            for (int j = 0; j < a[i]; j++) {
                x[i][nextInt() - 1] = nextInt();
            }
        }
        int max = 0;
        for (int option = 0; option < (1 << n); option++) {
            boolean ok = true;
            int ans = 0;
            for (int i = 0; i < n; i++) {
                boolean isHonestI = (option & (1 << i)) == (1 << i);
                if (isHonestI) {
                    ans++;
                    for (int j = 0; j < n; j++) {
                        boolean isHonestJ = (option & (1 << j)) == (1 << j);
                        if ((x[i][j] == 1 && !isHonestJ) || (x[i][j] == 0 && isHonestJ)) {
                            ok = false;
                            break;
                        }
                    }
                }
            }
            if (ok) max = Math.max(max, ans);
        }

        System.out.println(max);
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