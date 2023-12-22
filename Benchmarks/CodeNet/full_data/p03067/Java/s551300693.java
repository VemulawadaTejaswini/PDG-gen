import java.util.*;

class Main{
  public static void main(String arg[]){
    Scanner stdIn = new Scanner(System.in);
    
    int N = stdIn.nextInt();
    String S = stdIn.next();
    
    int ans = N;
    for(int i = 0; i < N; i++){
      // 境界iの左側を.にする場合の変更数
      int leftBlack = 0;
      int rightWhite = 0;
      for(int j = 0; j <= i; j++){
        if((String.valueOf(S.charAt(j))).equals("#")) leftBlack++;
      }
      for(int j = i+1; j < N; j++){
        if((String.valueOf(S.charAt(j))).equals(".")) rightWhite++;
      }
      if((leftBlack + rightWhite) < ans){
        ans = leftBlack + rightWhite;
      }
    }
    
    System.out.println(ans);
  }
}