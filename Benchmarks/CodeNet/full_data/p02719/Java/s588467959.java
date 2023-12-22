import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      Long N = sc.nextLong();
      Long K = sc.nextLong();
      
      // 操作
      Long quot = N / K;
      Long candidate1 = abs(N - K * quot);
      Long candidate2 = abs(N - K * (quot+1));
      Long min;
      if(candidate1 < candidate2){
        min = candidate1;
      }else{
        min = candidate2;
      }
      
      // 出力
      System.out.println(min);
    }
    
    // 絶対値を求める関数
    public static Long abs(Long num){
      if(num < 0){
        return num * (-1);
      }else{
        return num;
      }
    }

}