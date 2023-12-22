import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      double a = (double)sc.nextInt();
      double b = (double)sc.nextInt();
      double c = (double)sc.nextInt();
      
      // 大小判定
      double left = a + Math.sqrt(a * b) * 2 + b;
      double right = c;
      String result = "";
      if(left < right){
        result = "Yes";
      }else{
        result = "No";
      }
      
      // 出力
      System.out.println(result);
    }
    
}