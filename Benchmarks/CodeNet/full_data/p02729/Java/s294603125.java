import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int M = sc.nextInt();
      
      // 偶数+偶数の方法の数を算出
      int even = 0;
      if(N >= 2){
        even = N * (N-1) / 2;
      }
      
      // 奇数+奇数の方法の数を算出
      int odd = 0;
      if(M >= 2){
        odd = M * (M-1) / 2;
      }
      
      // 方法の合計数
      int result = even + odd;
      
      // 出力
      System.out.println(result);
    }
    

}