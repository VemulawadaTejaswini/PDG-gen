import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Map;
import java.util.Collection;
import java.util.HashMap;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        try (PrintWriter writer = new PrintWriter(System.out); InputReader reader = new InputReader(System.in)) {
            solve(writer, reader);
        }
    }

    private static void solve(PrintWriter writer, InputReader reader) throws IOException {
        char[] a = reader.readLine().toCharArray();
        char[] b = reader.readLine().toCharArray();

        Map<Character, Integer> aset = new HashMap<>(a.length);
        Map<Character, Integer> bset = new HashMap<>(b.length);
        for (int i = 0; i < a.length; i++) {
            if (aset.containsKey(a[i])) {
                Integer tmp = aset.get(a[i]) + 1;
                aset.put(a[i], tmp);
            } else {
                aset.put(a[i], 0);
            }

            if (bset.containsKey(b[i])) {
                Integer tmp = bset.get(b[i]) + 1;
                bset.put(b[i], tmp);
            } else {
                bset.put(b[i], 0);
            }
        }

        if (aset.size() < bset.size()) {
            writer.println("No");
            writer.flush();
            return;
        }

        Collection<Integer> aa = aset.values();
        Collection<Integer> bb = bset.values();
        List<Integer> aaa = new ArrayList<>(aa);
        List<Integer> bbb = new ArrayList<>(bb);
        aaa.sort(Comparator.naturalOrder());
        bbb.sort(Comparator.naturalOrder());
        for (int i = 0; i < aaa.size(); i++){
            if (aaa.get(i).compareTo(bbb.get(i)) != 0) {
                writer.println("No");
                writer.flush();
                return;
            }
        }
        writer.println("Yes");
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
