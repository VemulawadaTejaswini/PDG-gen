import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int X = scanner.nextInt();
    int[] L = new int[N];
    for (int i = 0; i < N; i++) {
      L[i] = scanner.nextInt();
    }
    int count = 1;
    int x = 0;
    for (int i = 0; i < N; i++) {
      x += L[i];
      if (x <= X) count++;
    }
    System.out.println(count);
  }
}
