import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int x = sc.nextInt();
    System.out.println(Math.toDegrees(Math.atan2(b, (double) x * 2 / (a * b))));
  }
}