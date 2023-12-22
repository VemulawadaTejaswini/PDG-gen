import java.util.Arrays;
import java.util.Scanner; // 文字列を標準入力からscanする

public class Main { 

  static long return_smaller(long a, long b){
    if(a > b){
      return b;
    }
      return a;
  }

  static long return_bigger(long a, long b){
    if(a > b){
      return a;
    }
      return b;
  }
    
  public static void main(final String[] args) {
    int N = 0;
    int i = 0;
    int j = 0;
    int k = 0;

    Scanner scan = new Scanner(System.in);
		String str = "";
    str = scan.nextLine();

    N = Integer.parseInt(str);
    
    int[][] a = new int[N+1][3];

    for(i=1; i<=N; i++){
      str = scan.nextLine();
      String[] strs2 = str.split(" ");
      a[i][0] = Integer.parseInt(strs2[0]);
      a[i][1] = Integer.parseInt(strs2[1]);
      a[i][2] = Integer.parseInt(strs2[2]);
    }
    scan.close();

    int init = 0;
    long[][] dp = new long[N+1][3];
    for(i=0; i<N; i++){
      Arrays.fill(dp[i], init);
    }

    for(i=1; i<=N; i++){
      for(j=0; j<3; j++){
        for(k=0; k<3; k++){
          if(j != k){
            dp[i][j] = return_bigger(dp[i][j], dp[i-1][k] + a[i][j]);
          }
        }
      }
    }

    long dpN_max = 0;
    for(i=0; i<3; i++){
      dpN_max = return_bigger(dpN_max, dp[N][i]);
    }

    System.out.println(dpN_max);

  }
}