import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayDeque;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int rows = in.nextInt();
            int cols = in.nextInt();
            int queries = in.nextInt();
            in.nextLine();
            boolean[][] map = new boolean[rows][cols];
            for (int row = 0; row < rows; row++) {
                String line = in.nextLine();
                for (int col = 0; col < cols; col++) {
                    map[row][col] = line.charAt(col) == '1';
                }
            }

            int[][] components = new int[rows][cols];
            ArrayDeque<TaskC.Point> deque = new ArrayDeque<>();
            int nextComponentId = 1;

            for (int queryN = 0; queryN < queries; queryN++) {
                int row1 = in.nextInt() - 1;
                int col1 = in.nextInt() - 1;

                int row2 = in.nextInt() - 1;
                int col2 = in.nextInt() - 1;

                int startComponentId = nextComponentId;

                for (int row = row1; row <= row2; row++) {
                    for (int col = col1; col <= col2; col++) {
                        if (map[row][col] == true && components[row][col] < startComponentId) {
                            deque.add(new TaskC.Point(row, col));
                            components[row][col] = nextComponentId++;
                            while (deque.size() > 0) {
                                TaskC.Point point = deque.remove();
                                //right
                                if (point.col + 1 <= col2 && map[point.row][point.col + 1] &&
                                        components[point.row][point.col + 1] < startComponentId) {
                                    deque.add(new TaskC.Point(point.row, point.col + 1));
                                    components[point.row][point.col + 1] = components[point.row][point.col];
                                }

                                //down
                                if (point.row + 1 <= row2 && map[point.row + 1][point.col] &&
                                        components[point.row + 1][point.col] < startComponentId) {
                                    deque.add(new TaskC.Point(point.row + 1, point.col));
                                    components[point.row + 1][point.col] = components[point.row][point.col];
                                }

                                //left
                                if (point.col - 1 >= col1 && map[point.row][point.col - 1] &&
                                        components[point.row][point.col - 1] < startComponentId) {
                                    deque.add(new TaskC.Point(point.row, point.col - 1));
                                    components[point.row][point.col - 1] = components[point.row][point.col];
                                }

                                //up
                                if (point.row - 1 >= row1 && map[point.row - 1][point.col] &&
                                        components[point.row - 1][point.col] < startComponentId) {
                                    deque.add(new TaskC.Point(point.row - 1, point.col));
                                    components[point.row - 1][point.col] = components[point.row][point.col];
                                }
                            }
                        }
                    }
                }

                out.println(nextComponentId - startComponentId);
            }
        }

        private static class Point {
            private final int row;
            private final int col;

            public Point(int row, int col) {
                this.row = row;
                this.col = col;
            }

        }

    }
}

