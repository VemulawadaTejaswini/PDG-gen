import java.util.Scanner;
public class Main{
  private static boolean debug = false;
  public static void main(String... args) {
    assert debug = true;
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    if (debug) System.out.println("assert");
    System.out.println(3 * r * r);
  }
}