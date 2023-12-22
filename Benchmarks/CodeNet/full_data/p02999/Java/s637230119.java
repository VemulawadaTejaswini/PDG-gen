import java.utils.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int x = scan.nexrInt();
    int a = scan.nextInt();

    if (0 <= x && a <= 9) {
      if (x < a) {
        System.out.println("0");
      } else {
        System.out.println("10");
      }
    }
  }
}
