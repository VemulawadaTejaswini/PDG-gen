import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    long A = scanner.nextInt();
    long B = scanner.nextInt();
    long C = scanner.nextInt();
    long D = scanner.nextInt();
    long left = A - (N - 1) * D;
    long right = A - (N - 1) * C;
    for (int i = 0; i < N - 1; i++) {
      if (left <= B && B <= right) {
        System.out.println("YES");
        return;
      }
      left += C + D;
      right += C + D;
    }
    System.out.println("NO");
  }
}
