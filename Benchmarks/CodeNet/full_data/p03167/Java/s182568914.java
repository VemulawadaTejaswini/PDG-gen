import java.util.Scanner;

class Main{

  private static int solve(String[] play, int H, int W){

    int[][] dp = new int[H][W];
    dp[0][0] = 0;
    
    for(int i = 1; i < play[0].length(); i++){
      if(play[0].charAt(i) == '.')
        dp[0][i] = 1;
      else 
        break;
    }
    
    for(int i = 1; i < H; i++){
      if(play[i].charAt(0) == '.')
        dp[i][0] = 1;
      else 
        //char '#' encountered so make all 0
        break;
    }
    for(int i = 1; i < H; i++){
        for(int j = 1; j < W; j++){
          dp[i][j] = (play[i].charAt(j) == '.' ? (dp[i][j-1] + dp[i-1][j])%INF : 0);
        }
    }
    return dp[H-1][W-1];
  }

  private static final int INF = (int)1e9+7;
  
  public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		sc.nextLine();
		String[] play = new String[H];

		for (int i = 0; i < play.length; i++) {
			play[i] = sc.nextLine();
		}

		System.out.println(solve(play, H, W));
		if (sc != null)
			sc.close();
	}
}
