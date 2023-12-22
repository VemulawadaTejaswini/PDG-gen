import java.io.*;
import java.util.*;

public class Main {
    private static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        try (CustomReader in = new CustomReader()) {
            new Main().execute(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void execute(CustomReader in) throws IOException {
        int[] hw = in.readLineAsIntArray();
        int H = hw[0];
        int W = hw[1];
        char[][] A = new char[H][W];
        Set<Address> nextBlacks = new HashSet<>();
        for (int i = 0; i < H; i++) {
            String l = in.readLine();
            A[i] = l.toCharArray();
        }
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (A[i][j] == '#') {
                    if (i > 0 && A[i - 1][j] == '.') {
                        nextBlacks.add(new Address(i - 1, j));
                    }
                    if (i < H - 1 && A[i + 1][j] == '.') {
                        nextBlacks.add(new Address(i + 1, j));
                    }
                    if (j > 0 && A[i][j - 1] == '.') {
                        nextBlacks.add(new Address(i, j - 1));
                    }
                    if (j < W - 1 && A[i][j + 1] == '.') {
                        nextBlacks.add(new Address(i, j + 1));
                    }
                }
            }
        }

        int turn = 0;
        while (!nextBlacks.isEmpty()) {
            Set<Address> temp = new HashSet<>();
            for (Address addr : nextBlacks) {
                A[addr.x][addr.y] = '#';
                int i = addr.x;
                int j = addr.y;
                if (i > 0 && A[i - 1][j] == '.') {
                    temp.add(new Address(i - 1, j));
                }
                if (i < H - 1 && A[i + 1][j] == '.') {
                    temp.add(new Address(i + 1, j));
                }
                if (j > 0 && A[i][j - 1] == '.') {
                    temp.add(new Address(i, j - 1));
                }
                if (j < W - 1 && A[i][j + 1] == '.') {
                    temp.add(new Address(i, j + 1));
                }
            }
            turn++;
            nextBlacks = temp;
        }
        System.out.println(turn);
    }

    class Address {
        final int x;
        final int y;

        public Address(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Address) {
                Address that = (Address) obj;
                return this.x == that.x && this.y == that.y;
            }
            return false;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

    private void copyCharArray(int h, int w, char[][] from, char[][] to) {
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                to[i][j] = from[i][j];
            }
        }
    }

    static class CustomReader extends BufferedReader {

        private static final int DEFAULT_BUF_SIZE = 2048;
        // private static final int DEFAULT_BUF_SIZE = 4096;
        // private static final int DEFAULT_BUF_SIZE = 8192;
        //private static final int DEFAULT_BUF_SIZE = 16384;
        // private static final int DEFAULT_BUF_SIZE = 1048576;

        public CustomReader() throws IOException {
            super(new InputStreamReader(System.in), DEFAULT_BUF_SIZE);
        }

        public int[] readLineAsIntArray() throws IOException {
            String[] strArray = this.readLine().split(" ");
            int[] intArray = new int[strArray.length];
            for (int i = 0, n = strArray.length; i < n; i++) {
                intArray[i] = Integer.parseInt(strArray[i]);
            }
            return intArray;
        }

        public long[] readLineAsLongArray() throws IOException {
            String[] strArray = this.readLine().split(" ");
            long[] longArray = new long[strArray.length];
            for (int i = 0, n = strArray.length; i < n; i++) {
                longArray[i] = Long.parseLong(strArray[i]);
            }
            return longArray;
        }


        public int[][] readAsIntMatrix(int rows, int columns) throws IOException {
            int[][] matrix = new int[rows][columns];
            for (int i = 0; i < rows; i++) {
                String[] r = this.readLine().split(" ");
                for (int j = 0; j < columns; j++) {
                    matrix[i][j] = Integer.parseInt(r[j]);
                }
            }
            return matrix;
        }
    }
}