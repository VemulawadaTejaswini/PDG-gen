import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[] w = scanner.next().toCharArray();
    int[] freq = new int[26];
    for (char ch : w) freq[ch - 'a']++;
    if (Arrays.stream(freq).allMatch(i -> i % 2 == 0)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
