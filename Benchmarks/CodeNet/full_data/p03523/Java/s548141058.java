import java.util.*;

public class Main {
  private static final char[] PATTERN = "AKIHABARA".toCharArray();

  public static boolean solve(char[] cs) {
    int patternIndex = 0;
    int csIndex = 0;
    while (csIndex < cs.length && patternIndex < PATTERN.length) {
      char c1 = cs[csIndex];
      char c2 = PATTERN[patternIndex];
      if (c1 == c2) {
        csIndex++;
        patternIndex++;
      } else if (c2 == 'A') {
        patternIndex++;
      } else {
        return false;
      }
    }
    return csIndex >= cs.length && patternIndex >= PATTERN.length - 1;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char[] cs = scanner.next().toCharArray();
    System.out.println(solve(cs) ? "YES" : "NO");
  }
}
