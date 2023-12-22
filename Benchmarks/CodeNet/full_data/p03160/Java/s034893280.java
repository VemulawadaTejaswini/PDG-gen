import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] heights = new int[n];

        String[] ss = sc.nextLine().split(" ");
        for(int i = 0; i < n; i++) {
            heights[i] = Integer.parseInt(ss[i]);
        }

        sc.close();
        System.out.println(frog(n, heights));
    }

    public static int frog(int n, int[] heights) {
        if(n == 0 || n == 1)    return 0;

        int[] dp = new int[n];
        dp[0] = 0;
        dp[1] = Math.abs(heights[1] - heights[0]);
        for(int i = 2; i < n; i++) {
            dp[i] = Math.min(Math.abs(heights[i] - heights[i - 2]) + dp[i - 2],
                    Math.abs(heights[i] - heights[i - 1]) + dp[i - 1]);
        }
        return dp[n - 1];
    }
}

