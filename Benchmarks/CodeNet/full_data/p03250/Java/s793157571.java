import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int A = in.nextInt();
      int B = in.nextInt();
      int C = in.nextInt();
      int max = Math.max(A, Math.max(B, C));
      int sumOfNotMax = A + B + C - max;

      System.out.println(max * 10 + sumOfNotMax);
    }
  }
}