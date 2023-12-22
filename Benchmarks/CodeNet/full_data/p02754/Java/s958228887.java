import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int A = sc.nextInt();
      int B = sc.nextInt();
      
      // 周期数と余りをカウント
      int roop = N / (A+B);
      int remain = N % (A+B);
      
      // 青いボールをカウント
      int result = A * roop;
      if(remain < A){
        result += remain;
      }else{
        result += A;
      }
        
      // 出力
      System.out.println(result);
    }
    
}