import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int D = scanner.nextInt();
    System.out.println((N - 1) / (D * 2 + 1) + 1);
  }
}
