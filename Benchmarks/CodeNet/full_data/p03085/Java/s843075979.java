import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // 入力を取得
    String c = sc.next();

    if(c.equals("A")){
      System.out.println("T");
    }else if(c.equals("T")){
      System.out.println("A");
    }else if(c.equals("G")){
      System.out.println("C");
    }else if(c.equals("C")){
      System.out.println("G");
    }

    // 出力
  }
}
