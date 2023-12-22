import java.util.*;

public class Main {

    public static double result = 0;
  
	public static void main(String[] args) {

		// argumentの取得
		Scanner sc = new Scanner(System.in);
		double x = sc.nextInt();
      
        // 奇数の数 ÷ 数全体
        // 5の場合 3 / 5
        // 任意の整数Nが含む奇数の数は 1 + (N-1)/2個
      
        if ((x % 2) == 0) {
          //System.out.println("偶数");
          result = ((x / 2) / x);
        } else {
          //System.out.println("奇数");
          if (x == 1) {
            result = 1;
          } else {
            result = ((((x -1)/2) + 1) / x);
          }
        }
      
		// 戻り値の返却
		System.out.println(String.format("%.10f", result));
	
	} 
}