
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  static int k;
  static long[][] counts = new long[18][9];
  static long counter = 0;
  static long result = 0;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    k = scanner.nextInt();
    for (int i = 0; i < 9; i++) {
      counts[0][i] = 1;
    }
    for (int i = 1; i < 18; i++) {
      for (int j = 0; j < 9; j++) {
        if (j == 0) {
          counts[i][j] = (long) (counts[i - 1][j] + counts[i - 1][j + 1] + Math.pow(2, i - 1));
        } else if (j == 8) {
          counts[i][j] = counts[i - 1][j-1] + counts[i - 1][j];
        } else {
          counts[i][j] = counts[i - 1][j - 1] + counts[i - 1][j] + counts[i - 1][j+1];
        }
      }
    }

    for (int i = 0; i < 18; i++) {
      for (int j = 0; j < 9; j++) {
        if (counter + counts[i][j] >= k) {
          resolve(i, j);
          System.out.println(result);
          return;
        } else {
          counter += counts[i][j];
        }
      }
    }
    return;
  }

  private static void resolve(final int dig, final int num) {
    if(dig == 0) {
      result += num+1;
      return;
    } else {
      result += (num + 1) * Math.pow(10, dig);
    }
    for (int i = num - 1; i < num + 2; i++) {
      if(num < 0 || num > 9) {
        continue;
      }
      if (counter + counts[dig - 1][i] >= k) {
        resolve(dig-1, i);
        return;
      } else {
        counter += counts[dig-1][i];
      }
    }
  }
}
