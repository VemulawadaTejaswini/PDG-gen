import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
      // 整数の入力
      int a = sc.nextInt();
      // b
      int b = sc.nextInt();
      // c
      int c = sc.nextInt();
      if (a < b) {
         int temp = a;
         a = b;
         b = temp;
      }
      if (a < c) {
         int temp = a;
         a = c;
         c = temp;
      }
    System.out.println(a * 10 + b + c);
  }
}