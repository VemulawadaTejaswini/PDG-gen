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
    if (a == b && b == c && a == c) {
      r = -1;
    } else if (a % 2 == 1 || b % 2 == 1 || c % 2 == 1) {
      r = 0;
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
