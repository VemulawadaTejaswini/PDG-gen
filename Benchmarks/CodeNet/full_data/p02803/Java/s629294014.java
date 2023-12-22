import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
  public static Integer INFINITY = Integer.MAX_VALUE;

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int h = scan.nextInt();
    int w = scan.nextInt();

    char[][] ar = new char[h][w];

    // reading the input from the char array
    for (int i = 0; i < ar.length; i++) {
        String c = scan.next();
        String[] split = c.split("");
      for (int j = 0; j < ar[i].length; j++) {
            ar[i][j] = split[j].charAt(0);
      }
    }
    int max = 0;

    for (int i = 0; i < ar.length; i++) {
      for (int j = 0; j < ar[i].length; j++) {
        // processing input based on the source
        int[][] dp = new int[h][w];
        // initialize the dp array with the Infinity to find the minima
        for (int k = 0; k < dp.length; k++) {
          Arrays.fill(dp[k], INFINITY-1);
        }
        // mark source to be 0. (as it start from the distance 0)

        dp[i][j] = 0;
        Queue<int[]> posQueue = new LinkedList<>();
        posQueue.add(new int[] {i, j});
        while (!posQueue.isEmpty()) {
          int[] poll = posQueue.poll();
          int x = poll[0];
          int y = poll[1];
          if (validPos(x - 1, y, ar, dp) && dp[x-1][y] > dp[x][y]) {
            posQueue.add(new int[] {x - 1, y});
            dp[x - 1][y] = Math.min(dp[x - 1][y], 1 + dp[x][y]);
            max = Math.max(dp[x-1][y],max);
          }
          if (validPos(x + 1, y, ar, dp) && dp[x+1][y] > dp[x][y]) {
            posQueue.add(new int[] {x + 1, y});
            dp[x + 1][y] = Math.min(dp[x + 1][y], 1 + dp[x][y]);
              max = Math.max(dp[x+1][y],max);
          }
          if (validPos(x, y - 1, ar, dp) && dp[x][y-1] > dp[x][y]) {
            posQueue.add(new int[] {x, y - 1});
            dp[x][y - 1] = Math.min(dp[x][y - 1], 1 + dp[x][y]);
              max = Math.max(dp[x][y-1],max);
          }
          if (validPos(x, y + 1, ar, dp) && dp[x][y+1] > dp[x][y]) {
            posQueue.add(new int[] {x, y + 1});
            dp[x][y + 1] = Math.min(dp[x][y + 1], 1 + dp[x][y]);
              max = Math.max(dp[x][y+1],max);
          }
        }
      }
    }
    System.out.println(max);
  }

  private static boolean validPos(int i, int j, char[][] ar, int[][] dp) {
    if (i < 0
        || j < 0
        || i >= ar.length
        || j >= ar[0].length
        || ar[i][j] == '#'
        || dp[i][j] == INFINITY) return false;
    return true;
  }
}
