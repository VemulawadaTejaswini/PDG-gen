import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        try (PrintWriter writer = new PrintWriter(System.out); InputReader reader = new InputReader(System.in)) {
            solve(writer, reader);
        }
    }

    private static void solve(PrintWriter writer, InputReader reader) throws IOException {
        int[] ints = reader.readIntsSplitByDelimiter(" ");
        int height = ints[0];
        int width = ints[1];
        int[][] field = new int[height][width];
        for (int i = 0; i < height; i++) {
            field[i] = reader.readIntsSplitByDelimiter(" ");
        }

        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                int x = j;
                if (i % 2 == 1) {
                    x = width - 1 - j;
                }

                if (field[i][x] % 2 == 1) {
                    int nextI = 0;
                    int nextJ = 0;
                    if (i % 2 == 0) {
                        if (x == width - 1) {
                            if (i == height - 1) {
                                continue;
                            }
                            nextI = i + 1;
                            nextJ = x;
                        } else {
                            nextI = i;
                            nextJ = x + 1;
                        }
                    } else {
                        if (x == 0) {
                            if (i == height - 1) {
                                continue;
                            }
                            nextI = i + 1;
                            nextJ = x;
                        } else {
                            nextI = i;
                            nextJ = x - 1;
                        }
                    }

                    field[i][x]--;
                    field[nextI][nextJ]++;
                    count++;
                    sb.append(String.format("%d %d %d %d%n", i + 1, x + 1, nextI + 1, nextJ + 1));
                }
            }
        }

        writer.println(count);
        writer.print(sb);
        writer.flush();
    }
}

class Util {
    static int gcd(int m, int n) {
        int min = Math.min(m, n);
        int max = Math.max(m, n);
        while (min != 0) {
            int tmp = min;
            min = max % tmp;
            max = tmp;
        }

        return max;
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
        return Integer.parseInt(this.readLine());
    }

    long readLong() throws IOException {
        return Long.parseLong(this.readLine());
    }

    double readDouble() throws IOException {
        return Double.parseDouble(this.readLine());
    }

    String[] readStringsSplitByDelimiter(String delimiter) throws IOException {
        return this.readLine().split(delimiter);
    }

    int[] readIntsSplitByDelimiter(String delimiter) throws IOException {
        String[] strings = this.readStringsSplitByDelimiter(delimiter);

        int stringsLength = strings.length;
        int[] ints = new int[stringsLength];
        for (int i = 0; i < stringsLength; i++) {
            ints[i] = Integer.parseInt(strings[i]);
        }

        return ints;
    }

    long[] readLongsSplitByDelimiter(String delimiter) throws IOException {
        String[] strings = this.readStringsSplitByDelimiter(delimiter);

        int stringsLength = strings.length;
        long[] longs = new long[stringsLength];
        for (int i = 0; i < stringsLength; i++) {
            longs[i] = Long.parseLong(strings[i]);
        }

        return longs;
    }

    double[] readDoublesSplitByDelimiter(String delimiter) throws IOException {
        String[] strings = this.readStringsSplitByDelimiter(delimiter);

        int stringsLength = strings.length;
        double[] doubles = new double[stringsLength];
        for (int i = 0; i < stringsLength; i++) {
            doubles[i] = Double.parseDouble(strings[i]);
        }

        return doubles;
    }

    @Override
    public void close() throws IOException {
        this.br.close();
    }
}
