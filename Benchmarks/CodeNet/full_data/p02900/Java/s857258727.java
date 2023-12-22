import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int count = 0;
    boolean ok;
    for (int i = 1; i <= Math.min(A, B); i++)
      if (A % i == 0 && B % i == 0) {
        ok = true;
        for (int j = 2; j < i; j++)
          if (i % j == 0) {
            ok = false;
            break;
          }
        if (ok)
          count++;
      }
    System.out.println(count);
  }
}