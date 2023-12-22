import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int count4 = 0;
    int count2 = 0;
    for (int i = 0; i < N; i++) {
      int a = scanner.nextInt();
      if (a % 4 == 0) {
        count4++;
      } else if (a % 2 == 0) count2++;
    }

    if (solve(N, count2, count4)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }

  private static boolean solve(int N, int count2, int count4) {
    if (count2 == N) return true;
    if (count2 > 1) {
      N -= count2 - 1;
    }
    return count4 >= N / 2;
  }
}
