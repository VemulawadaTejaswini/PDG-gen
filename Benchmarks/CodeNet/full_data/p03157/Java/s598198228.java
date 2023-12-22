import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    //    private static final int MOD = 1_000_000_007;
    private static final char BLACK = '#';
    private static final char WHITE = '.';

    private int H;
    private int W;

    public static void main(String[] args) {
        try (CustomReader in = new CustomReader()) {
            new Main().execute(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void execute(CustomReader in) throws IOException {
        int[] hw = in.readLineAsIntArray();
        H = hw[0];
        W = hw[1];
        final int SZ = H * W;

        char[][] field = new char[H][];
        int[] parent = new int[H * W];

        for (int i = 0; i < H; i++) {
            field[i] = in.readLine().toCharArray();
        }

        for (int i = 0; i < SZ; i++) {
            parent[i] = i;
        }

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                int cellId = id(i, j);
                if (parent[cellId] == cellId) {
                    dfs(i, j, field, cellId, parent);
                }
            }
        }

        HashMap<Integer, Integer> countBlack = new HashMap<>();
        HashMap<Integer, Integer> countWhite = new HashMap<>();
        HashSet<Integer> keys = new HashSet<>();
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                int cellId = id(i, j);
                if (field[i][j] == BLACK) {
                    int cnt = countBlack.getOrDefault(parent[cellId], 0) + 1;
                    countBlack.put(parent[cellId], cnt);
                } else {
                    int cnt = countWhite.getOrDefault(parent[cellId], 0) + 1;
                    countWhite.put(parent[cellId], cnt);
                }
                keys.add(cellId);
            }
        }


        long totalCount = 0L;
        for (Integer key : keys) {
            totalCount += countBlack.getOrDefault(key, 0) * countWhite.getOrDefault(key, 0);
        }
        System.out.println(totalCount);

    }

    private void dfs(int h, int w, char[][] field, int root, int[] parents) {

        if (h - 1 > 0 && field[h][w] != field[h - 1][w]) {
            int adjId = id(h - 1, w);
            if (adjId != root && parents[adjId] == adjId) {
                parents[adjId] = root;
                dfs(h - 1, w, field, root, parents);
            }
        }

        if (w - 1 > 0 && field[h][w] != field[h][w - 1]) {
            int adjId = id(h, w - 1);
            if (adjId != root && parents[adjId] == adjId) {
                parents[adjId] = root;
                dfs(h, w - 1, field, root, parents);
            }
        }

        if (h + 1 < H && field[h][w] != field[h + 1][w]) {
            int adjId = id(h + 1, w);
            if (adjId != root && parents[adjId] == adjId) {
                parents[adjId] = root;
                dfs(h + 1, w, field, root, parents);
            }
        }

        if (w + 1 < W && field[h][w] != field[h][w + 1]) {
            int adjId = id(h, w + 1);
            if (adjId != root && parents[adjId] == adjId) {
                parents[adjId] = root;
                dfs(h, w + 1, field, root, parents);
            }
        }
    }


    private int id(int h, int w) {
        return h * W + w;
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