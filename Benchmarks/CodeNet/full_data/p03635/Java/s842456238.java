import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) {
    int n, m;
    Scanner scan = new Scanner(System.in);
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    while (true) {
      try {
        System.out.print("n = ?:");
        n = scan.nextInt();
        System.out.print("m = ?:");
        m = scan.nextInt();
        System.out.println(nBlocks(n, m));

      } catch (java.util.InputMismatchException e) {
        e.printStackTrace();
      }

      try {
        System.out.print("Wanna quit? (y / n)");
        String str = reader.readLine();
        if (str.equals("y")) {
          break;
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

  }

  public static int nBlocks(int n, int m) {
    if (n >= 2 && m <= 100 && m > 0) {
      if (m == 1) {
        return 0;
      }

      return (n - 1) * (m - 1);
    }
    return -1;
  }
}
