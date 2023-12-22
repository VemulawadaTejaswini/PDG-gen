import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[] S = scanner.next().toCharArray();
    int N = S.length;
    int[] count = new int[3];
    for (char ch : S) count[ch - 'a']++;
    Arrays.sort(count);
    if (count[2] > (N - 1) / 3 + 1) {
      System.out.println("NO");
    } else {
      System.out.println("YES");
    }
  }
}
