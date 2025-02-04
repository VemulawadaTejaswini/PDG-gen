import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().trim().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        int[][] students = new int[n][2];
        for (int i = 0; i < n; i ++) {
            input = scanner.nextLine().trim().split(" ");
            students[i][0] = Integer.parseInt(input[0]);
            students[i][1] = Integer.parseInt(input[1]);
        }

        int[][] checkpoints = new int[m][2];
        for (int i = 0; i < m; i ++) {
            input = scanner.nextLine().trim().split(" ");
            checkpoints[i][0] = Integer.parseInt(input[0]);
            checkpoints[i][1] = Integer.parseInt(input[1]);
        }

        for (int[] s: students) {
            int iMin = -1;
            int dMin = Integer.MAX_VALUE;
            for (int i = 0; i < m; i ++) {
                int[] c = checkpoints[i];
                int dist = Math.abs(s[0] - c[0]) + Math.abs(s[1] - c[1]);
                if (dist < dMin) {
                    dMin = dist;
                    iMin = i;
                }
            }
            System.out.println(iMin + 1);
        }
    }
}
