import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        ReaderD.init(System.in);
        int a = ReaderD.nextInt(), b = ReaderD.nextInt();
        char[][] grid = new char[100][100];
        int whiteComponents = 0, blackComponents = 0;
        boolean curr = true;
        boolean doneWhite = false;
        int doneIndex = 0;
        if (a == 1) {
            doneWhite = true;
            doneIndex = -1;
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j += 2) {
                if (i % 2 == 0) {
                    grid[i][j] = !curr ? '.' : '#';
                    grid[i][j + 1] = !curr ? '.' : '#';
                }
                else {
                    if (!doneWhite) {
                        grid[i][j] = '#';
                        grid[i][j + 1] = '.';
                        whiteComponents++;
                        if (whiteComponents == a - 1) {
                            doneWhite = true;
                            doneIndex = i;
                            for (int k = j + 2; k < grid.length; k++) grid[i][k] = '.';
                            break;
                        }
                    }
                    else {
                        if (blackComponents < b) {
                            grid[i][j] = '.';
                            grid[i][j + 1] = '#';
                            blackComponents++;
                        }
                        else {
                            grid[i][j] = '.';
                            grid[i][j + 1] = '.';
                        }
                    }
                }
            }
            if (doneWhite && i == doneIndex + 1) {
                i++;
                for (int j = 0; j < grid.length; j += 1) grid[i][j] = '.';
                curr = false;
                blackComponents++;
            }
        }
        System.out.println(100 + " " + 100);
        for (char[] row: grid) System.out.println(new String(row));
    }
}

/**
 * Reader class based on the article at "https://www.cpe.ku.ac.th/~jim/java-io.html"
 */
class ReaderD {
    private static BufferedReader reader;
    private static StringTokenizer tokenizer;

    static void init(InputStream inputStream) {
        reader = new BufferedReader(new InputStreamReader(inputStream));
        tokenizer = new StringTokenizer("");
    }

    static String next() throws IOException {
        String read;
        while (!tokenizer.hasMoreTokens()) {
            read = reader.readLine();
            if (read == null || read.equals(""))
                return "-1";
            tokenizer = new StringTokenizer(read);
        }

        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    //    Get a whole line.
    static String line() throws IOException {
        return reader.readLine();
    }

    static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }
}

