import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int r = in.nextInt();

      System.out.println(3 * r * r);
    }
  }
}