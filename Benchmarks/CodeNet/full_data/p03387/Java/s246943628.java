import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int max = Math.max(Math.max(a, b), c);
    int tag = 0;

    if (((a + b + c) % 2) == 0) {
      if ((max % 2) == 0) {
        tag = max;
      } else {
        tag = max + 1;
      }
    } else {
      if ((max % 2) != 0) {
        tag = max;
      } else {
        tag = max + 1;
      }
    }

    int sum = (3 * tag) - (a + b + c);
    System.out.println((sum + 1) / 2);

  }
}