import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    sc.close();
    System.out.println(solve(a, b));

  }

  static int solve(int a, int b) {
    for (int price = b * 10; price < (b + 1) * 10; price++) {
      if (price * 8 / 100 == a) {
        return price;
      }
    }
    return -1;
  }
}