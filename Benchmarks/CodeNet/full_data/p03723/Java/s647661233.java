import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int ap = 0;
    int bp = 0;
    int cp = 0;

    for (int i = 0;; i++) {
      if (((a % 2) != 0) || ((b % 2) != 0) || ((c % 2) != 0)) {
        System.out.println(i);
        return;
      } else if ((a == b) && (b == c)) {
        System.out.println(-1);
        return;
      }
      ap = (b + c) / 2;
      bp = (c + a) / 2;
      cp = (a + b) / 2;
      a = ap;
      b = bp;
      c = cp;
    }

  }
}