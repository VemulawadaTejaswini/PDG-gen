import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {

    private static Scanner sc;
    private static int[][] neg8 = new int[][]{{-1, -1}, {0, -1}, {1, -1}, {-1, 0}, {1, 0}, {-1, 1}, {0, 1}, {1, 1}};
    private static int[][] neg4 = new int[][]{{1, 0}, {0, -1}, {-1, 0}, {0, 1}};

    public static void main(String[] args) {
        Main instance = new Main();
        sc = instance.new Scanner();
        instance.solve();
    }

    private void solve() {
        try {
            int H, W;
            H=sc.nextInt();
            W=sc.nextInt();
            char[][] maze = new char[H][W];
            int nWall = 0;
            int nMaze = H*W;
            for (int i = 0; i < H; i++) {
                maze[i] = sc.next().toCharArray();
                for (int j = 0; j < W; j++) {
                    if(maze[i][j]=='#') nWall++;
                }
            }

            int dst[][] = new int[H][W];
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    dst[i][j] = Integer.MAX_VALUE;
                }
            }

            int sy = 0, sx = 0;
            int gy = H - 1, gx = W - 1;

            ArrayDeque<Point> q = new ArrayDeque<>();
            q.offer(new Point(sx,sy));
            dst[sy][sx] = 0;

            while (q.size() > 0) {
                Point newP = q.poll();

                if (newP.equals(new Point(gx, gy))) {
                    break;
                }

                for (int[] ints : neg4) {
                    try {
                        int ny, nx;
                        ny = newP.y + ints[1];
                        nx = newP.x + ints[0];
                        if(maze[ny][nx] == '.' && dst[ny][nx] == Integer.MAX_VALUE) {
                            q.offer(new Point(nx, ny));
                            dst[ny][nx] = dst[newP.y][newP.x] + 1;
                        }

                    }catch (ArrayIndexOutOfBoundsException e) {

                    }
                }
            }

            int goal = dst[gy][gx];
            int ans = nMaze - nWall - (goal + 1);
            if (goal == Integer.MAX_VALUE) {
                ans = -1;
            }

            System.out.println(ans);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private class Scanner {
        String[] s;
        int i;
        BufferedReader br;
        String regex = " ";

        public Scanner() {
            s = new String[0];
            i = 0;
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        @Override
        protected void finalize() throws Throwable {
            try {
                super.finalize();
            } finally {
                destruction();
            }
        }

        private void destruction() throws IOException {
            if (br != null) br.close();
        }

        public String next() throws IOException {
            if (i < s.length) return s[i++];
            String st = br.readLine();
            while (st == "") st = br.readLine();
            s = st.split(regex, 0);
            i = 0;
            return s[i++];
        }

        public int nextInt() throws NumberFormatException, IOException {
            return Integer.parseInt(next());
        }

        public Long nextLong() throws NumberFormatException, IOException {
            return Long.parseLong(next());
        }

        public Double nextDouble() throws NumberFormatException, IOException {
            return Double.parseDouble(next());
        }
    }

    private static double distance(int x1, int x2, int y1, int y2) {
        return Math.sqrt((Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)));
    }
}

