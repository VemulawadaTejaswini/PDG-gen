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


    private static final char STAND = '0';
    private static final char HAND = '1';


    public void execute(CustomReader in) throws IOException {
        int[] nk = in.readLineAsIntArray();
        final int N = nk[0];
        final int K = nk[1];
        char[] people = in.readLine().toCharArray();

        ArrayList<Integer> standPeople = new ArrayList<>();
        ArrayList<Integer> handPeople = new ArrayList<>();

        int idx = 0;
        if (people[0] == STAND) {
            handPeople.add(0);
        }
        while (idx < N) {
            int cnt = 0;
            while (idx < N && people[idx] == HAND) {
                cnt++;
                idx++;
            }
            if (cnt > 0) {
                handPeople.add(cnt);
            }
            cnt = 0;
            while (idx < N && people[idx] == STAND) {
                cnt++;
                idx++;
            }
            if (cnt > 0) {
                standPeople.add(cnt);
            }
        }
        if (people[N - 1] == STAND) {
            handPeople.add(0);
        }

        int ans = 0;
        if (standPeople.size() <= K) {
            ans = N;
        } else {
            int[] standSum = new int[standPeople.size()];
            int[] handSum = new int[handPeople.size()];

            standSum[0] = standPeople.get(0);
            for (int i = 1, sz = standPeople.size(); i < sz; i++) {
                standSum[i] = standSum[i - 1] + standPeople.get(i);
            }
            handSum[0] = handPeople.get(0);
            for (int i = 1, sz = handPeople.size(); i < sz; i++) {
                handSum[i] = handSum[i - 1] + handPeople.get(i);
            }

            for (int i = 0, sz = standPeople.size(); i + K <= sz; i++) {
                int stands = (i == 0)  ? standSum[i + K - 1] : standSum[i + K - 1] - standSum[i - 1];
                int hands = (i == 0) ? handSum[i + K] : handSum[i + K] - handSum[i - 1];
                ans = Math.max(ans, stands + hands);
            }
        }
        System.out.println(ans);


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