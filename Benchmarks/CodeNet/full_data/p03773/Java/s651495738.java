import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<Point> start = new ArrayList<>();
    private static List<Point> end = new ArrayList<>();

    private static class Point {
        int x;
        int y;

        private Point(final int x, final int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static class FastReader {
        static BufferedInputStream in = new BufferedInputStream(System.in);

        static int readInt() {
            int no = 0;
            boolean minus = false;
            try {
                int a = in.read();
                while (a == 32 || a == 10) //10 is newline & 32 is ASCII for space
                    a = in.read();
                if (a == '-') {
                    minus = true;
                    a = in.read();
                }
                while (a != 10 && a != 32 && a != -1) {
                    no = no * 10 + (a - '0');
                    a = in.read();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return minus ? -no : no;
        }

        static String read() {
            StringBuilder str = new StringBuilder();
            try {
                int a = in.read();
                while (a == 32)
                    a = in.read();
                while (a != 10 && a != 32 && a != -1) {
                    str.append((char) a);
                    a = in.read();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str.toString();
        }
    }


    public static void main(String[] args) {
        FastReader in = new FastReader();
        solve(in);

    }


    private static void solve(final FastReader in) {
        int n = in.readInt();
        int m = in.readInt();
        coordinateBuilder(in, n, start);
        coordinateBuilder(in, m, end);
        for (int i = 0; i < n; i++) {
            int res = 0;
            for (int j = 0; j < m; j++) {
                if (distance(i, j) < distance(i, res)) {
                    res = j;
                }
            }
            System.out.println(res + 1);
        }
    }

    private static int distance(final int i, final int j) {
        return Math.abs(start.get(i).x - end.get(j).x) + Math.abs(start.get(i).y - end.get(j).y);
    }

    private static void coordinateBuilder(final FastReader in, final int range, final List<Point> coordinates) {
        for (int i = 0; i < range; i++) {
            coordinates.add(new Point(in.readInt(), in.readInt()));
        }
    }
}
