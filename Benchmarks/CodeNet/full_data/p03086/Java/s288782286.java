import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String line = sc.next();
    Main abc122B = new Main();
    System.out.println(abc122B.solve(line));
  }

  public int solve(String line) {
    int ans = 0;
    int temp = 0;
    Set<Character> set = new HashSet(Arrays.asList('A', 'T', 'C', 'G'));
    for (int i = 0; i < line.length(); i++) {
      if (set.contains(line.charAt(i))) {
        temp += 1;
        if (temp > ans) {
          ans = temp;
        }
      } else {
        temp = 0;
      }
    }
    return ans;
  }
}
