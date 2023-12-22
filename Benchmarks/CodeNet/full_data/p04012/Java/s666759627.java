import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);

    final String s = scanner.nextLine();
    final boolean[] alphabets = new boolean[26];
    for (char c: s.toCharArray()) {
      alphabets[c - 'a'] = !alphabets[c - 'a'];
    }

    for (boolean a: alphabets) {
      if (a) {
        System.out.println("No");
        return;
      }
    }

    System.out.println("Yes");
  }
}