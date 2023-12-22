import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char[] D = scanner.next().toCharArray();
    int[] digits = new int[4];
    for (int i = 0; i < 4; i++) digits[i] = D[i] - '0';

    for (int i = -1; i < 2; i += 2) {
      for (int j = -1; j < 2; j += 2) {
        for (int k = -1; k < 2; k += 2) {
          int sum = digits[0] + i * digits[1] + j * digits[2] + k * digits[3];
          if (sum == 7) {
            System.out.printf("%d%c%d%c%d%c%d=7\n", digits[0], i < 0 ? '-' : '+', digits[1], j < 0 ? '-' : '+', digits[2], k < 0 ? '-' : '+', digits[3]);
            return;
          }
        }
      }
    }
  }
}
