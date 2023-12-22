import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int x = scanner.nextInt();

    if ( a > x ) {
      System.out.println("NO");
    } else if ( (a + b) < x ) {
      System.out.println("NO");
    } else {
      System.out.println("YES");
    }

  }

}