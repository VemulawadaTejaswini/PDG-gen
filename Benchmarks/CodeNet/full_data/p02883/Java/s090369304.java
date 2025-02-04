import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Gluttony
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            long[] array = readLongArray(reader);
            int N = (int) array[0];
            long K = array[1];
            long[] A = readLongArray(reader);
            long[] F = readLongArray(reader);

            long S = 0;
            for (long a : A) {
                S += a;
            }

            if (S <= K) {
                System.out.println(0);
                return;
            }

            Arrays.sort(A);
            Arrays.sort(F);

            long min = 0;
            long max = 0;
            for (int i = 0; i < N; i++) {
                max = Math.max(max, A[i] * F[N - 1 - i]);
            }

            while (max - min > 1) {
                long mid = (min + max) / 2;

                long need = 0;
                for (int i = 0; i < N; i++) {
                    if (A[i] * F[N - 1 - i] > mid) {
                        need += A[i] - mid / F[N - 1 - i];
                    }
                }

                if (need > K) {
                    min = mid;
                } else {
                    max = mid;
                }
            }

            System.out.println(max);
        }

    }

    public static String readString(BufferedReader reader) throws Exception {
        return reader.readLine();
    }

    public static int readInt(BufferedReader reader) throws Exception {
        return Integer.parseInt(reader.readLine());
    }

    public static long readLong(BufferedReader reader) throws Exception {
        return Long.parseLong(reader.readLine());
    }

    public static double readDouble(BufferedReader reader) throws Exception {
        return Double.parseDouble(reader.readLine());
    }

    public static String[] readStringArray(BufferedReader reader) throws Exception {
        return reader.readLine().split(" ");
    }

    public static int[] readIntArray(BufferedReader reader) throws Exception {
        String[] str = reader.readLine().split(" ");
        int[] array = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            array[i] = Integer.parseInt(str[i]);
        }
        return array;
    }

    public static long[] readLongArray(BufferedReader reader) throws Exception {
        String[] str = reader.readLine().split(" ");
        long[] array = new long[str.length];
        for (int i = 0; i < str.length; i++) {
            array[i] = Long.parseLong(str[i]);
        }
        return array;
    }

    public static double[] readDoubleArray(BufferedReader reader) throws Exception {
        String[] str = reader.readLine().split(" ");
        double[] array = new double[str.length];
        for (int i = 0; i < str.length; i++) {
            array[i] = Double.parseDouble(str[i]);
        }
        return array;
    }

    public static int[][] readIntMatrix(BufferedReader reader, int N) throws Exception {
        int[][] matrix = new int[N][];
        for (int i = 0; i < N; i++) {
            matrix[i] = readIntArray(reader);
        }
        return matrix;
    }

    public static long[][] readLongMatrix(BufferedReader reader, int N) throws Exception {
        long[][] matrix = new long[N][];
        for (int i = 0; i < N; i++) {
            matrix[i] = readLongArray(reader);
        }
        return matrix;
    }

    public static double[][] readDoubleMatrix(BufferedReader reader, int N) throws Exception {
        double[][] matrix = new double[N][];
        for (int i = 0; i < N; i++) {
            matrix[i] = readDoubleArray(reader);
        }
        return matrix;
    }

    public static int[] extractArray(int[][] matrix, int index) {
        int[] array = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            array[i] = matrix[i][index];
        }
        return array;
    }

    public static long[] extractArray(long[][] matrix, int index) {
        long[] array = new long[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            array[i] = matrix[i][index];
        }
        return array;
    }

    public static double[] extractArray(double[][] matrix, int index) {
        double[] array = new double[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            array[i] = matrix[i][index];
        }
        return array;
    }

}
