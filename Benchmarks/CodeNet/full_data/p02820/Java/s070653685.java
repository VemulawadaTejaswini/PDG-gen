import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    Map<Character, Integer> map = new HashMap<>();
    map.put('r', sc.nextInt());
    map.put('s', sc.nextInt());
    map.put('p', sc.nextInt());
    char[] t = sc.next().toCharArray();
    sc.close();

    int count = 0;
    for (int i = 0; i < t.length; i++) {
      if (i >= k && t[i] == t[i - k]) {
        t[i] = '_';
      } else {
        count += win(t[i], map);
      }
    }
    System.out.println(count);
  }
  // 6 + 8 + 0 + 7 + 6 = 27

  private static int win(char c, Map<Character, Integer> map) {
    switch (c) {
      case 'r':
        return map.get('p');
      case 's':
        return map.get('r');
      case 'p':
        return map.get('s');
      default:
        return 0;
    }
  }
}