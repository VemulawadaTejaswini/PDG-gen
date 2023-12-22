import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int D = scanner.nextInt();
    int X = scanner.nextInt();
    int tot = X;
    for (int i = 0; i < N; i++) {
      int A = scanner.nextInt();
      tot += (D + A - 1) / A;
    }
    System.out.println(tot);
  }
}
