import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int A, B, T;
    A = scanner.nextInt();
    B = scanner.nextInt();
    T = scanner.nextInt();
    System.out.println(T / A * B);
  }
}
