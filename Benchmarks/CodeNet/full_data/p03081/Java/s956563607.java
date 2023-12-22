import java.io.*;
import java.util.*;

public class Main {
    private static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        try (CustomReader in = new CustomReader()) {
            new Main().execute(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void execute(CustomReader in) throws IOException {
        int[] nq = in.readLineAsIntArray();
        final int N = nq[0];
        final int Q = nq[1];

        char[] s = in.readLine().toCharArray();

        Spell[] spells = new Spell[Q];
        for (int i = 0; i < Q; i++) {
            String[] sp = in.readLine().split(" ");
            spells[i] = new Spell(sp[0].charAt(0), sp[1].charAt(0));
        }

        int leftLow = 0;
        int leftHigh = N;
        while (leftLow < leftHigh) {
            int leftMid = (leftLow + leftHigh) / 2;
            if (posAfter(s, leftMid, spells) < 0) {
                leftLow = leftMid + 1;
            } else {
                leftHigh = leftMid;
            }
        }

        int rightLow = 0;
        int rightHigh = N;
        while (rightLow < rightHigh) {
            int rightMid = (rightLow + rightHigh) / 2;
            if (posAfter(s, rightMid, spells) >= N) {
                rightHigh = rightMid;
            } else {
                rightLow = rightMid + 1;
            }
        }
        int dead = leftLow + (N - rightHigh);
        System.out.println(N - dead);
    }

    private int posAfter(char[] map, int pos, Spell[] spells) {
        for (int q = 0; q < spells.length; q++) {
            Spell sp = spells[q];
            if (map[pos] == sp.t) {
                if (sp.direction == 'L') {
                    pos--;
                } else if (sp.direction == 'R') {
                    pos++;
                }
            }
            if (pos < 0 || pos >= map.length) {
                break;
            }
        }
        return pos;
    }

    class Spell {
        public final char t;
        public final char direction;

        public Spell(char t, char d) {
            this.t = t;
            this.direction = d;
        }

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