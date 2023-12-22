import java.io.*;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        init();

        int n = nextInt(), m = nextInt(), q = nextInt();

        int[][] trains = new int[n + 1][n];

        for (int i = 0; i < m; i++) {
            int l = nextInt(), r = nextInt();
            int dist = r - l;
            trains[l][dist]++;
        }

        for (int i = 1; i < trains.length; i++) {
            for (int j = 0; j < trains[i].length; j++) {
                trains[i][j] += j > 0 ? trains[i][j - 1]: 0;
            }
        }

        for (int i = 0; i < trains[0].length; i++) {
            for (int j = 1; j < trains.length; j++) {
                if (j > i + 1) break;
                if (i - j + 1 < trains[0].length) {
                    trains[j][i - j + 1] += i - j + 2 < trains[0].length ? trains[j - 1][i - j + 2]: 0;
                }
            }
        }

        for (int i = 0; i < q; i++) {
            int pi = nextInt(), qi = nextInt();
            System.out.println(trains[qi][0] - (qi - pi + 1 < trains[0].length ? trains[pi - 1][qi - pi + 1] : 0));
        }
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