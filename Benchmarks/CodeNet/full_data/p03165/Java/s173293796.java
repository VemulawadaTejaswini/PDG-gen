import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	public static void main (String[] args) {
      Scanner in = new Scanner(System.in);
      String S = in.nextLine();
      String T = in.nextLine();
      int lenS = S.length();
      int lenT = T.length();
      int[][] dp = new int[lenS+1][lenT+1];
      for (int i = 1; i <= lenS; i++) {
        for(int j = 1; j <= lenT; j++){
          if(S.charAt(i-1) == T.charAt(j-1))
            dp[i][j] = dp[i-1][j-1] + S.charAt(i-1);
          else
            dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
        }
      }
      String result = "";
      int i = lenS;
      int j = lenT;
      while(i>0 && j>0){
        if(S.charAt(i-1) == T.charAt(j-1)){
          result = S.charAt(i-1) + result;
          i--;
          j--;
        }else if(dp[i-1][j] > dp[i][j-1])
          i--;
        else
          j--;
      }
      System.out.println(result);
	}
}
