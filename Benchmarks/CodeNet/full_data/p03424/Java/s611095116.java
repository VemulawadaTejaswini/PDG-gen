import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    scanner.nextLine();
    String[] c = scanner.nextLine().split(" ");
    for (int i = 0; i < N; i++) {
      if (c[i].charAt(0) == 'Y') {
        System.out.println("Four");
        return;
      }
    }
    System.out.println("Three");
  }
}
