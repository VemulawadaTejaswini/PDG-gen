import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    long A = scan.nextLong();
    long B = scan.nextLong();

    long AB = A + B;
    if (AB % 2 != 0) {
      System.out.println("IMPOSSIBLE");
      return;
    }
    System.out.println(AB / 2);


  }

}
