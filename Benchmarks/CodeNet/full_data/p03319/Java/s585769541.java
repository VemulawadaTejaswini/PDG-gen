import java.io.*;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        init(System.in);
        int n = nextInt(), k = nextInt();
        int oneLeft = 0, oneRight = 0;
        int[] perm = new int[n + 1];
        for (int i = 1; i < perm.length; i++) {
            perm[i] = nextInt();
            if (perm[i] == 1) {
                oneLeft = i;
                oneRight = i;
            }
        }

        oneLeft = oneLeft - k + 1;
        if (oneLeft <= 0) oneRight = k;

        int steps = 1;
        while (oneLeft > 1) {
            steps++;
            oneLeft = oneLeft - k + 1;
        }
        while (oneRight < n) {
            steps++;
            oneRight = oneRight + k - 1;
        }

        System.out.println(steps);
    }

    //Input Reader
    private static BufferedReader reader;
    private static StringTokenizer tokenizer;

    private static void init(InputStream inputStream) {
        reader = new BufferedReader(new InputStreamReader(inputStream));
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

//    private static long nextLong() throws IOException {
//        return Long.parseLong(next());
//    }
//
//    //    Get a whole line.
//    private static String line() throws IOException {
//        return reader.readLine();
//    }
//
//    private static double nextDouble() throws IOException {
//        return Double.parseDouble(next());
//    }
}