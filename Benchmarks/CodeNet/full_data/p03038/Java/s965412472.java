import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        try (CustomReader in = new CustomReader()) {
            new Main().execute(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void execute(CustomReader in) throws IOException {
        int[] nm = in.readLineAsIntArray();
        final int N = nm[0];
        final int M = nm[1];
        int[] A = in.readLineAsIntArray();
        Operation[] ops = new Operation[M];
        Arrays.sort(A);

        for (int i = 0; i < M; i++) {
            int[] bc = in.readLineAsIntArray();
            ops[i] = new Operation(bc[0], bc[1]);
        }
        Arrays.sort(ops, (x, y) -> (y.C == x.C) ? y.B - x.B : y.C - x.C);

        int[] rep = new int[N];
        int k = 0;
        for (int i = 0; i < ops.length; i++) {
            if (k >= N) {
                k = N;
                break;
            }
            Arrays.fill(rep, k, Math.min(N, k + ops[i].B), ops[i].C);
            k += ops[i].B;
        }
        long sum = 0L;

        for (int i = 0; i < N; i++) {
            if (i < k) {
                sum += Math.max(rep[i], A[i]);
            }else{
                sum += A[i];
            }
        }
        System.out.println(sum);
    }

    static class Operation {
        int B;
        int C;

        public Operation(int b, int c) {
            B = b;
            C = c;
        }

    }

    static class CustomReader extends BufferedReader {

        public CustomReader() throws IOException {
            super(new InputStreamReader(System.in));
        }

        public int[] readLineAsIntArray() throws IOException {
            String[] strArray = this.readLine().split(" ");
            int[] intArray = new int[strArray.length];
            for (int i = 0, n = strArray.length; i < n; i++) {
                intArray[i] = Integer.parseInt(strArray[i]);
            }
            return intArray;
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