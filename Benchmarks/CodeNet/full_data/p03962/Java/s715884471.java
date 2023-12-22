import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    // 標準入力から整数a,b,cの数値を取得
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    
    // 3つの数値を比較し、色が全てが同じ場合1を出力
    if(a == b && a == c) {
      System.out.println(1);
    
    // 3つの数値を比較し、色が1つでも同じ場合2を出力  
    } else if(a == b || b == c || c == a) {
      System.out.println(2);
    
    // 3つの数値を比較し、すべて違う場合3を出力
    } else {
      System.out.println(3);
  }
}