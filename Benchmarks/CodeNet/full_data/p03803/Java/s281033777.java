import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //整数の入力
    int A = sc.nextInt();
    int B = sc.nextInt();
    //条件分岐と出力
    if (A==B) {
      System.out.println("Draw");
    } else if (A > B) {
      System.out.println("Alice");
    } else {
      System.out.println("Bob");
    }
  }
}