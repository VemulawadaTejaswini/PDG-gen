import java.util.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int L = sc.nextInt();
      
      // 体積最大値算出
      BigDecimal bdL = BigDecimal.valueOf(L);
      BigDecimal three = BigDecimal.valueOf(3);
      BigDecimal ave = bdL.divide(three, 6, BigDecimal.ROUND_HALF_UP);
      BigDecimal max = ave;
      max = max.multiply(ave);
      max = max.multiply(ave);
      
      // 出力
      System.out.println(max);
    }
    
}