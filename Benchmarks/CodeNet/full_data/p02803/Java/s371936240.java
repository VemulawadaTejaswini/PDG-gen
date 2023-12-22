import java.io.*;
import java.util.*;

public class Main {

    private static FastReader in = new FastReader(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static void solve() {
        int h = in.nextInt();
        int w = in.nextInt();
        // true if '#' (wall)
        boolean[][] maze = new boolean[h][w];

        for (int i = 0; i < h; i++) {
            char[] row = in.nextLine().toCharArray();
            for (int j = 0; j < w; j++) {
                maze[i][j] = row[j] == '#';
            }
        }

        int max = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                max = Math.max(max, searchFarthest(maze, i, j));
            }
        }
        out.println(max);
    }

    private static final List<Map.Entry<Integer, Integer>> dCoordsSet;

    static {
        dCoordsSet = new ArrayList<>();
        dCoordsSet.add(
                new AbstractMap.SimpleEntry<>(-1, 0)
        );
        dCoordsSet.add(new AbstractMap.SimpleEntry<>(1, 0));
        dCoordsSet.add(new AbstractMap.SimpleEntry<>(0, 1));
        dCoordsSet.add(new AbstractMap.SimpleEntry<>(0, -1));
    }

    private static int searchFarthest(boolean[][] maze, int startI, int startJ) {
        if (maze[startI][startJ]) return 0;

        int height = maze.length;
        int width = maze[0].length;
        boolean[][] visited = new boolean[height][width];

        Queue<Map.Entry<Integer, Map.Entry<Integer, Integer>>> bfs = new ArrayDeque<>();
        bfs.add(new AbstractMap.SimpleEntry<>(0,
                new AbstractMap.SimpleEntry<>(startI, startJ)));

        int max = 0;
        while (!bfs.isEmpty()) {
            Map.Entry<Integer, Map.Entry<Integer, Integer>> next = bfs.poll();
            max = Math.max(next.getKey(), max);
            int i = next.getValue().getKey();
            int j = next.getValue().getValue();
            // out.println("Searching i = " + i + ", j = " + j + ", length = " + next.getKey());
            visited[i][j] = true;

            for (Map.Entry<Integer, Integer> dCoord : dCoordsSet) {
                int nextI = i + dCoord.getKey();
                int nextJ = j + dCoord.getValue();
                if (nextI < 0 || height <= nextI
                        || nextJ < 0 || width <= nextJ
                        || maze[nextI][nextJ]
                        || visited[nextI][nextJ]) {
                    continue;
                }

                bfs.add(
                        new AbstractMap.SimpleEntry<>(next.getKey() + 1,
                                new AbstractMap.SimpleEntry<>(nextI, nextJ)
                        )
                );
            }
        }
        // out.println("For i = " + startI + ", j = " + startJ + ", max was " + max);
        return max;
    }

    // https://www.geeksforgeeks.org/fast-io-in-java-in-competitive-programming/
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        FastReader(InputStream inputStream) {
            br = new BufferedReader(new
                    InputStreamReader(inputStream));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException  e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        // https://qiita.com/masakinpo/items/5f77f2a879578a85a0bb
        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }
}
