import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) throws IOException {
        try (PrintWriter writer = new PrintWriter(System.out); InputReader reader = new InputReader(System.in)) {
            int[] input = reader.readIntsSplitByDelimiter("");

            for (int i_1 = 0; i_1 < 2; i_1++) {
                for (int i_2 = 0; i_2 < 2; i_2++) {
                    for (int i_3 = 0; i_3 < 2; i_3++) {
                        int sum = 0;
                        String ans = "";
                        if (i_1 == 0) {
                            sum += input[0] + input[1];
                            ans = input[0] + "+" + input[1];
                        } else {
                            sum += input[0] - input[1];
                            ans = input[0] + "-" + input[1];
                        }

                        if (i_2 == 0) {
                            sum += input[2];
                            ans += "+" + input[2];
                        } else {
                            sum -= input[2];
                            ans += "-" + input[2];
                        }

                        if (i_3 == 0) {
                            sum += input[3];
                            ans += "+" + input[3];
                        } else {
                            sum -= input[3];
                            ans += "-" + input[3];
                        }

                        if (sum == 7) {
                            ans += "=7";
                            System.out.println(ans);
                            return;
                        }
                    }
                }
            }

            System.out.println(input[0]);
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