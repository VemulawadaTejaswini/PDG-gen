import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int A = in.nextInt();
      int B = in.nextInt();

      if (B % A == 0) {
        System.out.println(A + B);
      } else {
        System.out.println(B - A);
      }
    }
  }
}