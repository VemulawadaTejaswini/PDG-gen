import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //文字列の入力
    String AtCoder = sc.next("AtCoder");
    String s = sc.next();
    String Contest = sc.next("Contest");
    //　出力
    System.out.println(AtCoder.charAt(0) + s.charAt(0) + Contest.charAt(0));
  }
}