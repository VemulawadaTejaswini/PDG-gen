import javax.swing.*;
import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Main {


    public static void main(String[] args) {
        try (CustomReader in = new CustomReader()) {
            new Main().execute(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void execute(CustomReader in) throws IOException {
        final int N = in.readLineAsInt();
        System.out.println(baseMinus2String(N));
    }

    private String baseMinus2String(int N) {
        int n = Math.abs(N);
        boolean carry = false;
        String baseMinus2 = "";
        int mask = 1;
        int number = 0;
        for (int keta = 0; keta <= 32; keta++) {
            if ((n & mask) > 0) {
                if (carry) {
                    baseMinus2 = "0" + baseMinus2;
                } else {
                    baseMinus2 = "1" + baseMinus2;
                    number += (1 << keta) * ((keta % 2 == 0) ? 1 : -1);
                    if ((N >= 0 && keta % 2 == 1) || (N < 0 && keta % 2 == 0)) {
                        carry = true;
                    }
                }
            } else {
                if (carry) {
                    carry = false;
                    baseMinus2 = "1" + baseMinus2;
                    number += (1 << keta) * ((keta % 2 == 0) ? 1 : -1);
                    if ((N >= 0 && keta % 2 == 1) || (N < 0 && keta % 2 == 0)) {
                        carry = true;
                    }
                } else {
                    baseMinus2 = "0" + baseMinus2;
                }
            }
            if (number == N) {
                break;
            }
            mask = mask << 1;
        }

        return baseMinus2;
    }


    static class CustomReader extends BufferedReader {
        public CustomReader() throws IOException {
            super(new InputStreamReader(System.in));
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

        public char[][] readAsCharMatrix(int rows) throws IOException {
            char[][] matrix = new char[rows][];
            for (int i = 0; i < rows; i++) {
                matrix[i] = this.readLine().toCharArray();
            }
            return matrix;
        }

    }

}