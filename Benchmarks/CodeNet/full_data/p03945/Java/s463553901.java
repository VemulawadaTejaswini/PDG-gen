import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[] s = scanner.next().toCharArray();
    int count = 0;
    for (int i = 1; i < s.length; i++) if (s[i] != s[i - 1]) count++;
    System.out.println(count);
  }
}
