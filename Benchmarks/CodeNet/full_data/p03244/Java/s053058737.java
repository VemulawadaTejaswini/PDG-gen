import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        try (InputReader reader = new InputReader(System.in)) {
            solve(reader);
        }
    }

    private static void solve(InputReader reader) throws IOException {
        int n = reader.readInt();
        int[] array = reader.readIntsSplitByDelimiter(" ");
        HashMap<Integer, Long> map1 = new HashMap<>(n / 2);
        HashMap<Integer, Long> map2 = new HashMap<>(n / 2);

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                Long tmp = map1.getOrDefault(array[i], 0L) + 1L;
                map1.put(array[i], tmp);
            } else {
                Long tmp = map2.getOrDefault(array[i], 0L) + 1L;
                map2.put(array[i], tmp);
            }
        }

        if (array[0] == array[1] && map1.keySet().size() == 1 && map2.keySet().size() == 1) {
            System.out.println(n / 2);
            return;
        }

        long maxValue = 0;
        for (Long value : map1.values()) {
            maxValue = Math.max(maxValue, value);
        }
        long ans = n - maxValue;

        maxValue = 0;
        for (Long value : map2.values()) {
            maxValue = Math.max(maxValue, value);
        }
        ans -= maxValue;

        System.out.println(ans);
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
