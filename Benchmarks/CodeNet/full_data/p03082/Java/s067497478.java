import java.io.*;
import java.util.*;

public class Main {
    private static final long MOD = 1_000_000_007;

    public static void main(String[] args) {
        try (CustomReader in = new CustomReader()) {
            new Main().execute(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void execute(CustomReader in) throws IOException {
        int[] nx = in.readLineAsIntArray();
        final int N = nx[0];
        int X = nx[1];
        int[] S = in.readLineAsIntArray();
        System.out.println(countNumbers(S, X));
    }

    private long countNumbers(int[] arr, int x) {
        if (x == 0) {
            return 0L;
        } else if (arr.length == 1) {
            return x % arr[0];
        }
        Arrays.sort(arr);
        long count = 0L;
        int small = 0;
        int large = 0;
        boolean eq = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < x) {
                small++;
            } else if (arr[i] == x) {
                eq = true;
            }
            if (arr[i] > x) {
                large++;
            }
        }
        if (eq) {
            return 0;
        }

        if (large > 0) {
            count = x;
            for (int i = 1; i <= large; i++) {
                count = (count * i) % MOD;
            }
        }

        for (int i = 0; i < small; i++) {
            int r = x % arr[i];
            count = (count + countNumbers(copyAndRemove(arr, 0, small, i), r)) % MOD;
        }
        return count % MOD;
    }

    private int[] copyAndRemove(int[] arr, int start, int end, int removeIndex) {
        int[] copyArray = new int[end - start - 1];
        int j = 0;
        for (int i = start; i < end; i++) {
            if (i == removeIndex) {
                continue;
            }
            copyArray[j++] = arr[i];
        }
        return copyArray;
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

        public int readLineAsInt() throws IOException {
            return Integer.parseInt(readLine());
        }

        public int[] readLineAsIntArray() throws IOException {
            String[] strArray = this.readLine().split(" ");
            int[] intArray = new int[strArray.length];
            for (int i = 0, n = strArray.length; i < n; i++) {
                intArray[i] = Integer.parseInt(strArray[i]);
            }
            return intArray;
        }

        public int[][] readLinesAsIntMatrix(int rows, int columns) throws IOException {
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