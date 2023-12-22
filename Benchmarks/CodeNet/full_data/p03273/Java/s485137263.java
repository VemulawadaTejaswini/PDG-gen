import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Set;
import java.util.HashSet;

import javax.swing.text.Highlighter.Highlight;

public class Main {
    public static void main(String[] args) throws IOException {
        try (PrintWriter writer = new PrintWriter(System.out); InputReader reader = new InputReader(System.in)) {
            int[] inputInts = reader.readIntsSplitByDelimiter(" ");
            int width = inputInts[1];
            int height = inputInts[0];

            char[][] matrix = new char[height][width];

            for (int i = 0; i < height; i++) {
                String row = reader.readLine();
                matrix[i] = row.toCharArray();
            }

            Set<Integer> emptyColumnsSet = new HashSet<>(width);
            for (int i = 0; i < width; i++) {
                for (int j = 0; j < height; j++) {
                    if (matrix[j][i] == '#') {
                        break;
                    }

                    if (j == height - 1) {
                        emptyColumnsSet.add(i);
                    }
                }
            }

            for (int i = 0; i < height; i++) {
                String row = new String(matrix[i]);

                if (!row.contains("#")) {
                    continue;
                }

                for (int j = 0; j < width; j++) {
                    if (!emptyColumnsSet.contains(j)) {
                        System.out.print(matrix[i][j]);
                    }
                }

                System.out.println();
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
        return Integer.parseInt(this.readLine());
    }
 
    long readLong() throws IOException {
        return Long.parseLong(this.readLine());
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
 
    @Override
    public void close() throws IOException {
        br.close();
    }
}
