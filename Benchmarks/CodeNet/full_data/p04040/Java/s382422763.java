import java.util.*;

class Main{
  static int[][] dp;
  static int h;
  static int w;
  static int a;
  static int b;
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    h = scan.nextInt();
    w = scan.nextInt();
    a = scan.nextInt();
    b = scan.nextInt();

    dp = new int[h][w];
    dp[0][0]=1;

    for(int i = 0; i < h; i++) {
      for(int j = 0; j < w; j++) {
        if(h-i<=a&&j<b) continue;
        calc(i,j);
      }
    }

    System.out.println(dp[h-1][w-1]);

    //System.out.println(Arrays.deepToString(dp));
  }

  static void calc(int x, int y) {
    if(x<h-1) dp[x+1][y] += dp[x][y];
    if(y<w-1) dp[x][y+1] += dp[x][y];
    dp[x][y] %= 1000000007;
  }
}
