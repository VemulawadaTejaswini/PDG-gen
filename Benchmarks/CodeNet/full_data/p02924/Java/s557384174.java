import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    N--;
    System.out.println(N * (N + 1) / 2);
  }
}
