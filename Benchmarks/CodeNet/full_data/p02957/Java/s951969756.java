import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt() + sc.nextInt();
    System.out.println(a % 2 == 0 ? a / 2 : "IMPOSSIBLE");
  }
}