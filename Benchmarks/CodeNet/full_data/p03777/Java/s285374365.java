import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 整数の入力
    String a = sc.next();
    String b = sc.next();
    // 条件分岐と出力
    if (a=="H" && b=="H") {
      System.out.println("H");
    } else if (a=="H" && b=="D") {
      System.out.println("D");
    } else if (a=="D" && b=="H") {
      System.out.println("D");
    } else {
      System.out.println("H");
    }
  }
}