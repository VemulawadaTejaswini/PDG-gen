import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 整数の入力
    int a = sc.nextInt();
    int b = sc.nextInt();
    // 数値a,bを文字列A,Bに変換
    String A = String.valueOf(a);
    String B = String.valueOf(b);
    // AとBを繋げた文字列を数値に変換
    int testNumber = Integer.parseInt(A + B);
    // 平方数かどうかを判定する変数を定義
    boolean squareNumber = false;
    
    for (int i=1; i<=400; i++) {
      if (testNumber == i * i) {
        squareNumber = true;
      }
    }
    
    if (squareNumber) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
    