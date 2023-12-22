import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] tasks = new int[N][3];

        for (int i = 0; i < N; i++) {
            tasks[i][0] = sc.nextInt();
            tasks[i][1] = sc.nextInt();
            tasks[i][2] = sc.nextInt();
        }

        int[] dp = new int[3];

        for(int day = 0; day < N; day++) {
            int[] temp = new int[3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (i != j) {
                        temp[i] = Math.max(temp[i], dp[j] + tasks[day][i]);
                    }
                }
            }
            dp = temp;
        }
        System.out.println(Math.max(dp[0], Math.max(dp[1], dp[2])));
    }
}
