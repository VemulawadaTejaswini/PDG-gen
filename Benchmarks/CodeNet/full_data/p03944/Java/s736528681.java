import java.awt.*;
import java.io.PrintWriter;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    private static Scanner sc;

    public static void main(String[] args) {
        Main.sc = new Scanner(System.in);

        final int W = nextInt(), H = nextInt(), N = nextInt();
        HashMap<Integer, List<Point>> each_points = inputPoints(N);

        Solver solver = new Solver();
        int result = solver.solve(each_points, W, H);

        PrintWriter out = new PrintWriter(System.out);
        out.println(result);
        out.flush();
    }

    public static HashMap<Integer, List<Point>> inputPoints(int n) {
        HashMap<Integer, List<Point>> result = new HashMap<>();
        IntStream.range(0, n).forEach(i -> {
            Point point = new Point(nextInt(), nextInt());
            int point_type = nextInt();
            if (!result.containsKey(point_type))
                result.put(point_type, new ArrayList<>());
            result.get(point_type).add(point);
        });
        return result;
    }

    public static int nextInt() {
        return Integer.parseInt(sc.next());
    }
}

class Solver {
    final int LOWER_X = 1;
    final int UPPER_X = 2;
    final int LOWER_Y = 3;
    final int UPPER_Y = 4;

    public int solve(HashMap<Integer, List<Point>> each_points, int W, int H) {
        int[][] calcConfigList = {
                {LOWER_X, 1, 1, 0},
                {UPPER_X, 1, 0, W},
                {LOWER_Y, 0, 1, 0},
                {UPPER_Y, 0, 0, H},
        };
        int[] edges = Arrays.stream(calcConfigList).mapToInt(calcConfig -> {
            List<Point> target_points = each_points.get(calcConfig[0]);
            if (target_points == null) {
                return calcConfig[3];
            }
            return _calcEdge(target_points, calcConfig[1] == 1, calcConfig[2] == 1);
        }).toArray();
        final int width = Math.max(0, edges[1] - edges[0]);
        final int height = Math.max(0, edges[3] - edges[2]);

        return width * height;
    }

    private int _calcEdge(List<Point> points, boolean isX, boolean isLower) {
        List<Integer> values = isX ?
                points.stream().map(point -> point.x).collect(Collectors.toList())
                : points.stream().map(point -> point.y).collect(Collectors.toList());
        return isLower ? values.stream().min(Comparator.naturalOrder()).orElse(0)
                : values.stream().max(Comparator.naturalOrder()).orElse(0);
    }
}