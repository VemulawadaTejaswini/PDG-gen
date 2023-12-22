import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);

    final int n = scanner.nextInt();
    scanner.nextLine();

    final boolean[] dislikes = new boolean[11];
    for (String s : scanner.nextLine().split(" ")) {
      dislikes[Integer.parseInt(s)] = true;
    }

    int pay = n;
    int cursor = 1;
    while (cursor <= pay) {
      if (dislikes[(pay / cursor) % 10]) {
        pay = (int) Math.floor(pay / cursor) * cursor + cursor;
        cursor = 1;
        continue;
      }

      cursor *= 10;
    }

    System.out.println(pay);
  }
}