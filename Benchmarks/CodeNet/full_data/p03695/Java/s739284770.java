import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws IOException {
        try (InputReader reader = new InputReader(System.in)) {
            solve(reader);
        }
    }

    private static void solve(InputReader reader) throws IOException {
        int n = reader.readInt();
        int[] scores = reader.readIntsSplitByDelimiter(" ");
        Set<Integer> set = new HashSet<>(n);
        int redOverCount = 0;
        for (int i = 0; i < n; i++) {
            int score = scores[i] / 400;
            if (score > 7) {
                redOverCount++;
            } else {
                set.add(score);
            }
        }

        int min = Math.max(set.size(), 1);
        int max = set.size() + redOverCount;
        System.out.println(min + " " + max);
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
