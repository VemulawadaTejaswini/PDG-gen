import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
    static Map<String, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println(solve(arr, n - 1, 0));
        //System.out.println(map);
    }

    public static int solve(int[][] arr, int row, int col) {

        String s = "" + row + col;
        if (map.containsKey(s)) {
            return map.get(s);
        }
        //base case
        if (row < 0) {
            return 0;
        }

        //recursive case
        int max0 = 0;
        int max1 = 0;
        int max2 = 0;
        for (int j = 0; j < 3; j++) {
            if (j == 0) {
                max0 = arr[row][j] + Math.max(solve(arr, row - 1, 1),
                        solve(arr, row - 1, 2));
                map.putIfAbsent("" + row + j, max0);
            } else if (j == 1) {
                max1 = arr[row][j] + Math.max(solve(arr, row - 1, 0),
                        solve(arr, row - 1, 2));
                map.putIfAbsent("" + row + j, max1);
            } else if (j == 2) {
                max2 = arr[row][j] + Math.max(solve(arr, row - 1, 0),
                        solve(arr, row - 1, 1));
                map.putIfAbsent("" + row + j, max2);

            }
        }
        return Math.max(max0, Math.max(max1, max2));
    }
}