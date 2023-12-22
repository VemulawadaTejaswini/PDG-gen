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


    private static final char BLACK = '0';
    private static final char WHITE = '1';


    public void execute(CustomReader in) throws IOException {
        char[] tiles = in.readLine().toCharArray();
        int N = tiles.length;

        char[] ptn1 = new char[N];
        char[] ptn2 = new char[N];

        ptn1[0] = BLACK;
        ptn2[0] = WHITE;
        for (int i = 1; i < N; i++) {
            ptn1[i] = oppositeColor(ptn1[i - 1]);
            ptn2[i] = oppositeColor(ptn2[i - 1]);
        }

        int cnt1 = 0;
        int cnt2 = 0;
        for (int i = 0; i < N; i++) {
            if(tiles[i]!= ptn1[i]){
                cnt1++;
            }
            if(tiles[i] != ptn2[i]){
                cnt2++;
            }
        }

        System.out.println(Math.min(cnt1, cnt2));

    }

    private char oppositeColor(char col) {
        if (col == BLACK) {
            return WHITE;
        } else if (col == WHITE) {
            return BLACK;
        } else {
            throw new IllegalArgumentException();
        }
    }


    static class CustomReader extends BufferedReader {

        //private static final int DEFAULT_BUF_SIZE = 2048;
        private static final int DEFAULT_BUF_SIZE = 4096;
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