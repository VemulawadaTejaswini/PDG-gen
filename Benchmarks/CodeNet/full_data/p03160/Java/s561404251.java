import java.util.Scanner; // 文字列を標準入力からscanする

public class Main{ 

  static int return_smaller(int a, int b){
    if(a > b){
      return b;
    }
      return a;
  }
    
  public static void main(final String[] args) {
    Scanner scan = new Scanner(System.in);
		String str = "";
		str = scan.nextLine();
    int N = Integer.parseInt(str);

    int[] hi = new int[N];
    int[] dp = new int[N];

    str = scan.nextLine();
    String[] strs2 = str.split(" ");
    for(int i=0; i<strs2.length; i++) {
      hi[i] = Integer.parseInt(strs2[i]);
    }
    scan.close();

    dp[0] = 0;
    for (int i = 1; i < N; ++i) {
      if(i > 1){
        dp[i] = return_smaller(dp[i - 1] + Math.abs(hi[i] - hi[i - 1]), 
                                  dp[i - 2] + Math.abs(hi[i] - hi[i - 2]));
      }
      else{
        dp[1] = dp[0] + Math.abs(hi[1] - hi[0]);
      }
    }

    System.out.println(dp[N-1]);

  }
}