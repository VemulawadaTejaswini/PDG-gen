import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();
    String op = scanner.next();
    int b = scanner.nextInt();

    // aとbをopにしたがって計算する
    // opが"+"だったら足し算
    if(op.equals("+")) {
      System.out.println(a + b);
    // "-"だったら引き算
    } else if(op.equals("-")) {
      System.out.println(a - b);
    } else {
      System.out.println("+か-の演算子を使用してください。");
    }
  }
}