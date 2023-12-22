import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();
    int j = sc.nextInt();

    if (i > 0) {
      int c = (j / i) + ((j % i) > 0 ? 1 : 0);
      System.out.println(c);
    } else {
      System.out.println(0);
    }
  }
}