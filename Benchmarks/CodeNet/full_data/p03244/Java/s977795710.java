import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        try (CustomReader in = new CustomReader()) {
            new Main().execute(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static final int MAX_INDEX = 100001;

    public void execute(CustomReader in) throws IOException {

        final int N = in.readLineAsInt();
        final int n = N / 2;
        int[] v = in.readLineAsIntArray();

        int[] oddCount = new int[MAX_INDEX];
        int[] evenCount = new int[MAX_INDEX];

        int oddMax = 0, oddMaxNumber = 0;
        int evenMax = 0, evenMaxNumber = 0;
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                evenCount[v[i]]++;
                if (evenCount[v[i]] > evenMax) {
                    evenMax = evenCount[v[i]];
                    evenMaxNumber = v[i];
                }
            } else {
                oddCount[v[i]]++;
                if(oddCount[v[i]] > oddMax) {
                    oddMax = oddCount[v[i]];
                    oddMaxNumber = v[i];
                }
            }
        }
        Arrays.sort(oddCount);
        Arrays.sort(evenCount);
        int ans = -1;

        if(oddMaxNumber == evenMaxNumber){
            ans = Math.min(
                    (n - oddCount[MAX_INDEX - 1]) + (n - evenCount[MAX_INDEX - 2]),
                    (n - oddCount[MAX_INDEX - 2]) + (n - evenCount[MAX_INDEX - 1])
            );
        }else{
            ans = (n - oddCount[MAX_INDEX - 1]) + (n - evenCount[MAX_INDEX - 1]);
        }
        System.out.println(ans);

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