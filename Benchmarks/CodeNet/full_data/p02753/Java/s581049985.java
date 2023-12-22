import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[] s = scanner.next().toCharArray();
    for (int i = 1; i < 3; i++) {
      if (s[i] != s[i - 1]) {
        System.out.println("Yes");
        return;
      }
    }
    System.out.println("No");
  }
}
