import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[] s = scanner.next().toCharArray();

    int min = Integer.MAX_VALUE;
    for (int i = 0; i < s.length - 2; i++) {
      int d = Math.abs((s[i] - '0') * 100 + (s[i + 1] - '0') * 10 + (s[i + 2] - '0') - 753);
      min = Math.min(d, min);
    }
    System.out.println(min);
  }
}
