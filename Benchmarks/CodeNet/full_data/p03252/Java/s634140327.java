import java.util.HashMap;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[] s = scanner.next().toCharArray();
    char[] t = scanner.next().toCharArray();

    int[] si = number(s);
    int[] ti = number(t);

    if (equals(si, ti)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }

  private static boolean equals(int[] si, int[] ti) {
    for (int i = 0; i < si.length; i++) {
      if (si[i] != ti[i]) {
        return false;
      }
    }
    return true;
  }

  private static int[] number(char[] chars) {
    HashMap<Character, Integer> map = new HashMap<>();
    int n = 0;
    int[] id = new int[chars.length];
    for (int i = 0; i < chars.length; i++) {
      char ch = chars[i];
      if (!map.containsKey(ch)) {
        map.put(ch, n++);
      }
      id[i] = map.get(ch);
    }
    return id;
  }
}
