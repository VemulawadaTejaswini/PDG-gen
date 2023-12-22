import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[] s = scanner.next().toCharArray();
    boolean good = true;
    for (int i = 0; i < s.length - 1; i++) {
      if (s[i] == s[i + 1]) good = false;
    }
    if (good) System.out.println("Good");
    else System.out.println("Bad");
  }
}
