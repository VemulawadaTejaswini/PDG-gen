import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        try (PrintWriter writer = new PrintWriter(System.out); InputReader reader = new InputReader(System.in)) {
            int n = reader.readInt();
            int[] x = reader.readIntsSplitByDelimiter(" ");
            int[] sorted = new int[n];

            for (int i = 0; i < n; i++) {
                sorted[i] = x[i];
            }
            Arrays.sort(sorted);

            int half2 = sorted[n / 2 - 1];
            int half3 = sorted[n / 2];

            // System.out.println(half2 + " h2");
            // System.out.println(half3 + " h3");
            for (int i = 0; i < n; i++) {
                // System.out.println(x[i] + "aa");
                if (half2 == half3) {
                    System.out.println(half2);
                } else if (x[i] < half3) {
                    System.out.println(half3);
                } else if (x[i] > half2) {
                    System.out.println(half2);
                }
            }
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