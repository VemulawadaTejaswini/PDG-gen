import java.util.Arrays;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int A = 0;
    int B = 0;
    int C = 0;
    int r = 0;
    if (a / 2 + b / 2 == b / 2 + c / 2 && a / 2 + c / 2 == a / 2 + b / 2 && b / 2 + c / 2 == a / 2 + c / 2) {
      r = -1;
    } else {
      while (a % 2 == 0 && b % 2 == 0 && c % 2 == 0) {
        A = b / 2 + c / 2;
        B = a / 2 + c / 2;
        C = b / 2 + a / 2;
        a = A;
        b = B;
        c = C;
        ++r;
      }
    }
    System.out.println(r);
    sc.close();
  }
}
