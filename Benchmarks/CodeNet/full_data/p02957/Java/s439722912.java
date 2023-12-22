import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    if (a % 2 != b% 2) {
    	System.out.println("IMPOSSIBLE");
    } else {
    	System.out.println((a + b) / 2);
    }
  }
}
