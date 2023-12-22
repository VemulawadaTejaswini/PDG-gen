import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // 入力を取得
    String str = sc.next();
    int firstLength = str.length();

    while(true){
      int flag = 0;
      int strLength = str.length();
      str = str.replaceFirst("01", "");
      str = str.replaceFirst("10", "");
      if(strLength==str.length()){
        break;
      }
    }

    // 出力
    System.out.println(firstLength - str.length());
  }
}
