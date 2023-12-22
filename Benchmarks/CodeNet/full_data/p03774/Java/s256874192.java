import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] students = new int[n][2];
        for (int i = 0; i < n; i++) {
            students[i][0] = sc.nextInt();
            students[i][1] = sc.nextInt();
        }

        int[][] checkpoints = new int[n][2];
        for (int i = 0; i < m; i++) {
            checkpoints[i][0] = sc.nextInt();
            checkpoints[i][1] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int minDist = Integer.MAX_VALUE;
            int minIndex = 0;
            for (int j = 0; j < m; j++) {
                int dist = Math.abs(students[i][0] - checkpoints[j][0]) + Math.abs(students[i][1] - checkpoints[j][1]);
                if (dist < minDist) {
                    minDist = dist;
                    minIndex = j;
                }
            }
            System.out.println(minIndex + 1);
        }
    }
}
