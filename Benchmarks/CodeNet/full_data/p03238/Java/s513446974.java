import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int N = in.nextInt();

      if (N == 1) {
        System.out.println("Hello World");
      } else if (N == 2) {
        int A = in.nextInt();
        int B = in.nextInt();

        System.out.println(A + B);
      }
    }
  }
}