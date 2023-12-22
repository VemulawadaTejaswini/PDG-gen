import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedInputStream(System.in));
        int H = scan.nextInt();
        int W = scan.nextInt();
        char[][] grid = new char[H][];
        for (int i=0;i<H;i++) grid[i] = scan.next().toCharArray();
        Task tsk = new Task();
        char[][] fnl = tsk.solve(grid);
        for (char[] row: fnl) System.out.println(new String(row));
    }

    static class Task{
        public char[][] solve(char[][] grid) {
            boolean change = true;
            while (change) {
                change = false;
                char[][] delr = delRow(grid);
                if (delr != null) change = true;
                grid = delr == null? grid: delr;
                char[][] delc = delCol(grid);
                if (delc != null) {
                    grid = delc;
                    change = true;
                }
            }
            return grid;
        }

        private char[][] delRow(char[][] grid) {
            if (grid.length == 0) return null;
            int m = grid.length, n = grid[0].length;
            HashSet<Integer> rows = new HashSet<>();
            for (int i=0;i<m;i++) {
                boolean white = true;
                for (int j=0;j<n&&white;j++) {
                    if (grid[i][j] == '#') white = false;
                }
                if (white) rows.add(i);
            }
            if (rows.isEmpty()) return null;
            char[][] res = new char[m-rows.size()][n];
            int idx = 0;
            for (int i=0;i<m;i++) {
                if (rows.contains(i)) continue;
                for (int j=0;j<n;j++) res[idx][j] = grid[i][j];
                idx++;
            }
            return res;
        }

        private char[][] delCol(char[][] grid) {
            if (grid.length == 0) return null;
            int m = grid.length, n = grid[0].length;
            HashSet<Integer> cols = new HashSet<>();
            for (int j=0;j<n;j++) {
                boolean white = true;
                for (int i=0;i<m&&white;i++) {
                    if (grid[i][j] == '#') white = false;
                }
                if (white) cols.add(j);
            }
            if (cols.isEmpty()) return null;
            char[][] res = new char[m][n-cols.size()];
            for (int i=0;i<m;i++) {
                int idx = 0;
                for (int j=0;j<n;j++) {
                    if (cols.contains(j)) continue;
                    res[i][idx++] = grid[i][j];
                }
            }
            return res;
        }
    }
}
