    import java.io.*;
    import java.util.Arrays;

    public class Main {

        public static void main(String[] args) {
            try (CustomReader in = new CustomReader()) {
                new Main().execute(in);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void execute(CustomReader in) throws IOException {
            final int N = Integer.parseInt(in.readLine());
            int[] A = in.readLineAsIntArray();

            for (int i = 0; i < N; i++) {
                A[i] -= i + 1;
            }
            Arrays.sort(A);
            int k = N / 2;
            long minS = (N%2==0)? S(A, (A[k] + A[k + 1]) / 2)  :S(A, A[k]);
            System.out.println(minS);

        }

        private long S(int[] a, int b) {
            long s = 0;
            for (int i = 0; i < a.length; i++) {
                s += Math.abs(a[i] - b);
            }
            return s;
        }

        static class CustomReader extends BufferedReader {
            private static final int DEFAULT_BUF_SIZE = 2048;

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