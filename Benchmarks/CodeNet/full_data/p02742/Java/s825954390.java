import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      Long H = sc.nextLong();
      Long W = sc.nextLong();
      
      // 移動可能数マス算出
      Long move = (H * W + 1) / 2;
      
      // 出力
      System.out.println(move);
    }


}