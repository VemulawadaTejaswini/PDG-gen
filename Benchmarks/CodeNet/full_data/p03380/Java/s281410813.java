import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        try (PrintWriter writer = new PrintWriter(System.out); InputReader reader = new InputReader(System.in)) {
            int n = reader.readInt();
            int[] a = reader.readIntsSplitByDelimiter(" ");

            Arrays.sort(a);

            int closestIndexs = 0;
            int halfMax = (a[n - 1] % 2 == 0) ? a[n - 1] / 2 : a[n - 1] / 2 + 1;
            int minAbs = Math.abs(halfMax - a[closestIndexs]);
            for (int i = 0; i < n; i++) {
                if (Math.abs(halfMax - a[i]) < minAbs) {
                    closestIndexs = i;
                    minAbs = Math.abs(halfMax - a[closestIndexs]);
                }
            }
            System.out.println(a[n - 1] + " " + a[closestIndexs]);
        }
    }
}

class InputReader implements Closeable, AutoCloseable {
    private final BufferedReader br;

    InputReader(InputStream inputStream) {
        this.br = new BufferedReader(new InputStreamReader(inputStream));
    }

    String readLine() throws IOException {
        return this.br.readLine();
    }

    int readInt() throws IOException {
        return Integer.parseInt(this.br.readLine());
    }

    long readLong() throws IOException {
        return Long.parseLong(this.br.readLine());
    }

    String[] readStringsSplitByDelimiter(String delimiter) throws IOException {
        return this.br.readLine().split(delimiter);
    }

    int[] readIntsSplitByDelimiter(String delimiter) throws IOException {
        String[] strings = this.br.readLine().split(delimiter);

        int stringsLength = strings.length;
        int[] ints = new int[stringsLength];
        for (int i = 0; i < stringsLength; i++) {
            ints[i] = Integer.parseInt(strings[i]);
        }

        return ints;
    }

    long[] readLongsSplitByDelimiter(String delimiter) throws IOException {
        String[] strings = this.br.readLine().split(delimiter);

        int stringsLength = strings.length;
        long[] longs = new long[stringsLength];
        for (int i = 0; i < stringsLength; i++) {
            longs[i] = Long.parseLong(strings[i]);
        }

        return longs;
    }

    @Override
    public void close() throws IOException {
        br.close();
    }
}