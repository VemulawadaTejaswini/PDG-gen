import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Main {
    //    static String INPUT = "5\n3 2 2 4 1\n1 2 2 2 1";
    static String INPUT = "";

    public static void main(String[] args) {
        InputStream is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());

        Scanner scanner = new Scanner(is);

        final int n = scanner.nextInt();
        int[][] matrix = new int[2][];
        for (int i = 0; i < 2; i++) {
            matrix[i] = new int[n];
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println(solve(matrix));
    }

    static int solve(int[][] matrix) {
        return dfs(matrix, 0, 0, 0);
    }

    static int dfs(int[][] matrix, int x, int y, int acc) {
        if (y >= matrix.length || x >= matrix[0].length) {
            return acc;
        }
        if (y == matrix.length - 1 && x == matrix[0].length - 1) {
            return acc + matrix[y][x];
        }
        int max = -1;
        int accPlusCurrent = acc + matrix[y][x];
        max = Math.max(max, dfs(matrix, x, y + 1, accPlusCurrent));
        max = Math.max(max, dfs(matrix, x + 1, y, accPlusCurrent));
        return max;
    }

}
