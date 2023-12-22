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
            solve(writer, reader);
        }
    }

    private static void solve(PrintWriter writer, InputReader reader) throws IOException {
        int[] inputInts = reader.readIntsSplitByDelimiter(" ");
        int numOfCity = inputInts[0];
        int firstPosition = inputInts[1];
        int[] cityPositions = reader.readIntsSplitByDelimiter(" ");

        int[] positions = new int[numOfCity + 1];
        System.arraycopy(cityPositions, 0, positions, 0, numOfCity);
        positions[numOfCity] = firstPosition;
        Arrays.sort(positions);

        int preP = positions[0];
        int minDistance = positions[1] - preP;
        for (int i = 2; i < positions.length; i++) {
            int p = positions[i];
            int distance = p - preP;
            if (distance < minDistance) {
                minDistance = distance;
            }
        }

        writer.println(minDistance);
        writer.flush();
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
