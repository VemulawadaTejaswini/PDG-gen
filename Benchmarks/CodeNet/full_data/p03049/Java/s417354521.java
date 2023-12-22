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
        final int N = Integer.parseInt(in.readLine());
        String[] S = new String[N];
        int endWithA = 0;
        int beginWithB = 0;
        int ab = 0;
        for (int i = 0; i < N; i++) {
            S[i] = in.readLine();
            if (S[i].charAt(0) == 'B') {
                beginWithB++;
            }
            if (S[i].charAt(S[i].length() - 1) == 'A') {
                endWithA++;
            }
            for (int j = 0; j < S[i].length() - 1; j++) {
                if (S[i].charAt(j) == 'A' && S[i].charAt(j + 1) == 'B') {
                    ab++;
                }
            }
        }
        System.out.println(ab + Math.min(endWithA, beginWithB));

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