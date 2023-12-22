import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {


    public static void main(String[] args) {
        try (CustomReader in = new CustomReader()) {
            new Main().execute(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void execute(CustomReader in) throws IOException {
        final String[] theNumbers = {"3", "5", "7"};
        final int N = in.readLineAsInt();

        int keta = 0;
        int n = N;
        while (n > 0) {
            keta++;
            n /= 10;
        }

        ArrayList<String> numbers = new ArrayList<>();
        ArrayList<String> prev = new ArrayList<>();
        prev.add("");

        for (int i = 0; i < keta; i++) {
            ArrayList<String> tmpNumbers = new ArrayList<>();
            for (String p : prev) {
                for (String num : theNumbers) {
                    tmpNumbers.add(num + p);
                }
            }
            numbers.addAll(tmpNumbers);
            prev = tmpNumbers;
        }

        int count = 0;
        for (String num : numbers) {
            if (Integer.parseInt(num) <= N && num.contains("3") && num.contains("5") && num.contains("7")) {
                count++;
            }
        }
        System.out.println(count);
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