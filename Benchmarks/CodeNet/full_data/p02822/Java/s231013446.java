import java.io.*;
import java.util.*;

public class Solution {

    public static int[] KR = new int[]{1, 0, -1, 0, 1, -1, 1, -1};
    public static int[] KC = new int[]{0, 1, 0, -1, 1, 1, -1, -1};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int[][] grid = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = in.nextInt();
            }
        }

        int max = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int val = findRegion(grid, i, j);
                if (max < val) {
                    max = val;
                }
            }
        }

        System.out.println(max);
    }

    public static int findRegion(int[][] grid, int r, int c) {
        if (grid[r][c] == -1 || grid[r][c] == 0) {
            return 0;
        }

        grid[r][c] = -1;

        int sum = 0;
        for (int i = 0; i < KR.length; i++) {
            if (r + KR[i] >= 0 && r + KR[i] < grid.length &&
                    c + KC[i] >= 0 && c + KC[i] < grid[0].length) {
                sum += findRegion(grid, r + KR[i], c + KC[i]);
            }
        }

        return 1 + sum;

    }

}